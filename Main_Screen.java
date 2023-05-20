package Number_guess_gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.sound.sampled.*;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.io.*;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextField;

public class Main_Screen extends JFrame {

	private JPanel contentPane;
	public static Main_Screen frame1;
	public JTextField nameplay;
	public Clip clip;
	public static String h;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
				    frame1 = new Main_Screen();
					frame1.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main_Screen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 274, 462);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Number Guessing ");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 26));
		lblNewLabel.setBounds(32, 71, 182, 30);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Game");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 26));
		lblNewLabel_1.setBounds(88, 111, 107, 30);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("START");
		btnNewButton.setBackground(new Color(0, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					 h=nameplay.getText();
					if(h.equals("")) {
						JOptionPane.showMessageDialog(btnNewButton,"Plz Enter Your Name First!!!");
					}
					else {
						Guessing_Game frame = new Guessing_Game();
						frame.setVisible(true);
						frame.kittynum();
						frame1.setVisible(false);
	//audio location in File Class in String
					            File audioclip2=new File("C:\\Users\\Admin\\eclipse-workspace\\Number_guess_swing\\src\\Number_guess_gui\\cyan1.wav"); 
	//audioInputstream to io files
					            AudioInputStream audioInputStream1 = AudioSystem.getAudioInputStream(audioclip2);

	// Get clip
					            clip = AudioSystem.getClip();
					            clip.open(audioInputStream1);
   // Start playing the audio clip
					            clip.start();
   //we want to stop the clip audio use this 					           
					            //clip.stop();
					}
				} catch (Exception s) {
					s.printStackTrace();
				}
			}
		});
		btnNewButton.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 26));
		btnNewButton.setBounds(61, 347, 134, 36);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("Enter Your Full Name");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_3.setBounds(45, 266, 182, 30);
		contentPane.add(lblNewLabel_3);
		
		nameplay = new JTextField();
		nameplay.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 24));
		nameplay.setBounds(61, 307, 134, 30);
		contentPane.add(nameplay);
		nameplay.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\Admin\\Desktop\\background projects\\Black image.jpg"));
		lblNewLabel_5.setBounds(0, 0, 258, 423);
		contentPane.add(lblNewLabel_5);
	}
}
