import java.util.ArrayList;
import java.util.Scanner;

public class OppgaveOversikt {
    private int antStud;
    public ArrayList<Integer> oppgaverG = new ArrayList<Integer>();
    public ArrayList<String> studenter = new ArrayList<String>();
    Scanner sc = new Scanner(System.in);

    public OppgaveOversikt(ArrayList<String> studenter,ArrayList<Integer> oppgaverG){
    }
    public void oppgaver(){
        oppgaverG.add(1);
        oppgaverG.add(2);
    }
    public void stud(){
        studenter.add(sc.nextLine());
    }
}
