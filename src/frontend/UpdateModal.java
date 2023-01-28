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
	private JTextField moduleTitle;
	private JTextField moduleDuration;
	private JTextField moduleMark;
	private JButton submitbutton;

	
	
	public JTextField getModuleTitle() {
		return moduleTitle;
	}

	public void setModuleTitle(JTextField moduleTitle) {
		this.moduleTitle = moduleTitle;
	}

	public JTextField getModuleDuration() {
		return moduleDuration;
	}

	public void setModuleDuration(JTextField moduleDuration) {
		this.moduleDuration = moduleDuration;
	}

	public JTextField getModuleMark() {
		return moduleMark;
	}

	public void setModuleMark(JTextField moduleMark) {
		this.moduleMark = moduleMark;
	}

	public JButton getSubmitbutton() {
		return submitbutton;
	}

	public void setSubmitbutton(JButton submitbutton) {
		this.submitbutton = submitbutton;
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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 255, 255));
		panel.setBounds(0, 0, 453, 274);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Module Title");
		lblNewLabel.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblNewLabel.setBounds(69, 10, 134, 44);
		panel.add(lblNewLabel);
		
		moduleTitle = new JTextField();
		moduleTitle.setBounds(69, 53, 253, 29);
		panel.add(moduleTitle);
		moduleTitle.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Module Duration");
		lblNewLabel_1.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(68, 92, 171, 49);
		panel.add(lblNewLabel_1);
		
		moduleDuration = new JTextField();
		moduleDuration.setBounds(69, 131, 253, 29);
		panel.add(moduleDuration);
		moduleDuration.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Module Mark");
		lblNewLabel_2.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(69, 170, 152, 38);
		panel.add(lblNewLabel_2);
		
		moduleMark = new JTextField();
		moduleMark.setBounds(69, 208, 253, 29);
		panel.add(moduleMark);
		moduleMark.setColumns(10);
		
		submitbutton = new JButton("Submit");
		submitbutton.setBounds(332, 212, 85, 21);
		panel.add(submitbutton);
	}
}
