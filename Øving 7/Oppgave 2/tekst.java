import java.util.Scanner;

public class tekst {
    public Scanner sc = new Scanner(System.in);
    public String ting;
    
    public tekst(String ting){
        this.ting = ting;
        sc.close();
    }
    public void antall(){
        String regex = " ";
        String[] me = ting.split(regex);
        int lengde = me.length;
        System.out.println(lengde);
        }
    }

