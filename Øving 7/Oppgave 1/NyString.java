import java.util.Scanner;
public class NyString {
    public String setning;
    Scanner sc = new Scanner(System.in);
    String u = sc.nextLine().toLowerCase();

    public NyString(String setning){
        this.setning = setning;
        sc.close();
    }
    public void uten(){
        String regex = u;
        String[] my = setning.split(regex);
        for (String s : my) {
            System.out.print(s);
        }
    System.out.println();
    }
    public void forko(){
        String regex = "";
        String[] fork = setning.split(regex);
        for (String f : fork) {
            System.out.print(f);
        }
    }
}
