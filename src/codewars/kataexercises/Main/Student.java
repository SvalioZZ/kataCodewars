package codewars.kataexercises.Main;

public class Student {
    
    String name;
    String surname;
    int age;
    
    public Student(String name, String surname, int age) {
        
        this.name = name;
        this.surname = surname;
        this.age = age;
        
    }
    
//    @Override
//    public String toString() {
//        return "*** new student created ***\n" + name + " - " + surname + " - " + age;
//    }
    
    
    public int getAge(int i) {
        return age;
    }
    
    @Override
    public String toString() {
        return "Student { " +
                       "name = '" + name + '\'' +
                       ", surname = '" + surname + '\'' +
                       ", age = " + age +
                       " }";
    }
}

