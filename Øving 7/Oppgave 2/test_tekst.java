import java.util.Scanner;

public class test_tekst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ting = sc.nextLine().toLowerCase();
        tekst obj = new tekst(ting);

        obj.antall();

        sc.close();
    
    }
    
}
