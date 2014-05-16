import java.math.BigInteger;

public class Fibonacci
{
    public static void main( String[] args )
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
        System.out.println("########FINAL###########");
        System.out.println( term );
        System.out.println( result );
        System.out.println( digits );
    }

    private BigInteger getFibonacciNumber( BigInteger term )
    {
        BigInteger result = BigInteger.ZERO;
        if ( isValidTerm( term ) )
        {
            if ( term.compareTo(  BigInteger.ONE ) == 0 || term.compareTo( BigInteger.valueOf( 2 ) ) == 0 )
            {
                result = BigInteger.ZERO;
            }
            else
            {
                BigInteger parent = BigInteger.ONE;
                BigInteger grandParent = BigInteger.ONE;
                for (BigInteger i = BigInteger.valueOf( 3 ); i.compareTo( term ) == -1 || i.compareTo( term ) == 0; i = i.add( BigInteger.ONE ))
                {
                    result = parent.add( grandParent );
                    grandParent = parent;
                    parent = result;
                }
            }
        }
        else
        {
            throw new RuntimeException( "Invalid term number" );
        }

        return result;
    }

    private boolean isValidTerm( BigInteger term )
    {
        return (term.compareTo( BigInteger.ZERO ) == 1);
    }

}
