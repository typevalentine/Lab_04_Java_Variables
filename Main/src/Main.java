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
        System.out.println("The product using two ints: " + intOperandA + " and " + intOperandB + " is " + intProduct);
        intDifference = intOperandA - intOperandB;
        System.out.println("The difference using two ints: " + intOperandA + " and " + intOperandB + " is " + intDifference);
        intQuotient = intOperandB / intOperandA;
        System.out.println("The quotient using two ints: " + intOperandA + " and " + intOperandB + " is " + intQuotient);
        intModulo = intOperandA % intOperandB;
        System.out.println("The modulo using two ints: " + intOperandA + " and " + intOperandB + " is " + intModulo);

        doubleSum = doubleOperandA + doubleOperandB;
        System.out.println("The double sum using two ints: " + doubleOperandA + " and " + doubleOperandB + " is " + doubleSum);
        doubleProduct = doubleOperandA * doubleOperandB;
        System.out.println("The double product using two ints: " + doubleOperandA + " and " + doubleOperandB + " is " + doubleProduct);
        doubleDifference = doubleOperandA - doubleOperandB;
        System.out.println("The double difference using two ints: " + doubleOperandA + " and " + doubleOperandB + " is " + doubleDifference);
        doubleQuotient = doubleOperandA / doubleOperandB;
        System.out.println("The double quotient using two ints: " + doubleOperandA + " and " + doubleOperandB + " is " + doubleQuotient);
        doubleModulo= doubleOperandA % doubleOperandB;
        System.out.println("The double modulo using two ints: " + doubleOperandA + " and " + doubleOperandB + " is " + doubleModulo);
    }
}
