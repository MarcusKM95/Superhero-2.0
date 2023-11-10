import java.util.ArrayList;

public class Database {

    public ArrayList<Superhero> superheroList;

    public Database(){
        this.superheroList = new ArrayList<Superhero>();
    }

    public void addSuperhero(Superhero hero){
        this.superheroList.add(hero);
    }

    public void showSuperheroList(){
        int counter = 0;
        for (Superhero hero:this.superheroList){
            System.out.println(counter + " " + hero.toString());
            counter++;
        }
    }
    public void deleteSuperhero(int i){
        this.superheroList.remove(i);
    }
    public void editSuperhero(int number, String name){
        this.superheroList.get(number).setName(name);
    }
    public void searchSuperhero(String search){
        for (Superhero hero:this.superheroList){
            if(hero.getName().toLowerCase().contains(search.toLowerCase()) || hero.getSuperheroName().contains(search.toLowerCase())){
                System.out.println(hero.toString());
            }
        }

    }
}
