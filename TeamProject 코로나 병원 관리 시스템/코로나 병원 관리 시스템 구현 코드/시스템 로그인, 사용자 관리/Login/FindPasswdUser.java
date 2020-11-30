package Login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author ImDoYeon
 */
public class FindPasswdUser implements SearchPasswd {
    protected String id;
    protected int personalnumber;
     public String finedpasswd;
     Login whatname;
    @Override
    //Login클래스에서 id와 personalnumber의 set값을 받아온다
    public void setPinfo(String id, int personalnumber){
        this.id = id;
        this.personalnumber = personalnumber;
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
            statement = con.prepareStatement("Select user_id, user_personalnumber,user_passwd FROM user "
                    + "WHERE user_id =" + "'" + this.id + "'"+" AND "+"user_personalnumber = '"+this.personalnumber+"'");
            ResultSet rs = statement.executeQuery();
            while(rs.next()) {
                finedpasswd = rs.getString("user_passwd");
     //           whatname.name = rs.getString("user_name");
            }
            rs.close();
        }catch(Exception e) {
            e.printStackTrace();
        }
        return finedpasswd;
    }      
}
