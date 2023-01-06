package classWork.arrays;

public class ArrayConstructor {

    public static void main(String[] args) {

        String [] food = {"Bread", "Cucumber", "Apples", "Orange", "Cookies", "Cake", "Banana", "Apricot",
                "Asparagus"};
        int count =0;
        for(int i =0; i< food.length; i++){
            String temp = food[i];
            if(food[i].startsWith("A")){
                System.out.println(temp.charAt(0) == 'A'); // this will print boolean of charAt
                count++;
            }
        }
        System.out.println("Foods starting with A: " + count); //this will count

        for (int i = 0; i < food.length; i++){
            String temp = food[i]; //this will save each element under index i  in the loop.

            if(temp.charAt(0) == 'B'){
                count++;
                System.out.println(temp);
            }
        } System.out.println("Total number of Items starting with B " + count);
    }
}
