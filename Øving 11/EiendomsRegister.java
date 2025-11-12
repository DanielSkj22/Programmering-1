import java.util.ArrayList;

public class EiendomsRegister {
    Eiendom eiendom = new Eiendom();
    Eiendom obj;
    private ArrayList<Integer> sortering = new ArrayList<>();

    public EiendomsRegister(Eiendom eiendom){
        this.obj = eiendom;
    }
    public ArrayList<Integer> getSortering(){
        return sortering;
    }
    public int antallEiendom(){
        int antall = eiendom.getNavn().size();
        return antall;
    }
    public void gjennomSnitt(){
        float gjennom = 0;
        for ( int i = 0; i<eiendom.getAreal().size(); i++){
            gjennom += eiendom.getAreal().get(i);
        }
        System.out.println(gjennom);
    }
}