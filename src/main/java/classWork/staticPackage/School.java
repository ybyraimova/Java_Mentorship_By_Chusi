package classWork.staticPackage;

public class School {
    public static void main(String[] args) {
//        object is an instance of a class. in our case teacher1 and 2 are objects
//        that is instances of a class Teacher.
        Teacher teacher1 = new Teacher();
        Teacher teacher2 = new Teacher();

        teacher1.name = "Nicola Tesla";
        teacher1.hasDegree = true;
        teacher1.age = 45;
        teacher1.salary = 4900;
        teacher1.workplace = "Codewise";

        teacher2.name = "Albert Einstein";
        teacher2.hasDegree = false;
//        teacher2.age = 56;
//        teacher2.salary = 4500;

        System.out.println(teacher1.name); //Nicola Tesla
        System.out.println(teacher1.age); //45
        System.out.println(teacher2.age); //0
        System.out.println(teacher1.workplace); //codewise
        System.out.println(teacher2.workplace); //codewise

        teacher2.workplace = "Harvard";

        System.out.println(teacher1.workplace); //harvard

//        you can change and instantiate static variables using teacher.
        Teacher.workplace = "Yale University";
        Teacher.city = "Washington";
        Teacher.year = 2022;

        Teacher teacher3 = new Teacher();
        Teacher teacher4 = new Teacher();

        System.out.println(teacher1.workplace);
        System.out.println(teacher3.workplace);
        System.out.println(teacher4.city);
        System.out.println(teacher2.year);











    }

}
