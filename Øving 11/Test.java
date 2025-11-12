import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Eiendom eiendom = new Eiendom();
        EiendomsRegister register = new EiendomsRegister();
        String fiks;
        boolean run = true;
        int kommune = 0;
        int gards = 0;
        int bruks = 0;

        while(run){
            System.out.println("*****************");
            int input = scanner.nextInt();
            switch (input) {
                case 1:
                    fiks = scanner.nextLine();
                    String navn = scanner.nextLine();
                    String eier = scanner.nextLine();
                    String gard = scanner.nextLine();
                    eiendom.nyEiendomString(navn, eier, gard);
                    kommune = scanner.nextInt();
                    gards = scanner.nextInt();
                    bruks = scanner.nextInt();
                    float arealet = scanner.nextFloat();
                    eiendom.nyEiendomInt(kommune, gards, bruks, arealet);
                    break;
                case 2:
                    input = scanner.nextInt();
                    eiendom.slettEiendom(input);
                    break;
                case 3:
                    System.out.println(register.antallEiendom());
                    break;
                case 4:
                    kommune = scanner.nextInt();
                    gards = scanner.nextInt();
                    bruks = scanner.nextInt();
                    System.out.println(register.finnNr(kommune, gards, bruks, eiendom));
                    break;
                case 5:
                   System.out.println(register.gjennomSnitt(eiendom));
                    break;
                default:
                    scanner.close();
                    run = false;
                    break;
        }
    }
}
}
