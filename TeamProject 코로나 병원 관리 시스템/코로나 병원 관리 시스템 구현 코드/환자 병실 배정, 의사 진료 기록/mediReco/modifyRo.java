package mediReco;

/**
 *
 * @author ShinMinJin
 */

import static mediReco.DB_information.JDBC_DRIVER;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import static mediReco.DB_information.JDBC_DRIVER;

public class modifyRo extends DB_information{
    private String columnName;
    private String changeValue;
    private String selectedNum;

    public modifyRo(String columnName, String changeValue, String selectedNum) {
        this.columnName = columnName;
        this.changeValue = changeValue;
        this.selectedNum = selectedNum;
    }
    
    public boolean roundsModi() {
        Connection conn = null; 
        Statement state = null;
  
        boolean result = false;
        
        String sql = String.format("UPDATE record SET %s = \"%s\" WHERE patient_num = \"%s\"", columnName, changeValue, selectedNum);
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
