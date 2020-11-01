package assignment8;



public class Assignment8 {
    
    public void search(int[] a, int target)
    {   
        for(int c:a)
        {
        System.out.print(c+" ");
        }
        int count=-1;
    	for (int i = 0; i < a.length; i++)
		if (a[i] == target)
			count=i;
    
         System.out.println(" --> "+count);
    }
    public static void main(String[] args) 
    {
      System.out.println("RADHESHYAM 61");
      System.out.println(" ");
     Assignment8 as=new Assignment8();
     int[] a ={5,3,2,1};
     int[] b ={9,8,3};
     int[] c ={1,2,3,4};
     int[] d ={1,2,8,5};
     as.search(a, 1); 
     as.search(b, 9);
     as.search(c, 6);
     as.search(d,5);
    }
    
}
