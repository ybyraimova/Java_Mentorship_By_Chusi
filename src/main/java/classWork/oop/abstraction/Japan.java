package classWork.oop.abstraction;

public class Japan extends Country {
    public Japan(String countryName) {
        super(countryName);
    }

    public void exportProducts(String productName, String [] destinations){
        for(int i = 0; i < destinations.length; i++){
            System.out.println("Japan is exporting the " + productName + " to " + destinations[i] + " by sea.");

            if(destinations[i].equals("South Korea")){
                System.out.println("Japan is exporting the " + productName + " to South Korea by ferry");
            }
        }
    }

    public void implementNewLaw(String law, String date) {
        System.out.println(country + " implemented the law of " + law + " on " + date);

    }
}
