package assignment6;

public class Assignment6 
{
    public void animals(int ch,int co,int p)
    {
    System.out.print("Chicken ="+ch+" cow ="+co+" pig ="+p);
    int chiken=ch*2;
    int cow=co*4;
    int pig=p*4;
    int total=chiken+cow+pig;
    System.out.println(" (Total number of legs --> "+ total+")");
    }
    public static void main(String[] args) 
    {
    System.out.println("RADHESHYAM 61");
    System.out.println(" ");
    Assignment6 as=new Assignment6();
    as.animals(2, 3, 5);
    as.animals(1, 2, 3);
    as.animals(5, 2, 8);
    }
}
