package in.kanha.string;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StringProgrammingWithJava8 {
    public static void main(String[] args) {
       String str = "Hello, I Love java!";
       str = str.toLowerCase();

// 1) Remove duplicate characters from a string.
//=============================================
        /* Using java8 */
//      -----------------

        /*
        String result = str.chars() // convert string to IntStream
                .distinct() // for unique
                .mapToObj(ch -> String.valueOf((char) ch)) // convert the int back to a character
                .collect(Collectors.joining());// join character to the string
        System.out.println(result);
        */

        /* Using String class methods */
//      ----------------------------------
        /*
        String result = "";
        for(int i = 0 ;i < str.length(); i++){
            char ch = str.charAt(i);
            if(result.indexOf(ch) == -1){
                result += ch;
            }
        }
        System.out.println(result); // helo, ivja!
        */

        /*
        String result = "";
        boolean spaceAdded = false;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (str.charAt(i) == ' ' && !spaceAdded) {
                spaceAdded = true;
                result += ch;
            } else if (ch != ' ' && result.indexOf(ch) == -1 ) {
                result += ch;
                spaceAdded = false;
            }
        }
        System.out.println(result);
        */

        /* Using Collection Set */
//      --------------------------
        /*
        Set<Character> hashSet = new HashSet<>();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(!hashSet.contains(ch)) {
                hashSet.add(ch);
                result.append(ch);
            }
        }
        System.out.println(result.toString());
        */

// 2) Count the frequency of each character in a string.
//=====================================================

        /*
        Map<Character, Long> frequencyMap = str.chars()
                .filter(ch -> ch != ' ') // Ignore
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        frequencyMap.forEach((key, value) -> System.out.println(key + ":" + value));
        */

// 3) Check if a string contains only digits.
//===========================================

         /*String myString = "5628";*/
        // By using Java8
        /*
        boolean isOnlyDigits = myString.chars()
                .allMatch(Character::isDigit);
        System.out.println("Contains only digits: " + isOnlyDigits);
        */

        // By using String.matches()
        /*
        boolean isOnlyDigits = myString.matches("\\d+"); // "\\d+ is a regular expression that matches one or more digits."
        System.out.println("Contains only digits: " + isOnlyDigits);
        */

        //By using Character.isDigit()
        /*
        boolean isOnlyDigits = true;
        for(char c : myString.toCharArray()){
            if(!Character.isDigit(c)){
                isOnlyDigits = false;
                break;
            }
        }
        System.out.println("Contains only digits: " + isOnlyDigits);
        */

// 4) Check if a string starts with a specific character.
//======================================================
        char target = 'H';
        // Using Java8
        /*
        boolean startsWithChar = str.chars()
                .findFirst().orElse(-1) == target;
         */
        /*
        boolean startsWithChar =
                Character.toLowerCase(str.chars().findFirst().orElse(-1)) == Character.toLowerCase(target);
        System.out.println("Starts with " + target + ": " + startsWithChar);
        */

        //Using charAt()
        boolean startsWithChar = Character.toLowerCase(str.charAt(0)) == Character.toLowerCase(target);
        System.out.println("Starts with " + target + ": " + startsWithChar);

    }
}
