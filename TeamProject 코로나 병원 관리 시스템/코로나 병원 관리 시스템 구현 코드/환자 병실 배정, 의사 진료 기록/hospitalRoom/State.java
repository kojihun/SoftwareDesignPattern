package hospitalRoom;

/**
 *
 * @author ShinMinJin
 */
public interface State {
    void emptyRoom(roomCheck roomCheck);
    void someRoom(roomCheck roomCheck);
    void lotRoom(roomCheck roomCheck);
    
}
