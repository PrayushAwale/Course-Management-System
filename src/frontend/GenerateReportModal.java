package frontend;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;

public class GenerateReportModal extends JFrame {

	private JPanel contentPane;
	private JTextField remarkTextField;
	private JTextField messageTextField;
	private JLabel remarkAverage;
	private JLabel remarkAiMark;
	private JLabel remarkNmcMark;
	private JLabel remarkOopMark;
	private JLabel remarkStudentName;
	private JLabel remarkStudentTd;
	private JButton generateButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GenerateReportModal frame = new GenerateReportModal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public JButton getGenerateButton() {
		return generateButton;
	}

	public JTextField getRemarkTextField() {
		return remarkTextField;
	}

	public JTextField getMessageTextField() {
		return messageTextField;
	}

	public JLabel getRemarkAverage() {
		return remarkAverage;
	}

	public JLabel getRemarkAiMark() {
		return remarkAiMark;
	}

	public JLabel getRemarkNmcMark() {
		return remarkNmcMark;
	}

	public JLabel getRemarkOopMark() {
		return remarkOopMark;
	}

	public JLabel getRemarkStudentName() {
		return remarkStudentName;
	}

	public JLabel getRemarkStudentTd() {
		return remarkStudentTd;
	}

	/**
	 * Create the frame.
	 */
	public GenerateReportModal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 629, 532);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student ID: ");
		lblNewLabel.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblNewLabel.setBounds(57, 53, 121, 50);
		contentPane.add(lblNewLabel);
		
		JLabel lblStudentName = new JLabel("Student Name: ");
		lblStudentName.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblStudentName.setBounds(57, 77, 156, 50);
		contentPane.add(lblStudentName);
		
		JLabel lblOopMark = new JLabel("OOP Mark: ");
		lblOopMark.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblOopMark.setBounds(57, 137, 156, 50);
		contentPane.add(lblOopMark);
		
		JLabel lblMncMark = new JLabel("NMC Mark:");
		lblMncMark.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblMncMark.setBounds(57, 169, 156, 50);
		contentPane.add(lblMncMark);
		
		JLabel lblAiMark = new JLabel("AI Mark:");
		lblAiMark.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblAiMark.setBounds(57, 197, 156, 50);
		contentPane.add(lblAiMark);
		
		remarkStudentTd = new JLabel("");
		remarkStudentTd.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		remarkStudentTd.setBounds(214, 69, 335, 20);
		contentPane.add(remarkStudentTd);
		
		remarkStudentName = new JLabel("");
		remarkStudentName.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		remarkStudentName.setBounds(214, 92, 335, 20);
		contentPane.add(remarkStudentName);
		
		remarkOopMark = new JLabel("");
		remarkOopMark.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		remarkOopMark.setBounds(214, 152, 335, 20);
		contentPane.add(remarkOopMark);
		
		remarkNmcMark = new JLabel("");
		remarkNmcMark.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		remarkNmcMark.setBounds(214, 184, 335, 20);
		contentPane.add(remarkNmcMark);
		
		remarkAiMark = new JLabel("");
		remarkAiMark.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		remarkAiMark.setBounds(214, 212, 335, 20);
		contentPane.add(remarkAiMark);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(57, 124, 528, 3);
		contentPane.add(panel);
		
		generateButton = new JButton("Generate");
		generateButton.setBackground(new Color(255, 255, 255));
		generateButton.setFont(new Font("Century Gothic", Font.BOLD, 20));
		generateButton.setBounds(57, 424, 528, 41);
		contentPane.add(generateButton);
		
		JLabel lblNewLabel_2 = new JLabel("Average ");
		lblNewLabel_2.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblNewLabel_2.setBounds(57, 282, 91, 26);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Message");
		lblNewLabel_2_1.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblNewLabel_2_1.setBounds(57, 364, 91, 26);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Remark");
		lblNewLabel_2_2.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblNewLabel_2_2.setBounds(57, 321, 91, 26);
		contentPane.add(lblNewLabel_2_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.BLACK);
		panel_1.setBounds(57, 259, 528, 3);
		contentPane.add(panel_1);
		
		remarkTextField = new JTextField();
		remarkTextField.setBounds(161, 321, 424, 27);
		contentPane.add(remarkTextField);
		remarkTextField.setColumns(10);
		
		messageTextField = new JTextField();
		messageTextField.setColumns(10);
		messageTextField.setBounds(161, 369, 424, 26);
		contentPane.add(messageTextField);
		
		remarkAverage = new JLabel("");
		remarkAverage.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		remarkAverage.setBounds(214, 282, 335, 26);
		contentPane.add(remarkAverage);
	}
}
