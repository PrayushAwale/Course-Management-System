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

public class AddTeacherModal extends JFrame {

	private JPanel contentPane;
	private JTextField nameTextField;
	private JTextField phoneNumField;
	private JTextField addressTextField;
	private JCheckBox isPartTimeCheck;
	private JTextField idTextField;
	private JTextField isPartTimeTextField;
	private JTextField moduleTextField;
	private JButton addButton;

	/**
	 * Launch the application.
	 */
	
	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddTeacherModal frame = new AddTeacherModal();
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



	public JCheckBox getIsPartTimeCheck() {
		return isPartTimeCheck;
	}



	public JTextField getIdTextField() {
		return idTextField;
	}



	public JTextField getIsPartTimeTextField() {
		return isPartTimeTextField;
	}



	public JTextField getModuleTextField() {
		return moduleTextField;
	}



	public JButton getAddButton() {
		return addButton;
	}



	/**
	 * Create the frame.
	 */
	public AddTeacherModal() {
		setResizable(false);
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 570, 554);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(64, 128, 128));
		panel.setBounds(0, 0, 605, 545);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Teacher Name");
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
		
		isPartTimeCheck = new JCheckBox("Part Time");
		isPartTimeCheck.setSize(new Dimension(2, 2));
		isPartTimeCheck.setFont(new Font("Century Gothic", Font.BOLD, 15));
		isPartTimeCheck.setForeground(new Color(255, 255, 255));
		isPartTimeCheck.setBackground(new Color(64, 128, 128));
		isPartTimeCheck.setBounds(77, 400, 100, 21);
		panel.add(isPartTimeCheck);
		
		JLabel lblNewLabel_2 = new JLabel("Module to assign");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lblNewLabel_2.setBounds(249, 402, 125, 17);
		panel.add(lblNewLabel_2);
		
		JComboBox comboBoxModule = new JComboBox();
		comboBoxModule.setBackground(new Color(255, 255, 255));
		comboBoxModule.setModel(new DefaultComboBoxModel(new String[] {"Select", "OOP", "ISA", "NMC"}));
		comboBoxModule.setBounds(388, 400, 83, 21);
		panel.add(comboBoxModule);
		
		addButton = new JButton("Add");
		addButton.setForeground(new Color(255, 255, 255));
		addButton.setFont(new Font("Century Gothic", Font.BOLD, 15));
		addButton.setBackground(new Color(45, 204, 112));
		addButton.setBounds(77, 431, 394, 36);
		panel.add(addButton);
		
		idTextField = new JTextField();
		idTextField.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		idTextField.setColumns(10);
		idTextField.setBounds(77, 76, 394, 32);
		panel.add(idTextField);
		
		JLabel lblTeacherId = new JLabel("Teacher ID");
		lblTeacherId.setForeground(Color.WHITE);
		lblTeacherId.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblTeacherId.setBounds(77, 30, 166, 36);
		panel.add(lblTeacherId);
		
		isPartTimeTextField = new JTextField();
		isPartTimeTextField.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		isPartTimeTextField.setColumns(10);
		isPartTimeTextField.setBounds(77, 477, 174, 32);
		panel.add(isPartTimeTextField);
		
		moduleTextField = new JTextField();
		moduleTextField.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		moduleTextField.setColumns(10);
		moduleTextField.setBounds(261, 477, 210, 32);
		panel.add(moduleTextField);
	}
}
