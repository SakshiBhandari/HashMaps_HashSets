import java.util.*;
/*You will be given the array of ‘n’ integers, and you have to print “true” if the distinct integers of the given n integers
can form a set of contiguous integers. Otherwise, print “false”.
Note: The given array of integers may contain duplicates.
Input: The input will be in the following format:
The first line will be ‘n’, indicating the size of the input array.
The next line will be ‘n’ space-separated integers, indicating the elements of the array.
Output: The output should be in the following format:
Print 'true' if the distinct integers of the given n integers can form a set of contiguous integers. Otherwise, print 'false'.
Note: If the array is empty, then assume that the array did not contain any distinct integers that can form contiguous integers.
Sample input-1:
10
5 8 4 4 7 6 2 6 7 3
Sample output-1:
true
*/
public class ContiguousIntegers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, count = 0;
        n = in.nextInt();

        //array to store the input elements
        int[] array = new int[n];

        //storing the elements to the array
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }

        // If the array is empty then print false and return
        if (n == 0) {
            System.out.println("false");
            return;
        }


        /* HashSet to store all the elements of the "array" */
        HashSet<Integer> hashSet = new HashSet<Integer>();

        /* Store all the elements of the "array" to the "hashSet" */
        for (int i = 0; i < n; i++)
            hashSet.add(array[i]);

        // Initialise the current element as array[0]
        int currentElement = array[0];

        // while "currentElement" present in "hashSet" do the following
        while (hashSet.contains(currentElement) == true) {

            // increment count by one
            count++;

            // decrement the "currentElement" by one
            currentElement--;
        }


        /*Now to check for the elements greater than the array[0]. So, modify the "currentElement" as array[0] + 1 */
        currentElement = array[0] + 1;

        // while "currentElement" present in "hashSet" do the following
        while (hashSet.contains(currentElement) == true) {

            // increment the "count" by one
            count++;

            // increment the "currentElement" by one
            currentElement++;
        }

        // Print true if the "count" is equal to the size of the "hashSet"
        if (count == (hashSet.size())) {
            System.out.println("true");
        }
        //Otherwise print false
        else
            System.out.println("false");
    }
}
