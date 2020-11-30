package userManagement;

import Login.MyConnection;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author ImDoYeon
 */
public class UserData implements UserInformation {
    private List<Observer> observers;
    Observer ob;
  private String id;
  private String passwd;
  private String name;
  private String position;
  private String number;
  private int personalnumber;
     //옵저버 객체 저장 위해 ArrayList 추가하고 객체 생성
  public UserData() {
      observers = new ArrayList<Observer>();
  }
// 옵저버를 추가하고
 // measurmentChanged를 호출한다.
  public void addObserver(Observer o) {
    observers.add(o);
    measurmentChanged();
  }
  //옵저버 삭제 메소드
    @Override
  public void removeObserver(Observer o){
      observers.remove(o);
  }
//ConcreteObserver의 update에 추가/ 삭제 된 사용자의 정보를 넘긴다.
  public void notifyObservers() {
      for(int i = 0;i<observers.size();i++){
          Observer o = (Observer)observers.get(i);
          o.update(id, name,passwd,number,personalnumber,position);
      }
  }
//notifyObservers를 호출한다.
public void measurmentChanged(){
    notifyObservers();
 
}
//추가/삭제 할 사용자의 정보를 main에서 받아온다. 
  public  void setUserData(String name,String id, String passwd,  String position, 
          String number, int personalnumber) {
  this.id = id;
  this.name = name;
  this.passwd = passwd;
  this.number = number;
  this.personalnumber = personalnumber;
  this.position = position;
  }

}

