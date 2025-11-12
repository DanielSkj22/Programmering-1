import java.util.ArrayList;

public class Eiendom {
    private ArrayList<String> navn = new ArrayList<>();
    private ArrayList<Integer> komuneNr = new ArrayList<>();
    private ArrayList<Integer> gardsNr = new ArrayList<>();
    private ArrayList<Integer> bruksNr = new ArrayList<>();
    private ArrayList<String> eier = new ArrayList<>();
    private ArrayList<String> gardsNavn = new ArrayList<>();
    private ArrayList<Float> areal = new ArrayList<>();

    public Eiendom(){
        navn = new ArrayList<>();
        komuneNr = new ArrayList<>();
        gardsNr = new ArrayList<>();
        eier = new ArrayList<>();
        gardsNavn = new ArrayList<>();
        areal = new ArrayList<>();
        bruksNr = new ArrayList<>();
    }
    public ArrayList<String>getNavn(){
        return navn;
    }
    public ArrayList<String>getEier(){
        return eier;
    }
    public ArrayList<String>getGardsNavn(){
        return gardsNavn;
    }
    public ArrayList<Integer>getKomuneNr(){
        return komuneNr;
    }
    public ArrayList<Integer>getGardsNr(){
        return gardsNr;
    }
    public ArrayList<Integer>getBruksNr(){
        return bruksNr;
    }
    public ArrayList<Float>getAreal(){
        return areal;
    }
    public void nyEiendomString(String Navn, String Eier, String Gard){
        navn.add(Navn);
        eier.add(Eier);
        gardsNavn.add(Gard);
    }
    public void nyEiendomInt(int komunenr, int gardsnr, int bruksnr, float Areal){
        komuneNr.add(komunenr);
        gardsNr.add(gardsnr);
        bruksNr.add(bruksnr);
        areal.add(Areal);
    }
    public void slettEiendom(int tall){
        navn.remove(tall);
        eier.remove(tall);
        gardsNavn.remove(tall);
        komuneNr.remove(tall);
        gardsNr.remove(tall);
        bruksNr.remove(tall);
        areal.remove(tall);
    }
    
}
