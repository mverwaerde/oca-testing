package assessment;

import java.util.ArrayList;
import java.util.List;

class Chicken {
}

interface HenHouse {
    public List<Chicken> getChickens();
}

class RedHenHouse implements HenHouse {
    public List<Chicken> getChickens() {
        return new ArrayList<Chicken>();
    }
}

class ChickenSong {
    public static void main(String[] args) {
        HenHouse house = new RedHenHouse();
        Chicken chicken = house.getChickens().get(0);
        for (int i = 0; i < house.getChickens().size(); chicken = house.getChickens().get(i++)) {
            System.out.println("Cluck");
        }
    }
}
