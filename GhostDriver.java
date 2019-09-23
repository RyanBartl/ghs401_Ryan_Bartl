
/**
 * Write a description of class GhostDriver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GhostDriver
{
    // instance variables - replace the example below with your own
    public static void main(){
        Ghost g1 = new Ghost();
        Ghost g2 = new Ghost();
        Ghost g3 = new Ghost();
        
        System.out.println(g1);       
        Ghost g4 = new Ghost("chartruse", 99, 4);
        System.out.println(g4.toString());
        g4.bumpSpeed(); //increase speed of g4 by 1
        g4.doubleColor();
        System.out.println(g4.toString());
       

    }
}