package com.example.project.Student;
import java.util.ArrayList;
import java.util.Arrays;

public class Utility {

    public static ArrayList<Student> sortStudents(ArrayList<Student> list){
        for (int i = 0; i < list.size(); i++) {
            for (int k = i+1; k < list.size(); k++) {
                int compareTo = list.get(i).getLastName().compareTo(list.get(k).getLastName());
                if (compareTo > 0) {
                    list.set(i, list.set(k, list.get(i)));
                }
                else if (compareTo == 0) {
                    int compareTo2 = list.get(i).getFirstName().compareTo(list.get(k).getFirstName());
                    boolean compareTo3 = list.get(i).getGpa() < list.get(k).getGpa();
                    if (compareTo2 > 0) {
                        list.set(i, list.set(k, list.get(i)));
                    }
                    else if (compareTo2 == 0 && (compareTo3)) {
                        list.set(i, list.set(k, list.get(i)));
                    }
                }
            }
        }
        return list;
    }

}
