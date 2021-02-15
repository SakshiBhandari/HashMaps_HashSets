import java.util.*;
/*You are given a HashMap with n number of keys and values. You need to print key-value pairs that are an anagrams of each other
in the dictionary order of keys (alphabetical order based on the first letter of the word). An anagram is a word, phrase or name that
is formed by rearranging the letters of another.
Example:
Map = {rasp spar, dog cat}
Output:
rasp : spar
Here spar is formed from rasp.
Input: The input will be in the following format:
The first line should be the number of elements present in the map.
Next, n lines contain the key-value pairs.
Output:
All the key-value pairs that are an anagram of each other should be printed in the following format:
Key1: Value1
Key2: Value2
Note: If there is no such key-value pair anagram of each other, then the output should be false.
Sample Case-1:
Input:
3
BAT TAB
CAT DOG
EAT TEA
Output:
BAT:TAB
EAT:TEA
Here, 3 represents the number of key-value pairs present in the map. The next three lines in the input represent the key-value pairs.
 The output is those key-value pairs that are anagrams.
Sample Case-2:
Input:
2
A B
C D
 */
public class AnagramsKeyValue {
        //Method to check if two strings are anagram of each other or not
        public static boolean check(String str1, String str2){
            char[] ch1 = str1.toLowerCase().toCharArray();
            char[] ch2 = str2.toLowerCase().toCharArray();
            //Write your code here
            if(ch1.length == ch2.length){
                arrange(ch1);
                arrange(ch2);
                for(int i = 0; i < ch1.length; i++){
                    if(ch1[i] != ch2[i])
                        return false;
                }
                return true;
            }
            else{
                return false;
            }
        }
    //Method to sort the character array
    public static void arrange(char[] ch){
        char temp;
        for(int i = 0; i < ch.length-1; i++){
            for(int j = 0; j < ch.length-1-i; j++){
                if(ch[j] > ch[j+1]){
                    temp = ch[j];
                    ch[j] = ch[j+1];
                    ch[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] x){
        Map<String,String> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String key;
        String value;
        for(int i = 1; i <= num; i++){
            key = sc.next();
            value = sc.next();
            map.put(key,value);
        }
        boolean flag = false;
        List<String> l = new ArrayList<String>();
        for(String s : map.keySet()){
            if(check(s,map.get(s))){
                l.add(s);
                flag = true;
            }
        }
        if(!flag){
            System.out.println("false");
        }
        else{
            //This method sorts the elements present in the list
            Collections.sort(l);
            for(String s : l){
                System.out.println(s + " : " + map.get(s));
            }
        }
    }
}

