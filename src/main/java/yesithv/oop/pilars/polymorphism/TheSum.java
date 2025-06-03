package yesithv.oop.pilars.polymorphism;

public class TheSum {

    public String doTheSum() {
        return "This is the doTheSum() method";
    }

    public int doTheSum(int intX, int intY) {
        return (intX + intY);
    }

    public int doTheSum(int intX, int intY, int intZ) {
        return (intX + intY + intZ);
    }

    public double doTheSum(double doubleX, double doubleY) {
        return (doubleX + doubleY);
    }
}
