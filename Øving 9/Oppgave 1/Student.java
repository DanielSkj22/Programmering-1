import java.util.ArrayList;
import java.util.Scanner;
public class Student {
    
    private String navn;
    private int antOppg;


    public Student(){

    }
    public String getNavn(){
            return navn;
        }
    public int getAntOppg(){
            return antOppg;
        }
    public void økAntOppg(int økning){

    }
    public String toString(){
        return navn;
    }
    public void liste(){
        ArrayList<String> me = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        while(run){
            String input = sc.nextLine();
            if(input.equals("nei")){
                run = false;
            }
        me.add(input);
        }
        for (int i = 0; i < me.size(); i++){
            System.out.print(me.get(i)+" ");
    }
}
}
