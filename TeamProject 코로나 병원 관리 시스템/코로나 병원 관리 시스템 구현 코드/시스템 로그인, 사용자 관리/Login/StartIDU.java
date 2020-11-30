package Login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ImDoYeon
 */
public class StartIDU implements SearchID{
    //login 인터페이스로 넘어와서 SearchIDinfo를 구현- 정보를 검색함.
    //일치하는 정보가 있다면 true 없다면 false
    protected String id;
    protected String passwd;
    protected String position;
    public void setINFO(String id,String passwd) {
        System.out.println("유저 setINfO 넘어감");
        this.id = id;
        this.passwd = passwd;
        System.out.println(this.id +" , "+this.passwd);
    }
    @Override
    public boolean SearchIDinfo(){
        MainUserFrame frame= new MainUserFrame();
        LoginFrame login = new LoginFrame();
        System.out.println("유저 SearchIDinfo 넘어감sql문 있는거");
        System.out.println("넘어갈 아이디 비번"+this.id +" , "+this.passwd);
        MyConnection db = new MyConnection();
        Connection con = db.getConnection();
        boolean result = false;
        PreparedStatement statement;
        try {
            statement = con.prepareStatement("SELECT * FROM user "
                    + "WHERE user_id =" + "'" + this.id + "'"+" AND "+"user_passwd = '"+this.passwd+"'");
            try (ResultSet rs = statement.executeQuery()) {
                while(rs.next()) {
                    position = rs.getString("user_position");             
                    login.getUserPosition(id, position);
                    result = true;
                }
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
        return result;
    }        
}

