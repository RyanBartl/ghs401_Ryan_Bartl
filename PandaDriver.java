

public class PandaDriver
{
    public static void main(){
        
        Panda p1 = new Panda("China", 832.33);
        double currentWeight = p1.getWeight();
        currentWeight += 1000.0;
        p1.setWeight(currentWeight);
        System.out.println(p1.getWeight());
        
        Panda[] pandaArray = new Panda[3];
        zoo[0] = Panda p2 = new Panda("USA", 444.44);
        zoo[1] = Panda p3 = new Panda("Taiwan", 324.65);
        zoo[2] = Panda p4 = new Panda("Canada", 936.73);
        
        for(int i=0; i<pandaArray.length; i++){
            System.out.println(pandaArray[i].toString());
            
        }
}
}
