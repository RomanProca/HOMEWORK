package Classwork;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("First string");
        strings.add("Second string");
        strings.add("Forth string");
        System.out.println(strings);

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Alexandru"));
        students.add(new Student("Roman"));
        students.add(new Student("Vasile"));
        for (Student student : students) {
            System.out.println(students.toString() + " ");
        }
        students.add(0, new Student("Ion"));
        System.out.println(students);

        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            if (s.equals("Forth string")) {
                iterator.remove();
            }
        }
        System.out.println(strings);
    }
}
