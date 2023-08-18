package class14;
class MyClass3 {
    private String name;
    private MyClass3 other;

    public MyClass3(String name) {
        this.name = name;
        System.out.println("Created object: " + name);
    }

    public void setOther(MyClass3 other) {
        this.other = other;
    }

    @Override
    protected void finalize()
    {
        System.out.println("Garbage collection triggered for object: " + name);
    }
}

public class GarbageCollectionExample3 {
    public static void main(String[] args) {

        // Scenario 5: System-triggered garbage collection
        for (int i = 0; i < 1000000; i++)
        {
            new MyClass3("Temp Object " + i);
        }

    }
}
