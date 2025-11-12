import java.util.ArrayList;

public class EiendomsRegister {
    Eiendom eiendom = new Eiendom();
    private ArrayList<Integer> sortering = new ArrayList<>();
    private String finn;

    public ArrayList<Integer> getSortering(){
        return sortering;
    }
    public int antallEiendom(){
        int antall = eiendom.getNavn().size();
        return antall;
    }
    public float gjennomSnitt(Eiendom eiendom){
        float gjennom = 0;
        for ( int i = 0; i<eiendom.getAreal().size(); i++){
            gjennom += eiendom.getAreal().get(i);
        }
        return gjennom/eiendom.getAreal().size();
    }
    public String finnNr(int komune, int gards, int bruks, Eiendom eiendom){
        finn = eiendom.getNavn().get(0);
    return finn;
}
}