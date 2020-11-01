package assignment13;

public class Assignment13 {
    
    public void broken(String str1,String str2)
    {
    String s=" ";
    for(int i=0;i<str1.length();i++)
    {
    if(str1.charAt(i)!=str2.charAt(i))
    {
    s=s+str1.charAt(i);
    }
    }
    char c;
    for( c='a'; c<='z';c++)
	{
	for(int i=0;i<s.length();i++)
	{
	if(c==s.charAt(i))
	{
	System.out.print(c + " ");
	break;
	}
	}
	}
      System.out.println(" ");
    }
    public static void main(String[] args) {
        
        System.out.println("RADHESHYAM 61");
        
        Assignment13 as=new Assignment13();
        as.broken("happy birthday", "hawwy birthday");
        as.broken("starry night", "starrq light");
        as.broken("beethoven", "affthoif5");
    }
    
}
