
package assignment11;


public class Assignment11 {

    public int ect(int a,int b)
    {
    if (a == 0) 
            return b; 
          
        return ect(b%a, a);
    }
    
    public static void main(String[] args) {
        System.out.println("RADHESHYAM 61");
        System.out.println(" ");
        Assignment11 as=new Assignment11();
        int z=as.ect(5,25); 
        System.out.println(z);
        System.out.println(as.ect(8,6));
        System.out.println(as.ect(49,14));
    }
    
}
