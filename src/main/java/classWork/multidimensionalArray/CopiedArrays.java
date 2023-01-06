//package classWork.multidimensionalArray;
//
//public class CopiedArrays {
//    /*
//        Create 4 String one dim arrays
//        Create 2 String two dim arrays
//        Create 1 String three dim array
//        print everything using for loop and for each loop
//         */
//
//    String [] madrid = {"modric","ronaldo","carlos"};
//    String [] barcelona = {"messi","pedro","pique"};
//    String [] psg = {"messi","mbappe","neymar"};
//    String [] manut = {"sko","kok","pop"};
//
//    String [][] total = {madrid,barcelona};
//    String [][] total1 = {psg,manut};
//
//    String [][][] total2 = {total,total1};
//
//        for(int i = 0;i < total2.length;i++){
//        for(int k = 0;k < total2[i].length;k++){
//            for(String name : total2[i][k]){
//                System.out.print(name + " , ");
//            }
//        }
//    }
//
//    String [][][][] fourDimArr = {total2, {total1, total}, {{madrid, psg}, {barcelona, manut}}};
//        System.out.println("Below is four dimensional array printed using for each loops");
//        for (String [][][] threeDim : fourDimArr){
//        for(String [][] twoDim: threeDim){
//            for (String [] oneDim: twoDim){
//                for(String name: oneDim){
//                    System.out.print(name + " - ");
//                }
//            }
//        }
//    }
//}
