import java.util.Scanner;

public class test_student {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OppgaveOversikt obj2 = new OppgaveOversikt(null, null);
        Student obj = new Student();
        boolean run = true;

        while (run) {
        System.out.println("Tast 1 for registrering");
        System.out.println("Tast 3 for antall studenter");
        System.out.println("Tast 5 for å avslutte");
        int input = sc.nextInt();
            switch (input) {
                case 1:
                obj2.studenter.add(obj.getNavn());
                System.out.println(obj2.studenter);
                    break;
                case 2:
                    break;
                case 3:
                int antall = obj2.studenter.size();
                System.out.println(antall);
                    break;
                case 4:
                System.out.println("Hvilken Student");
                System.out.println(obj2.studenter);
                int hvilken = sc.nextInt();
                hvilken += -1;
                System.out.println(obj2.studenter.get(hvilken));
                    break;
                default:
                    run = false;
                    break;
            }
        } 
    }
}
