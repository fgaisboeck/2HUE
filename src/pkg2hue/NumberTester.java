package pkg2hue;

import java.io.File;
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

    public void testFile() {

        NumberTester numberTester = new NumberTester("testdoc.txt");
        Scanner fileScanner = new Scanner(numberTester.f.getName());
        String line = fileScanner.nextLine();
        int anzahlTestfaelle = Integer.parseInt(fileScanner.nextLine());
        
        numberTester.oddTester = (n) -> (n%2) == 0;
        numberTester.primeTester = (n) -> (n%2) == 0;
        numberTester.palindromeTester = (n) -> (n%2) == 0;
        
        for (int i = 0; i < anzahlTestfaelle; i++) {
            line = fileScanner.nextLine();
            String[] parts = line.split("\\s+");
            if(Integer.parseInt(parts[0])==1)
            {
                
            }
            else if(Integer.parseInt(parts[0])==2)
            {
                
            }
            else if(Integer.parseInt(parts[0])==3)
            {
                
            }
            
        }
        
        
        
    }

    public interface NumberTest {

        boolean testNumber(int number);
    }
}
