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

<img src="https://github.com/ethan-josh/JC-Exploring-Arraylist/blob/main/images/Ex1.png"/>

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

<img src="https://github.com/ethan-josh/JC-Exploring-Arraylist/blob/main/images/Ex2.png"/>

**Explanation:**

ArrayLists are zero-indexed, meaning the first element is at index 0, the second at index 1, and so on. equipment.get(1) retrieves the element at the second position, which is "Map".

The set(0, "GPS") method replaces the element at index 0 ("Compass") with the new element ("GPS"). This method overwrites the existing value at that specific position.

---

### Exercise 3: Inserting and Removing Elements (add at index and remove)

**Code to run:**
```
import java.util.ArrayList;

public class ArrayListLab {
    public static void main(String[] args) {
        ArrayList<String> objectives = new ArrayList<>();
        objectives.add("Primary Objective");
        objectives.add("Tertiary Objective");
        
        // Insert a new objective at index 1
        objectives.add(1, "Secondary Objective");
        System.out.println("List after insertion: " + objectives);
        
        // Remove the objective at index 2
        String removedObjective = objectives.remove(2);
        System.out.println("Removed objective: " + removedObjective);
        System.out.println("List after removing by index: " + objectives);
        
        // Remove a specific objective by its value
        objectives.remove("Primary Objective");
        System.out.println("List after removing by object: " + objectives);
    }
}
```
**Predicted Output:**
```
List after insertion: [Primary Objective, Secondary Objective, Tertiary Objective]
Removed objective: Tertiary Objective
List after removing by index: [Primary Objective, Secondary Objective]
List after removing by object: [Secondary Objective]
```

**Actual Output:**

<img src="https://github.com/ethan-josh/JC-Exploring-Arraylist/blob/main/images/Ex3.png"/>

**Explanation:**

add(1, "Secondary Objective") inserts the new element at index 1. The existing element at that position ("Tertiary Objective") and all subsequent elements are shifted one position to the right.

remove(2) removes the element at index 2 ("Tertiary Objective") and returns it. The list size decreases, and any elements after the removed one shift to the left to fill the gap.

remove("Primary Objective") searches the list for the first occurrence of the given object and removes it.

---

### Exercise 4: Searching the List (contains and indexOf)

**Code to run:**
```
import java.util.ArrayList;

public class ArrayListLab {
    public static void main(String[] args) {
        ArrayList<String> waypoints = new ArrayList<>();
        waypoints.add("Alpha");
        waypoints.add("Bravo");
        waypoints.add("Charlie");

        boolean hasBravo = waypoints.contains("Bravo");
        System.out.println("Does the list contain 'Bravo'? " + hasBravo);

        int indexOfCharlie = waypoints.indexOf("Charlie");
        System.out.println("Index of 'Charlie': " + indexOfCharlie);

        int indexOfDelta = waypoints.indexOf("Delta");
        System.out.println("Index of 'Delta': " + indexOfDelta);
    }
}
```
**Predicted Output:**
```
Does the list contain 'Bravo'? true
Index of 'Charlie': 2
Index of 'Delta': -1
```

**Actual Output:**

<img src="https://github.com/ethan-josh/JC-Exploring-Arraylist/blob/main/images/Ex4.png"/>

**Explanation:**
contains("Bravo") iterates through the list and returns true because it finds an element that is equal to "Bravo".

indexOf("Charlie") returns the index of the first occurrence of the specified element, which is 2.

indexOf("Delta") searches for "Delta", but since it's not in the list, the method returns -1. This is a standard way to indicate that an item was not found.

---

### Exercise 5: Iterating Through the List

**Code to run:**
```
import java.util.ArrayList;

public class ArrayListLab {
    public static void main(String[] args) {
        ArrayList<String> squad = new ArrayList<>();
        squad.add("Leader");
        squad.add("Medic");
        squad.add("Engineer");
        squad.add("Scout");

        System.out.println("--- Using an Enhanced For-Loop ---");
        for (String role : squad) {
            System.out.println("Role: " + role);
        }
        
        System.out.println("\n--- Using a Standard For-Loop with index ---");
        for (int i = 0; i < squad.size(); i++) {
            System.out.println("Role at index " + i + ": " + squad.get(i));
        }
    }
}
```
**Predicted Output:**
```
--- Using an Enhanced For-Loop ---
Role: Leader
Role: Medic
Role: Engineer
Role: Scout

--- Using a Standard For-Loop with index ---
Role at index 0: Leader
Role at index 1: Medic
Role at index 2: Engineer
Role at index 3: Scout
```

**Actual Output:**

<img src="https://github.com/ethan-josh/JC-Exploring-Arraylist/blob/main/images/Ex5.png"/>

**Explanation:**
The enhanced for-loop (or for-each loop) is a clean and simple way to iterate over each element in a collection without worrying about indices. It's best used when you just need to access each element in order.

The standard for-loop gives you more control by providing the index i. This is necessary when you need to know the position of an element, or if you need to modify the list while iterating (though that should be done with care).

---

### Exercise 6: Clearing the List (clear)

**Code to run:**
```
import java.util.ArrayList;

public class ArrayListLab {
    public static void main(String[] args) {
        ArrayList<String> intel = new ArrayList<>();
        intel.add("Enemy position: Sector 4");
        intel.add("Weakness: Power generator");
        
        System.out.println("Intel count before mission: " + intel.size());
        System.out.println("Intel list: " + intel);
        
        // After the mission, the intel is no longer needed
        intel.clear();
        
        System.out.println("\nIntel count after mission: " + intel.size());
        System.out.println("Is the intel list empty now? " + intel.isEmpty());
        System.out.println("Intel list: " + intel);
    }
}
```
**Predicted Output:**
```
Intel count before mission: 2
Intel list: [Enemy position: Sector 4, Weakness: Power generator]

Intel count after the mission: 0
Is the intel list empty now? true
Intel list: []
```

**Actual Output:**

<img src="https://github.com/ethan-josh/JC-Exploring-Arraylist/blob/main/images/Ex6.png"/>

**Explanation:**
 
 The clear() method is straightforward: it removes every single element from the ArrayList. After the call to clear(), the list's size() becomes 0, and isEmpty() returns true.