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

public class educational_AttainmentInterface extends JFrame {

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
					educational_AttainmentInterface frame = new educational_AttainmentInterface();
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
	public educational_AttainmentInterface() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(435, 75, 714, 658);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
//================================================================================================
		
		//Directs to Main Menu page
		JLabel lblEdubackbtn = new JLabel("Back");
		lblEdubackbtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				mainMenuInterface main = new mainMenuInterface();
				main.setVisible(true);
				main.setLocationRelativeTo(null);
			}
			public void mouseEntered(MouseEvent e) {
				lblEdubackbtn.setForeground(Color.yellow);
			}
			public void mouseExited(MouseEvent e) {
				lblEdubackbtn.setForeground(Color.white);
			}
		});
		
		lblEdubackbtn.setForeground(Color.WHITE);
		lblEdubackbtn.setFont(new Font("Poppins", Font.PLAIN, 18));
		lblEdubackbtn.setBounds(598, 53, 45, 18);
		contentPane.add(lblEdubackbtn);
		
//================================================================================================		
		
		//Educational Attainment Text
		JLabel lblEduAttaintxt = new JLabel(ins.eduAttain);
		lblEduAttaintxt.setHorizontalAlignment(SwingConstants.LEFT);
		lblEduAttaintxt.setForeground(Color.WHITE);
		lblEduAttaintxt.setFont(new Font("Poppins ExtraBold", Font.PLAIN, 35));
		lblEduAttaintxt.setBounds(25, 40, 496, 45);
		contentPane.add(lblEduAttaintxt);
		
		//Primary Text
		JLabel lblPrimary = new JLabel(ins.primary);
		lblPrimary.setFont(new Font("Poppins", Font.BOLD, 30));
		lblPrimary.setHorizontalAlignment(SwingConstants.LEFT);
		lblPrimary.setBounds(69, 454, 140, 27);
		contentPane.add(lblPrimary);
		
		//Secondary Text
		JLabel lblSecondary = new JLabel(ins.secondary);
		lblSecondary.setHorizontalAlignment(SwingConstants.LEFT);
		lblSecondary.setFont(new Font("Poppins", Font.BOLD, 30));
		lblSecondary.setBounds(69, 295, 194, 27);
		contentPane.add(lblSecondary);
		
		//Tertiary Text
		JLabel lblTertiary = new JLabel(ins.tertiary);
		lblTertiary.setHorizontalAlignment(SwingConstants.LEFT);
		lblTertiary.setFont(new Font("Poppins", Font.BOLD, 30));
		lblTertiary.setBounds(69, 140, 149, 27);
		contentPane.add(lblTertiary);
		
		//T. Alonzo Text
		JLabel lblTAlonzo = new JLabel(ins.taes);
		lblTAlonzo.setFont(new Font("Poppins Medium", Font.PLAIN, 15));
		lblTAlonzo.setHorizontalAlignment(SwingConstants.LEFT);
		lblTAlonzo.setBounds(54, 522, 268, 13);
		contentPane.add(lblTAlonzo);
		
		// 2015-2016 Text
		JLabel lbl2015 = new JLabel(ins.fifteen);
		lbl2015.setHorizontalAlignment(SwingConstants.LEFT);
		lbl2015.setFont(new Font("Poppins Medium", Font.PLAIN, 15));
		lbl2015.setBounds(54, 560, 268, 13);
		contentPane.add(lbl2015);
		
		//Laurel Text
		JLabel lblLaurel = new JLabel(ins.jplshs);
		lblLaurel.setHorizontalAlignment(SwingConstants.LEFT);
		lblLaurel.setFont(new Font("Poppins Medium", Font.PLAIN, 15));
		lblLaurel.setBounds(54, 351, 268, 13);
		contentPane.add(lblLaurel);
		
		//JCA Text
		JLabel lblJCA = new JLabel(ins.jca);
		lblJCA.setHorizontalAlignment(SwingConstants.LEFT);
		lblJCA.setFont(new Font("Poppins Medium", Font.PLAIN, 15));
		lblJCA.setBounds(54, 371, 268, 13);
		contentPane.add(lblJCA);
		
		//2019-2020 Junior High School Year Text
		JLabel lbl2019 = new JLabel(ins.nineteen);
		lbl2019.setHorizontalAlignment(SwingConstants.LEFT);
		lbl2019.setFont(new Font("Poppins Medium", Font.PLAIN, 15));
		lbl2019.setBounds(54, 395, 268, 13);
		contentPane.add(lbl2019);
		
		//2021-2022 Senior High School Year Text
		JLabel lbl2021 = new JLabel(ins.twentyone);
		lbl2021.setHorizontalAlignment(SwingConstants.LEFT);
		lbl2021.setFont(new Font("Poppins Medium", Font.PLAIN, 15));
		lbl2021.setBounds(54, 415, 268, 13);
		contentPane.add(lbl2021);
		
		//National University Text
		JLabel lblNU = new JLabel(ins.nu);
		lblNU.setHorizontalAlignment(SwingConstants.LEFT);
		lblNU.setFont(new Font("Poppins Medium", Font.PLAIN, 15));
		lblNU.setBounds(54, 209, 268, 13);
		contentPane.add(lblNU);
		
		//2022-present Text
		JLabel lbl2022 = new JLabel(ins.twentytwo);
		lbl2022.setHorizontalAlignment(SwingConstants.LEFT);
		lbl2022.setFont(new Font("Poppins Medium", Font.PLAIN, 15));
		lbl2022.setBounds(54, 249, 268, 13);
		contentPane.add(lbl2022);
		
//================================================================================================
		
		//Educational Attainment Background Image
		JLabel lblEducationalAttainmentPage = new JLabel("Educational Attainment");
		lblEducationalAttainmentPage.setIcon(new ImageIcon(educational_AttainmentInterface.class.getResource("/Image/Educational Attainment.png")));
		lblEducationalAttainmentPage.setBounds(0, 0, 700, 623);
		contentPane.add(lblEducationalAttainmentPage);
	}

}
