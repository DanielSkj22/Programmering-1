public class person_test {
    public static void main(String[] args) {
        ArbTaker obj = new ArbTaker();
        obj.setarbNr("1234");
        obj.setmånedLønn(35000);
        obj.setskattPro(0.30);
        obj.setansÅr(5);

        obj.trekk();
        obj.årslønn();
        obj.årTrekk();
        obj.taker();
        obj.alder();
        obj.ansatt();
        obj.veteran();
    }
}
