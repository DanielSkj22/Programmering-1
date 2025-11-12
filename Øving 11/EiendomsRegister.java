import java.util.ArrayList;

public class EiendomsRegister {
    Eiendom eiendom = new Eiendom();
    private ArrayList<Integer> sortering = new ArrayList<>();
    private String finn;

    public ArrayList<Integer> getSortering(){
        return sortering;
    }
    public int antallEiendom(Eiendom eiendom){
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
    public String finnNr(int kommune, int gards, int bruks, Eiendom eiendom){
          for ( int i = 0; i<eiendom.getAreal().size(); i++){
            if(eiendom.getKomuneNr().get(i).equals(kommune)&&eiendom.getGardsNr().get(i).equals(gards)&&eiendom.getBruksNr().get(i).equals(bruks)){
                finn = eiendom.getNavn().get(0);
            }
            else{
                finn = "nei";
            }
        }
        return finn;
    }
    public void printing(Eiendom eiendom){
        System.out.println(eiendom.getNavn());
        System.out.println(eiendom.getEier());
        System.out.println(eiendom.getGardsNavn());
        System.out.println(eiendom.getKomuneNr()+"-"+eiendom.getGardsNr()+"/"+eiendom.getBruksNr());
        System.out.println(eiendom.getAreal());
    }
}