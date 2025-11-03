import java.util.ArrayList;

public class ArrangementRegister {
    Arrangement obj = new Arrangement();
    ArrayList<Integer> søk = new ArrayList();

    public void nyttArr(String navn, String sted, String arr, String type, int tid){
        obj.setNavn(navn);
        obj.setSted(sted);
        obj.setArr(arr);
        obj.setType(type);
        obj.setTid(tid);
    }
    public void stedSøk(String søkSted){
        for (int i = 0; i < obj.Sted.size(); i++){
            if (obj.Sted.equals(søkSted)){
                søk.add(i);
            }
        }
    }
}
