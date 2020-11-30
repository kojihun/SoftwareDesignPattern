package managementPatient;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author KoJiHun
 */
public class Prescription extends Prototype {

    private String patientName; //환자의 이름
    private String patientNumber; //환자의 주민등록번호
    private String patientEnter; //환자의 입원날짜
    private String patientExit; //환자의 퇴원날짜
    private long totalPrice;
    private Pill pill;

    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    Date Enterday;
    Date Exitday;

    ArrayList<Pill> patientPill = new ArrayList<>();
    int Randomnum = (1 + (int) (Math.random() * 100));
    int number = (1 + (int) (Math.random() * 10));

    ManagementProgram managementProgram = new ManagementProgram();

    public Prescription() {
        this.patientName = ManagementProgram.patientName;
        this.patientNumber = ManagementProgram.patientPsnum;

        try {
            Enterday = dateFormat.parse(ManagementProgram.patientEnter);
            Exitday = dateFormat.parse(ManagementProgram.patientExit);
        } catch (ParseException ex) {
            Logger.getLogger(Prescription.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void addPill() {
        pill = new Pill("알약명", (1 + (int) (Math.random() * 10)) , "식후 " + Randomnum + "분 후에 먹으세요", "3일분 처방");
        patientPill.add(pill);
    }

    public long dateDiff() {
        long diff = Exitday.getTime() - Enterday.getTime();
        long diffDays = diff / (24 * 60 * 60 * 1000);
        System.out.println(diffDays);
        
        return diffDays;
    }

    public long sumPrice() {
        totalPrice = dateDiff() * 5000 + pill.getPillPrice() * number;
        return totalPrice;
    }

    public Prescription copy() throws CloneNotSupportedException {
        Prescription prescription = (Prescription) clone();
        return prescription;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientNumber() {
        return patientNumber;
    }

    public void setPatientNumber(String patientNumber) {
        this.patientNumber = patientNumber;
    }
}
