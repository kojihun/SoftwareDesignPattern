package mediReco;

/**
 *
 * @author ShinMinJin
 */
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Vector;

public class showPatientDB extends DB_information{
     
    public static Vector showPatient()
    {
            Connection conn = null; 
            Statement state = null;
            Vector<String> show_patient = new Vector<>();
            int count = 0;
                    
        try{
            Class.forName(JDBC_DRIVER); // 드라이버 드라이버가 없다면 오류

            conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);    // 접속 정보

            
            state = conn.createStatement(); // 연결
            String sql = null; //SQL문을 저장할 String
           
            ResultSet rs = null; 

            sql = "SELECT patient_num, doctor_num, medical_num, medical_presc, patient_enter, codiva_check FROM record;"; 
            
            System.out.println(sql);
            rs = state.executeQuery(sql); //SQL문을 전달하여 실행

            
            while(rs.next()){
                       for(int i =1; i<7; i++){
                           show_patient.add(rs.getString(i));
                       }
            }
            
            rs.close();
            state.close();
            conn.close();
        } catch(Exception e){ //예외 발생 시 처리부분
            
        } 
        return show_patient;
    }      
}
