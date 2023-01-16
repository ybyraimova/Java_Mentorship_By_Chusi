package classWork.oop.encapsulation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserAccount {
    private String userName;
    private String password;
    private boolean isPrivateAccount;

    /*
    IDE - integrated development environment
    Intellij
     */

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        String regex = "[!@#$%^&*()+=:;<>,/?]";
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(userName);
        //returns true of username has regex:
//        matcher.find();

        if(matcher.find()){
            System.out.println("Spec chars are not allowed. Only -_@");
        }else{
            this.userName =userName;
        }



//
//       if(userName.length() <=40){
//           if(!userName.contains(regex)){
//               this.userName = userName;
//           }else{
//               System.out.println("Spec chars are not allowed. Only -_@");
//
//           }
//       }else{
//           System.out.println("Username must be less than 40 chars");
//       }
//
//
//    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        String upper = "[QWERTYUIOPASDFGHJKLZXCVBNM]";
        String lower = "[qwertyuiopasdfghjklzxcvbnm]";
        String specChars = "[!@#$%^&*()+=:;<>,/?]";





        if(password.length() >=8){
            if(password.contains(upper)&& password.contains(lower)){
                if(password.contains(specChars)){
                    this.password= password;
                }else{
                    System.out.println("Your password must have at least one special char");
                }
            }else{
                System.out.println("Your password must have min one upper and one lower case");
            }

        }else{
            System.out.println("You password must be min 8 chars");
        }
    }

    public boolean isPrivateAccount() {
        return isPrivateAccount;
    }

    public void setPrivateAccount(boolean privateAccount) {
        isPrivateAccount = privateAccount;
    }

//
//        public void setUsername(String username) {
//
//            String regex = "[!#$%^&*()+={}|:;,?><~]";
//            Pattern pattern = Pattern.compile(regex);
//            Matcher mather = pattern.matcher(username);
//
//            if (username.length() <= 40 && !mather.find()) {
//                System.out.println("Good username! " + username);
//                this.username = username;
//            } else {
//                System.out.println("ERROR! Make sure username is less than 40 and does not contain any special character except for _ - . @");
//            }
//        }

}
