package mediReco;

import java.util.Vector;

/**
 *
 * @author ShinMinJin
 */
public abstract class RecordFactory {
    
    public abstract Record getRecord(String checkType);
    
    public abstract Vector show();
    
}
