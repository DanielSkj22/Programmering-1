import java.util.ArrayList;

public class MenyRegister {
    public ArrayList<String> retter = new ArrayList<>();
    public ArrayList<String> oppskrift = new ArrayList<>();
    public ArrayList<String> typer = new ArrayList<>();
    public ArrayList<Integer> priser = new ArrayList<>();
    public ArrayList<Integer> mengde = new ArrayList<>();

    
    public void NyRett(String rett, String opp, int pris, String type){
        retter.add(rett);
        oppskrift.add(opp);
        priser.add(pris);
        typer.add(type);
    }
    public void finn(String noe){
        for (int i = 0; i<retter.size(); i++){
            if(retter.contains(noe)){
                int riktig = i;
            }
        }
    }
    public void FinnTyper(String noe){
        for (int i = 0; i<typer.size(); i++){
            if(typer.contains(noe)){
                mengde.add(i);
            }
            else;
        }
    }
}