package Generics.ObjectsComparing;

public class Student implements Comparable<Student>{
    int roll_no;
    float marks;

    public Student(int roll_no, float marks) {
        this.roll_no = roll_no;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student o) {
        int difference = (int)(this.marks - o.marks);
        return difference; // if difference == 0? Means both are equal
                           // if difference < 0? Means o is bigger else o is smaller
    }
}
