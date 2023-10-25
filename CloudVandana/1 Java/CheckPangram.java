import java.util.Scanner;

public class CheckPangram {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your sentence below...");
        String input = sc.nextLine();
        boolean result = checkIfPangram(input.toLowerCase());
        if (result) {
            System.out.println("This is a pangram...Excilent!");
        } else {
            System.out.println("The isn't a pangram...Sorry!");
        }
    }

    public static boolean checkIfPangram(String str) {
        if (str.length() < 26) {
            return false;
        }
        String chekerString = "abcdefghijklmnopqrstuvwxyz";
        for(int i=0 ; i<chekerString.length() ; ++i){
            if(!str.contains(String.valueOf(chekerString.charAt(i)))){
                return false;
            }
        }
        return true;
    }
}
