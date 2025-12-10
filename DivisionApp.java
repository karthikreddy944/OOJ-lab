import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DivisionApp extends JFrame {
    
    private JTextField num1Field, num2Field;
    private JButton divideButton;
    private JLabel resultLabel;

    public DivisionApp() {
        setTitle("Integer Division");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Num1 input field
        JLabel num1Label = new JLabel("Num1:");
        num1Field = new JTextField(10);
        
        // Num2 input field
        JLabel num2Label = new JLabel("Num2:");
        num2Field = new JTextField(10);
        
        // Divide button
        divideButton = new JButton("Divide");
        
        // Result label
        resultLabel = new JLabel("Result: ");
        
        // Add components to the frame
        add(num1Label);
        add(num1Field);
        add(num2Label);
        add(num2Field);
        add(divideButton);
        add(resultLabel);
        
        // Button click event
        divideButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(num1Field.getText());
                    int num2 = Integer.parseInt(num2Field.getText());
                    if (num2 == 0) {
                        throw new ArithmeticException("Cannot divide by zero.");
                    }
                    int result = num1 / num2;
                    resultLabel.setText("Result: " + result);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter valid integers.", "Error", JOptionPane.ERROR_MESSAGE);
                } catch (ArithmeticException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new DivisionApp().setVisible(true);
            }
        });
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
