package Login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author ImDoYeon
 */

public class FindPasswdManager implements SearchPasswd {
  public String id;
  private int personalnumber;
  public String finedpasswd;
    @Override
    //Login클래스에서 id와 personalnumber의 set값을 받아온다
    public void setPinfo(String id, int personalnumber){
        this.id = id;
        this.personalnumber= personalnumber;
    }
  @Override
  public String searchpasswd() {
      //데이터베이스에 연결해 정보 매치시키고, personalnumber까지 맞다면 
      //사용자의 비밀번호를 return 시킴. 
             MyConnection db = new MyConnection();
        Connection con = db.getConnection();
        finedpasswd = "";
        PreparedStatement statement;
        try {
            statement = con.prepareStatement("Select  manager_personalnumber,manager_passwd FROM manager "
                    + "WHERE manager_id =" + "'" + this.id + "'"+" AND "+"manager_personalnumber = '"
                    +this.personalnumber+"'");
            ResultSet rs = statement.executeQuery();
            while(rs.next()) {
                finedpasswd = rs.getString("manager_passwd");
            }
            rs.close();
        }catch(Exception e) {
            e.printStackTrace();
        }
        return finedpasswd;
    }      
}
