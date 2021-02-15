import java.util.Scanner;
import java.util.*;
/*You will be given a string, and you have to print the first unique character of the string, i.e., the non-repeating character of the string.
Note:
The string may contain duplicates.
If there is no unique character, then print -1.
Input: The input will be in the following format:
The first line will be a string.
Output: The output should be in the following format:
Print the first unique character of the string or -1 if no unique character is found.
Sample Input-1:
abcdabdef
Sample output-1:
c
The input is a string "abcdabdef". The output is character c from the input string, as c is the only character that is not repeated in the string.
Sample input-2:
aabb
Sample output-2:
-1
*/
public class FirstUniqueCharacter {

        public static void main(String arg[]) {

            Scanner in = new Scanner(System.in);

            //storing the input string to String variable "str"
            String str = in.nextLine();
            //write your code here
            Character firstUniqueChar = null;

            Map<Character, Integer> characterCount = new LinkedHashMap<Character, Integer>();
            for (Character ch : str.toCharArray()) {
                if (!characterCount.containsKey(ch)) {
                    characterCount.put(ch, 1);
                } else {
                    characterCount.put(ch, characterCount.get(ch) + 1);
                }
            }

            for (Character ch : characterCount.keySet()) {
                if (characterCount.get(ch) == 1) {
                    firstUniqueChar = ch;
                    break;
                }
            }

            if (firstUniqueChar == null) {
                System.out.println("-1");
            } else {
                System.out.println(firstUniqueChar);
            }

        }
}
