import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Eiendom eiendom = new Eiendom();
        EiendomsRegister register = new EiendomsRegister(eiendom);
        String fiks;
        boolean run = true;

        while(run){
            int input = scanner.nextInt();
            switch (input) {
                case 1:
                    fiks = scanner.nextLine();
                    //String navn = scanner.nextLine();
                    //String eier = scanner.nextLine();
                    //String gard = scanner.nextLine();
                    //eiendom.nyEiendomString(navn, eier, gard);
                    int kommune = scanner.nextInt();
                    int gards = scanner.nextInt();
                    int bruks = scanner.nextInt();
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
                //finne etter numre
                    System.out.println(eiendom.getAreal());
                    System.out.println(eiendom.getAreal().get(0));
                    break;
                case 5:
                    //feil
                    register.gjennomSnitt();
                    break;
                default:
                    scanner.close();
                    run = false;
                    break;
        }
    }
}
}
