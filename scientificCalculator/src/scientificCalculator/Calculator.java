package scientificCalculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	double first;
	double second;
	double result;
	String operation;
	String answer;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 378, 673);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SCIENTIFIC CALCULATOR");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel.setBounds(53, 10, 301, 26);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 13));
		textField.setBounds(10, 38, 348, 79);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("\u221A");
		btnNewButton.setEnabled(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.sqrt(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(10, 150, 62, 59);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("e^X");
		btnNewButton_1.setEnabled(false);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.exp(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_1.setBounds(82, 150, 62, 59);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Sin");
		btnNewButton_2.setEnabled(false);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.sin(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_2.setBounds(154, 150, 62, 59);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_4 = new JButton("1/X");
		btnNewButton_4.setEnabled(false);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=1/(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_4.setBounds(10, 219, 62, 59);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btncube = new JButton("X^3");
		btncube.setEnabled(false);
		btncube.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=(Double.parseDouble(textField.getText()));
				a=a*a*a;
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btncube.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btncube.setBounds(10, 360, 62, 59);
		frame.getContentPane().add(btncube);
		
		JButton btnsquare = new JButton("X^2");
		btnsquare.setEnabled(false);
		btnsquare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=(Double.parseDouble(textField.getText()));
				a=a*a;
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnsquare.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnsquare.setBounds(10, 429, 62, 59);
		frame.getContentPane().add(btnsquare);
		
		JButton btnfactorial = new JButton("n!");
		btnfactorial.setEnabled(false);
		btnfactorial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Double.parseDouble(textField.getText());
				double fact=1;
				while(a!=0)
				{
					fact=fact*a;
					a--;
				}
				textField.setText("");
				textField.setText(textField.getText());
			}
		});
		btnfactorial.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnfactorial.setBounds(10, 498, 62, 59);
		frame.getContentPane().add(btnfactorial);
		
		JButton btnplusorminus = new JButton("+/-");
		btnplusorminus.setEnabled(false);
		btnplusorminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Double.parseDouble(String.valueOf(textField.getText()));
				a=a*(-1);
				textField.setText(String.valueOf(a));
			}
		});
		btnplusorminus.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnplusorminus.setBounds(10, 567, 62, 59);
		frame.getContentPane().add(btnplusorminus);
		
		JButton btnNewButton_11 = new JButton("Log");
		btnNewButton_11.setEnabled(false);
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.log(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_11.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_11.setBounds(82, 219, 62, 59);
		frame.getContentPane().add(btnNewButton_11);
		
		JButton btnBackspace = new JButton("\uF0E7");
		btnBackspace.setEnabled(false);
		btnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace=null;
				
				if(textField.getText().length()>0)
				{
					StringBuilder str=new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backSpace=str.toString();
					textField.setText(backSpace);
				}
			}
		});
		btnBackspace.setFont(new Font("Wingdings", Font.PLAIN, 21));
		btnBackspace.setBounds(221, 288, 62, 59);
		frame.getContentPane().add(btnBackspace);
		
		JButton btn7 = new JButton("7");
		btn7.setEnabled(false);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn7.setBounds(82, 357, 62, 59);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setEnabled(false);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn8.setBounds(154, 357, 62, 59);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setEnabled(false);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn9.setBounds(226, 357, 62, 59);
		frame.getContentPane().add(btn9);
		
		JButton btn4 = new JButton("4");
		btn4.setEnabled(false);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn4.setBounds(82, 426, 62, 59);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setEnabled(false);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn5.setBounds(154, 426, 62, 59);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setEnabled(false);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn6.setBounds(226, 426, 62, 59);
		frame.getContentPane().add(btn6);
		
		JButton btn1 = new JButton("1");
		btn1.setEnabled(false);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn1.setBounds(82, 498, 62, 59);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setEnabled(false);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn2.setBounds(154, 498, 62, 59);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setEnabled(false);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn3.setBounds(226, 498, 62, 59);
		frame.getContentPane().add(btn3);
		
		JButton btn0 = new JButton("0");
		btn0.setEnabled(false);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn0.setBounds(82, 566, 134, 59);
		frame.getContentPane().add(btn0);
		
		JButton btnDot = new JButton(".");
		btnDot.setEnabled(false);
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnDot.setBounds(226, 566, 62, 59);
		frame.getContentPane().add(btnDot);
		
		JButton btnEqual = new JButton("=");
		btnEqual.setEnabled(false);
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				second=Double.parseDouble(textField.getText());
				if(operation=="+")
				{
					result=first+second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="+")
				{
					result=first+second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="-")
				{
					result=first-second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="*")
				{
					result=first*second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="/")
				{
					result=first/second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="%")
				{
					result=first%second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="X^Y")
				{
					double resultt=1;
					for(int i=0;i<second;i++)
					{
						resultt=first*resultt;
					}
					answer=String.format("%.2f", resultt);
					textField.setText(answer);
				}
			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnEqual.setBounds(298, 566, 62, 59);
		frame.getContentPane().add(btnEqual);
		
		JButton btnDiv = new JButton("/");
		btnDiv.setEnabled(false);
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation ="/";
			}
		});
		btnDiv.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnDiv.setBounds(296, 498, 62, 59);
		frame.getContentPane().add(btnDiv);
		
		JButton btnMul = new JButton("*");
		btnMul.setEnabled(false);
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation ="*";
			}
		});
		btnMul.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnMul.setBounds(296, 426, 62, 59);
		frame.getContentPane().add(btnMul);
		
		JButton btnSub = new JButton("-");
		btnSub.setEnabled(false);
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation ="-";
			}
		});
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnSub.setBounds(298, 357, 62, 59);
		frame.getContentPane().add(btnSub);
		
		JButton btnAdd = new JButton("+");
		btnAdd.setEnabled(false);
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation ="+";
			}
		});
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnAdd.setBounds(296, 288, 62, 59);
		frame.getContentPane().add(btnAdd);
		
		JButton btnclear = new JButton("C");
		btnclear.setEnabled(false);
		btnclear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnclear.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnclear.setBounds(149, 288, 62, 59);
		frame.getContentPane().add(btnclear);
		
		JButton btnpercent = new JButton("%");
		btnpercent.setEnabled(false);
		btnpercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation ="%";
			}
		});
		btnpercent.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnpercent.setBounds(82, 288, 62, 59);
		frame.getContentPane().add(btnpercent);
		
		JButton btnpower = new JButton("X^Y");
		btnpower.setEnabled(false);
		btnpower.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation ="X^Y";
			}
		});
		btnpower.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnpower.setBounds(10, 291, 62, 59);
		frame.getContentPane().add(btnpower);
		
		JButton btnNewButton_2_1 = new JButton("Cos");
		btnNewButton_2_1.setEnabled(false);
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.cos(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_2_1.setBounds(226, 150, 62, 59);
		frame.getContentPane().add(btnNewButton_2_1);
		
		JButton btnNewButton_2_2 = new JButton("Tan");
		btnNewButton_2_2.setEnabled(false);
		btnNewButton_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.tan(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_2_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_2_2.setBounds(296, 150, 62, 59);
		frame.getContentPane().add(btnNewButton_2_2);
		
		JButton btnNewButton_2_3 = new JButton("Sinh");
		btnNewButton_2_3.setEnabled(false);
		btnNewButton_2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.sinh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_2_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_2_3.setBounds(154, 219, 62, 59);
		frame.getContentPane().add(btnNewButton_2_3);
		
		JButton btnNewButton_2_4 = new JButton("Cosh");
		btnNewButton_2_4.setEnabled(false);
		btnNewButton_2_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.cosh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_2_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_2_4.setBounds(226, 219, 62, 59);
		frame.getContentPane().add(btnNewButton_2_4);
		
		JButton btnNewButton_2_5 = new JButton("Tanh");
		btnNewButton_2_5.setEnabled(false);
		btnNewButton_2_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.tanh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_2_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_2_5.setBounds(296, 219, 62, 59);
		frame.getContentPane().add(btnNewButton_2_5);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("ON");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn1.setEnabled(true);
				btn2.setEnabled(true);
				btn3.setEnabled(true);
				btn4.setEnabled(true);
				btn5.setEnabled(true);
				btn6.setEnabled(true);
				btn7.setEnabled(true);
				btn8.setEnabled(true);
				btn9.setEnabled(true);
				btnDot.setEnabled(true);
				btnAdd.setEnabled(true);
				btnEqual.setEnabled(true);
				btnBackspace.setEnabled(true);
				btnclear.setEnabled(true);
				btnclear.setEnabled(true);
				btncube.setEnabled(true);
				btnDiv.setEnabled(true);
				btnfactorial.setEnabled(true);
				btnMul.setEnabled(true);
				btnNewButton_1.setEnabled(true);
				btnNewButton_11.setEnabled(true);
				btnNewButton_2.setEnabled(true);
				btnNewButton_2_1.setEnabled(true);
				btnNewButton_2_2.setEnabled(true);
				btnNewButton_2_3.setEnabled(true);
				btnNewButton_2_4.setEnabled(true);
				btnNewButton_2_5.setEnabled(true);
				btnNewButton_4.setEnabled(true);
				btnpercent.setEnabled(true);
				btnplusorminus.setEnabled(true);
				btnpower.setEnabled(true);
				btnsquare.setEnabled(true);
				btnSub.setEnabled(true);
				btn0.setEnabled(true);
				btnNewButton.setEnabled(true);
				textField.setEnabled(true);
			}
		});
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(10, 123, 62, 21);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnOff = new JRadioButton("OFF");
		rdbtnOff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				btn1.setEnabled(false);
				btn2.setEnabled(false);
				btn3.setEnabled(false);
				btn4.setEnabled(false);
				btn5.setEnabled(false);
				btn6.setEnabled(false);
				btn7.setEnabled(false);
				btn8.setEnabled(false);
				btn9.setEnabled(false);
				btnDot.setEnabled(false);
				btnAdd.setEnabled(false);
				btnEqual.setEnabled(false);
				btnBackspace.setEnabled(false);
				btnclear.setEnabled(false);
				btnclear.setEnabled(false);
				btncube.setEnabled(false);
				btnDiv.setEnabled(false);
				btnfactorial.setEnabled(false);
				btnMul.setEnabled(false);
				btnNewButton_1.setEnabled(false);
				btnNewButton_11.setEnabled(false);
				btnNewButton_2.setEnabled(false);
				btnNewButton_2_1.setEnabled(false);
				btnNewButton_2_2.setEnabled(false);
				btnNewButton_2_3.setEnabled(false);
				btnNewButton_2_4.setEnabled(false);
				btnNewButton_2_5.setEnabled(false);
				btnNewButton_4.setEnabled(false);
				btnpercent.setEnabled(false);
				btnplusorminus.setEnabled(false);
				btnpower.setEnabled(false);
				btnsquare.setEnabled(false);
				btnSub.setEnabled(false);
				btn0.setEnabled(false);
				btnNewButton.setEnabled(false);
				textField.setEnabled(false);
			}
		});
		buttonGroup.add(rdbtnOff);
		rdbtnOff.setBounds(82, 123, 62, 21);
		frame.getContentPane().add(rdbtnOff);
	}
}
