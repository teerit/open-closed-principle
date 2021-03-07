package ocp;

public class Multiplication implements CalculatorOperation{
    private double left;
    private double right;
    private double result;

    @Override
    public void perform() {
        result = left * right;
    }

    public Multiplication(double left, double right) {
        this.left = left;
        this.right = right;
    }

    public double getLeft() {
        return left;
    }

    public double getRight() {
        return right;
    }

    public double getResult() {
        return result;
    }

    public void setLeft(double left) {
        this.left = left;
    }

    public void setRight(double right) {
        this.right = right;
    }

    public void setResult(double result) {
        this.result = result;
    }
}
