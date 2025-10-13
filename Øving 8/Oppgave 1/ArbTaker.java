public class ArbTaker {
    Person obj = new Person();
    private String arbNr;
    private String ansÅr;
    private String månedLønn;
    private String skattPro;

    public String getarbNr(){
        return arbNr;
    }
     public String getansÅr(){
        return ansÅr;
    }
     public String getmånedLønn(){
        return månedLønn;
    }
     public String getskattPro(){
        return skattPro;
    }
    public void setarbNr(String newNR){
        this.arbNr = newNR;
    }
    public void setansÅr(String newÅR){
        this.ansÅr = newÅR;
    }
    public void setmånedLønn(String newLønn){
        this.månedLønn = newLønn;
    }
    public void setskattPro(String newPro){
        this.skattPro = newPro;
    }
}
