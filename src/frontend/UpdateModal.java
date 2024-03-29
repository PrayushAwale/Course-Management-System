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
	private JLabel showthis;

	
	
	

	public JLabel getShowthis() {
		return showthis;
	}

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
		setBounds(100, 100, 596, 589);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(64, 128, 128));
		panel.setBounds(0, 0, 598, 587);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Module Code");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblNewLabel.setBounds(69, 10, 198, 44);
		panel.add(lblNewLabel);
		
		moduleCodeTextfield = new JTextField();
		moduleCodeTextfield.setBounds(69, 53, 458, 29);
		panel.add(moduleCodeTextfield);
		moduleCodeTextfield.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Module Title");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblNewLabel_1.setBounds(68, 92, 171, 49);
		panel.add(lblNewLabel_1);
		
		moduleTitleTextfield = new JTextField();
		moduleTitleTextfield.setBounds(69, 131, 458, 29);
		panel.add(moduleTitleTextfield);
		moduleTitleTextfield.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Module Duration");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblNewLabel_2.setBounds(69, 170, 253, 38);
		panel.add(lblNewLabel_2);
		
		moduleDurationTextfield = new JTextField();
		moduleDurationTextfield.setBounds(69, 208, 458, 29);
		panel.add(moduleDurationTextfield);
		moduleDurationTextfield.setColumns(10);
		
		submitbutton = new JButton("Submit");
		submitbutton.setForeground(new Color(255, 255, 255));
		submitbutton.setFont(new Font("Century Gothic", Font.BOLD, 15));
		submitbutton.setBackground(new Color(45, 204, 112));
		submitbutton.setBounds(69, 457, 458, 38);
		panel.add(submitbutton);
		
		moduleMarkTextfield = new JTextField();
		moduleMarkTextfield.setColumns(10);
		moduleMarkTextfield.setBounds(69, 295, 458, 29);
		panel.add(moduleMarkTextfield);
		
		JLabel lblNewLabel_2_1 = new JLabel("Module Mark");
		lblNewLabel_2_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_1.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblNewLabel_2_1.setBounds(69, 247, 152, 38);
		panel.add(lblNewLabel_2_1);
		
		moduleLeaderTextfield = new JTextField();
		moduleLeaderTextfield.setColumns(10);
		moduleLeaderTextfield.setBounds(69, 378, 458, 29);
		panel.add(moduleLeaderTextfield);
		
		lblNewLabel_2_2 = new JLabel("Module Leader");
		lblNewLabel_2_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_2.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblNewLabel_2_2.setBounds(69, 339, 152, 38);
		panel.add(lblNewLabel_2_2);
		
		showthis = new JLabel("Auto Generated");
		showthis.setVisible(false);
		showthis.setFont(new Font("Century Gothic", Font.BOLD, 20));
		showthis.setBounds(69, 41, 171, 44);
		panel.add(showthis);
	}
}
