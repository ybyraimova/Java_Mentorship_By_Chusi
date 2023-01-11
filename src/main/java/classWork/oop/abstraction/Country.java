package classWork.oop.abstraction;

public abstract class Country {
    int population;
    boolean hasAccessToOcean;

    String country;

    String presidentName;
    String capital;
    String language;

    public Country(String countryName){

    }


    public abstract void implementNewLaw(String law, String date);



    //this is abstract method, doesn't have body. it gives only idea:
    public  abstract void exportProducts(String productName, String [] destinations);


    }

