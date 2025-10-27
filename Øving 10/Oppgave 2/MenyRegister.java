import java.util.ArrayList;

public class MenyRegister {
    public ArrayList<String> retter = new ArrayList<>();
    public ArrayList<String> oppskrift = new ArrayList<>();
    public ArrayList<String> typer = new ArrayList<>();
    public ArrayList<Integer> priser = new ArrayList<>();
    public void NyRett(String rett, String opp, int pris, String type){
        retter.add(rett);
        oppskrift.add(opp);
        priser.add(pris);
        typer.add(type);

    }
}