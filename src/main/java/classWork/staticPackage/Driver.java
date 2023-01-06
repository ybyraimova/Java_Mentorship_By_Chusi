package classWork.staticPackage;
public class Driver {
    String name;
    static boolean isPaid;
    String destination;
    public Driver(String name) {
        this.name = name;
        System.out.println("Hired a new driver " + name + "."); //it will be executed after block of code
                                                                // the last turn
    }


    {
        System.out.println("HR is interviewing a new driver."); //this will be executed before the constructor as many
                                                                //many times as objects were created.
    }

    static {
        System.out.println("Good morning! Trucking company is open now!"); //this will be executed first and only once
    }

    public void drive(String destination){
        System.out.println(name + " is on route " + destination);

    }

    public static boolean getPaid(){
        System.out.println("Drivers got paid");
        isPaid = true;
        return true;
    }
//    you can create a static class inside class:

      static  class NestedDriver{

    }
}

class TruckCompany{
    public static void main(String[] args) {
        Driver driver1 = new Driver("Barack Obama"); //inside it's an argument that has to be provided
        Driver driver2 = new Driver("Barbie Girl"); //inside it's an argument that has to be provided

        driver1.drive("Minnesota");
        driver2.drive("Pennsylvania");

        System.out.println(driver2.isPaid); //false default value

        Driver.getPaid(); //assigning true;

        System.out.println(driver1.isPaid); //true
        System.out.println(driver2.isPaid); //true



    }

}
