package CoreJava.Module4;

public class AdvanceCalculator extends Calculator {
    public double mul(int a, int b){
        return a*b;
    }

    public int div(int a, int b){
        if (b==0){
            throw new IllegalArgumentException("Denominator cannot be zero");
        }
        return a/b;
    }
}
