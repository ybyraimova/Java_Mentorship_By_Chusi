package Package.PackageTwo.ClassZ;

import Package.PackageOne.ClassY;

public class ClassZ {
//    create 2 private variables, 1 private method
//    create 2 default variables, 1 default method
//    create 2 protected variables, 1 protected method
//    create 2 public variables, 1 public method
//    call variables/methods of ClassY and ClassX
//if it's not possible to call the vaaiable/method,
//    comment the line out and explain why you can't call it in comments

    private int zebra;
    private byte zet;
    private  void setZebra(){
        this.zebra = zebra;

    }
    String ZooName;
    String ZooLocation;
    void printLocation(String ZooName, String ZooLocation){
        this.ZooLocation = ZooLocation;
        this.ZooName = ZooName;
    }
    protected long ZooPhoneNumber;
    protected long ZooFaxNumber;
    protected  void printInfo( long ZooPhoneNumber,  long ZooFaxNumber){
        this.ZooPhoneNumber = ZooPhoneNumber;
        this.ZooFaxNumber = ZooFaxNumber;
    }
    public int zombie;
    public int virus;
    public int count(int zombie, int virus ){
        this.zombie = zombie;
        this.virus = virus;
        return zombie*virus;
    }

    public static void main(String[] args) {
        ClassY y = new ClassY();
//        y.members;
//        y.numbers;
//        y.getMembers; those are private and cannot be accessed without setters and getters;

//        y.name;
//        y.surname;
//        y.printFullName; those are methods and variables that belong to another package PackageOne;

//        y.TransactionNumber;
//        y.AccountNumber;
//        y.printInfor;  those are protected and cannot be used otuside the class because they do not have a parent child
//        relationship;

        y.quantity = 45;
        y.times = 2;
        y.count(y.quantity, y.times);




    }
}
