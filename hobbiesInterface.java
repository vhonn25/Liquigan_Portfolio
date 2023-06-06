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

public class hobbiesInterface extends JFrame {

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
					hobbiesInterface frame = new hobbiesInterface();
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
	public hobbiesInterface() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(435, 75, 714, 658);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
//================================================================================================
		
		//Directs to Main Menu page
		JLabel lblHobbiesbackbtn = new JLabel("Back");
		lblHobbiesbackbtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				mainMenuInterface main = new mainMenuInterface();
				main.setVisible(true);
				main.setLocationRelativeTo(null);
			}
			public void mouseEntered(MouseEvent e) {
				lblHobbiesbackbtn.setForeground(Color.yellow);
			}
			public void mouseExited(MouseEvent e) {
				lblHobbiesbackbtn.setForeground(Color.white);
			}
		});
		lblHobbiesbackbtn.setFont(new Font("Poppins", Font.PLAIN, 18));
		lblHobbiesbackbtn.setForeground(new Color(255, 255, 255));
		lblHobbiesbackbtn.setBounds(588, 53, 45, 18);
		contentPane.add(lblHobbiesbackbtn);
		
//================================================================================================
		
		//Hobbies text
		JLabel lblHobbiestxt = new JLabel(ins.hobbiestxt);
		lblHobbiestxt.setHorizontalAlignment(SwingConstants.LEFT);
		lblHobbiestxt.setForeground(new Color(255, 255, 255));
		lblHobbiestxt.setFont(new Font("Poppins ExtraBold", Font.PLAIN, 45));
		lblHobbiestxt.setBounds(25, 40, 197, 45);
		contentPane.add(lblHobbiestxt);
		
		//Playing Games text
		JLabel lblPlaygames = new JLabel(ins.playgames);
		lblPlaygames.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlaygames.setFont(new Font("Poppins SemiBold", Font.PLAIN, 18));
		lblPlaygames.setBounds(32, 330, 152, 17);
		contentPane.add(lblPlaygames);
		
		//Watching Movies text
		JLabel lblWatchingMovies = new JLabel(ins.watchmovies);
		lblWatchingMovies.setHorizontalAlignment(SwingConstants.CENTER);
		lblWatchingMovies.setFont(new Font("Poppins SemiBold", Font.PLAIN, 18));
		lblWatchingMovies.setBounds(264, 330, 173, 17);
		contentPane.add(lblWatchingMovies);
		
		//Reading Books text
		JLabel lblReadbooks = new JLabel(ins.readbooks);
		lblReadbooks.setHorizontalAlignment(SwingConstants.CENTER);
		lblReadbooks.setFont(new Font("Poppins SemiBold", Font.PLAIN, 18));
		lblReadbooks.setBounds(513, 330, 152, 17);
		contentPane.add(lblReadbooks);
		
		//Cycling Text
		JLabel lblCycling = new JLabel(ins.cycling);
		lblCycling.setHorizontalAlignment(SwingConstants.CENTER);
		lblCycling.setFont(new Font("Poppins SemiBold", Font.PLAIN, 18));
		lblCycling.setBounds(156, 538, 152, 17);
		contentPane.add(lblCycling);
		
		//Jogging Text
		JLabel lblJogging = new JLabel(ins.jogging);
		lblJogging.setHorizontalAlignment(SwingConstants.CENTER);
		lblJogging.setFont(new Font("Poppins SemiBold", Font.PLAIN, 18));
		lblJogging.setBounds(396, 538, 152, 17);
		contentPane.add(lblJogging);
		
//================================================================================================

		//Hobbies Background Image
		JLabel lblHobbiespage = new JLabel("New label");
		lblHobbiespage.setForeground(new Color(255, 255, 255));
		lblHobbiespage.setIcon(new ImageIcon(hobbiesInterface.class.getResource("/Image/Hobbies.png")));
		lblHobbiespage.setBounds(0, 0, 700, 623);
		contentPane.add(lblHobbiespage);
	}

}
