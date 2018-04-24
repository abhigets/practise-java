import java.util.List;

public class LongestWordOFSubSequence {
    public static String find(String pattern, List<String> inputList) {
        String longestString = "";
        for (String currentInput : inputList) {
            if (isSubSequenceOf(pattern, currentInput))
                if (isCurrentInputStringLonger(currentInput, longestString))
                    longestString = currentInput;
        }
        return longestString;
    }

    public static boolean isCurrentInputStringLonger(String currentInput, String longestString) {
        if (currentInput.length() > longestString.length())
            return true;
        return false;
    }

    public static boolean isSubSequenceOf(String pattern, String inputString) {
        char[] patternArray = pattern.toCharArray();
        char[] inputStringArray = inputString.toCharArray();
        int indexOfInputString = 0 ;
        for (int indexOfPattern = 0; indexOfPattern < patternArray.length & indexOfInputString < inputString.length(); indexOfPattern++) {
            if (patternArray[indexOfPattern] == inputStringArray[indexOfInputString])
                indexOfInputString++;
        }
        if (indexOfInputString == inputString.length())
            return true;
        return false;
    }
}
