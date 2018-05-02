import sun.awt.image.ImageWatched;

import java.util.LinkedList;

/**
 * Created by je4282oi on 5/2/2018.
 */
public class monthStore {
    private static LinkedList<month> monthList;

    monthStore () {
        monthList = new LinkedList<>();
    }
    public static void add (month newMonth) {
        monthList.add(newMonth);
    }

    public static LinkedList<month> getAllMonths() {
        return monthList;
    }

    public month getMonthbyName (String name) {
        for (month m : monthList){
            if (m.getName() == name) {
                return m;
            }
        }
        //If no ticket found matching that name
        return null;
    }
}


