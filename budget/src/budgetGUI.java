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
    private JTextArea previewMonthTextArea;
    private JList recentMonthsList;

    //Components to enter data
    private JPanel dataEntryPanel;
    private JLabel programTitle;
    private JButton addMonthButton;
    private JTextField whichMonthTextField;
    private JComboBox<String> purchaseTypeComboBox;
    private JTextField purchaseAmountTextField;
    private JButton previewMonthButton;

    //Components to write to file
    private JButton saveToFileButton;
    private JButton addPurchaseAmountButton;
    private JLabel comboBoxStatusDescriptionLabel;

    budget_Manager manager;

    public static String typeHome = "Home related purchase";
    public static String typeGroc = "Groceries purchase";
    public static String typeFoodOut = "Food out";
    public static String typeTravel = "Travel purchase";
    public static String typePersonal = "Personal purchase";

    month newMonth = new month();

    //constructor:
    budgetGUI (budget_Manager manager) {

        this.manager = manager;

        //Populates comboBox with static types of purchase
        setComboBox();
        actionHandling();
        //setJList();

        setContentPane(mainPanel);

        pack();
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        previewMonthTextArea.setText("Generated preview here");
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

        //TODO:?? Set so that dataEntryPanel only displays when addMonth pushed
        //Use Custom Create?

        //Set newMonth's name using object setter
        addMonthButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (whichMonthTextField !=null) {
                    newMonth.setName(whichMonthTextField.getText());
                }
            }  });

        purchaseTypeComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (purchaseTypeComboBox.getSelectedItem() == typeHome)
                    comboBoxStatusDescriptionLabel.setText("Entering purchase data for home:");
            }
        });

        //Set newMonth's hashmap reading info from boxes, each time pushed
        addPurchaseAmountButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (purchaseTypeComboBox.getSelectedItem() == typeHome) {
                    comboBoxStatusDescriptionLabel.setText("Entering purchase data for home:");
            }
                setTotals();
            } });

        //Preview newMonth's data
        previewMonthButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //setContentPane(displayPanel);
                previewMonthTextArea.setText(newMonth.toString());
            } });

        saveToFileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Too easy?! monthStore.add(newMonth);
                month monthToSave = new month();
                String [] lines = previewMonthTextArea.getText().split("\\n");
                monthToSave = readMonth(lines);
                monthStore.add(monthToSave);
            }
        });

    }

    public month readMonth(String[] text) {
        String n= "";
        double ht = 0.0, gt = 0.0, ft = 0.0, pt = 0.0, tt = 0.0;
        for (String t : text) {
            if (t.contains("for:"))
                n = t.substring(t.indexOf(": "));
            if (t.contains("homeTotal"))
                ht = Double.parseDouble(t.substring(t.indexOf("= ")+1));
            if (t.contains("grocTotal"))
                gt = Double.parseDouble(t.substring(t.indexOf("= ")));
            if (t.contains("foodOutTotal"))
                ft = Double.parseDouble(t.substring(t.indexOf("= ")));
            if (t.contains("personalTotal"))
                pt = Double.parseDouble(t.substring(t.indexOf("= ")));
            if (t.contains("travelTotal"))
                tt = Double.parseDouble(t.substring(t.indexOf("= ")));
        }
        month temp = new month (n, ht, gt, ft, pt, tt);
        return temp;
    }

    public void setTotals() {
        //Set amount entered into correct total in catsAndTotals
        if (purchaseTypeComboBox.getSelectedItem() == typeHome) {
            newMonth.setHomeTotal(Double.parseDouble(purchaseAmountTextField.getText()));
            System.out.println(newMonth.getHomeTotal());
        }
        if (purchaseTypeComboBox.getSelectedItem() == typeFoodOut){
            newMonth.setFoodOutTotal(Double.parseDouble(purchaseAmountTextField.getText()));
        }
        if (purchaseTypeComboBox.getSelectedItem() == typeGroc){
            newMonth.setGrocTotal(Double.parseDouble(purchaseAmountTextField.getText()));
        }
        if (purchaseTypeComboBox.getSelectedItem() == typePersonal){
            newMonth.setPersonalTotal(Double.parseDouble(purchaseAmountTextField.getText()));
        }
        if (purchaseTypeComboBox.getSelectedItem() == typeTravel){
            newMonth.setTravelTotal(Double.parseDouble(purchaseAmountTextField.getText()));
        }

    }

    /*private void createUIComponents() {
        // TODO: place custom component creation code here
    }*/
}
