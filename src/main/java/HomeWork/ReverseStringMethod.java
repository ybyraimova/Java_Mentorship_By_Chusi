package HomeWork;

public class ReverseStringMethod {

//    Create below method, that will take String str, and returns reversed string.
//        //codewise  ==> esiwedoc
//        //mama  ==> amam
//        //hello ==> olleh
//        reverseString("codewise");
//
//  Pseudocode:
//    1. Create a string reversed to store a reversed string;
//    2. create for loop;
//    3. give a condition to start from the last letter of the string;
//    4. give a condition to stop at first letter of the string;
//    5. decrement index, so it will count from biggest to lowest (from end to beginning)
//    6. store a new
//

    public static String reverseString(String str){
        String reversed = "";
         for(int i = str.length()-1; i >= 0; i--){
             reversed = reversed + str.charAt(i);
         }
        System.out.println(str + " ==> " + reversed);
         return reversed;
    }

    public static void main(String[] args) {
        reverseString("codewise");
        reverseString("mama");
        reverseString("hello");


    }

}



