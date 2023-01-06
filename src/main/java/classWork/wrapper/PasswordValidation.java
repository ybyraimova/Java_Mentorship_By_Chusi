package classWork.wrapper;

public class PasswordValidation {
    /*
    1. create method , parameter String password;
    2.
    3. create for loop to check every letter for digit
    4.


     */

    String password1 = "Hello12";

    public static boolean validatePassword(String password) {
        boolean hasNumber = false;
        for (int i = 0; i < password.length(); i++) {
            char letter = password.charAt(i);
            if (Character.isDigit(letter)) {
                hasNumber = true;
            }
        }
        System.out.println("The password is strong");
        return hasNumber;
    }

    /*
    write a method that picks only numbers from String and converts them to integers.
    the method should accept a string.
    check for any digit in the given string. if you find any, keep eliminating and build
    a separate strings for digits. in the end, convert it to integer data type and print it out
     */

    /*
    Pseudocode:
    1. declare method with void and accept string;
    2.create a variable for string with empty value for numbers
    3. loop and get each character
    4. check if character is digit
    5. if it is digit, add this to the created string on step 2;
    6. finish the loop and convert the string to int using Integer.parseInt method
    7. print it out
     */

    public static void convertStringtoInt(String word){
        String numbers = "";
        for(int i = 0; i< word.length(); i++){
            char letter = word.charAt(i);
            if(Character.isDigit(letter)){
                numbers += letter;
            }
        }
        int result = Integer.parseInt(numbers);
        System.out.println("Numbers " + result);
    }

    public static void main(String[] args) {
        validatePassword("Hello212");
        convertStringtoInt("0q100y1200");

    }
}


