package comparator;
import Data.Superhero;
import java.util.Comparator;

public class SuperheroPowerComparator implements Comparator<Superhero> {
    @Override
    public int compare(Superhero o1, Superhero o2) {
        return o1.getSuperheroPower().compareTo(o2.getSuperheroPower());
    }
}
