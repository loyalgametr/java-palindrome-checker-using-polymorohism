import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // get string
        System.out.println("Please enter a number to check: ");
        String taken_string = scan.nextLine();

        BasePall isPalindrome = new IfPalindrome(taken_string);
        // give result
        System.out.println(isPalindrome.Checker("anything"));

    }

}

class BasePall {
    // below ones are just for initializations
    // nothing to do with this
    BasePall(String str){}
    // nothing to do with this
    public String Checker(String stt){

        return "false";
    }

}

class IfPalindrome extends BasePall{

    String str;
    IfPalindrome(String str){
        super(str);
        this.str = str;
    }


    // check if there is a palindrome number
    @Override
    public String Checker(String srr){
        int char1;
        int char2;
        int length = str.length();
        int count = 0;
        boolean bool = true;

        while (count <  ((length + 1) / 2)) {
            int opp = length - count - 1;
            char1 = str.charAt(count);
            char2 = str.charAt(opp);

            if ((((char1<58)&&(char1>47)) && ((char2<58)&&(char2>47)))){
                if (char1 != char2) {

                    bool = false;

                }

            }else{
                return "It is not a number! It is a string!";

            }

            count += 1;
        }

        if (!bool){
            return "It is not a palindrome number!!";
        }
        return "It is a palindrome number!!";
    }

}

