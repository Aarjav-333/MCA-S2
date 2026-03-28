class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class TestNegative {
    
    static void checkNumber(int num) throws NegativeNumberException {
        if (num < 0) {
            throw new NegativeNumberException("Number cannot be negative");
        } else {
            System.out.println("Valid number: " + num);
        }
    }

    public static void main(String[] args) {
        try {
            checkNumber(-5);
        } catch (NegativeNumberException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}