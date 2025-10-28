import java.util.Scanner;

public class test {
    public static void main(String[] args) {
    MenyRegister obj = new MenyRegister();
    Scanner sc = new Scanner(System.in);
    boolean run = true;
    int riktig = 0;
    String noe;

    while (run) {
        System.out.println("******************************");
        int input = sc.nextInt();
        String fiks = sc.nextLine();
        switch (input) {
            case 1:
                System.out.println("Navnet på retten");
                String rett = sc.nextLine();
                System.out.println("Oppskrift");
                String opp = sc.nextLine();
                System.out.println("Pris i kr");
                int pris = sc.nextInt();
                fiks = sc.nextLine();
                System.out.println("Type rett");
                String type = sc.nextLine();
                obj.NyRett(rett, opp, pris, type);
                break;
            case 2:
                System.out.println("Hvilken ret vil du finne");
                noe = sc.nextLine();
                obj.finn(noe);
                riktig = obj.finner.get(0);
                System.out.println(obj.retter.get(riktig));
                System.out.println(obj.oppskrift.get(riktig));
                System.out.println(obj.priser.get(riktig));
                System.out.println(obj.typer.get(riktig));
                break;
            case 3:
                System.out.println("Hvilken type vil du finne");
                noe = sc.nextLine();
                obj.FinnTyper(noe);
                for (int l = 0; l<obj.mengde.size(); l++){
                   System.out.println(obj.retter.get(obj.mengde.get(l)));
                }
                break;
            case 4:
                System.out.println("Hvilken rett vil du legge til som meny");
                int valg = sc.nextInt()-1;
                fiks = sc.nextLine();
                System.out.println("Navnet på menyen");
                String navn = sc.nextLine();
                obj.Menyer(valg, navn);
                break;
            case 5:
                System.out.println("Hva slags intervall");
            default:
                run = false;
                sc.close();
                break;
        }
    }
    }
}




 