package classWork.hashmap;

import java.util.HashMap;

public class StockPrice {
    public static void main(String[] args) {
        HashMap <String, Double> stocks = new HashMap<>();

        stocks.put("apple", 400.90);
        stocks.put("tesla", 1200.32);
        stocks.put("meta", 30.43);
        stocks.put("bofa", 5.5);
        stocks.put("slack", 125.54);
        stocks.put("mcdonalds", 98.12);

        //return the highest stock


        findTheHighestPrice(stocks);
        findTheAveragePrice(stocks);
        removeStocks(stocks, 100);

    }

    /* this solution is from internet:
Map.Entry<Foo, Bar> maxEntry = null;

for (Map.Entry<Foo, Bar> entry : map.entrySet())
{
    if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0)
    {
        maxEntry = entry;
    }
}
     */

    public static double findTheHighestPrice(HashMap<String, Double> stocks){
       double maxValue= 0;
        for (String key: stocks.keySet()){
            if(stocks.get(key) > maxValue){
                maxValue = stocks.get(key);
            }
        }
        System.out.println("The highest stock: " + maxValue);
        return maxValue;
        }

    public static double findTheAveragePrice(HashMap<String, Double> stocks){
        double average = 0;
        double sum = 0;
        for(String everykey: stocks.keySet()){ //everykey will iterate on each key
            sum += stocks.get(everykey); // get everykey will iterate each value
        }
        average=  sum/stocks.size();
        System.out.println("The average is:  " + average);
        return average;
    }


//
    public static HashMap <String, Double> removeStocks(HashMap <String, Double> stocks, double minPrice){
        HashMap <String, Double> newStocks = new HashMap<>();


        for(String everykey : stocks.keySet()){
            if(stocks.get(everykey) >= minPrice){
                newStocks.put(everykey, stocks.get(everykey));
            }
        }
        System.out.println(newStocks);
        return newStocks;
    }

    }


