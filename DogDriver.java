
/**
 * Write a description of class DogDriver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DogDriver
{
    public static void main(){

        Dog d1 = new Dog();
        Dog d2 = new Dog("Rex", "German Sherpard", 35);
        System.out.println(d1.toString());
        System.out.println(d2.toString());

        System.out.println(d1.getWeight());

    
    
    }
}

