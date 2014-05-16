import java.math.BigInteger;

public class ProjectEuler25
{
    public static void main( String[] args )
    {
       ProjectEuler25 projectEuler25 = new ProjectEuler25();
       projectEuler25.calculateFirstTermWithAResultOf1000Digits();
    }

    private void calculateFirstTermWithAResultOf1000Digits()
    {
        Fibonacci fibonacci = new Fibonacci();
        long digits = 0;
        BigInteger result = BigInteger.ZERO;
        BigInteger term = BigInteger.valueOf( 4700 );
        while ( digits < 1000 )
        {
            term = term.add( BigInteger.ONE );
            result = fibonacci.getFibonacciNumber( term );
            digits = (result + "").length();
        }
        System.out.println("###########FINAL###########");
        System.out.println( "Term: " + term );
        System.out.println( "Result: " + result );
        System.out.println( "Number of Digits: " + digits );
    }
}
