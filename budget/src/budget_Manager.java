import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by je4282oi on 4/11/2018.
 */
public class budget_Manager {

        /** Program to manage service calls to furnaces and AC units
         * All this does is launch the ServiceCallManager and start it managing calls */

        private final int ADD_PURCHASE = 1;
        private final int SHOW_ALL_PURCHASES = 2;
        private final int SHOW_CURRENT_BUDGET= 3;
        private final int CHANGE_CONTRIBUTIONS = 4;
        private final int CHANGE_COSTS = 5;
        private final int QUIT = 6;

               // Menu options, as an array
        private String[] mainMenuOptions = {
                ADD_PURCHASE + ". Add new past purchase to budget",
                SHOW_ALL_PURCHASES + ". Show all past purchases",
                SHOW_CURRENT_BUDGET + ". Print current budget",
                CHANGE_CONTRIBUTIONS + ". Change contributions",
                CHANGE_COSTS + ". Change monthly costs ",
                QUIT + ". Quit"};

        /* The main menu */
        void manageCalls() {

            boolean quit = false;
            Scanner user_input = new Scanner(System.in);

            while (!quit) {

                displayMenu("Main Menu", mainMenuOptions);

                int choice = Integer.parseInt(user_input.next());

                //int choice = intInput("Enter selection: ");

                switch (choice) {
                    case ADD_PURCHASE:
                        addPurchase();
                        break;
                    case SHOW_ALL_PURCHASES:
                        showAllPurchases();
                        break;
                    case SHOW_CURRENT_BUDGET:
                        showCurrentBudget();
                        break;
                    case CHANGE_CONTRIBUTIONS:
                        changeContributions();
                        break;
                    case CHANGE_COSTS:
                        changeCosts();
                        break;
                    case QUIT:
                        quit = true;  // Will stop the loop
                    default:
                        System.out.println("Enter a number from the menu choices");
                        break;
                }
            }

            System.out.println("Thanks, bye!");

        }

        private void changeCosts() {

        }

        private void changeContributions() {

        }

        private void showCurrentBudget() {

        }

        private void addPurchase() {
            Scanner user_input = new Scanner(System.in);
            System.out.println("Enter data for your new purchase!");
            System.out.println("Start by entering your type: home, groceries, fuel, eatingOut, " +
                    "school, other");
            String type = user_input.nextLine();
            if (type.equalsIgnoreCase("home")) {
                System.out.println("Enter name of month: ");
                String month = user_input.nextLine();
                System.out.println("Enter total purchases: ");
                double amount = Double.parseDouble(user_input.nextLine());
                //System.out.println("Enter category names and totals ");
                //HashMap<String, Double> extra = user_input.nextLine();
                HashMap<String, Double> extra = new HashMap<>();
                ArrayList<String> extraDetail = new ArrayList<>();
                System.out.println("Enter individual purchases for extra info:");
                {
                    String temp = user_input.nextLine();
                    extraDetail.add(temp);

                    while (temp != null);
                }
                //monthWithDetails newMonth = new monthWithDetails(extraDetail, month, extra, amount);
            }
        }

        private void showAllPurchases() {
            //Some how display them all!

        }

        /* Displays the contents of an array; the array should hold each menu option. */
        private void displayMenu(String menuName, String[] options) {

            System.out.println("\n" + menuName + "\n");

            for (String option : options) {
                System.out.println(option);
            }

        }

    }
