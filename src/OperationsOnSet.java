import java.util.*;
/*You are given an integer ‘n’, which represents the number of operations to be performed on a HashSet.
Each operation has two integers a and b.
‘a’ represents the type of the operation, and ‘b’ represents the data value that is an integer.
The input will be in the following format:
The first line will be ‘n’ indicating the number of operations.
The next ‘n’ lines will be two integers separated by a space, indicating the value of 'a' and 'b' respectively.
Output: The output should be in the following format:
If the type of the operation is 2 (i.e., if the value of a is 2), then check whether the value of 'b' is present in
the HashSet or not. If it is present, print 'true'. Otherwise, print 'false' in a new line.
 Sample Input-1:
6
1 1
1 3
1 3
2 3
3 3
2 3
Sample Output-1:
true
false
*/
public class OperationsOnSet {

        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            int n = in.nextInt();

            // creating a HashSet named "hashSet"
            Set<Integer> hashSet = new HashSet<Integer>();

            for (int i = 0; i < n; i++) {
                int a = in.nextInt();
                int b = in.nextInt();

                switch (a) {
                    case 1:

                        // Adding the input value b to the hashSet
                        hashSet.add(b);
                        break;

                    case 2:

                        // If hashSet contains b then print true
                        if (hashSet.contains(b)) {
                            System.out.println("true");
                        }

                        // Otherwise, print false
                        else {
                            System.out.println("false");
                        }
                        break;

                    case 3:

                        // Remove the element from the hashSet
                        hashSet.remove(b);
                        break;

                }
            }
        }
}