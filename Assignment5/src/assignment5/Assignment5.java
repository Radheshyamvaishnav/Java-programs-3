
package assignment5;


public class Assignment5 {
    
    public void getXO(String s)
        {
            int x=0;
            int y=0;
            String str=s.toLowerCase();
            for(int i=0;i<=s.length()-1;i++)
            {
            if(str.charAt(i)=='x')
                {
                x++;
                }
            else if(str.charAt(i)=='o')
                {
                y++;
                }
            }
            System.out.print(s+" ");
            if(x!=y)
            {
            System.out.println(" --> false");
            }
            else
            {
            System.out.println(" --> true");
            }

        }
    public static void main(String[] args) 
    {
    System.out.println("RADHESHYAM 61");
    System.out.println("");
     Assignment5 as=new Assignment5();
    as.getXO("ooxx");
    as.getXO("xooxx");
    as.getXO("ooxXm");
    as.getXO("zpzpzpp");
    as.getXO("zzoo");
       
    }
    
}
