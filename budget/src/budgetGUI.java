import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

/**
 * Created by je4282oi on 4/18/2018.
 */
public class budgetGUI extends JFrame{
    //Components to display
    private JPanel mainPanel;
    private JPanel displayPanel;
    private JPanel IndivDataPanel;
    private JTextArea previewMonthTextArea;
    private JList recentMonthsList;

    //Components to enter data
    private JPanel dataEntryPanel;
    private JLabel programTitle;
    private JButton addMonthbutton;
    private JTextField whichMonthTextField;
    private JComboBox<String> purchaseTypeComboBox;
    private JTextField purchaseAmountTextField;
    private JTextField individualPurchaseNames;
    private JButton previewMonthButton;
    private JTextField individualPurchaseAmounts;
    private JButton enterIndividDataButton;

    //Components to write to file
    private JButton saveToFileButton;

    budget_Manager manager;

    public static String typeHome = "Home related purchase";
    public static String typeGroc = "Groceries purchase";
    public static String typeFoodOut = "Food out";
    public static String typeTravel = "Travel purchase";
    public static String typePersonal = "Personal purchase";

    //constructor:
    budgetGUI (budget_Manager manager) {

        this.manager = manager;

        //Populates comboBox with static types of purchase
        setComboBox();
        //actionHandling();
        //setJList();

        setContentPane(mainPanel);
        pack();
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void setComboBox() {
        purchaseTypeComboBox.addItem("Choose Purchase Category:");
        purchaseTypeComboBox.addItem(typeHome);
        purchaseTypeComboBox.addItem(typeGroc);
        purchaseTypeComboBox.addItem(typeFoodOut);
        purchaseTypeComboBox.addItem(typeTravel);
        purchaseTypeComboBox.addItem(typePersonal);
    }

    public void actionHandling() {
        //TODO: Set so that dataEntryPanel only displays when addMonth pushed
        //Use Custom Create?
        addMonthbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setContentPane(dataEntryPanel);
                setVisible(true);
            }
        });

        whichMonthTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        purchaseAmountTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setTotals(); }  });
    }

    public HashMap<String, Double> setTotals() {
        //Set amount entered into correct total in catsAndTotals
        HashMap<String, Double> catsAndTotals = new HashMap<>();
        if (purchaseTypeComboBox.getSelectedItem() == typeHome) {
            Double purchaseAmount = Double.parseDouble(purchaseAmountTextField.getText());
            catsAndTotals.put("homeTotal", purchaseAmount);
        }
        if (purchaseTypeComboBox.getSelectedItem() == typeFoodOut){
            Double purchaseAmount = Double.parseDouble(purchaseAmountTextField.getText());
            catsAndTotals.put("foodOutTotal", purchaseAmount);
        }
        if (purchaseTypeComboBox.getSelectedItem() == typeGroc){
            Double purchaseAmount = Double.parseDouble(purchaseAmountTextField.getText());
            catsAndTotals.put("groceriesTotal", purchaseAmount);
        }
        if (purchaseTypeComboBox.getSelectedItem() == typePersonal){
            Double purchaseAmount = Double.parseDouble(purchaseAmountTextField.getText());
            catsAndTotals.put("personalTotal", purchaseAmount);
        }
        if (purchaseTypeComboBox.getSelectedItem() == typeTravel){
            Double purchaseAmount = Double.parseDouble(purchaseAmountTextField.getText());
            catsAndTotals.put("travelTotal", purchaseAmount);
        }
        return catsAndTotals;

    }

    /*private void createUIComponents() {
        // TODO: place custom component creation code here
    }*/
}
