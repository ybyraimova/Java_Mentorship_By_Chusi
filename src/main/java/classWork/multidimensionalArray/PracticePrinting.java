package classWork.multidimensionalArray;

public class PracticePrinting {
    public static void main(String[] args) {
        String [] numbers = {"12", "45", "56", "234"};
        String [] words = {"sun", "earth", "jupiter", "moon"};

        String [][] twoDimArr = {numbers, words};

        for(int i=0; i < twoDimArr.length; i++){
            for(int k= 0; k < twoDimArr[i].length; k++){
                System.out.print(twoDimArr[i][k] + " ");
            }
            System.out.println();
        }

//only second array:
            for(int k= 0; k < twoDimArr[1].length; k++){
                System.out.print(twoDimArr[1][k] + " ");
            }
            System.out.println();


//only first array:
            for(int k = 0; k < twoDimArr[0].length; k++){
                System.out.print(twoDimArr[0][k] + " ");
            }
            System.out.println();


            String [] toDoList = {"grocery shopping", "clean house", "study", "play wtih kids", "go out"};

            /*
            for-each loop works with collections:
            it doesn't work with primitive data types only with non primitives
             */
        for(String task: toDoList){
            System.out.println(task);
        }

        int [] arr = {1,2,3,4};
        for(int a : arr){
            System.out.println(a);
        }

        double [] doubles = {1.2, 2.1, 5.0, 6.7, 0.4};
        for(double looped: doubles){
            System.out.print(looped + "; ");
        }
        System.out.println();

        String [] color = {"yellow", "white", "black"};
        String [] name = {"Andi", "Max", "Tim", "Ken"};
        String [] product = {"Table", "Cabinet", "Tire", "Chair"};
        String [] food = {"Tamale", "Taco", "BBQ"};

        String [][] twoDimArray = {color, name, product, food};

        for(int i = 0; i <twoDimArray.length; i++){
            for(String items: twoDimArray[i]){
                System.out.print(items + " ");
            }
            System.out.println();
        }

        /*
        create 4 string one dim arrays
        create 2 string two dim arrays
        create 1 string three dim array
        print everything for loop and for each loop:
         */
        String [] colors = {"yellow", "white", "black"};
        String [] names = {"Andi", "Max", "Tim", "Ken"};
        String [] products = {"Table", "Cabinet", "Tire", "Chair"};
        String [] foods = {"Tamale", "Taco", "BBQ", "Steak"};

        String [][] colorNames = {colors, names};
        String [][] productsFoods = {products, foods};

        String [][][] threeDimArr = {colorNames, productsFoods};

        for (int i = 0; i < threeDimArr.length; i++){
            for (int j = 0; j < threeDimArr[i].length; j++){
                for(String nehmen : threeDimArr[i][j]){
                    System.out.print(nehmen + ";  ");
                }
            }
            System.out.println();
       }

//        String [][][][] fourDimArr = {names}, {products} ,{products, foods}, {colors, names}}}}



        }


        }

