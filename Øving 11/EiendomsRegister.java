import java.util.ArrayList;

public class EiendomsRegister {
    Eiendom eiendom = new Eiendom();
    private ArrayList<Integer> sortering = new ArrayList<>();

    public ArrayList<Integer> getSortering(){
        return sortering;
    }
    public int antallEiendom(){
        int antall = eiendom.getNavn().size();
        return antall;
    }
    public float gjennomSnitt(){
        float gjennom = 0;
        for (int i = 0; i>eiendom.getGardsNavn().size(); i++){
            gjennom = gjennom + eiendom.getAreal().get(i);
        }
        return gjennom/eiendom.getNavn().size();
    }
    public void Eiendommer(){
        for (int i = 0; i<eiendom.getNavn().size(); i++){
            System.out.println(eiendom.getNavn().get(i)+" "+eiendom.getGardsNavn().get(i)+" "+eiendom.getEier().get(i));
            System.out.println(eiendom.getKomuneNr().get(i)+"-"+eiendom.getGardsNr().get(i)+"/"+eiendom.getBruksNr().get(i));
            System.out.println(eiendom.getAreal().get(i));
        }
    }
}