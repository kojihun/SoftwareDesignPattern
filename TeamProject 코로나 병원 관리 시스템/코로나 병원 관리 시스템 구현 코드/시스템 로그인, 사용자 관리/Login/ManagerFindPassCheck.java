package Login;

import javax.swing.JOptionPane;

/**
 *
 * @author ImDoYeon
 */

public class ManagerFindPassCheck extends Login{
    public ManagerFindPassCheck(){
    //FindPasswdManager로 행동을 위임
    searchpasswd = new FindPasswdManager();
    
    }
    public void display(boolean success){
    //정보의 매치가 성공하고 
    //리턴받은 비밀번호 값을 메시지로 출력
    JOptionPane.showMessageDialog(null, ""+passwd);
    LoginFrame frame = new LoginFrame();
    frame.setVisible(true);
    }
}
