import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI {
	private JFrame mainWindow = new JFrame();
	private JPanel demoPanel = new JPanel();
	private JLabel testLabel = new JLabel("Test Label");
	private GridLayout grid = new GridLayout(4, 4);
	
	private CardGenerator core = new CardGenerator();
	
	public GUI () {
		mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainWindow.pack();
		mainWindow.setVisible(true);
		mainWindow.setSize(600, 600);
		mainWindow.setTitle("Test");
	}
	
	public void addButton (int buttonAmount) {
		for (int i = 0; i < buttonAmount; i++) {
			demoPanel.add(new JButton("testButton"));
		}
	}
	
	private void addButtonFunction (int buttonAmount) {
		Component[] componentArray = demoPanel.getComponents();
		
		core.start(16);
		
		for (int i = 0; i < buttonAmount; i++) {
			final int index = i;
			
			((JButton) componentArray[i]).addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					System.out.println("check card: " + core.getCard(index));
					core.flipCard(index);
				}
			});
		}
	}
	
	public void addPanel () {
//		JPanel demoPanel = new JPanel();
		demoPanel.setLayout(grid);
		
		mainWindow.add(testLabel, BorderLayout.NORTH);
		
		addButton(16);
		
		addButtonFunction(16);
		
		Component[] componentArray = demoPanel.getComponents();
		
		for (int i = 0; i < 16; i++) {
			((JButton) componentArray[i]).setText(Integer.toString(i));
		}
		
		System.out.println("Number of components in panel: " + demoPanel.getComponentCount());
		
		mainWindow.add(demoPanel, BorderLayout.CENTER);
		
		mainWindow.validate();
	}
	
	public void showContentInfo () {
		System.out.println("Number of components: " + mainWindow.getComponentCount());
		System.out.println(Arrays.toString(mainWindow.getComponents()));;
	}
	
	public void removeContent() {
		mainWindow.remove(0);
	}

}
