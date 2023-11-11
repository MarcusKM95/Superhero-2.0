import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Userinterface {

   Scanner scanner = new Scanner(System.in);










        Database db = new Database();

        public void menu () {
            System.out.println("Superherodatabase:");
            System.out.println("1: Show all heroes");
            System.out.println("2: Add a superhero to the database");
            System.out.println("3: Search for a superhero in the database");
            System.out.println("4: Remove a superhero from the database");
            System.out.println("5: Edit a superhero from the database");
            System.out.println("9: End program");

        }
        public void start() {
            boolean stopMenu = false;

            while (!stopMenu) {

                menu();
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        db.showSuperheroList();
                        break;

                    case 2:
                        System.out.println("Enter the name of the superhero");
                        scanner.nextLine();
                        String name = scanner.nextLine();
                        System.out.println("Enter the superheroname of your superhero");
                        String superheroName = scanner.nextLine();
                        System.out.println("Enter the superpower of your superhero");
                        String superheropower = scanner.nextLine();
                        System.out.println("Enter the creationyear of your superhero");
                        int creationYear = scanner.nextInt();
                        System.out.println("Enter the power level of your superhero");
                        int power = scanner.nextInt();
                        Superhero superhero = new Superhero(name, superheroName, superheropower, creationYear, power);
                        db.addSuperhero(superhero);
                        break;
                    case 3:
                        System.out.println("Enter the name, or part of the name of the superhero you want to find");
                        scanner.nextLine();
                        String search = scanner.nextLine();
                        db.searchSuperhero(search);
                        break;
                    case 4:
                        db.showSuperheroList();
                        System.out.println("Enter the number of the superhero you want to delete from the database");
                        scanner.nextLine();
                        try {
                            int number = scanner.nextInt();
                            db.deleteSuperhero(number);
                        } catch (InputMismatchException e) {
                            System.err.println("Please enter a valid number");
                            scanner.nextLine();

                        }
                        break;

                    case 5:
                        db.showSuperheroList();
                        System.out.println("Please enter the number of the superhero you want to edit");
                        scanner.nextLine();
                        int editnumber = scanner.nextInt();
                        System.out.println("Now enter the new name for the superhero" + " " + db.superheroList.get(0).getName());
                        scanner.nextLine();
                        String newname = scanner.nextLine();
                        db.editSuperhero(editnumber, newname);
                        System.out.println("The new name of the superhero is now: " + " " + db.superheroList.get(0).getName());
                        break;
                    case 9:
                        stopMenu = true;
                        break;


                }
            }
        }


    }


