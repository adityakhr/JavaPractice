import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ConvertIntoInteger{

    public static void main(String[] args) throws ArithmeticException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your roman number below...");
        String input = sc.nextLine();
        for(int i =0 ; i<input.length() ; ++i){
            if(input.toUpperCase().charAt(i)!='I' && input.toUpperCase().charAt(i)!='V' && input.toUpperCase().charAt(i)!='X' && input.toUpperCase().charAt(i)!='L' && input.toUpperCase().charAt(i)!='C' && input.toUpperCase().charAt(i)!='D' && input.toUpperCase().charAt(i)!='M'){
                throw new ArithmeticException("Expect Roman Character only...");
            }
        }
        int result = romanToInt(input);
        System.out.println(input + " is equal to: " + result);
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i > 0 && romanValues.get(s.charAt(i)) > romanValues.get(s.charAt(i - 1))) {
                result += romanValues.get(s.charAt(i)) - 2 * romanValues.get(s.charAt(i - 1));
            } else {
                result += romanValues.get(s.charAt(i));
            }
        }
        return result;
    }
}
