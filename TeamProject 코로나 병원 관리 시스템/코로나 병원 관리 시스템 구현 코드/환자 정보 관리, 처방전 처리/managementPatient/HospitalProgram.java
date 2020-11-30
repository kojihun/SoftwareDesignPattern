package managementPatient;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author KoJiHun
 */
public class HospitalProgram implements Management {

    private List<Observer> observers;
    private String patientType;
    private String Text;

    public void setText(String Text) {
        this.Text = Text;
    }

    public void setPatientType(String patientType) {
        this.patientType = patientType;
    }

    public HospitalProgram() {
        observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
        System.out.println("가입 수"+observers.size());
        System.out.println("등록완료");

    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        System.out.println("공지사항 수:"+observers.size());
        for (Observer o : observers) {
            o.update(patientType, Text);
        }
    }

    public void notifyToPatient() {
        System.out.println("--------------공지사항-------------");
        notifyObservers();
        System.out.println("-----------------------------------");
    }
}
