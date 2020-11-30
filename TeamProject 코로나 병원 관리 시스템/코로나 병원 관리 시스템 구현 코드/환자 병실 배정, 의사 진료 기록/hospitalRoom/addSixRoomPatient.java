package hospitalRoom;

import static hospitalRoom.DB_infomation.JDBC_DRIVER;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author ShinMinJin
 */
public class addSixRoomPatient extends DB_infomation {

    public int sixRoomMax;
    public int sixMember;
    public int sixpossMem;
    private int room_num;
    public static String sixpi;
    Connection conn = null;
    Statement state = null;

    public addSixRoomPatient(int sixRoomMax, int room_num) {
        this.sixMember = 0;
        this.sixRoomMax = 6;
        this.room_num = room_num;
    }

    public String addSixRoomPatient(int i) {
        if (i == 1) {
            sixMember = sixMember + 1;

            sixpossMem = sixRoomMax - sixMember;
            sixpi = Integer.toString(sixpossMem);

            try {
                Class.forName(JDBC_DRIVER); // 드라이버 드라이버가 없다면 오류

                conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);    // 접속 정보

                state = conn.createStatement(); // 연결
                String sql = null; //SQL문을 저장할 String
                int r = 0;
                ResultSet rs = null;

                sql = "update hossRoom set current_member=" + Integer.toString(sixMember) + " where hoss_num='H00" + Integer.toString(room_num) + "';";
             
                r = state.executeUpdate(sql);

                conn.commit();

                rs.close();
                state.close();
                conn.close();
            } catch (Exception e) { //예외 발생 시 처리부분

            }
            return sixpi;
        } else {
            sixpi = Integer.toString(sixpossMem);
            return sixpi;
        }
    }

    public String sixmemberChecking() {
        if (sixMember <= 0) {
            return "0";
        } else {
            return "1";
        }
    }

}
