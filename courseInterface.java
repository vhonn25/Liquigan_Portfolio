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

public class courseInterface extends JFrame {

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
					courseInterface frame = new courseInterface();
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
	public courseInterface() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(435, 75, 714, 658);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
//================================================================================================
		
		//Directs to Main Menu page
		JLabel lblCoursebackbtn = new JLabel("Back");
		lblCoursebackbtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				mainMenuInterface main = new mainMenuInterface();
				main.setVisible(true);
				main.setLocationRelativeTo(null);
			}
			public void mouseEntered(MouseEvent e) {
				lblCoursebackbtn.setForeground(Color.yellow);
			}
			public void mouseExited(MouseEvent e) {
				lblCoursebackbtn.setForeground(Color.white);
			}
		});
		lblCoursebackbtn.setForeground(Color.WHITE);
		lblCoursebackbtn.setFont(new Font("Poppins", Font.PLAIN, 18));
		lblCoursebackbtn.setBounds(598, 53, 45, 18);
		contentPane.add(lblCoursebackbtn);
		
//================================================================================================
		
		//Course Text
		JLabel lblCourse = new JLabel(ins.cour);
		lblCourse.setHorizontalAlignment(SwingConstants.LEFT);
		lblCourse.setForeground(Color.WHITE);
		lblCourse.setFont(new Font("Poppins ExtraBold", Font.PLAIN, 45));
		lblCourse.setBounds(25, 39, 197, 45);
		contentPane.add(lblCourse);
		
		// What is BSIT Text
		JLabel lblWhat = new JLabel(ins.what);
		lblWhat.setFont(new Font("Poppins", Font.BOLD, 20));
		lblWhat.setBounds(10, 196, 219, 18);
		contentPane.add(lblWhat);
		
		//Why BSIT Text
		JLabel lblWhy = new JLabel(ins.why);
		lblWhy.setFont(new Font("Poppins", Font.BOLD, 20));
		lblWhy.setHorizontalAlignment(SwingConstants.LEFT);
		lblWhy.setBounds(10, 426, 180, 18);
		contentPane.add(lblWhy);
		
//================================================================================================

		//Course Background Image
		JLabel lblCoursebg = new JLabel("New label");
		lblCoursebg.setIcon(new ImageIcon(courseInterface.class.getResource("/Image/Course.png")));
		lblCoursebg.setBounds(0, 0, 700, 623);
		contentPane.add(lblCoursebg);
	}
}
