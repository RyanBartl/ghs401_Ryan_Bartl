import javax.swing.JOptionPane;
public class Waldo
{ 
    public static void main() {
    String school = JOptionPane.showInputDialog("What school do you go to?");
    String mascot = JOptionPane.showInputDialog("What is your mascot?");
    String name = new String("Waldo");
    if(school.equals("Granada")){ 
        if(mascot.equals("Matadors")){
            String[] characters = {"Marty McFly", "Mufasa", "Waldo", "Mr. Frederickson", null};
            for(int i = 0; i < characters.length; i++) {
                if(characters[i] != null){
                    if (characters[i].equals(name)){
                        System.out.println("We found Waldo! He was in the " + (i+1) + " spot!");
                    }
                    else{
                        System.out.println("Waldo is not here in the " + (i+1) + " spot. Here is " + characters[i] + ".");
                    }
               
                       
                    
                    
                
        } /*null*/
        
        else{
            System.out.println("This line is empty."); 
        }
         
} /* for loop */
}
else{
         System.out.println("Wrong school. Get out of here.");   
}
}
else{
        System.out.println("Wrong school. Get out of here.");
    }
}
}
