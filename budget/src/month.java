import java.util.HashMap;

/**
 * Created by je4282oi on 4/11/2018.
 */
public class month {
    String name; //name of month Jan, Feb etc
    HashMap<String, Double> catsAndTotals; //homeTotal, groceriesTotal, foodOutTotal, travelTotal ...
    double totalSaved; //any wages earned above spending goes here

    //Constructor for basic month object
    public month (String name, HashMap<String, Double> catsAndTotals, Double totalSaved) {
        name = this.name;
        totalSaved = this.totalSaved;
        HashMap<String, Double> temp = new HashMap<>();
        temp.put("homeTotal", 0.0);
        temp.put("groceriesTotal", 0.0);
        temp.put("foodOutTotal", 0.0);
        temp.put("travelTotal", 0.0);
        temp.put("personalTotal", 0.0);
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
        return getHomeTotal(); //+ //etc
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


