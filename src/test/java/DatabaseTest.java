import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class DatabaseTest {

    private Database database;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final String testFilePath = "testSuperheroFile.csv";


    @BeforeEach
    public void setup() {
    database = new Database();

}
@Test

//Prepare
    public void showSuperheroListTest(){

    System.setOut(new PrintStream(outContent));
    database.addSuperhero(new Superhero("Spiderman", "Peter Parker", "Web-slinging", 1962, 85));

    // Method for testing
    database.showSuperheroList();

    // Expected output/result

    String expectedOutput = "toFilemethod Spiderman,Peter Parker,Web-slinging,1962,85\n0 \nSuperhero\nname: Spiderman\nSuperheroname: Peter Parker\nSuperheropower: Web-slinging\nCreationyear: 1962\nSuperherostrength 85\n";

    assertEquals(expectedOutput,outContent.toString());
}
@Test
    public void addSuperheroTest(){
    //prepare
    Superhero superhero = new Superhero("Batman", "Bruce Wayne", "Utility belt", 1939, 100);
    //add
    database.addSuperhero(superhero);

    //expected

    assertEquals(1, database.superheroList.size());
    assertEquals(superhero, database.superheroList.get(0));

}
@Test
    public void deleteSuperheroTest(){

    //Prepare
    Superhero superhero = new Superhero("Batman", "Bruce Wayne", "Utility belt", 1939, 100);
    Superhero superhero2 = new Superhero("Ken Clark", "Superman", "laser", 1945, 98);
    database.addSuperhero(superhero);
    database.addSuperhero(superhero2);
    //delete
    database.deleteSuperhero(1);
    //expected
    assertEquals(1,database.superheroList.size());
    assertEquals(superhero, database.superheroList.get(0));
}
    @Test
    public void toFileTest(){
        Superhero superhero = new Superhero("Bruce Wayne", "Batman", "Utility belt", 1939, 100);
        Superhero superhero2 = new Superhero("Ken Clark", "Superman", "laser", 1945, 98);

        //add

        database.addSuperhero(superhero);
        database.addSuperhero(superhero2);

        //methodToTest
            database.toFile();
        File file = new File(testFilePath);

        try {
            List<String> lines = Files.readAllLines(Path.of(testFilePath));
            assertEquals("Bruce Wayne,Batman,Utility belt,1939,100", lines.get(0).trim());
            assertEquals("Ken Clark,Superman,Laser,1945,98", lines.get(1).trim());
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            file.delete();
        }



    }


}
