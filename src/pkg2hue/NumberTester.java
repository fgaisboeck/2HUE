package pkg2hue;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NumberTester {

    NumberTest oddTester;
    NumberTest primeTester;
    NumberTest palindromeTester;
    File f;

    public NumberTester(String fileName) {
        this.f = new File(fileName);
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

    public void testFile() throws FileNotFoundException {

        NumberTester numberTester = new NumberTester("testdoc.txt");
        Scanner fileScanner = new Scanner(numberTester.f);
        String line = fileScanner.nextLine();

        int anzahlTestfaelle = Integer.parseInt(line);

        numberTester.oddTester = (n) -> (n % 2) == 0;

        numberTester.primeTester = (n) -> {
            boolean b = true;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    b = false;
                }
            }
            return b;
        };

        numberTester.palindromeTester = (n) -> {
            boolean b = true;
            String str = String.valueOf(n);
            StringBuilder sb = new StringBuilder(str);
            sb.reverse();
            if (str.equals(sb.toString())) {
                b = true;
            } else {
                b = false;
            }
            return b;
        };

        for (int i = 0;
                i < anzahlTestfaelle;
                i++) {
            line = fileScanner.nextLine();
            String[] parts = line.split("\\s+");
            if (Integer.parseInt(parts[0]) == 1) {
                if (numberTester.oddTester.testNumber(Integer.parseInt(parts[1]))) {
                    System.out.println("EVEN");
                } else {
                    System.out.println("ODD");
                }

            } else if (Integer.parseInt(parts[0]) == 2) {
                if (numberTester.primeTester.testNumber(Integer.parseInt(parts[1]))) {
                    System.out.println("PRIME");
                } else {
                    System.out.println("NO PRIME");
                }

            } else if (Integer.parseInt(parts[0]) == 3) {
                if (numberTester.palindromeTester.testNumber(Integer.parseInt(parts[1]))) {
                    System.out.println("PALINDROME");
                } else {
                    System.out.println("NO PALINDROME");
                }
            }

        }

    }

    public interface NumberTest {

        boolean testNumber(int number);
    }
}
