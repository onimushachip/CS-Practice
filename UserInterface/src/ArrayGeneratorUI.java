import java.awt.BorderLayout;
import java.awt.DisplayMode;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;


public class ArrayGeneratorUI {
	private ArrayGenerator core = new ArrayGenerator();
	private JTextArea displayField;
	
	//Putting main window's code to the end
	public ArrayGeneratorUI() {
		
		//Display panel
		JPanel displayPanel = new JPanel();
		displayPanel.setLayout(new BorderLayout());
		JLabel displayLabel = new JLabel("Display Result:");
		displayPanel.add(displayLabel, BorderLayout.NORTH);
		displayField = new JTextArea(10, 5);
		displayField.setFont(displayField.getFont().deriveFont(20.0f));
		displayField.setText("Helloeeeeeeeeeeee");
		displayPanel.add(displayField, BorderLayout.CENTER);
//		displayPanel.add(displayLabel, BorderLayout.SOUTH);
		
		
		//Button panel
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(2, 2));
		JButton generateButton = new JButton("Generate");
		generateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				core.generateString();
				displayField.setText("Given:\n" + core.getResult());
				System.out.println("check");
			}
		});
		
		JButton clearButton = new JButton("Clear");
		clearButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayField.setText(null);
				
			}
		});
		
		JButton sortButton = new JButton("Sort");
		sortButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				core.sortArray();
				String currentArray = displayField.getText();
				displayField.setText(currentArray + "\nResult:\n" + core.getResult());
				System.out.println(core.getResult());
			}
		});
		
		JButton quickSortButton = new JButton("Quick Sort");
		
		
		buttonPanel.add(generateButton);
		buttonPanel.add(clearButton);
		buttonPanel.add(sortButton);
		buttonPanel.add(quickSortButton);
		
		//Main window container
		JFrame mainFrame = new JFrame();
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.pack();
		mainFrame.setVisible(true);
		mainFrame.setSize(600, 450);
//		mainFrame.setLayout(new BorderLayout());
		mainFrame.add(displayPanel, BorderLayout.NORTH);
		mainFrame.add(buttonPanel, BorderLayout.SOUTH);
		
	}
}
