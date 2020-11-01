
package assignment1;


public class Assignment1 {

    public static void cancapture(String s1,String s2 )
    {
       System.out.print(s1+" "+s2);
       char c1=s1.charAt(0);
       char c2=s2.charAt(0);
       char c3=s1.charAt(1);
       char c4=s2.charAt(1);
       
       if(c1==c2 || c3==c4)
       {
       System.out.println(" --> True");
       }
       else{
       System.out.println(" --> False");
       }
    
    }
    
    public static void main(String[] args) 
    {
     System.out.println("RADHESHYAM - 61");
     Assignment1 as=new Assignment1();
     as.cancapture("A8","E8");
     as.cancapture("A1","B2");
     as.cancapture("H4","H3");
     as.cancapture("F5","C8");
       
    }
    
}
