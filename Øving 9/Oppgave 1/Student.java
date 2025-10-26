import java.util.Scanner;

public class Student {
    
    private String navn;
    private int antOppg;
    private Scanner sc = new Scanner(System.in);

    public String getNavn(){
            return navn;
        }
    public int getAntOppg(){
            return antOppg;
        }
    public void økAntOppg(int økning){
        antOppg += 1;
    }
    public String toString(){
        return navn + " "+ antOppg;
}
}

