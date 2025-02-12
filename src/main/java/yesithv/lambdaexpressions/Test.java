package yesithv.lambdaexpressions;

public class Test {

    public static void main(String[] args) {
        // Create functions without defining a class
        FuncInterfaceOneParameter functionalInterfaceOneParameter = (int x) -> System.out.println(2 * x);
        functionalInterfaceOneParameter.normalFun();
        functionalInterfaceOneParameter.abstractFun(3);

        FunctionalInterfaceTwoParameters add = (a, b) -> (a + b);
        FunctionalInterfaceTwoParameters multiply = (a, b) -> (a * b);
        System.out.println("Add: " + add.mathOperation(5, 6));
        System.out.println("Multiply: " + multiply.mathOperation(3, 8));

    }
}
