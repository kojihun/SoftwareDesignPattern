package Login;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ImDoYeon
 */
public class MyConnection {
       public Connection getConnection() {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try {
            Class.forName("드라이버 주소");
            String url = "서버 주소";
            con = DriverManager.getConnection(url, "사용자 이름", "비밀번호");
            return con;
        } catch (Exception e) {
            System.out.println("연결안됐음!");
            return null;
        }
    }
    public static void main(String[] args) {
        MyConnection connect = new MyConnection();
        connect.getConnection();
    }
}
