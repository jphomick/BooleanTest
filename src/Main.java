import java.util.Random;
public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        int numOne = rand.nextInt(10);
        int numTwo = rand.nextInt(10);
        System.out.println("The two numbers are: " + numOne + " and " + numTwo);
        boolean a, b, c, d, e, f;
        a = (numOne <  numTwo);
        b = (numOne <= numTwo);
        c = (numOne == numTwo);
        d = (numOne != numTwo);
        e = (numOne >  numTwo);
        f = (numOne >= numTwo);

        System.out.println( numOne + " is LESS THAN " + numTwo + ": " + a );
        System.out.println( numOne + " is LESS THAN or EQUAL TO " + numTwo + ": " + b );
        System.out.println( numOne + " is EQUAL TO " + numTwo + ": " + c );
        System.out.println( numOne + " is NOT EQUAL TO " + numTwo + ": " + d );
        System.out.println( numOne + " is GREATER THAN " + numTwo + ": " + e );
        System.out.println( numOne + " is GREATER THAN or EQUAL TO " + numTwo + ": " + f );
        System.out.println();

        System.out.println( !(numOne < numTwo) + " " + (numOne >= numTwo) );
        System.out.println( !(numOne <= numTwo) + " " + (numOne > numTwo) );
        System.out.println( !(numOne == numTwo) + " " + (numOne != numTwo) );
        System.out.println( !(numOne != numTwo) + " " + (numOne == numTwo) );
        System.out.println( !(numOne > numTwo) + " " + (numOne <= numTwo) );
        System.out.println( !(numOne >= numTwo) + " " + (numOne < numTwo) );
    }
}
