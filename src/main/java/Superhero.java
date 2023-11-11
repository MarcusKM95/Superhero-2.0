public class Superhero {

    private String name;
    private String superheroName;
    private String superheroPower;
    private int creationYear;
    private int superheroStrength;

    //constructors
public Superhero(String name, String superheroName, String superheroPower, int creationYear, int superheroStrength) {
    this.name = name;
    this.superheroName = superheroName;
    this.superheroPower = superheroPower;
    this.creationYear = creationYear;
    this.superheroStrength = superheroStrength;
}
public Superhero(String name, String superheroPower, int creationYear, int superheroStrength){
    this.name = name;
    this.superheroPower = superheroPower;
    this.creationYear = creationYear;
    this.superheroStrength = superheroStrength;
}
    //getters

public String getName(){
    return name;
    }

    public String getSuperheroName() {
        return superheroName;
    }

    public String getSuperheroPower() {
        return superheroPower;
    }

    public int getCreationYear() {
        return creationYear;
    }

    public int getSuperheroStrength() {
        return superheroStrength;
    }

    //setters


    public void setName(String name) {
        this.name = name;
    }
    public void setSuperheroName(String superheroName){
        this.superheroName = superheroName;
    }

    public void setSuperheroPower(String superheroPower) {
        this.superheroPower = superheroPower;
    }

    public void setCreationYear(int creationYear) {
        this.creationYear = creationYear;
    }

    public void setSuperheroStrength(int superheroStrength) {
        this.superheroStrength = superheroStrength;
    }

    @Override
    public String toString() {
        return "Superhero" + "\n" +
                "name:" + " " + name + "\n" +
                "Superheroname:" + " " + superheroName + "\n" +
                "Superheropower:" + " " + superheroPower + "\n" +
                "Creationyear:" + " " + creationYear + "\n" +
                "Superherostrength" + " " + superheroStrength;
    }

    public String toCsvString() {
    return name + "," + superheroName + "," + superheroPower + "," + creationYear + "," + superheroStrength;
    }
}
