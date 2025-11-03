import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        ArrangementRegister obj = new ArrangementRegister();
        Arrangement list = new Arrangement();
        String fiks;
        Scanner sc = new Scanner(System.in);
        boolean run = true;

        while (run){
            System.out.println("********************");
        int input = sc.nextInt();
            switch (input) {
                case 1:
                    fiks = sc.nextLine();
                    System.out.println("**************");
                    String navn = sc.nextLine();
                    String sted = sc.nextLine();
                    String arr = sc.nextLine();
                    String type = sc.nextLine();
                    int tid = sc.nextInt();
                    obj.nyttArr(navn, sted, arr, type, tid);
                    break;
                case 2:
                    fiks = sc.nextLine();
                    System.out.println("**************");
                    String søSted = sc.nextLine();
                    obj.stedSøk(søSted);
                    System.out.println(obj.søk.get(0));
                    for (int j = 0; j < obj.søk.size(); j++){
                        int l = obj.søk.get(j);
                        System.out.println(list.Navn.get(l));
                    }
                    break;
                default:
                    run = false;
                    sc.close();
                    break;
            }
        }
        
    }
}
