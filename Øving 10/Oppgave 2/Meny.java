import java.util.ArrayList;

public class Meny {
    public ArrayList<String> meny1 = new ArrayList<>();
    public int meny1pris = 0;
    public ArrayList<Integer> meny2 = new ArrayList<>();
    public ArrayList<Integer> meny3 = new ArrayList<>();
    Rett obj;

     public Meny(Rett rett) {
        this.obj = rett;
    }

    public ArrayList<String> getNavn(){
        return obj.Navn;
    }
    public ArrayList<Integer> getPris(){
        return obj.Pris;
    }
    public void nyMeny1(int input){
        meny1pris = meny1pris+obj.Pris.get(input);
        meny1.add(obj.Navn.get(input));
    }
}
