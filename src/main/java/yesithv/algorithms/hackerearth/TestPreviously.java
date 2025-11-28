package yesithv.algorithms.hackerearth;

public class TestPreviously {
    int val = 10;
    public static void main(String[] args) {

        Student s0 = new Student();
        Student s1 = new Student();
        s0.marks(s1);

    }

}

class Student {
    public void marks(Student s1){
        System.out.println(this==s1);
    }
}