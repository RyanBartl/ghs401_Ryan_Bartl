

public class Person
{
    private String[] fullName = new String[3];
    private int age;
    public Person(String[] name , int age){
        fullName = name;
        this.age = age;
    }
    
    public void age(){
        System.out.print(age);
    }
    
    public String toString(){
        return fullName[0] + " " + fullName[1] + " " + fullName[2];
    }
}
