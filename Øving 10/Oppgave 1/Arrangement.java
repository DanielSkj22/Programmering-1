import java.util.ArrayList;

public class Arrangement{
    private ArrayList<String> Navn = new ArrayList<>();
    private ArrayList<String> Sted = new ArrayList<>();
    private ArrayList<String> Arrangør = new ArrayList<>();
    private ArrayList<String> Type = new ArrayList<>();
    private ArrayList<Integer> Tidspunkt = new ArrayList<>();

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