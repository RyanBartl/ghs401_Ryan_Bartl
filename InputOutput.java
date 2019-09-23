


import javax.swing.JOptionPane;





public class InputOutput
{
    public static void main(){
        String name = JOptionPane.showInputDialog("What is your name?");
        int age = Integer.parseInt(JOptionPane.showInputDialog("How old are you?"));
        
       
        
        if(age > 15){
            System.out.println("You can drive, " + name + "!");
            
        }
        
        else{
            System.out.println("You can't drive. Sucks to be you, " + name + "!");
            
        }
        
        
        
    }
}
