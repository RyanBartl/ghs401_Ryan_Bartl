
import javax.swing.JOptionPane;

public class WhileLoops
{
    public static void main(){
        
        double hoursSleep = Double.parseDouble(JOptionPane.showInputDialog("How many hours did you sleep this week? "));
        
        while(hoursSleep <= 0){
            hoursSleep = Double.parseDouble(JOptionPane.showInputDialog("That is not possible. Try again: "));
        
}
        System.out.println("You said " + hoursSleep + " hours!");
}
}

