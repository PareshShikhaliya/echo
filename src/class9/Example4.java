package class9;

public class Example4 {

    public int x;  // instance variable

    public Example4(int x)
    {
        this.x = x;
    }

    public void printX()
    {
        // local variable that hides the instance variable
         int x = 100;
        System.out.println(" Local  variable x = " +x);
        System.out.println("Instance  variable x = " +this.x); // prints 10// prints 10
    }
    public static void main(String[] args)
    {
        Example4 instance1=new Example4(1000);
        Example4 instance2=new Example4(2000);
        instance1.printX();


    }

}



