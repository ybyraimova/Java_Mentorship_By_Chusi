package classWork.staticPackage;

public class Researcher {
    String fullName;
    String affiliation;
    public String university = "Dublin City University";
    String date;
    public int salary;
    public Researcher(String fullName, String affiliation){
        this.fullName = fullName;
        this.affiliation = affiliation;
    }
    public  void works(){
        System.out.println(fullName + ", " + affiliation + ",  works at " + university);
    }
    public void writeArticle(String date){
        System.out.println(fullName + " has been writing an article since "+ date);
    }

    public static void receiveSalary(int salary){
        System.out.println();
        salary = salary;
        System.out.println("The average salary received at DCU is "+ salary);


    }


}

class Website{
    public static void main(String[] args) {
        Researcher user1 = new Researcher("Ilona Baumane", "PhD");
        Researcher user2 = new Researcher("Abel Polese", "PhD");

        user1.works();
        user2.writeArticle("January 2021");
        user1.receiveSalary(5000);


    }



}
