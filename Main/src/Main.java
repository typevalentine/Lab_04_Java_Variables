public class Main
{
    public static void main(String[] args)
    {
        int intOperandA = 2;
        int intOperandB = 5;
        int intSum = 3;
        int intProduct = 7;
        int intDifference = 9;
        int intQuotient = 1;
        int intModulo = 4;
        double doubleOperandA = 2.5;
        double doubleOperandB = 5.5;
        double doubleSum = 3.5;
        double doubleProduct = 7.5;
        double doubleDifference = 9.5;
        double doubleQuotient = 1.5;
        double doubleModulo = 4.5;

        intSum = intOperandA + intOperandB;
        System.out.println("The sum using two ints: " + intOperandA + " and " + intOperandB + " is " + intSum);
        intProduct = intOperandA * intOperandB;
        intDifference = intOperandA - intOperandB;
        intQuotient = intOperandA / intOperandB;
        intModulo = intOperandA % intOperandB;

        doubleSum = doubleOperandA + doubleOperandB;
        doubleProduct = doubleOperandA * doubleOperandB;
        doubleDifference = doubleOperandA - doubleOperandB;
        doubleQuotient = doubleOperandA / doubleOperandB;
        doubleModulo= doubleOperandA % doubleOperandB;


        System.out.println("The product of ints: " + intOperandA + " and " + intOperandB + " is " + intProduct);
        System.out.println("The difference of ints: " + intOperandA + " and " + intOperandB + " is " + intDifference);
        System.out.println("The quotient of ints: " + intOperandA + " and " + intOperandB + " is " + intQuotient);
        System.out.println("The modulo of ints: " + intOperandA + " and " + intOperandB + " is " + intModulo);

        System.out.println("The double sum of ints: " + doubleOperandA + " and " + doubleOperandB + " is " + doubleSum);
        System.out.println("The double product of ints: " + doubleOperandA + " and " + doubleOperandB + " is " + doubleProduct);
        System.out.println("The double difference of ints: " + doubleOperandA + " and " + doubleOperandB + " is " + doubleDifference);
        System.out.println("The double quotient of ints: " + doubleOperandA + " and " + doubleOperandB + " is " + doubleQuotient);
        System.out.println("The double modulo of ints: " + doubleOperandA + " and " + doubleOperandB + " is " + doubleModulo);
    }
}
