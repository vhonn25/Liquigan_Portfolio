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

public class skillsInterface extends JFrame {

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
					skillsInterface frame = new skillsInterface();
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
	public skillsInterface() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(435, 75, 714, 658);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
//================================================================================================
		
		//Directs to Main Menu page
		JLabel lblSkillsbackbtn = new JLabel("Back");
		lblSkillsbackbtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				mainMenuInterface main = new mainMenuInterface();
				main.setVisible(true);
				main.setLocationRelativeTo(null);
			}
			public void mouseEntered(MouseEvent e) {
				lblSkillsbackbtn.setForeground(Color.yellow);
			}
			public void mouseExited(MouseEvent e) {
				lblSkillsbackbtn.setForeground(Color.white);
			}
		});
		lblSkillsbackbtn.setForeground(Color.WHITE);
		lblSkillsbackbtn.setFont(new Font("Poppins", Font.PLAIN, 18));
		lblSkillsbackbtn.setBounds(593, 50, 45, 18);
		contentPane.add(lblSkillsbackbtn);
		
//================================================================================================

		//Skills Text
		JLabel lblSkills = new JLabel(ins.skillstxt);
		lblSkills.setHorizontalAlignment(SwingConstants.LEFT);
		lblSkills.setForeground(Color.WHITE);
		lblSkills.setFont(new Font("Poppins ExtraBold", Font.PLAIN, 45));
		lblSkills.setBounds(25, 39, 197, 45);
		contentPane.add(lblSkills);
		
		//Personal Skills Text
		JLabel lblPersonalskills = new JLabel(ins.personalskills);
		lblPersonalskills.setFont(new Font("Poppins SemiBold", Font.BOLD, 25));
		lblPersonalskills.setBounds(88, 179, 220, 22);
		contentPane.add(lblPersonalskills);
		
		//Technical Skills Text
		JLabel lblTechnicalskills = new JLabel(ins.technicalskills);
		lblTechnicalskills.setFont(new Font("Poppins SemiBold", Font.BOLD, 25));
		lblTechnicalskills.setBounds(388, 179, 232, 22);
		contentPane.add(lblTechnicalskills);
		
		//Documenting Text
		JLabel lblDocument = new JLabel(ins.document);
		lblDocument.setFont(new Font("Poppins Medium", Font.PLAIN, 18));
		lblDocument.setBounds(127, 261, 142, 18);
		contentPane.add(lblDocument);
		
		//Collaboration Text
		JLabel lblCollab = new JLabel(ins.collab);
		lblCollab.setFont(new Font("Poppins Medium", Font.PLAIN, 18));
		lblCollab.setBounds(127, 346, 152, 18);
		contentPane.add(lblCollab);
		
		//Adaptability Text
		JLabel lblAdapt = new JLabel(ins.adapt);
		lblAdapt.setFont(new Font("Poppins Medium", Font.PLAIN, 18));
		lblAdapt.setBounds(127, 433, 142, 18);
		contentPane.add(lblAdapt);
		
		//Critical Thinking Text
		JLabel lblCritic = new JLabel(ins.critic);
		lblCritic.setFont(new Font("Poppins Medium", Font.PLAIN, 18));
		lblCritic.setBounds(127, 517, 167, 18);
		contentPane.add(lblCritic);
		
		//Premiere Pro Text
		JLabel lblPremiere = new JLabel(ins.premiere);
		lblPremiere.setFont(new Font("Poppins Medium", Font.PLAIN, 18));
		lblPremiere.setBounds(440, 261, 142, 18);
		contentPane.add(lblPremiere);
		
		//Photoshop Text
		JLabel lblPhotoshop = new JLabel(ins.photoshop);
		lblPhotoshop.setFont(new Font("Poppins Medium", Font.PLAIN, 18));
		lblPhotoshop.setBounds(440, 346, 142, 18);
		contentPane.add(lblPhotoshop);
		
		//Lightroom Text
		JLabel lblLightroom = new JLabel(ins.lightroom);
		lblLightroom.setFont(new Font("Poppins Medium", Font.PLAIN, 18));
		lblLightroom.setBounds(440, 433, 142, 18);
		contentPane.add(lblLightroom);
		
		//After Effects Text
		JLabel lblAE = new JLabel(ins.ae);
		lblAE.setFont(new Font("Poppins Medium", Font.PLAIN, 18));
		lblAE.setBounds(440, 517, 142, 18);
		contentPane.add(lblAE);
		
//================================================================================================
		
		//Skills Background Image
		JLabel lblSkillspage = new JLabel("Skills");
		lblSkillspage.setIcon(new ImageIcon(skillsInterface.class.getResource("/Image/Skills.png")));
		lblSkillspage.setBounds(0, 0, 700, 623);
		contentPane.add(lblSkillspage);
	}

}
