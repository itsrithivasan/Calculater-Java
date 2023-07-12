import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener{
	
	JLabel displayLabel;
	JButton sevenButton;
	JButton eightButton;
	JButton nineButton;
	JButton fourButton;
	JButton fiveButton;
	JButton sixButton;
	JButton oneButton;
	JButton twoButton;
	JButton threeButton;
	JButton dotButton;
	JButton zeroButton;
	JButton equaltoButton;
	JButton divButton;
	JButton multiButton;
	JButton subButton;
	JButton addButton;
	JButton clearButton;
	
	boolean isOperatorClicked = false;
	boolean isAddOperatorClicked = false;
	boolean isSubOperatorClicked = false;
	boolean isMultiOperatorClicked = false;
	boolean isDivOperatorClicked = false;
	
	String oldValue;
	String newValue;
	float oldValueF;
	float newValueF;
	float result;
	
	public Calculator() {
		JFrame jf = new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(600, 600);
		jf.setLocation(700, 225);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		displayLabel = new JLabel();
		displayLabel.setBounds(30, 50, 540, 40);
		displayLabel.setBackground(Color.gray);
		displayLabel.setOpaque(true);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displayLabel.setForeground(Color.white);
		
		jf.add(displayLabel);
		
		sevenButton = new JButton("7");
		sevenButton.setBounds(30, 130, 80, 80);
		sevenButton.addActionListener(this);
		jf.add(sevenButton);
		
		eightButton = new JButton("8");
		eightButton.setBounds(130, 130, 80, 80);
		eightButton.addActionListener(this);
		jf.add(eightButton);
		
		nineButton = new JButton("9");
		nineButton.setBounds(230, 130, 80, 80);
		nineButton.addActionListener(this);
		jf.add(nineButton);
		
		fourButton = new JButton("4");
		fourButton.setBounds(30, 230, 80, 80);
		fourButton.addActionListener(this);
		jf.add(fourButton);
		
		fiveButton = new JButton("5");
		fiveButton.setBounds(130, 230, 80, 80);
		fiveButton.addActionListener(this);
		jf.add(fiveButton);
		
		sixButton = new JButton("6");
		sixButton.setBounds(230, 230, 80, 80);
		sixButton.addActionListener(this);
		jf.add(sixButton);
		
		oneButton = new JButton("1");
		oneButton.setBounds(30, 330, 80, 80);
		oneButton.addActionListener(this);
		jf.add(oneButton);
		
		twoButton = new JButton("2");
		twoButton.setBounds(130, 330, 80, 80);
		twoButton.addActionListener(this);
		jf.add(twoButton);
		
		threeButton = new JButton("3");
		threeButton.setBounds(230, 330, 80, 80);
		threeButton.addActionListener(this);
		jf.add(threeButton);
		
		dotButton = new JButton(".");
		dotButton.setBounds(30, 430, 80, 80);
		dotButton.addActionListener(this);
		jf.add(dotButton);
		
		zeroButton = new JButton("0");
		zeroButton.setBounds(130, 430, 80, 80);
		zeroButton.addActionListener(this);
		jf.add(zeroButton);
		
		equaltoButton = new JButton("=");
		equaltoButton.setBounds(230, 430, 80, 80);
		equaltoButton.addActionListener(this);
		jf.add(equaltoButton);
		
		divButton = new JButton("/");
		divButton.setBounds(330, 130, 80, 80);
		divButton.addActionListener(this);
		jf.add(divButton);
		
		multiButton = new JButton("X");
		multiButton.setBounds(330, 230, 80, 80);
		multiButton.addActionListener(this);
		jf.add(multiButton);
		
		subButton = new JButton("-");
		subButton.setBounds(330, 330, 80, 80);
		subButton.addActionListener(this);
		jf.add(subButton);
		
		addButton = new JButton("+");
		addButton.setBounds(330, 430, 80, 80);
		addButton.addActionListener(this);
		jf.add(addButton);
		
		clearButton = new JButton("Clear");
		clearButton.setBounds(430, 430, 80, 80);
		clearButton.addActionListener(this);
		jf.add(clearButton);
	}

	
	public static void main(String[] args) {
		new Calculator();
	}


	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == sevenButton) {
			if(isOperatorClicked) {
				displayLabel.setText("7");
				isOperatorClicked = false;
			}else{
			displayLabel.setText(displayLabel.getText() + "7");
			}
		}
		else if (e.getSource() == eightButton) {
			if(isOperatorClicked) {
				displayLabel.setText("8");
				isOperatorClicked = false;
			}else{
			displayLabel.setText(displayLabel.getText() + "8");
			}
		}
		else if (e.getSource() == nineButton) {
			if(isOperatorClicked) {
				displayLabel.setText("9");
				isOperatorClicked = false;
			}else{
			displayLabel.setText(displayLabel.getText() + "9");
			}
		}
		else if (e.getSource() == fourButton) {
			if(isOperatorClicked) {
				displayLabel.setText("4");
				isOperatorClicked = false;
			}else{
			displayLabel.setText(displayLabel.getText() + "4");
			}
		}
		else if (e.getSource() == fiveButton) {
			if(isOperatorClicked) {
				displayLabel.setText("5");
				isOperatorClicked = false;
			}else{
			displayLabel.setText(displayLabel.getText() + "5");
			}
		}
		else if (e.getSource() == sixButton) {
			if(isOperatorClicked) {
				displayLabel.setText("6");
				isOperatorClicked = false;
			}else{
			displayLabel.setText(displayLabel.getText() + "6");
			}
		}
		else if (e.getSource() == oneButton) {
			if(isOperatorClicked) {
				displayLabel.setText("1");
				isOperatorClicked = false;
			}else{
			displayLabel.setText(displayLabel.getText() + "1");
			}
		}
		else if (e.getSource() == twoButton) {
			if(isOperatorClicked) {
				displayLabel.setText("2");
				isOperatorClicked = false;
			}else{
			displayLabel.setText(displayLabel.getText() + "2");
			}
		}
		else if (e.getSource() == threeButton) {
			if(isOperatorClicked) {
				displayLabel.setText("3");
				isOperatorClicked = false;
			}else{
			displayLabel.setText(displayLabel.getText() + "3");
			}
		}
		else if (e.getSource() == dotButton) {
			displayLabel.setText(displayLabel.getText() + ".");
		}
		else if (e.getSource() == zeroButton) {
			if(isOperatorClicked) {
				displayLabel.setText("0");
				isOperatorClicked = false;
			}else{
			displayLabel.setText(displayLabel.getText() + "0");
			}
		}
		
		
		
		else if (e.getSource() == equaltoButton) {
			newValue = displayLabel.getText();
			newValueF = Float.parseFloat(newValue);
			
			if(isAddOperatorClicked) {
				result = oldValueF + newValueF;
				isAddOperatorClicked = false;
			}
			else if(isSubOperatorClicked) {
				result = oldValueF - newValueF;
				isSubOperatorClicked = false;
			}
			else if(isMultiOperatorClicked) {
				result = oldValueF * newValueF;
				isMultiOperatorClicked = false;
			}
			else if(isDivOperatorClicked) {
				result = oldValueF / newValueF;
				isDivOperatorClicked = false;
			}
			
			
				
			displayLabel.setText(result + " ");
		}
		
		
		else if (e.getSource() == divButton) {
			isOperatorClicked = true;
			isDivOperatorClicked = true;
			oldValue = displayLabel.getText();
			oldValueF = Float.parseFloat(oldValue);
			
			displayLabel.setText("/");
			
		}
		
		else if (e.getSource() == multiButton){
			isOperatorClicked = true;
			isMultiOperatorClicked = true;
			
			oldValue = displayLabel.getText();
			oldValueF = Float.parseFloat(oldValue);
			
			displayLabel.setText("X");
		}
		
		else if (e.getSource() == subButton) {
			isOperatorClicked = true;
			isSubOperatorClicked = true;
			
			oldValue = displayLabel.getText();
			oldValueF = Float.parseFloat(oldValue);
			
			displayLabel.setText("-");
		}
		
		else if (e.getSource() == addButton) {
			isOperatorClicked = true;
			isAddOperatorClicked = true;
			
			oldValue = displayLabel.getText();
			oldValueF = Float.parseFloat(oldValue);

			displayLabel.setText("+");
		}
		else{
			displayLabel.setText("");
		}
	}
}
