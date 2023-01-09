package classWork.hashmap;

import java.util.Hashtable;

public class HashTable {
    public static void main(String[] args) {

        Hashtable<String, Integer> productPrices = new Hashtable<>();
        productPrices.put("apple", 3);
        productPrices.put("carrot", 5);
        productPrices.put("pineapple", 13);
        productPrices.put("avocado", 7);
        productPrices.put("chicken", 30);
        productPrices.put("apple pie", 40);
        productPrices.put("peanut butter", 4);


        calculateTheSum(productPrices, 2);
        getProductsInRange(productPrices, 1, 4);
        getProductsInRange(productPrices, 3, 1);
        getProductsInRange(productPrices, -2, 1);
        getProductsInRangeWithAP(productPrices, 1, 3);


    }

    public static int calculateTheSum(Hashtable<String, Integer> products, int quantity) {
        int sum = 0;

        for (String key : products.keySet()) {
            sum += products.get(key) * quantity;
        }
        System.out.println("The products to buy: " + products);
        System.out.println("The quantity of each product: " + quantity);
        System.out.println("The total price for the list of products provided is " + sum);
        return sum;
    }

    //return hashtable of products in the given range inclusively:
    public static Hashtable<String, Integer> getProductsInRange(
            Hashtable<String, Integer> products, int beginRange, int endRange) {

        if (beginRange >= 0 && endRange <= 100) {
            if (beginRange < endRange) {
                Hashtable<String, Integer> newProducts = new Hashtable<>();

                for (String key : products.keySet()) {
                    if (products.get(key) >= beginRange && products.get(key) <= endRange) {
                        newProducts.put(key, products.get(key));
                    }
                }
                System.out.println("The list of products in a range of " + beginRange + " and " + endRange
                        + " is " + newProducts);
                return newProducts;
            } else {
                System.out.println("Sorry, incorrect range was given. Give the correct range");
            }
            return null;
        } else {
            System.out.println("Given range is not between 0 and 100. Give the correct range");
        }
        return null;
    }

    /*
    create a method that returns a hastable with products in the given range
    and include only those products that start with "a"
    hashtable can have products out of the given range starts with "p"
     */
    public static Hashtable<String, Integer> getProductsInRangeWithAP(
            Hashtable<String, Integer> products, int beginRange, int endRange) {

        if (beginRange >= 0 && endRange <= 100) {

            if (beginRange < endRange) {

                Hashtable<String, Integer> newProducts = new Hashtable<>();

                for (String key : products.keySet()) {
                    if (products.get(key) >= beginRange && products.get(key) <= endRange) {
                        if (products.get(key).toString().charAt(0) == 'a' &&
                                products.get(key).toString().charAt(0) == 'p') {
                            newProducts.put(key, products.get(key));
                        }
                    }
                }
                    System.out.println("The list of products in a range of " + beginRange + " and " + endRange
                            + " is " + newProducts);
                    return newProducts;
                }else{
                    System.out.println("Sorry, incorrect range was given. Give the correct range");
                }
                return null;
            } else {
                System.out.println("Given range is not between 0 and 100. Give the correct range");
            }
            return null;
        }



    public static Hashtable<String, Integer> getProductsInRangeWithAP2(
            Hashtable<String, Integer> products, int beginRange, int endRange) {
        Hashtable<String, Integer> result = new Hashtable<>();

        if(beginRange>0 && endRange<100 && beginRange<endRange){
            for(String key : products.keySet()){
                // a - > should be in range
                // p - > not obligatory to be in range
//                    System.out.println(key + " "+products.get(key));
//                    System.out.println((key.charAt(0)=='a' && products.get(key) >= beginRange &&
//                            products.get(key) <= endRange));
//                    System.out.println();

                if((key.charAt(0)=='a' && products.get(key) >= beginRange &&
                        products.get(key) <= endRange )
                        || key.charAt(0)=='p'){
                    result.put(key, products.get(key));
                }
            }
        }
        else{
            System.out.println("Sorry, incorrect range was given. Give the correct range");
        }
        return result;
    }
    }



