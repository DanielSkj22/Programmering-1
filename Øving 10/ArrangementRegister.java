import java.util.ArrayList;
import java.util.Scanner;

public class ArrangementRegister {
    public ArrayList<String> morn = new ArrayList<String>();
    public static void main(String[] args) {
    Arrangement obj = new Arrangement();
    Scanner sc = new Scanner(System.in);

        for (int i = 0; i<3; i++){
            String input = sc.nextLine();
        obj.konsert.add(input);
        
        }
    System.out.println(obj.konsert);
    }
}
