package algo_Calc;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame window = new Frame();
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
	public Frame() {
		initialize();
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Sortingss obj = new Sortingss();
		frame = new JFrame();
		frame.setBounds(100, 100, 456, 324);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Bubble Sort");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				obj.vis(1,"BUBBLE SORT");
				frame.setVisible(false);	
			}
		});
		btnNewButton.setBounds(43, 48, 128, 25);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Insertion Sort");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				obj.vis(4,"INSERTION SORT");
				frame.setVisible(false);
			}
		});
		btnNewButton_1.setBounds(253, 48, 128, 25);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Selection Sort");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				obj.vis(2,"SELECTION SORT");
				frame.setVisible(false);
			}
		});
		btnNewButton_2.setBounds(43, 116, 128, 25);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Merge Sort");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				obj.vis(5,"MERGE SORT");
				frame.setVisible(false);
			}
		});
		btnNewButton_3.setBounds(253, 116, 128, 25);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Quick Sort");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				obj.vis(3,"QUICK SORT");
				frame.setVisible(false);
			}
		});
		btnNewButton_4.setBounds(43, 178, 128, 25);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Max Heap Sort");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				obj.vis(6,"HEAP SORT");
				frame.setVisible(false);
			}
		});
		btnNewButton_5.setBounds(253, 178, 128, 25);
		frame.getContentPane().add(btnNewButton_5);
	}
}
