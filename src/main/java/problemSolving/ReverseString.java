package problemSolving;

public class ReverseString {
    /*
    create a method that takes one String and returns reversed String;
     */
    public static String reverseString(String str){
        String reversed ="";
        for(int i =str.length()-1; i>=0; i--){
            reversed = reversed +str.charAt(i);
        }
        System.out.println(reversed);
       return reversed;
    }

    public static void main(String[] args) {
        reverseString("Hello");
    }
}
