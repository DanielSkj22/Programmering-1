import java.util.ArrayList;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
    MenyRegister obj = new MenyRegister();
    Scanner sc = new Scanner(System.in);
    boolean run = true;
    while (run) {
        int input = sc.nextInt();
        String fiks = sc.nextLine();
        switch (input) {
            case 1:
                String rett = sc.nextLine();
                String opp = sc.nextLine();
                int pris = sc.nextInt();
                fiks = sc.nextLine();
                String type = sc.nextLine();
                obj.NyRett(rett, opp, pris, type);
                break;
            case 2:
                System.out.println("noe");
                break;
            default:
                run = false;
                sc.close();
                break;
        }
        System.out.println(obj.retter);
        System.out.println(obj.oppskrift);
        System.out.println(obj.priser);
        System.out.println(obj.typer);
    }
    }


}

 