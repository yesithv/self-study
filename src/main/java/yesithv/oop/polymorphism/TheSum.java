package yesithv.oop.polymorphism;

public class TheSum {

    public String doTheSum() {
        return "This is the doTheSum() method";
    }

    public int doTheSum(int x, int y) {
        return (x + y);
    }

    public int doTheSum(int x, int y, int z) {
        return (x + y + z);
    }

    public double doTheSum(double x, double y) {
        return (x + y);
    }
}
