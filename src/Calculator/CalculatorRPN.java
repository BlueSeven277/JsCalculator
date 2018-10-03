package Calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculatorRPN {

	private JFrame frame;
	private JTextField textField;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorRPN window = new CalculatorRPN();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CalculatorRPN() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 330, 334);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(6, 6, 318, 36);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btn7 = new JButton("7");
		btn7.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		btn7.setBounds(6, 54, 80, 50);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		btn8.setBounds(84, 54, 80, 50);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		btn9.setBounds(162, 54, 80, 50);
		frame.getContentPane().add(btn9);
		
		JButton btnPlus = new JButton("+");
		btnPlus.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		btnPlus.setBounds(240, 54, 80, 50);
		frame.getContentPane().add(btnPlus);
		
		//second row
		JButton btn4 = new JButton("4");
		btn4.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		btn4.setBounds(6, 106, 80, 50);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		btn5.setBounds(84, 106, 80, 50);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		btn6.setBounds(162, 106, 80, 50);
		frame.getContentPane().add(btn6);
		
		JButton btnMin = new JButton("-");
		btnMin.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		btnMin.setBounds(240, 106, 80, 50);
		frame.getContentPane().add(btnMin);
		
		//third row
		JButton btn1 = new JButton("1");
		btn1.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		btn1.setBounds(6, 158, 80, 50);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		btn2.setBounds(84, 158, 80, 50);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		btn3.setBounds(162, 158, 80, 50);
		frame.getContentPane().add(btn3);
		
		JButton btnMul = new JButton("*");
		btnMul.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		btnMul.setBounds(240, 158, 80, 50);
		frame.getContentPane().add(btnMul);
		
		//fourth
		JButton btn0 = new JButton("0");
		btn0.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		btn0.setBounds(6, 210, 80, 50);
		frame.getContentPane().add(btn0);
		
		JButton btnDot = new JButton(".");
		btnDot.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		btnDot.setBounds(84, 210, 80, 50);
		frame.getContentPane().add(btnDot);
		
		JButton btnC = new JButton("C");
		btnC.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		btnC.setBounds(162, 210, 80, 50);
		frame.getContentPane().add(btnC);

		JButton btnDev = new JButton("/");
		btnDev.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		btnDev.setBounds(240, 210, 80, 50);
		frame.getContentPane().add(btnDev);
		
		
		JButton btnEquals = new JButton("=");
		btnEquals.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		btnEquals.setBounds(85, 265, 150, 40);
		frame.getContentPane().add(btnEquals);
		
		JButton btnRPN = new JButton("RPN");
		btnRPN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRPN.setBounds(6, 265, 80, 40);
		frame.getContentPane().add(btnRPN);
		
		JButton btnDel = new JButton("DEL");
		btnDel.setBounds(233, 265, 90, 40);
		frame.getContentPane().add(btnDel);
	}
}
