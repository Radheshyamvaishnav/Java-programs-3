
package assignment12;

public class Assignment12 {
    public void move(String str)
    {
    System.out.print(str+" --> ");
    String s=" ";
    for(int i=0;i<str.length();i++)
    {
    s=s+(char)(str.charAt(i)+1);
    }
    System.out.println(s);
    }
    public static void main(String[] args) {
        System.out.println("RADHESHYAM 61");
        System.out.println(" ");
        
        Assignment12 as=new Assignment12();
        as.move("HELLOW");
        as.move("BYE");
        as.move("Welcome");
        as.move("Love For All, Hatred For None.");
    }
    
}
