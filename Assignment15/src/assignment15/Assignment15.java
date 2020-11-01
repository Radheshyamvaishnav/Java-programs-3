package assignment15;

public class Assignment15 {

    public void missing(int [] a)
    {
        int z=0;
    for(int i=0;i<a.length;i++)
    {
    z= z +a[i];
    }
    int num=55-z;
    System.out.println("The Missing Number is:- "+num);
    }
    public static void main(String[] args) {
    Assignment15 as=new Assignment15();
    int [] a={1, 2, 3, 4, 6, 7, 8, 9, 10};
    int [] b={7, 2, 3, 6, 5, 9, 1, 4, 8};
    int [] c={10, 5, 1, 2, 4, 6, 8, 3, 9};
    as.missing(a);
    as.missing(b);
    as.missing(c);
        
    }
    
}
