package yesithv.oop.accessmodifiers.foratributesandmethods.somepackage;

public class SomeClass {

    Integer age;  // Default: Only accessible in the same package
    public String name;
    private boolean active; // private: Only accessible in the same class
    protected Double weight;

    public void calculate(){
        this.age = 42;
        this.weight = 42.0;
    }

    public static void main(String[] args) {

    }
}
