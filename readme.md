# Name: Ethan Joshua Camingao
## Exploring Java Arraylist

---

### Exercise 1: Creating an ArrayList and Adding Elements (add)

**Code to run:**
```
import java.util.ArrayList;

public class ArrayListLab {
    public static void main(String[] args) {
        // Creating an ArrayList to hold String objects
        ArrayList<String> missionTasks = new ArrayList<>();
        
        System.out.println("Is the list empty initially? " + missionTasks.isEmpty());
        
        missionTasks.add("Secure the perimeter");
        missionTasks.add("Establish communication");
        missionTasks.add("Report status");
        
        System.out.println("Current tasks: " + missionTasks);
        System.out.println("Number of tasks: " + missionTasks.size());
    }
}
```
**Predicted Output:**
```
Is the list empty initially? true
Current tasks: [Secure the perimeter, Establish communication, Report status]
Number of tasks: 3
```

**Actual Output:**

<img src="https://github.com/ethan-josh/JC-Exploring-JavaDateTime/blob/main/images/Ex1.png"/>

**Explanation:**

new ArrayList<>() creates an empty list. The <> (diamond operator) indicates it's a generic collection, and we've specified it will hold String objects.

The isEmpty() method returns true if the list has no elements, and false otherwise.

The add() method appends each new task to the end of the list.

The size() method returns the current number of elements in the list. When you print the ArrayList object directly, Java calls its toString() method, which provides a nicely formatted view of its contents.

---

### Exercise 2: Accessing and Modifying Elements (get and set)

**Code to run:**
```
import java.util.ArrayList;

public class ArrayListLab {
    public static void main(String[] args) {
        ArrayList<String> equipment = new ArrayList<>();
        equipment.add("Compass");
        equipment.add("Map");
        equipment.add("Radio");

        String secondItem = equipment.get(1);
        System.out.println("Item at index 1: " + secondItem);
        
        System.out.println("List before modification: " + equipment);
        
        // The compass is upgraded to a GPS
        equipment.set(0, "GPS");
        
        System.out.println("List after modification: " + equipment);
    }
}
```
**Predicted Output:**
```
Item at index 1: Map
List before modification: [Compass, Map, Radio]
List after modification: [GPS, Map, Radio]
```

**Actual Output:**

<img src="https://github.com/ethan-josh/JC-Exploring-JavaDateTime/blob/main/images/Ex2.png"/>

**Explanation:**

ArrayLists are zero-indexed, meaning the first element is at index 0, the second at index 1, and so on. equipment.get(1) retrieves the element at the second position, which is "Map".

The set(0, "GPS") method replaces the element at index 0 ("Compass") with the new element ("GPS"). This method overwrites the existing value at that specific position.

---

### Exercise 2: Accessing and Modifying Elements (get and set)

**Code to run:**
```
import java.util.ArrayList;

public class ArrayListLab {
    public static void main(String[] args) {
        ArrayList<String> equipment = new ArrayList<>();
        equipment.add("Compass");
        equipment.add("Map");
        equipment.add("Radio");

        String secondItem = equipment.get(1);
        System.out.println("Item at index 1: " + secondItem);
        
        System.out.println("List before modification: " + equipment);
        
        // The compass is upgraded to a GPS
        equipment.set(0, "GPS");
        
        System.out.println("List after modification: " + equipment);
    }
}
```
**Predicted Output:**
```
Item at index 1: Map
List before modification: [Compass, Map, Radio]
List after modification: [GPS, Map, Radio]
```

**Actual Output:**

<img src="https://github.com/ethan-josh/JC-Exploring-JavaDateTime/blob/main/images/Ex3.png"/>

**Explanation:**

ArrayLists are zero-indexed, meaning the first element is at index 0, the second at index 1, and so on. equipment.get(1) retrieves the element at the second position, which is "Map".

The set(0, "GPS") method replaces the element at index 0 ("Compass") with the new element ("GPS"). This method overwrites the existing value at that specific position.