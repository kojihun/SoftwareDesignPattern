package mediReco;

import static mediReco.DB_information.JDBC_DRIVER;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author ShinMinJin
 */
public class DeleteCo extends DB_information {

    private String selectedNum;

    public DeleteCo(String selectedNum) {
        this.selectedNum = selectedNum;
    }
    
    public boolean DeleteCo() {
        Connection conn = null; 
        Statement state = null;
  
        boolean result = false;
        
        String sql = "DELETE FROM record WHERE  codiva_check = ?;";
        System.out.println(sql);
        try {
            Class.forName(JDBC_DRIVER); // 드라이버 드라이버가 없다면 오류

            conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);    // 접속 정보
            
            state = conn.createStatement();
            state.executeUpdate(sql);
            
            state.close();
            conn.close();
            
            result = true;       
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
