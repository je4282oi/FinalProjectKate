import java.util.HashMap;

/**
 * Created by je4282oi on 4/11/2018.
 */
public class month {
    private String name; //name of month Jan, Feb etc
    private HashMap<String, Double> catsAndTotals; //homeTotal, groceriesTotal, foodOutTotal, travelTotal ...
    private double totalSaved; //any wages earned above spending goes here

    //Constructor for basic month object with data given
    month (String name, HashMap<String, Double> catsAndTotals, Double totalSaved) {
        name = this.name;
        totalSaved = this.totalSaved;
        /*HashMap<String, Double> temp = new HashMap<>(); */
        catsAndTotals = this.catsAndTotals;
    }

    //Constructor for blank month object
    month () {
        this.name ="";
        this.catsAndTotals = new HashMap<>();
        catsAndTotals.put("homeTotal", 0.0);
        catsAndTotals.put("groceriesTotal", 0.0);
        catsAndTotals.put("foodOutTotal", 0.0);
        catsAndTotals.put("travelTotal", 0.0);
        catsAndTotals.put("personalTotal", 0.0);
        this.totalSaved = 0.0;
    }

    //Month Methods

    //SetMonth
    public void setName(String name) {
        this.name = name;
    }

    public void setCatsAndTotals(HashMap<String, Double> catsAndTotals) {
        this.catsAndTotals = catsAndTotals;
    }

    public void setTotalSaved(double totalSaved) {
        this.totalSaved = totalSaved;
    }

    //GetMonth

    public String getName() {
        return name;
    }

    public HashMap<String, Double> getCatsAndTotals() {
        return catsAndTotals;
    }

    public double getTotalSaved() {
        return totalSaved;
    }

    //GetTotals

    public double getHomeTotal () {
        //Returns value associated with given key:
        return catsAndTotals.get("homeTotal");
    }

    public double getGrocTotal () {
        //Returns value associated with given key:
        return catsAndTotals.get("grocTotal");
    }

    public double getFoodOutTotal () {
        //Returns value associated with given key:
        return catsAndTotals.get("foodOutTotal");
    }

    public double getPersonalTotal () {
        //Returns value associated with given key:
        return catsAndTotals.get("personalTotal");
    }

    public double getTravelTotal () {
        //Returns value associated with given key:
        return catsAndTotals.get("travelTotal");
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


    @Override
    public String toString() {
        return "month{" +
                "name='" + name + '\'' +
                ", homeTotal: " + getHomeTotal() + '\'' +
                ", groceriesTotal: " + getGrocTotal() + '\''+
                ", foodOutTotal: " + getFoodOutTotal() + '\'' +
                ", travelTotal: " + getTravelTotal() + '\'' +
                ", personalTotal: " + getPersonalTotal() + '\'' +
                ", totalSaved=" + totalSaved +
                '}';
    }
}


