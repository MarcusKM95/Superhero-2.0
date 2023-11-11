import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;

import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class DatabaseTest {

    private Database database;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

@BeforeEach
    public void setup() {
    database = new Database();
    System.setOut(new PrintStream(outContent));
}
@Test

//Prepare
    public void showSuperheroListTest(){
    database.addSuperhero(new Superhero("Spiderman", "Peter Parker", "Web-slinging", 1962, 85));

    // Method for testing
    database.showSuperheroList();

    // Expected output/result

    String expectedOutput = "toFilemethod Spiderman,Peter Parker,Web-slinging,1962,85\n0 \nSuperhero\nname: Spiderman\nSuperheroname: Peter Parker\nSuperheropower: Web-slinging\nCreationyear: 1962\nSuperherostrength 85\n";

    assertEquals(expectedOutput,outContent.toString());
}



}
