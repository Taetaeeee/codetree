import java.util.Scanner;
import java.util.*;
class Student implements Comparable<Student>{
    String name;
    int height, weight;

    public Student(String name, int height, int weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Student student){
        if(student.height == this.height){
            return student.weight - this.weight;
        }

        return this.height - student.height;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] students = new Student[n];
        
        String name;
        int height, weight;

        for (int i = 0; i < n; i++) {
            name = sc.next();
            height = sc.nextInt();
            weight = sc.nextInt();
            students[i] = new Student(name, height, weight);
        }
        // Please write your code here.

        Arrays.sort(students);

        for(int i=0; i<n;i++){
            System.out.printf("%s %d %d", students[i].name, students[i].height, students[i].weight);
            System.out.println();
        }
    }
}