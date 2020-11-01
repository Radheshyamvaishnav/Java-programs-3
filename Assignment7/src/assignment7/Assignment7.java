
package assignment7;


public class Assignment7 {

    public void ctoa(char c)
    {
     System.out.print("ASCII VALUE OF "+c+" --> ");
    int value=c;
    System.out.println(value);
    }
    public static void main(String[] args) {
        Assignment7 as=new Assignment7();
        System.out.println("RADHESHYAM 61");
        System.out.println(" ");
        
        as.ctoa('A');
        as.ctoa('m');
        as.ctoa('['); 
        as.ctoa('/');
        as.ctoa('p');
        as.ctoa('1');
    }
    
}
