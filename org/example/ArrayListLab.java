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
        System.out.println("Item at index 1: " + secondItem);
        
        System.out.println("List before modification: " + equipment);
        
        equipment.set(0, "GPS");
        
        System.out.println("List after modification: " + equipment);
        // ******************************************

        // Exercise #3 ******************************
        
        // ******************************************

        // Exercise #4 ******************************
        
        // ******************************************

        // Exercise #5 ******************************
        
        // ******************************************

        // Exercise #6 ******************************
        
        // ******************************************


    }
}