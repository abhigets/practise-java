import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class LongestWordOFSubSequenceTest {
    @Test
    public void isSubSequenceOf() throws Exception {
        assertTrue(LongestWordOFSubSequence.isSubSequenceOf("abppplee","a"));
        assertTrue(LongestWordOFSubSequence.isSubSequenceOf("abppplee","e"));
        assertTrue(LongestWordOFSubSequence.isSubSequenceOf("abppplee","ab"));
        assertTrue(LongestWordOFSubSequence.isSubSequenceOf("abppplee","abl"));
        assertTrue(LongestWordOFSubSequence.isSubSequenceOf("abppplee","apple"));
        assertFalse(LongestWordOFSubSequence.isSubSequenceOf("abppplee","bale"));
        assertFalse(LongestWordOFSubSequence.isSubSequenceOf("abppplee","kangaroo"));
    }

    @Test
    public void givenStringAndWordsFindLongestWordThatIsSubsequenceOfString(){
        String actual = LongestWordOFSubSequence.find("abppplee", Arrays.asList("able","ale","apple","bale","kangaroo"));
        assertEquals(actual,"apple");
    }

    @Test
    public void isCurrentStringLonger() throws Exception {
        assertTrue(LongestWordOFSubSequence.isCurrentInputStringLonger("John","Jon"));
        assertFalse(LongestWordOFSubSequence.isCurrentInputStringLonger("Jon","John"));
    }
}