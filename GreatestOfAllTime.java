
import javax.swing.JOptionPane;

public class GreatestOfAllTime
{
    public static void main(){
        int min = 10;
        int max = 100;
        int lowest = 100;
        int greatest = 0;
        int arrayNumber = Integer.parseInt(JOptionPane.showInputDialog("Select any number between 10 and 20: "));
        while(arrayNumber > 20 || arrayNumber < 10 ){
            arrayNumber = Integer.parseInt(JOptionPane.showInputDialog("Pick another number: "));

        }     

        int[] randArray = new int [arrayNumber];
        for(int i = 0; i<arrayNumber; i++){
            randArray[i] = (int) (Math.random()*(max-min+1)+min);
            System.out.println(randArray[i]);
            if(randArray[i]<lowest){
                lowest = randArray[i];
            }
            if(randArray[i]>greatest){
                greatest = randArray[i];
            }
        }
        System.out.println("The greatest value is " + greatest);
        System.out.println("The lowest value is " + lowest);
    }
}