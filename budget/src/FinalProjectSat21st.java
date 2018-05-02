//import static input.InputUtils.*;

public class FinalProjectSat21st {

    public void main(String[] args) {

        budget_Manager manager = new budget_Manager();
        monthStore MonthStore = new monthStore();

        manager.manageCalls();
        FinalProjectSat21st.start();
    }
    void start() {
        createMonthList();
    }

    protected void createMonthList() {
        MonthStore = new monthStore();
    }

}

