import java.util.ArrayList;

public class Arrangement{
    public ArrayList<String> Navn = new ArrayList<>();
    public ArrayList<String> Sted = new ArrayList<>();
    public ArrayList<String> Arrangør = new ArrayList<>();
    public ArrayList<String> Type = new ArrayList<>();
    public ArrayList<Integer> Tidspunkt = new ArrayList<>();

    public void setNavn(String navn){
        Navn.add(navn);
    }
    public void setSted(String sted){
        Sted.add(sted);
    }
    public void setArr(String arr){
        Arrangør.add(arr);
    }
    public void setType(String type){
        Type.add(type);
    }
    public void setTid(int tid){
        Tidspunkt.add(tid);
    }

}