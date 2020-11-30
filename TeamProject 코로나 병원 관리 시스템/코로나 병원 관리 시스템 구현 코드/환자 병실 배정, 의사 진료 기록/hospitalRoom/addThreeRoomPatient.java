package hospitalRoom;

import static hospitalRoom.DB_infomation.JDBC_DRIVER;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

/**
 *
 * @author ShinMinJin
 */
public class addThreeRoomPatient extends DB_infomation {

    public static final int THREE_ROOM_MAX = 3;
    public int member = 0;
    public int possMem;
    private int room_num;
    public String pi;
    Connection conn = null;
    Statement state = null;

    public addThreeRoomPatient(int possMem,int room_num) {
        this.possMem = possMem;
        this.member = 0;
        this.room_num = room_num;
        
         try {
                Class.forName(JDBC_DRIVER); // 드라이버 드라이버가 없다면 오류

                conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);    // 접속 정보

                state = conn.createStatement(); // 연결
                String sql = null; //SQL문을 저장할 String
                int r = 0;
                ResultSet rs = null;

                sql = "update hossRoom set current_member=" + Integer.toString(member) + " where hoss_num LIKE 'H00%' ;";

                r = state.executeUpdate(sql);

                conn.commit();

                rs.close();
                state.close();
                conn.close();
            } catch (Exception e) { //예외 발생 시 처리부분

            }
    }

    public String threeRoomAdd(int i) {
        if (i == 1) {
            member = member + 1;
            possMem = THREE_ROOM_MAX - member;
            pi = Integer.toString(possMem);

            try {
                Class.forName(JDBC_DRIVER); // 드라이버 드라이버가 없다면 오류

                conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);    // 접속 정보

                state = conn.createStatement(); // 연결
                String sql = null; //SQL문을 저장할 String
                int r = 0;
                ResultSet rs = null;
                sql = "update hossRoom set current_member=" + Integer.toString(member) + " where hoss_num='H00"+Integer.toString(room_num)+"';";

                
                r = state.executeUpdate(sql);

                conn.commit();

                rs.close();
                state.close();
                conn.close();
            } catch (Exception e) { //예외 발생 시 처리부분

            }
            return pi;
        } else {
            pi = Integer.toString(possMem);
            return pi;
        }
    }

    public String threememberChecking() {
        if (member < 3) {
            System.out.println("추가할 수 있습니다.");
            return "1";
        } else {
            System.out.println("추가할 수 없습니다.");
            return "0";
        }
    }

}
