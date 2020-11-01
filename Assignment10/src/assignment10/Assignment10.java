
package assignment10;


public class Assignment10 {

    public void palindrom(String str)
    {
    System.out.print(str);
    char d1,d2,m1,m2,y1,y2,y3,y4 ;
    d1=str.charAt(0);
    d2=str.charAt(1);
    m1=str.charAt(3);
    m2=str.charAt(4);
    y1=str.charAt(6);
    y2=str.charAt(7);
    y3=str.charAt(8);
    y4=str.charAt(9);
    
    
   if((d1==y4 && d2==y3 && m1==y2 && m2==y1) || (d1==y3 && d2==y4 && m1==y1 && m2==y2))
    {
    System.out.println(" --> TRUE");
    }
   else
   {
   System.out.println(" --> False");
   }
    }
    public static void main(String[] args) {
    
        System.out.println("RADHESHYAM 61");
        System.out.println(" ");
        Assignment10 as=new Assignment10();
        as.palindrom("20/20/2020");
        as.palindrom("30-12-2020");
        as.palindrom("12-02-2021");
    }
    
}
