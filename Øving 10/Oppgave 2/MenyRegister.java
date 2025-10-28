import java.util.ArrayList;

public class MenyRegister {
    public ArrayList<String> retter = new ArrayList<>();
    public ArrayList<String> oppskrift = new ArrayList<>();
    public ArrayList<String> typer = new ArrayList<>();
    public ArrayList<Integer> priser = new ArrayList<>();
    public ArrayList<Integer> finner = new ArrayList<>();
    public ArrayList<Integer> mengde = new ArrayList<>();
    public ArrayList<String> meny = new ArrayList<>();

    
    public void NyRett(String rett, String opp, int pris, String type){
        retter.add(rett);
        oppskrift.add(opp);
        priser.add(pris);
        typer.add(type);
        meny.add(rett);
    }
    public void finn(String noe){
        for (int i = 0; i<retter.size(); i++){
            String nei = retter.get(i);
            if(nei.equals(noe)){
                finner.add(i);
            }
        }
    }
    public void FinnTyper(String noe){
        for (int j = 0; j<retter.size();j++){
            String ja = typer.get(j);
            if(ja.equals(noe)){
                mengde.add(j);
            }
        }
    }
    public void Menyer(int valg, String navn){
        for (int i = 0; i<retter.size(); i++){
            String hva = retter.get(i);
            if (hva.equals(retter.get(valg))){
                meny.add(i, navn);
                meny.remove(i+1);
            }
        }
    }
}