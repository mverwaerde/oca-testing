package assessment;

public class Deer {

    public Deer() {
        System.out.println("assessment.Deer");
    }
    public Deer(int age){
        System.out.println("DeerAge");
    }
    private boolean hasHorns(){
        return false;
    }

    public static void main(String[] args) {
        Deer deer = new Reindeer(5);
        System.out.println("," +(deer.hasHorns()));
    }

    static class Reindeer extends Deer {
        public Reindeer(int age) {
            System.out.println("Reindeer");
        }
        public boolean hasHorns(){return true;}
    }
}
