package userManagement;
import Login.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author ImDoYeon
 */
public class UserAdd implements Observer,Display {
     //Observer와 Display를 구현하는 클래스
  private UserData userData;
  String name;
  String id;
  String position;
  String passwd;
  int personalnumber;
  String number;
 //생성자에 userData라는 주제객체 전달. 이userData로
 //디스플레이를 옵저버에 등록한다.
  public UserAdd(UserData userData) {
      this.userData = userData;
      userData.addObserver(this);
  }
  //추가한 사용자의 이름, 아이디, 포지션을 입력받고 
  //디스플레이를 호출한다
  @Override
  public void update(String id, String name,String passwd,String number,
          int personalnumber,String position) {
      System.out.println(id+name+passwd);
      this.passwd = passwd;
      this.number = number;
      this.personalnumber = personalnumber;
      System.out.println("update까지 넘어옴");
      this.name = name;
      this.id = id;
      this.position = position;
      display();
  }
  //사용자의 정보가 추가되었다는 메시지가 관리자에게 
  //알림으로 간다.
  @Override
  public void display(){
                  boolean inputsuccess=false;
      MyConnection db = new MyConnection();
      Connection con = db.getConnection();
      PreparedStatement statement;
        String query = "INSERT INTO user (user_name,user_id,user_passwd,"
                + "user_position,user_number,user_personalnumber) VALUES ('"+
              this.name+"','"+this.id+"','"+this.passwd+"','"+this.position+"','"
                +this.number+"','"+this.personalnumber+"')";
      try{
          statement = con.prepareStatement(query);
          statement.executeUpdate();
          statement.close();
          con.close();
          inputsuccess=true;
      }catch(Exception e){
          System.out.println("addObserver() 실행오류 = "+e);
      }
      
   if(inputsuccess){
    
   }else{
       System.out.println("addObserver() 실행오류");
   }
     System.out.println("정보 추가 성공");
     JOptionPane.showMessageDialog(null,name
             +" 님 정보 추가 성공, 목록을 불러와 주세요.\n"+ "사용자 아이디: "
             + id+", 포지션: "+position);
}
}