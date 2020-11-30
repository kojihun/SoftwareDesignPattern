package hospitalRoom;

/**
 *
 * @author ShinMinJin
 */
public class stateEmpty implements State {
    private static stateEmpty instance = new stateEmpty();
    
    public static State getInstance(){
        return instance;
    }
    
    @Override
    public void emptyRoom(roomCheck roomcheck){
        System.out.println("방은 현재 비어있습니다.");
        roomcheck.setState(stateEmpty.getInstance());

    }
    

    
    @Override
    public void someRoom(roomCheck roomcheck){
        System.out.println("사람을 추가할 수 있습니다.");
    }
    
    @Override
    public void lotRoom(roomCheck roomcheck){
        System.out.println("사람을 추가할 수 없습니다");
    }
}
