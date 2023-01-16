package classWork.oop.encapsulation;

public class Programmer {

    private String name;
    private int age;
    private String [] programmingLanguages;
    private boolean isEmployed;
    private int yearsOfExperience;

    // getter
    public String getName(){
        return name;
    }
    //setter
    public void setName(String name){
//        String reverse = "";
//        for(int i = name.length()-1; i>= 0; i--){
//        }
//        reverse = reverse.substring(0,1).toUpperCase() + reverse.substring(1);
        this.name = name;

    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if(age >= 21){
            this.age = age;
        }else{
            System.out.println("21 and older only");
        }
    }
    public String [] getProgrammingLanguages (){
      return programmingLanguages;
    }
    public void setProgrammingLanguages(String [] programmingLanguages){
        boolean hasJava = false;
        for(int i = 0; i < programmingLanguages.length; i++){
            if(programmingLanguages[i].equalsIgnoreCase("java")){
                this.programmingLanguages = programmingLanguages;
                hasJava = true;
                break;
            }else{
                hasJava = false;
            }
        }
        if(hasJava){
            System.out.println("You should know java to join");
        }

    }

    public boolean getIEmployed(){
        return isEmployed;
    }
    public void setEmployed(boolean isEmployed){
        this.isEmployed = isEmployed;
    }

    public int getYearsOfExperience(){
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience){
        this.yearsOfExperience = yearsOfExperience;
    }

}
