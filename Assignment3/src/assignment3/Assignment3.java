package assignment3;


public class Assignment3 {
    
    public void countVowels(String s)
    {
    String str=s.toLowerCase();
    int count=0;
    for(int i=0;i<=str.length()-1;i++)
    {
    if(str.charAt(i)=='a'   ||str.charAt(i)=='o'   ||str.charAt(i)=='i'   || str.charAt(i)=='e'  || str.charAt(i)=='u')
    {
    count++;
    }    
    }
    
    System.out.print(s+" --> ");
    System.out.println(count);
   }

public static void main(String args[])
{
System.out.println("RADHESHYAM 61");
System.out.println(" ");
System.out.println("NUMBER OF VOWLES STRING HAS");
Assignment3 as=new Assignment3();
as.countVowels("RADHESHYAM");
as.countVowels("Celebration");
as.countVowels("Palm");
as.countVowels("Prediction");
}
}
