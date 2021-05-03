import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//TODO : Find time complexity of the algo

class NoRepeatSubstring {
    public static int findLength(String str) {
        if (str == null || str.length() == 0)
            throw new IllegalArgumentException();

        int windowStart = 0, windowEnd = 0, maxLength = 0;
        Set<Character> charSet = new HashSet<>();

        // in the following loop we'll try to extend the range [windowStart, windowEnd]
        while (windowEnd < str.length()) {
            char rightChar = str.charAt(windowEnd);
            char leftChar = str.charAt(windowStart);

            if(!charSet.contains(rightChar)) {
                charSet.add(rightChar);
                windowEnd ++;
            }else {
                charSet.remove(leftChar);
                windowStart ++;
            }
            maxLength = Math.max(maxLength,windowEnd - windowStart);


        }

        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println("Length of the longest substring: " + NoRepeatSubstring.findLength("aabccbb"));
        System.out.println("Length of the longest substring: " + NoRepeatSubstring.findLength("abbbb"));
        System.out.println("Length of the longest substring: " + NoRepeatSubstring.findLength("abcccde"));
        System.out.println("Length of the longest substring: " + NoRepeatSubstring.findLength("abccadbwer"));
    }
}
