package Livecoding;



public class RecapWhileLoop {
    public static void main(String[] args) {
        /*
        print numbers from 100 to 0 using while loop that can be divisible by three:
         */

        int a =100;

        while(a >=3){
            if (a % 3==0){
                System.out.println(a);
            }
            a--;
        }

        /*
        numbers that can be divisible by 5. from 0-100
         */
        int b =0;
        while(b<=100){
            if(b % 5 == 0){
                System.out.println(b);
            }
            b++;
        }

        int c=0;
        while(c <10){
            System.out.println("Good morning everyone"+ c++); //it also works but will run only this code;
        }

        int f= 1;
        while (f <=31){
            System.out.println(f + " January 2023");
            f++;
        }

        /*
        print 1 -28 feb
         */
        int day =1;
        do{
            System.out.println(day + " February 2023");
            day++;
        }while (day <= 28);

        /*
        print numbers from 1 to 100 using do while
         */
        do{
            System.out.println(day);
            day++;
        }while(day <=100);

        /*
        1-900 divisible by 9
         */
        int q =1;
        do{
            if(q % 9 == 0){
                System.out.println(q);
            }
            q++;
        }while(q <= 900);















    }
}
