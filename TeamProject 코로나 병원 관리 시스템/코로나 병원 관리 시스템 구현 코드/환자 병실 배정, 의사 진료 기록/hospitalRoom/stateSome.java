package hospitalRoom;

/**
 *
 * @author ShinMinJin
 */
public class stateSome implements State{
    private static stateSome instance = new stateSome();
    
    public static State getInstance(){
        return instance;
    }
    
    @Override
    public void emptyRoom(roomCheck roomcheck){
        System.out.println("방은 비어있습니다.");
 
    }
    
    @Override
    public void someRoom(roomCheck roomcheck){
        System.out.println("사람이 조금 있습니다.");
        roomcheck.setState(stateSome.getInstance());
    }
    
    
    @Override
    public void lotRoom(roomCheck roomcheck){
        System.out.println("아무것도 하지 않는다");
    }
    
    
}
