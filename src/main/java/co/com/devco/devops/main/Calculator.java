package co.com.devco.devops.main;

import co.com.devco.devops.methods.Operations;

import java.util.Scanner;

/**
 * Main class of the calculator
 * @author Camilo Andrés Rodríguez Usme {@link "mailto:crodriguezusme@gmail.com"}
 */

public class Calculator {

    static Scanner oRead = new Scanner(System.in);

    public static void main(String[] args) {
        String sNumberA = null;
        String sNumberB = null;
        double dResult = 0;
        int iOperation;
        do {
            iOperation = selectOption();
            if (iOperation != 5){
                System.out.println("Enter number 1:");
                sNumberA = oRead.next();
                System.out.println("Enter number 2:");
                sNumberB = oRead.next();
            }
            switch (iOperation){
                case 1:
                    dResult = Operations.add(sNumberA, sNumberB);
                    break;
                case 2:
                    dResult = Operations.subtract(sNumberA, sNumberB);
                    break;
                case 3:
                    dResult = Operations.multiply(sNumberA, sNumberB);
                    break;
                case 4:
                    dResult = Operations.divide(sNumberA, sNumberB);
                    break;
                case 5:
                    System.out.println("Goodbye...");
                    dResult = 0;
                    break;
            }
            System.out.println("Result: " + dResult);
        }while (iOperation < 5);
    }

    static int selectOption(){
        int iOption = 0;
        System.out.println("\nCALCULATOR:\n");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Exit\n");
        do {
            System.out.println("Option: ");
            iOption = oRead.nextInt();
        }while (iOption < 0 || iOption > 5);
        return  iOption;
    }


}
