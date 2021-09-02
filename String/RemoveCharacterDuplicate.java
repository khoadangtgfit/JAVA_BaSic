package String;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class RemoveCharacterDuplicate {
    public static void main(String[] args) {

        System.out.println(removeDuplicateChar("bananas"));
        System.out.println(removeDuplicateChar(""));
    }

    public static String removeDuplicateChar(String str) {
        Set<Character> charsPresent = new HashSet<>();
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < str.length(); i++) {
            if (!charsPresent.contains(str.charAt(i))) {
                stringBuilder.append(str.charAt(i));
                charsPresent.add(str.charAt(i));
            }
        }

        return stringBuilder.toString();
    }

}
