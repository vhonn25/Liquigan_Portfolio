package Liquigan_Portfolio;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import javax.swing.SwingConstants;

public class personalInformationInterface extends JFrame {

	private JPanel contentPane;

	//instantiation of the subclass that has all the inherited value from parent class to subclasses
		talentsAchievements ins = new talentsAchievements();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					personalInformationInterface frame = new personalInformationInterface();
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
	public personalInformationInterface() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(435, 75, 714, 658);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
//================================================================================================
	
		//Directs to Main Menu page
		JLabel lblReturnMenu = new JLabel("Return to Main Menu");
		lblReturnMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				mainMenuInterface main = new mainMenuInterface();
				main.setVisible(true);
				main.setLocationRelativeTo(null);
			}
			public void mouseEntered(MouseEvent e) {
				lblReturnMenu.setForeground(Color.yellow);
			}
			public void mouseExited(MouseEvent e) {
				lblReturnMenu.setForeground(Color.black);
			}
		});
		lblReturnMenu.setFont(new Font("Poppins", Font.BOLD, 15));
		lblReturnMenu.setBounds(82, 467, 162, 13);
		contentPane.add(lblReturnMenu);
		
//================================================================================================
		
		//Age Text
		JLabel lblAge = new JLabel(ins.age);
		lblAge.setFont(new Font("Poppins Medium", Font.PLAIN, 17));
		lblAge.setBackground(new Color(0, 0, 0));
		lblAge.setBounds(429, 203, 45, 16);
		contentPane.add(lblAge);
		
		//Sex Text
		JLabel lblSex = new JLabel(ins.sex);
		lblSex.setFont(new Font("Poppins Medium", Font.PLAIN, 17));
		lblSex.setBackground(Color.BLACK);
		lblSex.setBounds(427, 235, 45, 16);
		contentPane.add(lblSex);
		
		//Birthday Text
		JLabel lblBday = new JLabel(ins.bday);
		lblBday.setFont(new Font("Poppins Medium", Font.PLAIN, 17));
		lblBday.setBackground(Color.BLACK);
		lblBday.setBounds(474, 267, 170, 16);
		contentPane.add(lblBday);
		
		//Address Text
		JLabel lblAddress = new JLabel(ins.address);
		lblAddress.setFont(new Font("Poppins Medium", Font.PLAIN, 17));
		lblAddress.setBackground(Color.BLACK);
		lblAddress.setBounds(470, 296, 225, 22);
		contentPane.add(lblAddress);
		
		//Religion Text
		JLabel lblReligion = new JLabel(ins.religion);
		lblReligion.setFont(new Font("Poppins Medium", Font.PLAIN, 17));
		lblReligion.setBackground(Color.BLACK);
		lblReligion.setBounds(468, 331, 139, 16);
		contentPane.add(lblReligion);
		
		//Background Text
		JLabel lblBackground = new JLabel(ins.bckgrnd);
		lblBackground.setHorizontalAlignment(SwingConstants.CENTER);
		lblBackground.setFont(new Font("Poppins Medium", Font.BOLD, 14));
		lblBackground.setBackground(Color.BLACK);
		lblBackground.setBounds(460, 162, 125, 16);
		contentPane.add(lblBackground);
		
		//Contacts Text
		JLabel lblContacts = new JLabel(ins.contacts);
		lblContacts.setHorizontalAlignment(SwingConstants.CENTER);
		lblContacts.setFont(new Font("Poppins Medium", Font.BOLD, 14));
		lblContacts.setBackground(Color.BLACK);
		lblContacts.setBounds(460, 388, 125, 16);
		contentPane.add(lblContacts);
		
		//Facebook Text
		JLabel lblFacebook = new JLabel(ins.fb);
		lblFacebook.setHorizontalAlignment(SwingConstants.LEFT);
		lblFacebook.setFont(new Font("Poppins Medium", Font.PLAIN, 15));
		lblFacebook.setBackground(Color.BLACK);
		lblFacebook.setBounds(422, 427, 155, 16);
		contentPane.add(lblFacebook);
		
		//GMail Text
		JLabel lblGmail = new JLabel(ins.gmail);
		lblGmail.setHorizontalAlignment(SwingConstants.LEFT);
		lblGmail.setFont(new Font("Poppins Medium", Font.PLAIN, 15));
		lblGmail.setBackground(Color.BLACK);
		lblGmail.setBounds(422, 468, 200, 17);
		contentPane.add(lblGmail);
		
		//Contact Number Text
		JLabel lblNumber = new JLabel(ins.number);
		lblNumber.setHorizontalAlignment(SwingConstants.LEFT);
		lblNumber.setFont(new Font("Poppins Medium", Font.PLAIN, 15));
		lblNumber.setBackground(Color.BLACK);
		lblNumber.setBounds(422, 514, 139, 16);
		contentPane.add(lblNumber);
		
//================================================================================================

		//Personal Information Background Image
		JLabel lblPersonalInformationpage = new JLabel("Personal Information");
		lblPersonalInformationpage.setFont(new Font("Poppins", Font.BOLD, 15));
		lblPersonalInformationpage.setIcon(new ImageIcon(personalInformationInterface.class.getResource("/Image/Personal Information.png")));
		lblPersonalInformationpage.setBounds(0, 0, 700, 623);
		contentPane.add(lblPersonalInformationpage);
	}
}
