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
import javax.swing.JCheckBox;
import java.awt.Dimension;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class UpdateStudentModal extends JFrame {

	private JPanel contentPane;
	private JTextField nameTextField;
	private JTextField phoneNumField;
	private JTextField addressTextField;
	private JTextField idTextField;
	private JButton addButton;
	private JLabel lblNewLabel_1_2;
	private JTextField leveltextField;
	private JTextField coursetextFiled;

	/**
	 * Launch the application.
	 */
	
	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateStudentModal frame = new UpdateStudentModal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}





	public JPanel getContentPane() {
		return contentPane;
	}





	public JTextField getNameTextField() {
		return nameTextField;
	}





	public JTextField getPhoneNumField() {
		return phoneNumField;
	}





	public JTextField getAddressTextField() {
		return addressTextField;
	}





	public JTextField getIdTextField() {
		return idTextField;
	}





	public JButton getAddButton() {
		return addButton;
	}





	public JTextField getLeveltextField() {
		return leveltextField;
	}





	public JTextField getCoursetextFiled() {
		return coursetextFiled;
	}





	/**
	 * Create the frame.
	 */
	public UpdateStudentModal() {
		setResizable(false);
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 570, 678);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(64, 128, 128));
		panel.setBounds(0, 0, 605, 678);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student Name");
		lblNewLabel.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(77, 117, 166, 36);
		panel.add(lblNewLabel);
		
		nameTextField = new JTextField();
		nameTextField.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		nameTextField.setBounds(77, 163, 394, 32);
		panel.add(nameTextField);
		nameTextField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Phone Number");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblNewLabel_1.setBounds(77, 205, 156, 36);
		panel.add(lblNewLabel_1);
		
		phoneNumField = new JTextField();
		phoneNumField.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		phoneNumField.setBounds(77, 251, 394, 32);
		panel.add(phoneNumField);
		phoneNumField.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Address");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(77, 293, 156, 36);
		panel.add(lblNewLabel_1_1);
		
		addressTextField = new JTextField();
		addressTextField.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		addressTextField.setColumns(10);
		addressTextField.setBounds(77, 339, 394, 32);
		panel.add(addressTextField);
		
		JLabel lblNewLabel_2 = new JLabel("Course ");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lblNewLabel_2.setBounds(77, 482, 55, 17);
		panel.add(lblNewLabel_2);
		
		JComboBox comboBoxModule = new JComboBox();
		comboBoxModule.setBackground(new Color(255, 255, 255));
		comboBoxModule.setModel(new DefaultComboBoxModel(new String[] {"Select", "OOP", "ISA", "NMC"}));
		comboBoxModule.setBounds(145, 482, 83, 21);
		panel.add(comboBoxModule);
		
		addButton = new JButton("Add");
		addButton.setForeground(new Color(255, 255, 255));
		addButton.setFont(new Font("Century Gothic", Font.BOLD, 15));
		addButton.setBackground(new Color(45, 204, 112));
		addButton.setBounds(77, 523, 394, 36);
		panel.add(addButton);
		
		idTextField = new JTextField();
		idTextField.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		idTextField.setColumns(10);
		idTextField.setBounds(77, 76, 394, 32);
		panel.add(idTextField);
		
		JLabel lblTeacherId = new JLabel("University ID");
		lblTeacherId.setForeground(Color.WHITE);
		lblTeacherId.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblTeacherId.setBounds(77, 30, 166, 36);
		panel.add(lblTeacherId);
		
		lblNewLabel_1_2 = new JLabel("Level");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblNewLabel_1_2.setBounds(77, 381, 156, 36);
		panel.add(lblNewLabel_1_2);
		
		leveltextField = new JTextField();
		leveltextField.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		leveltextField.setColumns(10);
		leveltextField.setBounds(77, 422, 394, 32);
		panel.add(leveltextField);
		
		coursetextFiled = new JTextField();
		coursetextFiled.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		coursetextFiled.setColumns(10);
		coursetextFiled.setBounds(248, 474, 223, 32);
		panel.add(coursetextFiled);
	}
}
