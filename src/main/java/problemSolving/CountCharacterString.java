package problemSolving;

public class CountCharacterString {
    /*
    create a method that takes one string & one char
    returns int,
    return the number of times that char occurs in the string
    mama, a=> 2;
     */

    public static int countCharInString(String str, char letter){
        int count =0;
        for(int i = 0; i<= str.length()-1; i++){
            if(str.charAt(i) == letter){
                count++;
            }
        }
        System.out.println(str + " contains " + count + " " + letter);
        return count;
    }

    public static void main(String[] args) {
        countCharInString("Hello", 'l');
        countCharInString("Code", 'v');
    }

}
