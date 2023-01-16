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
