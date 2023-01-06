package classWork.multidimensionalArray;

import javax.xml.namespace.QName;

public class Practice {
    public static void main(String[] args) {
        String[] planets = {"Earth", "Mars", "Jupiter", "Venera", "Uranus"};
        String[] continents = {"North America", "South America", "Asia", "Europe", "Africa"};
        String[] countries = {"Switzerland", "Namibia", "Germany", "Japan", "Angola"};
        String[] cities = {"Zurich", "Berlin", "Warsaw", "Prague", "Tokyo"};

        String[][] twoDim1 = {planets, continents};
        String[][] twoDim2 = {countries, cities};

        for (String elem: twoDim2[0]) {
            System.out.println(elem);
        }

        String[][][] threeDim = {twoDim1, twoDim2};

        String[][][][] fourDim = {threeDim};

        for (String elem: fourDim[0][0][0]) {
            System.out.println(elem);
        }
        for (String[][][] threeDims : fourDim) {
            for (String[][] twoDims : threeDims) {
                for (String[] oneDim : twoDims) {
                    for (String elem : oneDim) {
                        System.out.print(elem + " - ");
                    }
                    System.out.println();
                }
            }
        }


        long [] numbers = {11111111, 22222222,33333333,4444444,5555555};
        long [] numbers1 = {5, 5555,33333,12342,58483};

        long [][] numnums = {numbers1, numbers};

        int [] num1 = {1,2,3,4,5};
        int [] num2 = {3,4,1,7,7};
        int [] num3 = {3,4,1,7,7};
        int [] num4 = {3,4,1,7,7};
        int [] num5 = {3,4,1,7,7,7};



    }
}
