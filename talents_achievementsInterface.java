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

public class talents_achievementsInterface extends JFrame {

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
					talents_achievementsInterface frame = new talents_achievementsInterface();
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
	public talents_achievementsInterface() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(435, 75, 714, 658);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
//================================================================================================
		
		//Directs to Main Menu page
		JLabel lblTalentsbackbtn = new JLabel("Back");
		lblTalentsbackbtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				mainMenuInterface main = new mainMenuInterface();
				main.setVisible(true);
				main.setLocationRelativeTo(null);
			}
			public void mouseEntered(MouseEvent e) {
				lblTalentsbackbtn.setForeground(Color.yellow);
			}
			public void mouseExited(MouseEvent e) {
				lblTalentsbackbtn.setForeground(Color.white);
			}
		});
		lblTalentsbackbtn.setForeground(Color.WHITE);
		lblTalentsbackbtn.setFont(new Font("Poppins", Font.PLAIN, 18));
		lblTalentsbackbtn.setBounds(593, 51, 45, 18);
		contentPane.add(lblTalentsbackbtn);
		
//================================================================================================
		
		//Talents & Achievements Text
		JLabel lblTalentsachievements = new JLabel(ins.talentsAchievements);
		lblTalentsachievements.setHorizontalAlignment(SwingConstants.LEFT);
		lblTalentsachievements.setForeground(Color.WHITE);
		lblTalentsachievements.setFont(new Font("Poppins ExtraBold", Font.PLAIN, 35));
		lblTalentsachievements.setBounds(25, 39, 447, 45);
		contentPane.add(lblTalentsachievements);
		
		//Talents Text
		JLabel lblTalentstxt = new JLabel(ins.talents);
		lblTalentstxt.setHorizontalAlignment(SwingConstants.CENTER);
		lblTalentstxt.setForeground(new Color(255, 255, 255));
		lblTalentstxt.setFont(new Font("Poppins SemiBold", Font.BOLD, 15));
		lblTalentstxt.setBounds(315, 159, 75, 18);
		contentPane.add(lblTalentstxt);
		
		//Achievements Text
		JLabel lblAchievementstxt = new JLabel(ins.achievements);
		lblAchievementstxt.setHorizontalAlignment(SwingConstants.CENTER);
		lblAchievementstxt.setForeground(Color.WHITE);
		lblAchievementstxt.setFont(new Font("Poppins SemiBold", Font.BOLD, 15));
		lblAchievementstxt.setBounds(287, 401, 125, 18);
		contentPane.add(lblAchievementstxt);
		
		//Lectoring Text
		JLabel lblLectoring = new JLabel(ins.lectoring);
		lblLectoring.setHorizontalAlignment(SwingConstants.CENTER);
		lblLectoring.setForeground(Color.WHITE);
		lblLectoring.setFont(new Font("Poppins Medium", Font.PLAIN, 15));
		lblLectoring.setBounds(111, 196, 75, 18);
		contentPane.add(lblLectoring);
		
		//Student Achiever Test
		JLabel lblStudentAchiever = new JLabel(ins.studentAchiever);
		lblStudentAchiever.setHorizontalAlignment(SwingConstants.CENTER);
		lblStudentAchiever.setForeground(Color.WHITE);
		lblStudentAchiever.setFont(new Font("Poppins Medium", Font.PLAIN, 15));
		lblStudentAchiever.setBounds(283, 196, 140, 18);
		contentPane.add(lblStudentAchiever);
		
		//Editing Text
		JLabel lblEditing = new JLabel(ins.editing);
		lblEditing.setHorizontalAlignment(SwingConstants.CENTER);
		lblEditing.setForeground(Color.WHITE);
		lblEditing.setFont(new Font("Poppins Medium", Font.PLAIN, 15));
		lblEditing.setBounds(519, 196, 75, 18);
		contentPane.add(lblEditing);
		
		//First Java Project Text
		JLabel lblFirstJavaProject = new JLabel(ins.fjavaproj);
		lblFirstJavaProject.setHorizontalAlignment(SwingConstants.CENTER);
		lblFirstJavaProject.setForeground(Color.WHITE);
		lblFirstJavaProject.setFont(new Font("Poppins Medium", Font.PLAIN, 15));
		lblFirstJavaProject.setBounds(100, 428, 140, 18);
		contentPane.add(lblFirstJavaProject);
		
		//First Java GUI Text
		JLabel lblFirstJavaGui = new JLabel(ins.fguiproj);
		lblFirstJavaGui.setHorizontalAlignment(SwingConstants.CENTER);
		lblFirstJavaGui.setForeground(Color.WHITE);
		lblFirstJavaGui.setFont(new Font("Poppins Medium", Font.PLAIN, 15));
		lblFirstJavaGui.setBounds(442, 428, 160, 18);
		contentPane.add(lblFirstJavaGui);
		
//================================================================================================
		
		//Talents & Achievements Background Image
		JLabel lblTalentspage = new JLabel("New Label");
		lblTalentspage.setIcon(new ImageIcon(talents_achievementsInterface.class.getResource("/Image/Talents_Achievements.png")));
		lblTalentspage.setBounds(00, 00, 700, 623);
		contentPane.add(lblTalentspage);
	}

}
