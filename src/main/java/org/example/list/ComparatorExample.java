package org.example.list;

//either you have to create a class which implements comparable or use lamda expression

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class CompareString implements Comparator<String>{

    @Override
    public int compare(String s1, String s2) {
        if(s1.compareTo(s2)<0)return 1;
        return -1;
    }
}

class Student {
    String name;
    int age;
    double grades;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGrades() {
        return grades;
    }

    public void setGrades(double grades) {
        this.grades = grades;
    }

    public Student(String name, int age, double grades) {
        this.name = name;
        this.age = age;
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Grades: " + grades;
    }

}

public class ComparatorExample {
    public static void main(String[] args) {
        List <String> list=new ArrayList();
        list.add("banana");
        list.add("apple");
        list.add("grapes");
        list.add("papaya");
        list.add("kiwi");
        list.add("orange");
        System.out.println(list);

        list.sort(Comparator.reverseOrder());
        System.out.println(list);

        list.sort(new CompareString());// by creating a class and implementing Comprator
        System.out.println(list);

        list.sort(null);

        //by using lamda expression
        System.out.println(list);

        list.sort((s1,s2)->{
            if(s1.compareTo(s2)<0)return 1;
            return -1;
        });
        System.out.println(list);


        //sorting in custom class can be done using 3 ways 2 of which have been demonstrated above
        //3rd way
        List<Student> students = new ArrayList<>();

        students.add(new Student("Alice", 18, 85.5));
        students.add(new Student("Bob", 19, 78.0));
        students.add(new Student("Charlie", 20, 92.3));
        students.add(new Student("David", 21, 88.8));
        students.add(new Student("Eva", 19, 75.6));
        students.add(new Student("Frank", 22, 80.0));
        students.add(new Student("Grace", 20, 95.4));
        students.add(new Student("Helen", 18, 89.9));
        students.add(new Student("Ian", 21, 70.5));
        students.add(new Student("Julia", 20, 82.2));

        System.out.println(students);

       // students.sort(null);//this will raise error as there is no natural ordering

        Comparator<Student> comparator=Comparator.comparing(Student::getGrades);//sorts in accending order
        Comparator<Student> comparator1=Comparator.comparing(Student::getGrades).reversed();//sorts in decending order


        students.sort(comparator1);

        System.out.println(students);


    }
}
