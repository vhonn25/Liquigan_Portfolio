package Liquigan_Portfolio;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class mainMenuInterface extends JFrame {

	private JPanel contentPane;

	//instantiation of the subclass that has all the inherited value from parent class to subclasses.
	talentsAchievements ins = new talentsAchievements();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainMenuInterface frame = new mainMenuInterface();
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
	public mainMenuInterface() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(435, 75, 714, 658);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		
//================================================================================================

		//Personal Information page
		JLabel lblPersonalinfobtn = new JLabel(ins.pers);
		lblPersonalinfobtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) { //Click and direct to next interface
				dispose();
				personalInformationInterface inf = new personalInformationInterface();
				inf.setVisible(true);
				inf.setLocationRelativeTo(null);
			}
			public void mouseEntered(MouseEvent e) {
				lblPersonalinfobtn.setForeground(Color.white);
			}
			public void mouseExited(MouseEvent e) {
				lblPersonalinfobtn.setForeground(Color.black);
			}
		});
		lblPersonalinfobtn.setBackground(new Color(0, 0, 0));
		lblPersonalinfobtn.setHorizontalAlignment(SwingConstants.CENTER);
		lblPersonalinfobtn.setForeground(new Color(0, 0, 0));
		lblPersonalinfobtn.setFont(new Font("Poppins", Font.BOLD, 15));
		lblPersonalinfobtn.setBounds(58, 451, 206, 44);
		contentPane.add(lblPersonalinfobtn);

		
		//Educational Attainment page
		JLabel lblEduAttainbtn = new JLabel(ins.edu);
		lblEduAttainbtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				educational_AttainmentInterface edu = new educational_AttainmentInterface();
				edu.setVisible(true);
				edu.setLocationRelativeTo(null);
			}
			public void mouseEntered(MouseEvent e) {
				lblEduAttainbtn.setForeground(Color.yellow);
			}
			public void mouseExited(MouseEvent e) {
				lblEduAttainbtn.setForeground(Color.white);
			}
		});
		
		lblEduAttainbtn.setHorizontalAlignment(SwingConstants.CENTER);
		lblEduAttainbtn.setForeground(new Color(255, 255, 255));
		lblEduAttainbtn.setFont(new Font("Poppins", Font.BOLD, 13));
		lblEduAttainbtn.setBounds(416, 177, 198, 44);
		contentPane.add(lblEduAttainbtn);
		
		
		//Hobbies page
		JLabel lblHobbiesbtn = new JLabel(ins.hob);
		lblHobbiesbtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				hobbiesInterface hob = new hobbiesInterface();
				hob.setVisible(true);
				hob.setLocationRelativeTo(null);
			}
			public void mouseEntered(MouseEvent e) {
				lblHobbiesbtn.setForeground(Color.yellow);
			}
			public void mouseExited(MouseEvent e) {
				lblHobbiesbtn.setForeground(Color.white);
			}
		});
		lblHobbiesbtn.setHorizontalAlignment(SwingConstants.CENTER);
		lblHobbiesbtn.setForeground(Color.WHITE);
		lblHobbiesbtn.setFont(new Font("Poppins", Font.BOLD, 15));
		lblHobbiesbtn.setBounds(414, 264, 206, 44);
		contentPane.add(lblHobbiesbtn);
		
		
		//Skills page
		JLabel lblSkillsbtn = new JLabel(ins.skill);
		lblSkillsbtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				skillsInterface skill = new skillsInterface();
				skill.setVisible(true);
				skill.setLocationRelativeTo(null);
			}
			public void mouseEntered(MouseEvent e) {
				lblSkillsbtn.setForeground(Color.yellow);
			}
			public void mouseExited(MouseEvent e) {
				lblSkillsbtn.setForeground(Color.white);
			}
		});
		lblSkillsbtn.setHorizontalAlignment(SwingConstants.CENTER);
		lblSkillsbtn.setForeground(Color.WHITE);
		lblSkillsbtn.setFont(new Font("Poppins", Font.BOLD, 15));
		lblSkillsbtn.setBounds(419, 352, 190, 44);
		contentPane.add(lblSkillsbtn);
		
		
		//Course page
		JLabel lblCoursebtn = new JLabel(ins.cour);
		lblCoursebtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				courseInterface cour = new courseInterface();
				cour.setVisible(true);
				cour.setLocationRelativeTo(null);
			}
			public void mouseEntered(MouseEvent e) {
				lblCoursebtn.setForeground(Color.yellow);
			}
			public void mouseExited(MouseEvent e) {
				lblCoursebtn.setForeground(Color.white);
			}
		});
		lblCoursebtn.setBackground(new Color(255, 255, 255));
		lblCoursebtn.setHorizontalAlignment(SwingConstants.CENTER);
		lblCoursebtn.setForeground(new Color(255, 255, 255));
		lblCoursebtn.setFont(new Font("Poppins", Font.BOLD, 15));
		lblCoursebtn.setBounds(410, 438, 206, 44);
		contentPane.add(lblCoursebtn);
		
		
		//Talents & Achievements page
		JLabel lblTalentsAchievementsbtn = new JLabel(ins.tal);
		lblTalentsAchievementsbtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				talents_achievementsInterface tal = new talents_achievementsInterface();
				tal.setVisible(true);
				tal.setLocationRelativeTo(null);
			}
			public void mouseEntered(MouseEvent e) {
				lblTalentsAchievementsbtn.setForeground(Color.yellow);
			}
			public void mouseExited(MouseEvent e) {
				lblTalentsAchievementsbtn.setForeground(Color.white);
			}
		});
		lblTalentsAchievementsbtn.setHorizontalAlignment(SwingConstants.CENTER);
		lblTalentsAchievementsbtn.setForeground(Color.WHITE);
		lblTalentsAchievementsbtn.setFont(new Font("Poppins", Font.BOLD, 13));
		lblTalentsAchievementsbtn.setBounds(410, 530, 206, 44);
		contentPane.add(lblTalentsAchievementsbtn);
		
//================================================================================================

		//Main Menu Background Image
		JLabel lblMainMenuPage = new JLabel("Main Menu");
		lblMainMenuPage.setIcon(new ImageIcon(mainMenuInterface.class.getResource("/Image/Main Menu.png")));
		lblMainMenuPage.setBounds(0, 0, 700, 623);
		contentPane.add(lblMainMenuPage);
	}
}
