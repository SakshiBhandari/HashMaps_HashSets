import java.util.*;
/*You will be given an array of integers and a target sum. You have to check whether there exist any two integers in the array
whose sum is equal to the given target sum. If so, then print true; otherwise, print false.
Input: The input will be in the following format:
The first line will be ‘n’, indicating the size of the input array, i.e., the number of integers in the array.
The next line will be ‘n’ integers, indicating the integers of the array.
The next line will be the target sum.
Output: The output should be in the following format:
If there exist any two integers in the array whose sum is equal to the given target sum, then print ‘true’; otherwise, print ‘false’.
Sample input-1:
6
1 7 40 8 -7 3
15
Sample output-1:
true
The first input is 'n' that is the size of the input array. The next line of input represents n space-separated integers.
The last input is the target sum. The output is true because there exist two integers in the input array whose sum is equal to the target sum that is 7,8.
*/
public class TargetSum {

    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);

        // number of the elements
        int n = in.nextInt();

        int array[] = new int[n];

        //storing the input integers to an array
        for(int i =0;i<n;i++){
            array[i] = in.nextInt();
        }

        // getting the target sum from input
        int targetSum = in.nextInt();

        // initialise flag to false
        boolean flag=false;

        HashSet<Integer> hashSet = new HashSet<Integer>();

        // for all the array elements do the following
        for (int i=0; i<array.length; i++)
        {
            // store difference of target sum and array[i] to a temporary variable "difference"
            int difference = targetSum-array[i];

            /* if the "difference" is already present in the hashSet, mark
            the flag as true indicating that there are two integers in the
             array, whose sum is equal to the given target sum*/
            if ( hashSet.contains(difference))
            {
                flag = true;
                break;
            }

            // add array[i] to the hashSet
            hashSet.add(array[i]);
        }

        /* if the flag is true, this means that there are any two
        integers in the array, whose sum is equal to the given target sum */
        if (flag){
            System.out.println("true");
        }

        /* if the flag is false, this means that you did not find any two
        integers in the array, whose sum is equal to the given target sum */
        else{
            System.out.println("false");
        }
    }
}

