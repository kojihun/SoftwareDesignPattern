package Login;

import userManagement.UserManagementFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author ImDoYeon
 */
public class UserLogin extends Login {
    UserLogin(){
    System.out.println("유저인식");
    //StartIDU 로 행동을 위임
    searchID =new StartIDU();
    }// 로그인에 성공했을 경우 유저용 메인 관리창을 띄운다.
    public void display(boolean success){
        if(success ==true ){
       MainUserFrame mainframe= new MainUserFrame();
            mainframe.setVisible(true); 
            System.out.println("유저용병원관리창");
        }else{
        JOptionPane.showMessageDialog(null, "로그인 실패");
        }   
    }
} 
