package classWork.oop.abstraction;

public class USA extends Country {

    public USA(){
        super("USA");
    }
    public static void main(String[] args) {

    }


    @Override
    public void implementNewLaw(String law, String date) {
        System.out.println(country + " implemented the law of " + law + " on " + date);

    }

    //tag
    @Override
    public void exportProducts(String productName, String[] destinations) {

        for(String destination: destinations){
            if(!destination.equals("Mexico") && !destination.equals("Canada")){
                System.out.println("USA is exporting the " + productName + " by ocean to " + destination);
            }else{
                System.out.println("USA is exporting the " + productName + " by railroad to "+ destination);
            }
        }

    }
}
