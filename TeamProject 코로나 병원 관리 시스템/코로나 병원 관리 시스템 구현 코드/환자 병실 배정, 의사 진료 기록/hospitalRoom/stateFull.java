package hospitalRoom;

/**
 *
 * @author ShinMinJin
 */
public class stateFull implements State{
    private static stateFull instance = new stateFull();
    
    public static State getInstance(){
        return instance;
    }
    
    @Override
    public void emptyRoom(roomCheck roomcheck){
        System.out.println("방은 현재 비어있습니다.");
    }
    
    @Override
    public void someRoom(roomCheck roomcheck){
        System.out.println("다른 방을 이용해 주세요");
    }
    
    @Override
    public void lotRoom(roomCheck roomcheck){
        System.out.println("사람이 가득 차 있습니다.");
        roomcheck.setState(stateEmpty.getInstance());
    }
    

}
