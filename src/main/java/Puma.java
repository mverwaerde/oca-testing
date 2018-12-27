public abstract class Puma implements HasTail{

    public int getTailLength() {
        return 4;
    }
}

class Cougar extends Puma{
    public static void main(String[] args) {
        Puma puma = new Cougar();
    }

    public int getTailLength() {
        return 4;
    }
}

interface HasTail {
    int getTailLength();
}
