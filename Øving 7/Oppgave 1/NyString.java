import java.util.Scanner;
public class NyString {
    public String setning;
    public Scanner sc = new Scanner(System.in);
    public String u = sc.nextLine().toLowerCase();
    public boolean f = true; 

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
        String regex = " ";
        String[] my = setning.split(regex);
        for(int i =0; i<= setning.length(); i++){
             String f = my[i];
             System.out.println(f);
            }
        }

    }

