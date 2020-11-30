package mediReco;

import java.util.Vector;
/**
 *
 * @author ShinMinJin
 */
public class ConcreateRecord extends RecordFactory {
    
public Record getRecord(String checkType){
        if(checkType == null){
            return null;
        }
        if(checkType.equalsIgnoreCase("covid")){
            return new CovidCheck();
        }else if(checkType.equalsIgnoreCase("rounds")){
            return new RoundsCheck();
        }
        return null;
    }
    
    public Vector show(){
            return showPatientDB.showPatient();
        }
}
