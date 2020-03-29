package _9_small_projects.MathOpsMenuWithCustomException;

/**
 * Custom exception class
 */

public class ZeroValueException extends Exception {
    int notAcceptedValue;

    public ZeroValueException(int notAcceptedValue) {
        this.notAcceptedValue = notAcceptedValue;
    }


    public String toString(){
        return "CustomZeroValueException [" + notAcceptedValue + " ]";
    }
}