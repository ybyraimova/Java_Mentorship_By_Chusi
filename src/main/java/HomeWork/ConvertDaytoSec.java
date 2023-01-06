package HomeWork;

public class ConvertDaytoSec {


//    Write a program to convert given number of days into seconds.

    /*
    day = 24h
    1 h = 60 min
    1 min = 60 sec

    Pseudocode:
    1. Create new integer seconds where we will store seconds;
    2. Create for loop because we want the number of days looped from 1 until it reaches the given number of days;
    3. We want to start the loop with the day 1, loop until the number of days, start from 1 till the end;
    4. inside the loop give a formula to calculate the seconds in 1 day.
    5. formula would be given number of days * 24 hours * 60 seconds;
    6. if number of days given is equal to one print: 1 day has "" secs;
    7.else print: '' days have "" secs;
     */

    public static long convertDayToSec(int numOfDays){
        long seconds  = 0;
        for( int i = 1; i <= numOfDays; i++){
            seconds = numOfDays * 24 * 60;
        }
        if(numOfDays == 1){
            System.out.println(numOfDays + " day has " + seconds + " seconds.");
        } else {
            System.out.println(numOfDays + " days have " + seconds + " seconds.");
        }
        return seconds;

    }

        public static void main (String[]args){
        convertDayToSec(1);
        convertDayToSec(7);
        convertDayToSec(365);
    }

}

