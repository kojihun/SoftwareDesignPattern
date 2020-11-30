package managementPatient;

/**
 *
 * @author KoJiHun
 */
public interface Management {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
