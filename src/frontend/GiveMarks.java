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
	private JTextField markTextField;
	Database db = new Database();
	private JLabel answer1;
	private JLabel answer2;
	private JLabel answer3;
	private JLabel answer4;
	private JButton doneButton;
	private JLabel quenstion1Answer;
	private JLabel quenstion2Answer;
	private JLabel quenstion3Answer;
	private JLabel quenstion4Answer;
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

	
	
	
	public JLabel getQuenstion1Answer() {
		return quenstion1Answer;
	}




	public JLabel getQuenstion2Answer() {
		return quenstion2Answer;
	}




	public JLabel getQuenstion3Answer() {
		return quenstion3Answer;
	}




	public JLabel getQuenstion4Answer() {
		return quenstion4Answer;
	}




	public JButton getDoneButton() {
		return doneButton;
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

	public JTextField getMarkTextField() {
		return markTextField;
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
		
		markTextField = new JTextField();
		markTextField.setBounds(142, 495, 144, 35);
		panel.add(markTextField);
		markTextField.setColumns(10);
		
		doneButton = new JButton("Done");
		doneButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		doneButton.setBackground(new Color(45, 204, 112));
		doneButton.setFont(new Font("Century Gothic", Font.BOLD, 15));
		doneButton.setForeground(new Color(255, 255, 255));
		doneButton.setBounds(76, 551, 599, 41);
		panel.add(doneButton);
		
		JLabel lblNewLabel = new JLabel("Mark");
		lblNewLabel.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblNewLabel.setBounds(86, 491, 56, 35);
		panel.add(lblNewLabel);
		
		quenstion1Answer = new JLabel("Question 1 Answer");
		quenstion1Answer.setFont(new Font("Century Gothic", Font.BOLD, 20));
		quenstion1Answer.setBounds(76, 33, 628, 26);
		panel.add(quenstion1Answer);
		
		quenstion2Answer = new JLabel("Question 2 Answer");
		quenstion2Answer.setFont(new Font("Century Gothic", Font.BOLD, 20));
		quenstion2Answer.setBounds(76, 135, 628, 26);
		panel.add(quenstion2Answer);
		
		quenstion3Answer = new JLabel("Question 3 Answer");
		quenstion3Answer.setFont(new Font("Century Gothic", Font.BOLD, 20));
		quenstion3Answer.setBounds(76, 249, 628, 26);
		panel.add(quenstion3Answer);
		
		quenstion4Answer = new JLabel("Question 4 Answer");
		quenstion4Answer.setFont(new Font("Century Gothic", Font.BOLD, 20));
		quenstion4Answer.setBounds(76, 369, 628, 26);
		panel.add(quenstion4Answer);
		
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
