import java.util.Scanner;

public class tekst {
    public Scanner sc = new Scanner(System.in);
    public String ting;
    public int resu;
    public String p;
    
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
    public void gjen(){
        String regex = " ";
        String[] me = ting.split(regex);
        double lengde = me.length;
        for(int i = 0; i < lengde; i++){
            String l = me[i];
            resu += l.length();
        }
        double snitt = resu /lengde;
        System.out.printf("%.2f%n",snitt);
    }
    public void fleregjen(){
        String regex = "[.]";
        String regex1 = " ";
        String[] me = ting.split(regex);
        double lengde = me.length;
        for(int i = 0; i < lengde; i++){
            p = me[i];
            me = ting.split(regex1);
            System.out.println(p.length());
        }
    }
    public void normal(){
        System.out.println(ting);
    }
    public void upper(){
        String upper = ting.toUpperCase();
        System.out.println(upper);
    }
    }

