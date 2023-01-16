package Package.PackageOne;

public class ClassX {

//    create 2 private variables, 1 private method
//    create 2 default variables, 1 default method
//    create 2 protected variables, 1 protected method
//    create 2 public variables, 1 public method

    private String name;
    private int age;
    private void setAge(){

    }
    int days;
    String surname;
    String getName(String name){
        return name;
    }

    protected boolean isRed;
    protected long IDnumber;
    protected void call(){

    }
    public char aChar;
    public boolean isBlack;
    public void printName(String name){

    }

    public static void main(String[] args) {
        //    call variables/methods of ClassY and ClassZ
//if it's not possible to call the vaaiable/method,
//    comment the line out and explain why you can't call it in comments
        ClassY objectY = new ClassY();
//        objectY.members = 2; no access because it is private;
//        objectY.number; no access because it is private;
//        objectY.getMembers(); no access because it is private;

        objectY.name = "Kim";
        objectY.surname = "Kardashian";
        objectY.printFullName("Kim", "Kardashian");
        objectY.TransactionNumber = 1234322321;
        objectY.AccountNumber = 212321;
        objectY.printInfo(objectY.TransactionNumber, objectY.AccountNumber);
        objectY.quantity = 5;
        objectY.times = 2;
        objectY.count(5,2);



//        ClassZ object2 = new ClassZ(); I cannot create an object from Class Z because default modifier gives access only within the package;

//        object1. I cannot call the variables or methods of Class X because they belong to class X but not Y.


    }
}

package Package.PackageOne;

public class ClassY {
//    create 2 private variables, 1 private method
//    create 2 default variables, 1 default method
//    create 2 protected variables, 1 protected method
//    create 2 public variables, 1 public method

    private int members;
    private byte number;
    private  void getMembers(int members){
        this.members = members;

    }
    String name;
    String surname;
    void printFullName(String name, String surname){
        this.name = name;
        this.surname = surname;
    }
    protected long TransactionNumber;
    protected long AccountNumber;
    protected  void printInfo( long TransactionNumber,  long AccountNumber){
        this.TransactionNumber = TransactionNumber;
        this.AccountNumber = AccountNumber;
    }
    public int quantity;
    public int times;
    public int count(int quantity, int times ){
        this.quantity = quantity;
        this.times = times;
        return quantity*times;
    }

    public static void main(String[] args) {
        //    call variables/methods of ClassX and ClassZ
//if it's not possible to call the vaaiable/method,
//    comment the line out and explain why you can't call it in comments

        ClassX object1X = new ClassX();

//        ClassZ object1 = new  ClassZ();  Cannot create an object from a class that belongs to another package;


//        object1X.name  i cannot access because it is private;
//        object1X.age  i cannot access because it is private;
//        object1X.setName()  i cannot access because it is private;

        object1X.aChar = 'c';
        object1X.days = 2;
        object1X.surname = "Gump";
        object1X.IDnumber = 12345654;
        object1X.isRed = false;
        object1X.isBlack = true;
        object1X.call();
        object1X.getName("Forrest");
        object1X.printName("Gump");
        // I could access variables from classX because the object1ClassX was created from class X.


    }



}


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


