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
                    obj.nyArr(navn, sted, arr, type, tid);
                    break;
                case 2:
                    fiks = sc.nextLine();
                    System.out.println("**************");
                    String søk = sc.nextLine();
                    obj.søkSted(søk);
                    for (int j = 0; j < obj.getSø().size(); j++){
                        int o = obj.getSø().get(j);
                        System.out.println(obj.getNavn().get(o));
                    }
                    break;
                case 3:
                    fiks = sc.nextLine();
                    System.out.println("**************");
                    int finn = sc.nextInt();
                    obj.søkTid(finn);
                    for (int j = 0; j < obj.getSø().size(); j++){
                        int o = obj.getSø().get(j);
                        System.out.println(obj.getNavn().get(o));
                    }
                    break;
                case 4:
                    obj.liste();
                    break;
                default:
                    run = false;
                    sc.close();
                    break;
            }
        }
        
    }
}
