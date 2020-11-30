package managementPatient;

//import문 - sql
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//import문 - swing
import javax.swing.JOptionPane;

//import문 - util
import java.util.regex.Pattern;
import java.util.ArrayList;

/**
 *
 * @author KoJiHun
 */
public class Control {

    boolean check = false; //해당 메소드들이 성공했는지 확인하기 위한 변수

    //환자의 정보를 등록하는 메소드
    boolean patientRegist(String patientnum, String patientname, String patientsex, String patientage, String patientpersonal, String patientaddr, String patientcheck, String patienttpye, String patiententer, String patientexit) {
        String query = "INSERT INTO patient VALUES (" + "'" + patientnum + "'," + "'" + patientname + "'," + "'" + patientsex + "'," + "'" + patientage + "'," + "'" + patientpersonal + "'," + "'" + patientaddr + "'," + "'" + patientcheck + "'," + "'" + patienttpye + "'," + "'" + patiententer + "'," + "'" + patientexit + "')";
        Connection con = MyConnect.getConnection();

        PreparedStatement ps = null;
        System.out.println("sql: " + query);

        try {
            if (patientnum.equals("") || patientname.equals("") || patientsex.equals("") || patientage.equals("") || patientpersonal.equals("") || patientaddr.equals("") || patientcheck.equals("") || patienttpye.equals("") || patiententer.equals("") || patientexit.equals("")) { //항목이 비어있을 경우 로그인 방지 처리
                JOptionPane.showMessageDialog(null, "모든 항목을 입력해주세요.");
                check = false;
            } else {
                //환자 고유 번호 체크
                if (Pattern.matches("[S,M,N]\\d{3}", patientnum)) {
                    ps = con.prepareStatement(query);
                    if (ps.executeUpdate() > 0) {
                        JOptionPane.showMessageDialog(null, patientname + "님 신규등록이 완료되었습니다.");
                        check = true;
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "환자번호 형식을 지켜주세요.");
                    check = false;
                }
            }
        } catch (SQLException ex) {
            ex.getMessage();
        }
        return check;
    }

    //각각의 경증환자들의 정보를 조회하기 위한 메소드
    public ArrayList<MildPatient> getMildPatientList(String patienttype, HospitalProgram hospitalprogram) {
        ArrayList<MildPatient> mildPatientlist = new ArrayList<MildPatient>();
        Connection con = MyConnect.getConnection();

        String query = "SELECT * FROM patient WHERE patient_type = '" + patienttype + "'";
        Statement st;
        ResultSet rs;

        try {
            st = con.createStatement();
            rs = st.executeQuery(query);

            MildPatient mildPatient;

            while (rs.next()) {
                //HospitalProgram hospitalprogram = new HospitalProgram(); //옵저버를 등록하기 위한 변수
                mildPatient = new MildPatient(hospitalprogram, rs.getString("patient_num"), rs.getString("patient_name"), rs.getString("patient_sex"), rs.getString("patient_age"), rs.getString("patient_personal"), rs.getString("patient_addr"), rs.getString("patient_check"), rs.getString("patient_type"), rs.getString("patient_enter"), rs.getString("patient_exit"));
                mildPatientlist.add(mildPatient);
            }
        } catch (Exception ex) {
            ex.getMessage();
        }
        return mildPatientlist;
    }

    //각각의 중증환자들의 정보를 조회하기 위한 메소드
    public ArrayList<SeverePatient> getSeverePatientList(String patienttype, HospitalProgram hospitalprogram) {
        //HospitalProgram hospitalprogram = new HospitalProgram(); //옵저버를 등록하기 위한 변수
        ArrayList<SeverePatient> severePatientlist = new ArrayList<SeverePatient>();
        Connection con = MyConnect.getConnection();

        String query = "SELECT * FROM patient WHERE patient_type = '" + patienttype + "'";
        Statement st;
        ResultSet rs;

        try {
            st = con.createStatement();
            rs = st.executeQuery(query);

            SeverePatient SeverePatient;

            while (rs.next()) {
                SeverePatient = new SeverePatient(hospitalprogram, rs.getString("patient_num"), rs.getString("patient_name"), rs.getString("patient_sex"), rs.getString("patient_age"), rs.getString("patient_personal"), rs.getString("patient_addr"), rs.getString("patient_check"), rs.getString("patient_type"), rs.getString("patient_enter"), rs.getString("patient_exit"));
                severePatientlist.add(SeverePatient);
            }
        } catch (Exception ex) {
            ex.getMessage();
        }
        return severePatientlist;
    }

    //각각의 보통환자들의 정보를 조회하기 위한 메소드
    public ArrayList<NonCoronaPatient> getNonCoronaPatientList(String patienttype, HospitalProgram hospitalprogram) {
        //HospitalProgram hospitalprogram = new HospitalProgram(); //옵저버를 등록하기 위한 변수
        ArrayList<NonCoronaPatient> nonCoronaPatientlist = new ArrayList<NonCoronaPatient>();
        Connection con = MyConnect.getConnection();

        String query = "SELECT * FROM patient WHERE patient_type = '" + patienttype + "'";
        Statement st;
        ResultSet rs;

        try {
            st = con.createStatement();
            rs = st.executeQuery(query);

            NonCoronaPatient NonCoronaPatient;

            while (rs.next()) {
                NonCoronaPatient = new NonCoronaPatient(hospitalprogram, rs.getString("patient_num"), rs.getString("patient_name"), rs.getString("patient_sex"), rs.getString("patient_age"), rs.getString("patient_personal"), rs.getString("patient_addr"), rs.getString("patient_check"), rs.getString("patient_type"), rs.getString("patient_enter"), rs.getString("patient_exit"));
                nonCoronaPatientlist.add(NonCoronaPatient);
            }
        } catch (Exception ex) {
            ex.getMessage();
        }
        return nonCoronaPatientlist;
    }

    //등록된 환자를 데이터베이스에서 삭제하기 위한 메소드
    public void patientRemove(String patientNumber) {
        try {
            Connection con = MyConnect.getConnection();
            String query = "DELETE FROM patient WHERE patient_num = '" + patientNumber + "'";

            PreparedStatement ps = null;
            ps = con.prepareStatement(query);
            if (ps.executeUpdate() > 0) {
                System.out.println("선택한 환자의 정보가 삭제되었습니다.");
            }
        } catch (SQLException ex) {
            ex.getMessage();
        }
    }

    //등록된 환자를 데이터베이스에서 삭제하기 위한 메소드
    public void patientUpdate(String patientNumber, String patientAddr, String patientCheck, String patientType, String patientExit) {
        try {
            Connection con = MyConnect.getConnection();
            String query = "UPDATE patient SET patient_addr = '" + patientAddr + "', patient_check = '" + patientCheck + "', patient_type = '" + patientType + "', patient_exit = '" + patientExit + "' WHERE patient_num = '" + patientNumber + "'";

            PreparedStatement ps = null;
            ps = con.prepareStatement(query);
            if (ps.executeUpdate() > 0) {
                System.out.println("선택한 환자의 정보가 수정되었습니다.");
            }
        } catch (SQLException ex) {
            ex.getMessage();
        }
    }
}
