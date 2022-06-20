import java.util.Scanner;

class BasePall {
    // below ones are just for initializations
    int number;
    // nothing to do with this
    BasePall(String str){}

    String str;
    // nothing to do with this
    public boolean Checker(){

        return false;
    }
    // nothing to do with this
    public String Checker(String stt){

        return "false";
    }

}

class ifPalindrome extends BasePall{

    ifPalindrome(String str){
        super(str);
        this.str = str;
    }
    String str;
    int num;
    @Override
    public boolean Checker(){
            // get length of string
            int length = str.length();
            int count = 0;
            // check there is palindrome number
            boolean bool = true;
            // get info about ascii codes of chars
            while (count < (int) ((length + 1) / 2)) {
                int opp = length - count - 1;

                if (str.charAt(count) != str.charAt(opp)) {
                    bool = false;
                    return bool;
                }
                count += 1;
            }

            return bool;

    }
    // check if there is a palindrome number
    public String Checker(String srr){
        int char1;
        int char2;
        int length = str.length();
        int count = 0;
        boolean bool = true;

        while (count < (int) ((length + 1) / 2)) {
            int opp = length - count - 1;
            char1 = (int) str.charAt(count);
            char2 = (int) str.charAt(opp);

            if ((((char1<58)&&(char1>47)) && ((char2<58)&&(char2>47)))){
                if (char1 != char2) {

                    bool = false;

                }

            }else{
                return "It is not an integer!!";

            }

            count += 1;
        }

        if (!bool){
            return "It is not a pallindrom number!!";
        }
        return "It is a pallindrom number";
    }

}


public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // get input
        System.out.println("Please input a number to check: ");
        String inputt = scan.nextLine();

        BasePall isPallindrom = new ifPalindrome(inputt);
        // give result
        System.out.println(isPallindrom.Checker("anything"));


    }

}
