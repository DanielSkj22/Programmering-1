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
                String rett = sc.nextLine();
                String opp = sc.nextLine();
                int pris = sc.nextInt();
                fiks = sc.nextLine();
                String type = sc.nextLine();
                obj.NyRett(rett, opp, pris, type);
                break;
            case 2:
                noe = sc.nextLine();
                obj.finn(noe);
                riktig = obj.finner.get(0);
                System.out.println(obj.retter.get(riktig));
                System.out.println(obj.oppskrift.get(riktig));
                System.out.println(obj.priser.get(riktig));
                System.out.println(obj.typer.get(riktig));
                break;
            case 3:
                noe = sc.nextLine();
                obj.FinnTyper(noe);
                for (int l = 0; l<obj.mengde.size(); l++){
                   System.out.println(obj.retter.get(obj.mengde.get(l)));
                }
                break;

            default:
                run = false;
                sc.close();
                break;
        }
        //System.out.println(obj.retter);
        //System.out.println(obj.oppskrift);
        //System.out.println(obj.priser);
        //System.out.println(obj.typer);
    }
    }
}




 