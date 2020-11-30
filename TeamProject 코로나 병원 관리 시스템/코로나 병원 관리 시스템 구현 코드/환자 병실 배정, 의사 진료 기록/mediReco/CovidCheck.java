package mediReco;

/**
 *
 * @author ShinMinJin
 */
public class CovidCheck  implements Record {
    public ConfirmCovid cC;
    
    @Override
    public String addCovidCheck(float a, String b, String c){
        int l;
        ConfirmCovid cC = new ConfirmCovid();
        l = cC.ConfirmCovid(a, b, c);
        
        if(l>2)
            return "확진";
        else
            return "비확진";
    }
    
    @Override
    public void addRoundsCheck(){
        
        
    }
    

}
