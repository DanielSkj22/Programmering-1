import java.util.Scanner;
public class person_test {
    public static void main(String[] args) {
        ArbTaker obj = new ArbTaker();
        Scanner sc = new Scanner(System.in);
        System.out.println("Arbeidsnummer");
        obj.setarbNr(sc.nextLine());
        System.out.println("Månedslønn");
        obj.setmånedLønn(sc.nextInt());
        System.out.println("Skatteprosent");
        obj.setskattPro(sc.nextDouble());
        System.out.println("Ansettelses år");
        obj.setansÅr(sc.nextInt());

        obj.trekk();
        obj.årslønn();
        obj.årTrekk();
        obj.taker();
        obj.alder();
        obj.ansatt();
        obj.veteran();
    }
}
