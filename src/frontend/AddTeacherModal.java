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
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JCheckBox chckbxNewCheckBox;

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

	/**
	 * Create the frame.
	 */
	public AddTeacherModal() {
		setResizable(false);
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 603, 466);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(64, 128, 128));
		panel.setBounds(0, 0, 605, 440);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(77, 22, 71, 36);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		textField.setBounds(77, 58, 394, 32);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Phone Number");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblNewLabel_1.setBounds(77, 100, 156, 36);
		panel.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		textField_1.setBounds(77, 136, 394, 32);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Address");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(77, 189, 156, 36);
		panel.add(lblNewLabel_1_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		textField_2.setColumns(10);
		textField_2.setBounds(77, 223, 394, 32);
		panel.add(textField_2);
		
		chckbxNewCheckBox = new JCheckBox("Part Time");
		chckbxNewCheckBox.setSize(new Dimension(2, 2));
		chckbxNewCheckBox.setFont(new Font("Century Gothic", Font.BOLD, 15));
		chckbxNewCheckBox.setForeground(new Color(255, 255, 255));
		chckbxNewCheckBox.setBackground(new Color(64, 128, 128));
		chckbxNewCheckBox.setBounds(77, 281, 100, 21);
		panel.add(chckbxNewCheckBox);
		
		JLabel lblNewLabel_2 = new JLabel("Module to assign");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lblNewLabel_2.setBounds(253, 285, 125, 17);
		panel.add(lblNewLabel_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(new Color(255, 255, 255));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select", "OOP", "ISA", "NMC"}));
		comboBox.setBounds(388, 283, 83, 21);
		panel.add(comboBox);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.setFont(new Font("Century Gothic", Font.BOLD, 15));
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setBounds(77, 336, 394, 36);
		panel.add(btnNewButton);
	}
}
