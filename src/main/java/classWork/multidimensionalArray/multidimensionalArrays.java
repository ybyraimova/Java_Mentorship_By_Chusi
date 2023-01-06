package classWork.multidimensionalArray;

import java.util.Arrays;

public class multidimensionalArrays {
    public static void main(String[] args) {
        /* 2D arrays are arrays of arrays;

         */
        int[] oneDArray = new int[5];
        int[][] twoDArray = new int[3][5];

        int[] oneDimArr2 = new int[]{1, 2, 3};
        int[][] twoDimArr2 = new int[][]{{1, 2, 3}, {1, 2, 3, 4, 5}};

        int[] oneDimArr3 = new int[3];
        oneDimArr3[0] = 1;
        oneDimArr3[1] = 3;
        oneDimArr3[2] = 5;

        int[][] twoDimArr3 = new int[2][3];
        twoDimArr3[0][0] = 1;
        twoDimArr3[0][1] = 5;


        twoDimArr3[1][0] = 8;
        twoDimArr3[1][1] = 80;
        twoDimArr3[1][2] = 800;
        System.out.println(twoDimArr3);//this prints ID


        String[] strOnDim = new String[3];
        strOnDim[0] = "hello";
        strOnDim[1] = "you understand?";
        strOnDim[2] = "easy";

        String[][] strTwoDim1 = new String[][]{{"abc", "def", "xyz"},
                {"qwe", "rty"}};
        String[][] strTwoDim2 = new String[3][4];

        strTwoDim2[0][0] = "hello";
        strTwoDim2[0][1] = "bye";
        strTwoDim2[0][2] = "welcome";

        strTwoDim2[1][0] = "girl";
        strTwoDim2[1][1] = "boy";
        strTwoDim2[1][2] = "child";
        strTwoDim2[1][3] = "kid";


        String countries[][] = {{"Africa:", "Zimbabwe", "Nigeria", "Kongo", "Chad"},
                {"Asia:", "Vietnam", "Thailand", "Nepal", "Sri Lanka", "Malaysia"}};

        String countries1[][] = new String[3][3];
        countries1[0][0] = "Asia:";
        countries1[0][1] = "Malaysia";
        countries1[0][2] = "Indonesia";


        countries1[1][0] = "Pakistan";
        countries1[1][1] = "Afghanistan";
        countries1[1][2] = "Turkmenistan";


        float[][] floatArray = new float[2][3];

        floatArray[0][0] = 201.5f;
        floatArray[1][0] = 2.5f;

        /*
        when you have 2d arrays, the size of the first array should not be more than the size of second array.
         */

        String[][] strArr = new String[][]{{"plov", "crepes", "shashlyk"}, //0
                {"tea", "cola", "water"}}; //1
        System.out.println(strArr.length); // 2 - it means number of arrays inside the multidimensional array;
        /*
        plov    | tea
        crepes  | cola
        shashlyk|water
         */
        for (int i = 0; i < strArr.length; i++) { //outer loop will loop through meaning [0][], then [0][]...[1][]...
            for (int k = 0; k < strArr[i].length; k++) { //inner loop [0][1], [0][1], [0][2], [0][3]..
                System.out.println(strArr[i][k]);
            }
        }

        String[] foods = {"sushi", "ramen", "tom-yam"};
        String[] drinks = {"green tea", "black tea", "soda", "mountain dew", "water"};

        String[][] menu = new String[][]{foods, drinks};
        for (int i = 0; i < menu.length; i++) {
            for (int j = 0; j < menu[i].length; j++) {
                System.out.println(menu[i][j]);
            }
        }

        String[] birds = {"mockingbird", "sparrow", "parrot", "eagle"};
        String[] insects = {"grasshopper", "spiders", "ladybug"};
        String[] mammals = {"cow", "bear", "whale", "elephant", "dog", "human"};
        String[][] species = new String[][]{birds, insects, mammals};

        for (int i = 0; i < species.length; i++) {
            for (int j = 0; j < species[i].length; j++) {
                System.out.print(species[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("==================================");

        //        or
        String[][][] species1 = {{birds}, {insects}, {mammals}};
        for (int i = 0; i < species1.length; i++) {
            for (int j = 0; j < species1[i].length; j++) {
                System.out.print(Arrays.toString(species1[i][j]));
            }

        }
        System.out.println();



    int[] row = new int[]{1, 2, 3};
    int[] column = new int[]{10, 20, 30};
    int[] end = new int[]{500, 500, 500};
//        int [][][] result = new int[][][]{row, column, end};


    int[][] arr = new int[5][2];
        System.out.println(arr.length);
//        arr[0][0] = 1;
//        arr[0][1] = 1;
////        arr[0][2] = 1;
//        arr[0][3] = 1;
//        arr[0][4] = 1;

        System.out.println(arr[0].length);

        int[][] arr2 = new int[][]{{1,2,3}, {4,5,6,7}};
        System.out.println(arr2.length);





    }
}



