package managementPatient;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author KoJiHun
 */
public class MyConnect {
    public static Connection getConnection(){
        Connection con = null;
        
        try{
            Class.forName("드라이버 주소");
            con = DriverManager.getConnection("서버 주소");
            System.out.println("데이터베이스 연결 성공");
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return con;
    }
}