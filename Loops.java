
public class Loops
{
    public static void main(){
        String[] firstNames = {"Phoebe", "Chandler", "Joey", "Rachel", "Bob"};
        String[] lastNames = {"Ross", "Buffay", "Bing", "Geller", "Green"};
        System.out.println("First Name \t\tLastName");
        int firstRandom;
        int lastRandom;
        for(int i = 0; i<11; i++){
            firstRandom = (int)(Math.random()*firstNames.length);
            lastRandom = (int)(Math.random()*lastNames.length);
            
            System.out.println(firstNames[firstRandom] + "\t\t" + lastNames[lastRandom]);
            
            

}
int a = firstNames.length-1;

while(a>=0){
    System.out.println(firstNames[a]);
    a--;
    
}
}
}


