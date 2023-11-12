import java.util.Comparator;

public class StrengthComparator implements Comparator<Superhero> {

    public int compare(Superhero o1, Superhero o2){
        return Integer.compare(o1.getSuperheroStrength(),o2.getSuperheroStrength());
    }
}
