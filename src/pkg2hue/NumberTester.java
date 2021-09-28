package pkg2hue;

import java.io.File;

public class NumberTester {

    public NumberTester(String fileName) {
        File f = new File(fileName);
    }

    public void setOddEvenTester(NumberTest oddTester) {
        this.oddTester = oddTester;
    }

    public void setPrimeTester(NumberTest primeTester) {
        this.primeTester = primeTester;
    }

    public void setPalindromeTester(NumberTest palindromeTester) {
        this.palindromeTester = palindromeTester;
    }

    public void testFile() {

    }

    public interface NumberTest {

        boolean testNumber(int number);
    }
}
