import java.util.Scanner;

public class test_tekst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ting = sc.nextLine();
        tekst obj = new tekst(ting);

        obj.antall();
        obj.gjen();
        //obj.fleregjen();
        obj.normal();
        obj.upper();

        sc.close();
    
    }
    
}
