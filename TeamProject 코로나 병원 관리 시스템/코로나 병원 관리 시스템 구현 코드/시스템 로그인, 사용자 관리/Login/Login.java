package Login;

/**
 *
 * @author ImDoYeon
 */
abstract class Login {
    protected SearchID searchID;
    protected SearchPasswd searchpasswd;
    protected String  passwd;
    public boolean checkInfo;  
    String name;
    public Login(){
        System.out.println("login기본생성자");
    }
    public boolean SearchLogin(String id, String passwd){
    //메인 클래스에서 받아온 id와 passwd 정보를 
    //정보를 매치하는 행동클래스로 넘긴다. 
    searchID.setINFO(id, passwd);
    //정보 매치가 성공한다면 true를 반환한다.
    if(searchID.SearchIDinfo()){return true;}
    else return false;
    }
    public String passinfo(String id, int personalnumber){
    //메인 클래스에서 받아온 id,personalnumber를 
    //정보를 매치하는 행동클래스로 넘기고, 비밀번호 값을 리턴받는다.
    searchpasswd.setPinfo( id,  personalnumber);
    passwd = searchpasswd.searchpasswd();
    //리턴받은 비밀번호 값을 리턴한다.
    return passwd;
    }
    public abstract void display(boolean success);
}



    /*public void passinfo(String id, int personalnumber){
        searchpasswd.setPinfo( id,  personalnumber);
    passwd = searchpasswd.searchpasswd();
    }*/