package classWork.oop.encapsulation;

public class ProgrammersClub {
    public static void main(String[] args) {
        Programmer programmer1 = new Programmer();
        programmer1.setName("Hermione");
        programmer1.setAge(24);
        programmer1.setProgrammingLanguages(new String[] {"java", "python", "c++"});
        programmer1.setEmployed(false);
        programmer1.setYearsOfExperience(1);

        System.out.println(programmer1.getName());

        UserAccount user = new UserAccount();
        user.setUserName("Buojh=");
        user.setUserName("Buojh");
        user.setPassword("MNqwmner1+_");
        user.setPassword("kjhghkjhjkjk");

    }

}
