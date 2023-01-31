package frontend;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class UpdateModal extends JFrame {

	private JPanel contentPane;
	private JTextField moduleCodeTextfield;
	private JTextField moduleTitleTextfield;
	private JTextField moduleDurationTextfield;
	private JButton submitbutton;
	private JTextField moduleMarkTextfield;
	private JTextField moduleLeaderTextfield;
	private JLabel lblNewLabel_2_2;

	
	
	

	public JTextField getModuleCodeTextfield() {
		return moduleCodeTextfield;
	}

	public JTextField getModuleTitleTextfield() {
		return moduleTitleTextfield;
	}

	public JTextField getModuleDurationTextfield() {
		return moduleDurationTextfield;
	}

	public JButton getSubmitbutton() {
		return submitbutton;
	}

	public JTextField getModuleMarkTextfield() {
		return moduleMarkTextfield;
	}

	public JTextField getModuleLeaderTextfield() {
		return moduleLeaderTextfield;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateModal frame = new UpdateModal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public UpdateModal() {
		setType(Type.UTILITY);
		setResizable(false);
		setDefaultCloseOperation(UpdateModal.EXIT_ON_CLOSE);
		setBounds(100, 100, 996, 537);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 255, 255));
		panel.setBounds(0, 0, 992, 500);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Module Code");
		lblNewLabel.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblNewLabel.setBounds(69, 10, 198, 44);
		panel.add(lblNewLabel);
		
		moduleCodeTextfield = new JTextField();
		moduleCodeTextfield.setBounds(69, 53, 253, 29);
		panel.add(moduleCodeTextfield);
		moduleCodeTextfield.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Module Title");
		lblNewLabel_1.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(68, 92, 171, 49);
		panel.add(lblNewLabel_1);
		
		moduleTitleTextfield = new JTextField();
		moduleTitleTextfield.setBounds(69, 131, 253, 29);
		panel.add(moduleTitleTextfield);
		moduleTitleTextfield.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Module Duration");
		lblNewLabel_2.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(69, 170, 253, 38);
		panel.add(lblNewLabel_2);
		
		moduleDurationTextfield = new JTextField();
		moduleDurationTextfield.setBounds(69, 208, 253, 29);
		panel.add(moduleDurationTextfield);
		moduleDurationTextfield.setColumns(10);
		
		submitbutton = new JButton("Submit");
		submitbutton.setBounds(433, 447, 85, 21);
		panel.add(submitbutton);
		
		moduleMarkTextfield = new JTextField();
		moduleMarkTextfield.setColumns(10);
		moduleMarkTextfield.setBounds(69, 315, 253, 29);
		panel.add(moduleMarkTextfield);
		
		JLabel lblNewLabel_2_1 = new JLabel("Module Mark");
		lblNewLabel_2_1.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblNewLabel_2_1.setBounds(69, 267, 152, 38);
		panel.add(lblNewLabel_2_1);
		
		moduleLeaderTextfield = new JTextField();
		moduleLeaderTextfield.setColumns(10);
		moduleLeaderTextfield.setBounds(472, 53, 253, 29);
		panel.add(moduleLeaderTextfield);
		
		lblNewLabel_2_2 = new JLabel("Module Leader");
		lblNewLabel_2_2.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblNewLabel_2_2.setBounds(490, 13, 152, 38);
		panel.add(lblNewLabel_2_2);
	}
}
