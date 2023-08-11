package class14;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

class MyClassPersonal {
    // Some fields and methods
}

public class MemoryManagementExample4 {
    public static void main(String[] args) {
        // Null References
        MyClassPersonal obj1 = new MyClassPersonal();
        obj1 = null; // Make obj1 eligible for garbage collection

        // Local Variables
        {
            MyClassPersonal obj2 = new MyClassPersonal();
            // obj2 is eligible for garbage collection once the scope ends
        }

        // Dereferencing Data Structures
        List<MyClassPersonal> myList = new ArrayList<>();
        myList.add(new MyClassPersonal());
        myList.clear(); // Make the objects added to myList eligible for garbage collection

    }
}

