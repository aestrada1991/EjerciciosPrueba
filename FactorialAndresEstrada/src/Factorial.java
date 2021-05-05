import java.util.Scanner;

public class Factorial {
    public static void main(String args[]){
        Scanner entryNumber = new Scanner(System.in);
        System.out.println("Ingrese el numero a calcular: ");
        int numberToCalculate = entryNumber.nextInt();
        System.out.printf("El factorial de %d es %.0f \n", numberToCalculate, calculateFactorial(numberToCalculate));
    }
    public static double calculateFactorial(int numberToCalculate){
        double auxiliaryNumber = 1;
        for( int i=2; i <= numberToCalculate; i++){
            auxiliaryNumber *= i;
        }
    return auxiliaryNumber;
    }
}
