import javax.swing.*;

/**
 * Created by je4282oi on 4/18/2018.
 */
public class budgetGUI extends JFrame{
    //Components to display
    private JPanel mainPanel;
    private JPanel displayPanel;
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

    //Components to write to file
    private JButton saveToFileButton;

    budget_Manager manager;

    //constructor:
    budgetGUI (budget_Manager manager) {

        this.manager = manager;

        //setComboBox();
        //actionHandling();
        //setJList();

        setContentPane(mainPanel);
        pack();
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
