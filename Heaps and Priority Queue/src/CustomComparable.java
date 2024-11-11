import java.util.Arrays;
class Student implements Comparable<Student>{
    int rolln ;
    double gpa ;
    String name ;
    Student(int rolln, double gpa, String name){
        this.rolln = rolln;
        this.name = name ;
        this.gpa = gpa ;
    }
    public int compareTo(Student s){
        return this.rolln - s.rolln;
    }
}
public class CustomComparable {

    public static void main(String[] args) {
        Student[] s = new Student[4];
        s[0] = new Student(71,7.00,"Vivek");
        s[1] = new Student(19,5.87,"Yash");
        s[2] = new Student(67,6.71,"Vishnu");
        s[3] = new Student(44,7.64,"Sujal");
        for(int i = 0 ; i < 4 ; i++){
            System.out.print(s[i].rolln+" ");
            System.out.print(s[i].name+" ");
            System.out.println(s[i].gpa+" ");
        }
        System.out.println();
        Arrays.sort(s);
        for(int i = 0 ; i < 4 ; i++){
            System.out.print(s[i].rolln+" ");
            System.out.print(s[i].name+" ");
            System.out.println(s[i].gpa+" ");
        }
    }
}
