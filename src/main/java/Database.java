import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Database {

    //Scanner fileScanner = new Scanner(new File("src/superherofile.csv"));

    public ArrayList<Superhero> superheroList;

    public Database() {
        this.superheroList = new ArrayList<Superhero>();
    }

    public void addSuperhero(Superhero hero) {
        this.superheroList.add(hero);
        this.toFile();
    }

    public void showSuperheroList() {
        int counter = 0;
        for (Superhero hero : this.superheroList) {
            System.out.println(counter + " " + hero.toString());
            counter++;
        }
    }

    public void deleteSuperhero(int i) {
        this.superheroList.remove(i);
    }

    public void editSuperhero(int number, String name) {
        this.superheroList.get(number).setName(name);
    }

    public void searchSuperhero(String search) {
        for (Superhero hero : this.superheroList) {
            if (hero.getName().toLowerCase().contains(search.toLowerCase()) || hero.getSuperheroName().contains(search.toLowerCase())) {
                System.out.println(hero.toString());
            }
        }

    }

    public void fileReader() {
        try {
            Scanner fileScanner = new Scanner(new File("src/superherofile.csv"));
        } catch
        (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void toFile() {
        try {
            PrintStream writeToFile = new PrintStream(new File("superherofile.csv"));
            for (int i = 0; i < this.superheroList.toArray().length; i++) {
                writeToFile.println(this.superheroList.get(i).toCsvString());
                System.out.println("toFilemethod " + this.superheroList.get(i).toCsvString());
            }
        }
        catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
