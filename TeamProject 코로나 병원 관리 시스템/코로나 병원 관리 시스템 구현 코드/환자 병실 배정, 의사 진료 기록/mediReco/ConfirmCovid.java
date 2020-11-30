package mediReco;

/**
 *
 * @author ShinMinJin
 */
public class ConfirmCovid {
    public int ConfirmCovid(float temp, String cough, String sick){
       int temp1 = 0;
       int cough1 =0;
       int sick1 = 0;
       
        if(temp>37.5)
            temp1 = 1;
        else
            temp1 = 0;
                
        if(cough.equals("lot"))
             cough1 = 2;
        else if(cough.equals("some"))
             cough1 =1;
        else if(cough.equals("not"))
            cough1 = 0;
        
        if(sick.equals("yes"))
            sick1 = 1;
        else if(sick.equals("no"))
            sick1=0;
        
        int check = cough1+temp1+sick1;
        return check;
   }
}
