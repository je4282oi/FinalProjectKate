/**
 * Created by je4282oi on 4/11/2018.
 */
public class monthWithDetails extends month {
    private ArrayList<String> individualPurchases; //Holds descriptions and totals on individual purchases
    //Should this be a hashmap with prices and descriptiosn? But then the prices have to be unique.

    public monthWithDetails (ArrayList<String> individualPurchases, String name,
                             HashMap<String, double> catsAndTotals, double totalSaved) {
        //Parent class constructs these variables:
        super (name, catsAndTotals, totalSaved);
        //initialize spending arraylist:
        individualPurchases = this.individualPurchases;
    }

}
