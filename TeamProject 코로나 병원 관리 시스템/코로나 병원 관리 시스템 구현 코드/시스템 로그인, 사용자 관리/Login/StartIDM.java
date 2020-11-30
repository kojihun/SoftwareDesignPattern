package Login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author ImDoYeon
 */
public class StartIDM implements SearchID{
    //login 인터페이스로 넘어와서 SearchIDinfo를 구현- 정보를 검색함.
    //일치하는 정보가 있다면 true 없다면 false
    protected String id;
    protected String passwd;
    public void setINFO(String id,String passwd) {
        System.out.println("매니저 setINfO 실행");
        this.id = id;
        this.passwd = passwd;
    }
    @Override
    public boolean SearchIDinfo(){
        System.out.println("매니저 SearchIDinfo sql문 실행");
        MyConnection db = new MyConnection();
        Connection con = db.getConnection();
        boolean result = false;
        PreparedStatement statement;
        try {
            System.out.println("매니저 sql문 실행");
            statement = con.prepareStatement("SELECT manager_id, manager_passwd FROM userlist.manager "
                    + "WHERE manager_id =" + "'" + this.id + "'" +" AND "+"manager_passwd = '"+this.passwd+"'");
            ResultSet rs = statement.executeQuery();
            while(rs.next()) {
                System.out.println("맞는 정보가 있다.");
                result = true;
            }
            rs.close();
        }catch(Exception e) {
        System.out.println("실패?");
            e.printStackTrace();
        }
        return result;
    }      
        //검색한 아이디와 비번의 정보가 일치한다면 트루, 아니면 펄스
}
    
