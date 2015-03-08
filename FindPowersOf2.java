public class FindPowersOf2 
{
	public static void main(String[] args)
	{
		findPowersOf2();
	}
	
	/**
       The findPowersOf2 identify the integers 
       that are powers of 2  and put them into the outputArray in descending order.
	*/
	public static void findPowersOf2()
	{
		int[] inputArray = {83, 2, 23, 11, 97, 23, 41, 67, 16, 25, 1 , 4,
				            75, 92, 52, 6, 44, 81, 8, 64};
	    int[] outputArray = new int[10];
    
        // The index pointing the next position in output array
        // Initialize it to the beginning of the array
        int nextOut = 0;

        // Interate in the descending order
        for( int i = 6; i >= 0; i-- )
        {
            // Shifting 1 i bits will produce 2^i
            int powOf2ToFind = 1 << i;

            // Iterate over the input array to look up for pow2
            for( int j = 0; j < inputArray.length; j++ )
            {
                // Make sure the output array is not over flown
                if( inputArray[j] == powOf2ToFind && nextOut < outputArray.length)
                {
                	outputArray[nextOut] = inputArray[j];
                    nextOut++;
                }
            }
        }
        
	}  
}
