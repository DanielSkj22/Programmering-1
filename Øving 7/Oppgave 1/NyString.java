import java.util.Scanner;
public class NyString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String setning = sc.nextLine();
        String nei = " ";
        String nei2 = "h"; 
        String[] noe = setning.split(nei2);
        for ( String h : noe){
            System.out.println(h);
        }


        sc.close();
        
    }
}
