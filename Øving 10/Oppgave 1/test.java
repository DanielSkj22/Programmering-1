import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        ArrangementRegister obj = new ArrangementRegister();
        Scanner sc = new Scanner(System.in);
        boolean run = true;

        while (run){
        int input = sc.nextInt();
            switch (input) {
                case 1:
                    String fiks = sc.nextLine();
                    System.out.println("**************");
                    String navn = sc.nextLine();
                    String sted = sc.nextLine();
                    String arr = sc.nextLine();
                    String type = sc.nextLine();
                    int tid = sc.nextInt();
                    obj.nyttArr(navn, sted, arr, type, tid);
                    break;
            
                default:
                    run = false;
                    sc.close();
                    break;
            }
        }
        
    }
}
