package Login;

import userManagement.UserManagementFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author ImDoYeon
 */
public class ManagerLogin extends Login{
    ManagerLogin(){
    System.out.println("매니저인식");
    //StartIDM 으로 행동을 위임
    searchID = new StartIDM();
    }
    @Override
    public void display(boolean success){
        //매니저용 관리 시스템 창 생성
        if(success ==true ){
            UserManagementFrame newframe = new UserManagementFrame();
            newframe.setVisible(true);
            System.out.println("매니저용관리창");
        }else{
        JOptionPane.showMessageDialog(null, "로그인 실패");
        }        
    }
}
