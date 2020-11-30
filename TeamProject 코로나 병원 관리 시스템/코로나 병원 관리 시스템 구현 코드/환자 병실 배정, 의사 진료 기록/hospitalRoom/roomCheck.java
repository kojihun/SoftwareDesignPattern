package hospitalRoom;

/**
 *
 * @author ShinMinJin
 */
public class roomCheck {
    private State state = new stateEmpty();
    
    public void setState(State state) {
        this.state = state;
    }
    
    
    public void emptyRoom(){
        state.emptyRoom(this);
    }
    
    public void someRoom(){
        state.someRoom(this);
    }
    
    public void lotRoom(){
        state.lotRoom(this);
    }
    
}
