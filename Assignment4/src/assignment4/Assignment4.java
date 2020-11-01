
package assignment4;


public class Assignment4 
{

    public void countVowels(String str)
    {
    String s=" ";
    int count=0;
    for(int i=0;i<=str.length()-1;i++)
        {
    if(str.charAt(i)=='a'   ||str.charAt(i)=='o'   || str.charAt(i)=='i'   || str.charAt(i)=='e'  || str.charAt(i)=='u'
      || str.charAt(i)=='A'   ||str.charAt(i)=='O'   || str.charAt(i)=='I'   || str.charAt(i)=='E'  || str.charAt(i)=='U')
            {
    count++;
            }    
    else
        {
    s=s+str.charAt(i);
        }    
        }
    System.out.println(s);
}
    public static void main(String[] args) 
    {
    System.out.println("RADHESHYAM 61");
    System.out.println("");
    Assignment4 as=new Assignment4();
    as.countVowels("Happy Thanksgiving to all--even the haters and losers!");
    as.countVowels("You only live once, but if you do it right, once is enough.");
    as.countVowels("The purpose of our lives is to be happy.");
    as.countVowels("Get busy living or get busy dying.");
    }
    
}
