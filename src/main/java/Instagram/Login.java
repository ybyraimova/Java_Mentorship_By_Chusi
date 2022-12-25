package Instagram;

import java.util.Random;
import java.util.Random;
import java.util.Scanner;

public class Login {
        public static void main(String[] args) {
            Face face = new Face ("White", "Oval");


            login(" +    9415459094 -");
            login1(" -943495      9679 ");
            login("ybyraimova", "jfnd");
        }




        //this is how I solved the problem:
        public static void login(String phoneNumber){
            String newPhoneNumber = phoneNumber.replaceAll("[- +]","");
            int length = newPhoneNumber.length();
            if(length == 10|| length == 11){
                Random random = new Random();
                int someRandom = random.nextInt(999999);
                System.out.println("Generated passcode: " + someRandom);
            }else{
                System.out.println("Invalid phone number. Please make sure it is 10 or 11 digits");
            }
        }

        //    this is how Esen solved the problem:
        public static void login1(String phoneNumber){
            phoneNumber = phoneNumber.replace("-", "");
            phoneNumber = phoneNumber.replace(" ", "");

            if (phoneNumber.length() == 10 || phoneNumber.length() == 11){
                Random random = new Random();
                int someRandom = random.nextInt(1000);
                System.out.println("Passcode:" + someRandom + " has been sent to your Phone number: " +phoneNumber);
            }else{
                System.out.println("Invalid phone number");
            }
        }

        //    method overloading
        public static void login(String userName,String password){
            userName.replaceAll(" ", "");
            password.replaceAll(" ", "");
            if(userName.isEmpty() || password.isEmpty()){
                System.out.println("invalid credentials");
            }else{
                System.out.println("Successfully logged in. Your username is " + userName + " and password " + password);
            }
        }

        public static void login(String gmail, boolean isGmail){
            if (isGmail = true){
                System.out.println("Redirecting to Gmail.com");
            }else{
                System.out.println("Please provide you phone number");
            }

        }

        public static void login(Face faceID){
            System.out.println("Successfully loggen in in with Face below:");
            faceID.displayFace();
        }
    }





