
/**
 * Write a description of class Ghost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ghost
{

    //instance variables for th class Ghost
    private String color;
    private int speed;
    private int level;

    //zero-argument constructor; basically makes a default ghost
    public Ghost(){
        color = null;
        speed = 0;
        level = 0;
        System.out.println("A default ghost was constructed.");

    }

    //two-argument contstructor; can set instance variables to anything desired

    public Ghost(String c, int s, int l
    ){
        this.color = c;
        this.speed = s;
        this.level = l;
        System.out.println("A unique ghost was constructed.");
    }
    
    public void bumpSpeed(int bump){
        this.speed+=bump;
        
    }
    public void bumpSpeed(){
        this.speed++;
        
    }
    public void doubleColor(){
        
        this.color = this.color + this.color;
        
    } 
    //public means other classes have access to this method
    //String is the return type of this method; gives back a String
    //toString is the name of this method
    public String toString(){
        
        return "Color: " + this.color + ", Speed: " + this.speed + ", Level: " + this.level;

    }
}