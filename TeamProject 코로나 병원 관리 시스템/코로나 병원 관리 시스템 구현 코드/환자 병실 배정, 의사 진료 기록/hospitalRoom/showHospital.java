package hospitalRoom;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

/**
 *
 * @author ShinMinJin 
 */
public class showHospital extends DB_infomation{
    public static Vector showHosRoom()
    {
            Connection conn = null; 
            Statement state = null;
            Vector<String> show_hosRoom = new Vector<>();
            int count = 0;
                    
        try{
            Class.forName(JDBC_DRIVER); // 드라이버 드라이버가 없다면 오류

            conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);    // 접속 정보

            
            state = conn.createStatement(); // 연결
            String sql = null; //SQL문을 저장할 String
           
            ResultSet rs = null; 

            sql = "SELECT hoss_num, current_member FROM hossRoom;"; 
            
            
            rs = state.executeQuery(sql); //SQL문을 전달하여 실행

            
            while(rs.next()){
                           show_hosRoom.add(rs.getString(1));
            }
            
            rs.close();
            state.close();
            conn.close();
        } catch(Exception e){ //예외 발생 시 처리부분
            
        } 
        return show_hosRoom;
    }      
}
