import java.util.ArrayList;

public class MenyRegister {
    private ArrayList<String> forret = new ArrayList<String>();
    private ArrayList<String> hoved = new ArrayList<String>();
    private ArrayList<String> dessert = new ArrayList<String>();
    private String rett;
    
    public void NyRett(){
        int input = 0;
        switch (input) {
            case 1:
                forret.add(rett);
                break;
            case 2: 
                hoved.add(rett);
            case 3:
                dessert.add(rett);
            default:
                break;
        }
    }
}
