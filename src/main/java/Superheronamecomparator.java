import java.util.Comparator;

public class Superheronamecomparator implements Comparator<Superhero> {

    public int compare(Superhero o1, Superhero o2){
        return o1.getSuperheroName().compareTo(o2.getSuperheroName());
    }
}
