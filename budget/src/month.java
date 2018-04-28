/**
 * Created by je4282oi on 4/11/2018.
 */
public class month {
    String name; //name of month Jan, Feb etc
    HashMap<String, double> catsAndTotals //homeTotal, groceriesTotal, foodOutTotal, travelTotal ...
    double totalSaved; //any wages earned above spending goes here

    //Constructor for basic month object
    public month (String name, HashMap<String, double> catsAndTotals, double totalSaved) {
        name = this.name;
        totalSaved = this.totalSaved;
        HashMap<String, double> temp = new HashMap<String, double> {"homeTotal" : 0.0, "groceriesTotal" : 0.0
                , "foodOutTotal" : 0.0, "travelTotal" : 0.0, "personalTotal" : 0.0}
        catsAndTotals = temp;
    }

    //Month Methods

    //GetTotals
    public double getHomeTotal () {
        //Returns value associated with given key:
        return catsAndTotals.get("homeTotal");
    }

    //etc

    //CalculateTotalMonth'sSpending
    public double getTotalSpent () {
        return getHomeTotal() + //etc
    }

    //GetPercentages
    public double getHomePercent() {
        return (getHomeTotal()/getTotalSpent() *100);
    }

    //etc

    //SetTotals
    public void setHomeTotal (double newTotal) {
        catsAndTotals.put("homeTotal", newTotal);
    }

    //etc

    //DisplayMethods
    //using GUI


}


