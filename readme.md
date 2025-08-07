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