
public class Dog
{
    private String name;
    private String breed;
    private int weight;

    public Dog(){
        name = null;
        breed = null;
        weight = 0;
        System.out.println("The first dog is default.");
    }

    public Dog(String n, String b, int w){  
        this.name = n;
        this.breed = b;
        this.weight = w;
        System.out.println("The second dog is unique.");
    }

    public String toString(){

        return "Name: " + this.name + ", Breed: " + this.breed + ", Weight: " + this.weight + ", lbs.";

    }
    
    //return type is an int
    public int getWeight(){
    
        return this.weight;
    
    }
}