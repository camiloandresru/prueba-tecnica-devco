package co.com.devco.devops.methods;

/**
 * Utility class with calculator methods
 * @author Camilo Andrés Rodríguez Usme {@link "mailto:crodriguezusme@gmail.com"}
 */

public class Operations {

    private static double dNumberA;
    private static double dNumberB;
    private static double dResult;

    private Operations(){
        throw new IllegalStateException("Utility class");
    }

    /**
     * Returns the sum of two numbers
     * @param sNumberA number to add
     * @param sNumberB number to add
     * @return sum result
     * */
    public static double add(String sNumberA, String sNumberB){
        dNumberA = Double.parseDouble(sNumberA);
        dNumberB = Double.parseDouble(sNumberB);
        dResult = dNumberA + dNumberB;
        return dResult;
    }

    /**
     * Returns the subtraction of two numbers
     * @param sNumberA number to subtract
     * @param sNumberB number to subtract
     * @return subtraction result
     * */
    public static double subtract(String sNumberA, String sNumberB){
        dNumberA = Double.parseDouble(sNumberA);
        dNumberB = Double.parseDouble(sNumberB);
        dResult = dNumberA - dNumberB;
        return dResult;
    }

    /**
     * Returns the multiplication of two numbers
     * @param sNumberA number to multiply
     * @param sNumberB number to multiply
     * @return multiplication result
     * */
    public static double multiply(String sNumberA, String sNumberB){
        dNumberA = Double.parseDouble(sNumberA);
        dNumberB = Double.parseDouble(sNumberB);
        dResult = dNumberA * dNumberB;
        return dResult;
    }

    /**
     * Returns the division of two numbers
     * @param sNumberA number to divide
     * @param sNumberB number to divide
     * @return result of the division between sNumberA and sNumberB
     * */
    public static double divide(String sNumberA, String sNumberB){
        dNumberA = Double.parseDouble(sNumberA);
        dNumberB = Double.parseDouble(sNumberB);
        try {
            dResult = dNumberA / dNumberB;
        }catch (ArithmeticException e){
            System.out.println("Invalid division");
        }
        return dResult;
    }

}
