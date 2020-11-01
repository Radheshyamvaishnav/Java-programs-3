
package assignment2;

public class Assignment2 {

    public static void nameShuffle(String str)
    {
    int space=str.indexOf(" ");
    String fname,lname;
    fname=str.substring(0,space);
    lname=str.substring(space+1);
    System.out.println(lname+" "+fname);
    }
    public static void main(String[] args) {
        System.out.println("RADHESHYAM 61");
        Assignment2 as=new Assignment2();
        as.nameShuffle("RADHESHYAM VAISHNAV");
        as.nameShuffle("Narendra Modi");
        as.nameShuffle("Donald Trump");
        as.nameShuffle("Narendra Modi"); 
        as.nameShuffle("Rahul Gandhi") ;
        
    }
    
}
