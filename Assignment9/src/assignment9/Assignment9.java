package assignment9;

public class Assignment9 {
    
    public void correct(String[] s1,String[] s2)
    {
    for(int i=0;i<=s1.length-1;i++)
    {
     if(s1[i]==s2[i])
     {
     System.out.print("1 ");
     }
     else
     {
     System.out.print("-1 ");
     }
        
    }
    System.out.println();
    }
    public static void main(String[] args) {
        System.out.println("RADHESHYAM 61");
        System.out.println(" ");
        Assignment9 as=new Assignment9();
        String[] a={"april", "showrs", "bring", "may", "flowers"};
        String[] b={"april", "showers", "bring", "may", "flowers"};
        String[] c={"it", "is", "find"};
        String[] d={"it", "is", "fine"};       
        as.correct(a, b);
        as.correct(c, d);
        
    }
    
}
