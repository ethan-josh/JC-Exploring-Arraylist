package org.example;

import java.util.ArrayList;

public class ArrayListLab {
    public static void main(String[] args) {
        
        // Exercise #1 ******************************
        ArrayList<String> missionTasks = new ArrayList<>();
        
        // System.out.println("Is the list empty initially? " + missionTasks.isEmpty());
        
        missionTasks.add("Secure the perimeter");
        missionTasks.add("Establish communication");
        missionTasks.add("Report status");
        
        // System.out.println("Current tasks: " + missionTasks);
        // System.out.println("Number of tasks: " + missionTasks.size());
        // ******************************************


        // Exercise #2 ******************************
        ArrayList<String> equipment = new ArrayList<>();
        equipment.add("Compass");
        equipment.add("Map");
        equipment.add("Radio");

        String secondItem = equipment.get(1);
        //System.out.println("Item at index 1: " + secondItem);
        //System.out.println("List before modification: " + equipment);
        
        equipment.set(0, "GPS");
        
        // System.out.println("List after modification: " + equipment);
        // ******************************************

        // Exercise #3 ******************************
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
        // ******************************************

        // Exercise #4 ******************************
        
        // ******************************************

        // Exercise #5 ******************************
        
        // ******************************************

        // Exercise #6 ******************************
        
        // ******************************************


    }
}