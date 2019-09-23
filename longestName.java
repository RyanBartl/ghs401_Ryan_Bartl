import javax.swing.JOptionPane;

public class longestName
{
    public static void main(){
            
        String[] yourName = new String[3];

        String[] friendName = new String[3];
        int yourNameLength = 0;
        int friendNameLength = 0;
        int yourAge;
        int friendAge;
        

        yourName[0] = JOptionPane.showInputDialog("What is your first name? ");
        yourName[1] = JOptionPane.showInputDialog("What is your middle name? ");
        yourName[2] = JOptionPane.showInputDialog("What is your last name? ");
        yourAge = Integer.parseInt(JOptionPane.showInputDialog("What is your age?"));

        
        friendName[0] = JOptionPane.showInputDialog("What is your friend's first name? ");
        friendName[1] = JOptionPane.showInputDialog("What is your friend's middle name? ");
        friendName[2] = JOptionPane.showInputDialog("What is your friend's last name? ");
        friendAge = Integer.parseInt(JOptionPane.showInputDialog("What is your friend's age?"));
        
        Person you = new Person(yourName[], yourAge);
        Person friend = new Person(friendName[], friendAge);
        
        for(int i = 0; i < 3; i++){
            char[] name = yourName[i].toCharArray();
            for(int a = 0; a < name.length; a++){
                yourNameLength++;
            }
        }
        for(int i = 0; i < 3; i++){
            char[] namef = friendName[i].toCharArray();
            for(int a = 0; a < namef.length; a++){
                friendNameLength++;
            }
        }
        System.out.println("Your name has " + yourNameLength + " characters.");
        System.out.println("Your friend's name has " + friendNameLength + " characters.");
        if(yourNameLength > friendNameLength){
            System.out.print(you + "'s name is longer. They are ");
            you.age();
            System.out.println(".");
        }
        else if(yourNameLength < friendNameLength){
            System.out.print(friend + "'s name is longer. They are ");
            friend.age();
            System.out.println(".");
        }
        else{
            System.out.println("It is a tie");
        }
        
        
    }
}