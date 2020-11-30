package Login;

import javax.swing.JOptionPane;

/**
 *
 * @author ImDoYeon
 */
public class UserFindPassCheck extends Login {
    public UserFindPassCheck(){
    //FindPasswdUser로 행동을 위임
    searchpasswd = new FindPasswdUser();
    }
    @Override //정보의 매치가 성공하고 
    //리턴받은 비밀번호 값을 메시지로 출력
    public void display(boolean success){
    JOptionPane.showMessageDialog(null, " "+passwd);
    LoginFrame frame = new LoginFrame();
    frame.setVisible(true);
    }
}
