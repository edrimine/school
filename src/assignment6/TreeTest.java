package assignment6;

/**
 * Created by Justin on 4/26/2016.
 */
import java.util.Random;

public class TreeTest
{
    public static void main( String[] args )
    {
        Tree< Integer > tree = new Tree< Integer >();
        int value;
        Random randomNumber = new Random();

        System.out.println( "Inserting the following values: " );

        // insert 10 random integers from 0-99 in tree
        for ( int i = 1; i <= 100; i++ )
        {
            value = randomNumber.nextInt( 10000 );
            System.out.printf( "%d ", value );
            tree.insertNode( value );
        } // end for

        System.out.println("\nNode count: " + tree.nodeCount());
    } // end main
} // end class TreeTest