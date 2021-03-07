package ocp;

public class Addition implements CalculatorOperation {

    private double left;
    private double right;
    private double result;

    /**
     * Implement method
     */
    @Override
    public void perform() {
        result = left + right;
    }

    /* Constructor */
    public Addition(double left, double right) {
        this.left = left;
        this.right = right;
    }

    public double getLeft() {
        return left;
    }

    public double getRight() {
        return right;
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

    public double getResult() {
        return result;
    }
}
