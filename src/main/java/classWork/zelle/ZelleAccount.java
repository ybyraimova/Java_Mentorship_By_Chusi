package classWork.zelle;

public class ZelleAccount {
    String fullName;
    String phoneNumber;
    double balance;
    String address;
    String bankName;

    static long totalUsers;
    static  double totalMoney;

    public ZelleAccount(String fullName, String phoneNumber,String address,
                        String bankName){
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.bankName = bankName;
        this.address = address;
        totalUsers++; //will increment each user

    }
    public void displayInfo(){
        System.out.println("USER INFORMATION: ");
        System.out.println("Full name: " + fullName +
                            "\nPhone number: " + phoneNumber +
                            "\nAddress: " + address +
                            "\nBank name: " + bankName +
                            "\nTotal Balance: " + balance);
    }

    public void depositMoney(double deposit){
        this.balance += deposit; //the user's balance
        totalMoney += deposit;
        System.out.println("Your deposit is " + deposit
                + "\nYour balance after deposit is " + this.balance);
    }
    public void transfer(double transferAmount, String phoneNumberReciepent){
        if(this.balance >= transferAmount){
            System.out.println(transferAmount + " is successfully transferred to " +
                   phoneNumberReciepent);
            this.balance -= transferAmount;
        }else{
            System.out.println("Insufficient funds. Transfer failed");
        }
    }

    public static void customerService(){
        System.out.println("\nCall 888-777-2323 for customer service");
    }

    public static  void zelleInfo(){
        System.out.println("Total users on Zelle: " + totalUsers);
        System.out.println("Total money on Zelle: " + totalMoney + "$");
    }

    //Zelle software:
    public static void main(String[] args) {
        ZelleAccount user1 = new ZelleAccount("Kim Kardashian", "941654578",
                "2901 12th St W", "Bank of America");

        user1.displayInfo();
        user1.depositMoney(500);
        user1.transfer(200, "94256797126");
        user1.transfer(300, "9415459096");
        user1.transfer(200, "976543456");
        user1.depositMoney(1000000);

        ZelleAccount.zelleInfo();
        ZelleAccount.customerService();







    }

}
