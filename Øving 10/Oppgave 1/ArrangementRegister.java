import java.util.ArrayList;

public class ArrangementRegister {
    public ArrayList<Integer> søk = new ArrayList<Integer>();
    Arrangement obj = new Arrangement();

    public void nyArr(String navn, String sted, String arr, String type, int tid ){
        obj.Navn.add(navn);
        obj.Sted.add(sted);
        obj.Arrangør.add(arr);
        obj.Type.add(type);
        obj.Tidspunkt.add(tid);
    }
    public ArrayList<String> getNavn(){
        return obj.Navn;
    }
    public ArrayList<String> getSted(){
        return obj.Sted;
    }
    public ArrayList<String> getArr(){
        return obj.Arrangør;
    }
    public ArrayList<String> getType(){
        return obj.Type;
    }
    public ArrayList<Integer> getTids(){
        return obj.Tidspunkt;
    }
    public ArrayList<Integer> getSø(){
        return obj.sø;
    }
    public void søkSted(String sk){
        obj.sø.clear();
        for (int i = 0; i < obj.Sted.size(); i++){
            if (obj.Sted.get(i).equals(sk)){
                obj.sø.add(i);
            }
        }
    }
    public void søkTid(int sl){
        obj.sø.clear();
        for (int i = 0; i < obj.Sted.size(); i++){
            if (obj.Tidspunkt.get(i).equals(sl)){
                obj.sø.add(i);
            }
        }
    }
    public void liste(){
        for (int i = 0; i < obj.Navn.size(); i++){
            System.out.println(obj.Navn.get(i)+obj.Sted.get(i));
        }
    }

}