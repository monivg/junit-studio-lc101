package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    //1
    @Test
    public void emptyTest() {

        assertEquals(true, true);
    }
    //2
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    //3
    @Test
    public void bothBracketsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    //4
    @Test
    public void stringsSeparatedByBracketsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    //5
    @Test
    public void bracketBeforeStringTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    //6

    @Test
    public void stringOneBracketFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    //7
    @Test
    public void openBracketFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    //8

    @Test
    public void stringsNoClosedBracketFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }

    // 9
    @Test
    public void noClosedBracketsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    //10
    @Test
    public void closedBracketFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    //11
    @Test
    public void twoBracketsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][]"));
    }

    @Test
    public void threeBracketsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]zebra]"));
    }


}
