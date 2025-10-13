public class ArbTaker {
    Person obj = new Person();
    private String arbNr;
    private String ansÅr;
    private int månedLønn;
    private String skattPro;

    public String getarbNr(){
        return arbNr;
    }
     public String getansÅr(){
        return ansÅr;
    }
     public int getmånedLønn(){
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
    public void setmånedLønn(int newLønn){
        this.månedLønn = newLønn;
    }
    public void setskattPro(String newPro){
        this.skattPro = newPro;
    }
    public void taker(){
        obj.setName("Daniel");
        obj.setName2("Skjørtorp");
        System.out.println(obj.getName1()+" "+ obj.getName());
    }
    public void årslønn(){
        System.out.println("Arbeids nummer: " + arbNr);
        System.out.println("Årslønn: " + månedLønn*12);
    }
    public void alder(){
        obj.setÅr("23");
        System.out.println(obj.getÅr()+ " År");
    }
}
