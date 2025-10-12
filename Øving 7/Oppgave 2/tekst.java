import java.util.Scanner;

public class tekst {
    public Scanner sc = new Scanner(System.in);
    public String ting;
    public String ta;
    public String bort;
    public String[] ja;
    public int resu;
    public String p;
    public tekst(String ting, String ta, String bort){
        this.ting = ting;
        this.ta = ta;
        this.bort = bort;
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
        String regex = " ";
        String regex1 = "[.:!?]";
        double len = 0;
        String[] me = ting.split(regex1);
        double lengde = me.length;
        for(int i = 0; i < lengde; i++){
            String h[] = me[i].split(regex);
            len += h.length;
        }
        double snitt = len /lengde;
        System.out.printf("%.2f%n",snitt);
    }
    public void skifte(){
        String mindre = ting.toLowerCase();
        String regex = " ";
        ja[0] = ta;
        String[] me = mindre.split(regex);
        double lengde = me.length;
        for(int i = 0; i < lengde; i++){
            if(me[i] == ja[0]){
                System.err.println(bort);
            }
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
    


