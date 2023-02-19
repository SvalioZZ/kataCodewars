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
        double sum = 0;
        for (int i = 0; i < ages.size(); i++) {
            student = new Student(names.get(i), surnames.get(i), ages.get(i));
            System.out.println(student);
            sum += student.getAge(i);
        }
        double average = sum / ages.size();
        System.out.println(average);
        
        double sum1 = 0;
        for (int i = 0; i < ages.size(); i++) {
            sum1 += ages.get(i);
        }
        double average1 = sum1 / ages.size();
        System.out.println("The average age is " + average1);
        
    }
    
    
}
