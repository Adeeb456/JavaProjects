import java.util.Scanner ;

class BinarySearchImplementation
{
    public static void main ( String [] args )
    {
        Scanner sc = new Scanner ( System.in ) ;
        int N = sc.nextInt () ;

        int [] arr = new int [ N ] ;
        
        for ( int i = 0 ; i < N ; i++ )
           arr [ i ] = sc.nextInt () ; 
        
        int target = sc.nextInt () ;   

        sc.close () ;
        
        System.out.println ( binarySearch ( arr, target ) ) ;
    }

    public static int binarySearch ( int [] arr , int target )
    {
        int start = 0 , end = arr.length ;

        while ( start <= end )
        {
            int mid = ( start + end ) / 2 ;

            if ( target == arr [ mid ] )
              return mid ;

            else if ( target > arr [ mid ] )
              start = mid + 1 ;
             
            else 
              end = mid - 1 ;  
        }

        return -1 ;
    }
} 

