package userManagement;

import java.util.List;

/**
 *
 * @author ImDoYeon
 */
public interface UserInformation {
    void addObserver(Observer o) ;
    void removeObserver(Observer o);
    void notifyObservers() ;
}
