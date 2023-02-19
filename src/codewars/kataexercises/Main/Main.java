package codewars.kataexercises.Main;

import java.awt.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {
        
        List<String> names = new ArrayList<>(Arrays.asList("John", "Jane", "Mary", "Frank"));
        List<String> surnames = new ArrayList<>(Arrays.asList("Smith", "Johnson", "Wallace", "Jones"));
        List<Integer> ages = new ArrayList<>(Arrays.asList(20, 45, 22, 32));
        
        Student student;
        for (int i = 0; i < ages.size(); i++) {
            student = new Student(names.get(i), surnames.get(i), ages.get(i));
            System.out.println(student);
        }
    }
    
    
}
