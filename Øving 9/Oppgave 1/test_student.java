
public class test_student {

    public static void main(String[] args) {
        OppgaveOversikt obj2 = new OppgaveOversikt(null, null);
        Student obj = new Student();
        boolean run = true;

        while (run) {
            obj2.studenter.add(obj.getNavn());
            obj2.studenter.add(obj.getNavn());
            obj2.studenter.add(obj.getNavn());
            run = false;
        } 
        System.out.println(obj2.studenter.get(2));
        System.out.println(obj2.studenter);
        System.out.println(obj2.oppgaverG);
    }
}
