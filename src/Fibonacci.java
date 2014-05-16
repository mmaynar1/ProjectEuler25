import java.math.BigInteger;

public class Fibonacci
{
    public BigInteger getFibonacciNumber( BigInteger term )
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
