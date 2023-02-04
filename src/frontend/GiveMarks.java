package frontend;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import backend.Database;

import java.awt.Window.Type;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.Cursor;

public class GiveMarks extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	Database db = new Database();
	private JLabel answer1;
	private JLabel answer2;
	private JLabel answer3;
	private JLabel answer4;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GiveMarks frame = new GiveMarks();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public JLabel getAnswer1() {
		return answer1;
	}
	
	

	public JLabel getAnswer2() {
		return answer2;
	}

	public JLabel getAnswer3() {
		return answer3;
	}

	public JLabel getAnswer4() {
		return answer4;
	}

	/**
	 * Create the frame.
	 */
	public GiveMarks() {
		setType(Type.UTILITY);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 763, 670);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 778, 656);
		contentPane.add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(142, 495, 144, 35);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Done");
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setBackground(new Color(45, 204, 112));
		btnNewButton.setFont(new Font("Century Gothic", Font.BOLD, 15));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBounds(76, 551, 599, 41);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Mark");
		lblNewLabel.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblNewLabel.setBounds(86, 491, 56, 35);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Question 1 Answer");
		lblNewLabel_1.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblNewLabel_1.setBounds(76, 33, 189, 26);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Question 2 Answer");
		lblNewLabel_1_1.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(76, 135, 189, 26);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Question 3 Answer");
		lblNewLabel_1_2.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblNewLabel_1_2.setBounds(76, 249, 189, 26);
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Question 4 Answer");
		lblNewLabel_1_3.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblNewLabel_1_3.setBounds(76, 369, 189, 26);
		panel.add(lblNewLabel_1_3);
		
		answer1 = new JLabel("");
		answer1.setFont(new Font("Century Gothic", Font.PLAIN, 10));
		answer1.setBounds(76, 69, 628, 26);
		panel.add(answer1);
		
		answer2 = new JLabel("");
		answer2.setFont(new Font("Century Gothic", Font.PLAIN, 10));
		answer2.setBounds(76, 183, 628, 26);
		panel.add(answer2);
		
		answer3 = new JLabel("");
		answer3.setFont(new Font("Century Gothic", Font.PLAIN, 10));
		answer3.setBounds(76, 296, 628, 26);
		panel.add(answer3);
		
		answer4 = new JLabel("");
		answer4.setFont(new Font("Century Gothic", Font.PLAIN, 10));
		answer4.setBounds(76, 418, 628, 26);
		panel.add(answer4);
	}
}
