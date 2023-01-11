package classWork.oop.abstraction;

public class Tokyo extends Japan {
    public Tokyo(String countryName) {
        super(countryName);
    }

    public static void main(String[] args) {
        Country country = new Country("Japan") {
            @Override
            public void implementNewLaw(String law, String date) {

            }

            @Override
            public void exportProducts(String productName, String[] destinations) {

            }
        };


    }
}

