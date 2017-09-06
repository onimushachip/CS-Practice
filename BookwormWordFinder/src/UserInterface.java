import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/*
 * Main GUI for the word finder
 * 
 */
public class UserInterface {
	private WordFinder core = new WordFinder();
	
	
	public UserInterface() {
		//Display panel
		JPanel displayPanel = new JPanel();
		JLabel displayLabel = new JLabel("Result");
		JTextArea displayField = new JTextArea(10, 30);
		
		displayPanel.add(displayLabel, BorderLayout.NORTH);
		displayPanel.add(displayField, BorderLayout.SOUTH);
		
		//Input panel
		JPanel inputPanel = new JPanel();
		JLabel inputLabel = new JLabel("Input Letters");
		final JTextArea inputField = new JTextArea(1, 30);
		
		inputPanel.add(inputLabel, BorderLayout.NORTH);
		inputPanel.add(inputField, BorderLayout.SOUTH);
		
		//Button panel
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(1,2));
		
		JButton findButton = new JButton("Find Words");
		findButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String inputLetters = inputField.getText();
//				System.out.println(inputField.getText());
				core.getInput(inputLetters);
				core.findWords();
				System.out.println("Done");
				core.printResult();
			}
		});
		
		JButton clearButton = new JButton("Clear");
		
		buttonPanel.add(findButton);
		buttonPanel.add(clearButton);
		
		//Main window container
		JFrame mainFrame = new JFrame();
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.pack();
		mainFrame.setVisible(true);
		mainFrame.setSize(600, 300);
		mainFrame.add(buttonPanel, BorderLayout.SOUTH);
		mainFrame.add(displayPanel, BorderLayout.CENTER);
		mainFrame.add(inputPanel, BorderLayout.NORTH);
	}
}
