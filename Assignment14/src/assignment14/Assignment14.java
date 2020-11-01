package assignment14;

public class Assignment14 {
    public void countpn(int [] a)
    {
        int p=0;
        int n=0;
    for(int i=0;i<a.length;i++)
    {
    if(a[i]>0)
    {
    p++;
    }
    else
    {
    n=n+a[i];
    }
    }
    System.out.println(p+" , "+n);
    }
    
    public static void main(String[] args) {
        System.out.println("RADHESHYAM 61");
        Assignment14 as=new Assignment14();
        int a[]={1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15};
        int b[]={92, 6, 73, -77, 81, -90, 99, 8, -85, 34};
        int c[]={91, -4, 80, -73, -28};
        as.countpn(a);
        as.countpn(b);
        as.countpn(c);

    }
    
}
