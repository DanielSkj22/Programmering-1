

public class ArrangementRegister {
    Arrangement obj = new Arrangement();

    public void nyttArr(String navn, String sted, String arr, String type, int tid){
        obj.setNavn(navn);
        obj.setSted(sted);
        obj.setArr(arr);
        obj.setType(type);
        obj.setTid(tid);
    }
}
