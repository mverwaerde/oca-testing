package assessment;

interface Animal { public String getName();}
interface Mammal {public String getName();}
abstract class Otter implements Mammal, Animal {

    @Override
    public String getName(){
        return "assessment.Otter";
    }
}
