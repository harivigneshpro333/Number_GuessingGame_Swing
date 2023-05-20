package Number_guess_gui;

import java.awt.Color;
import Number_guess_gui.Main_Screen.*;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Score_Panel extends JFrame {

	private JPanel contentPane;
	public  JLabel player;

	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the frame.
	 */
	public Score_Panel(int Point,String MScore,String no_of_gam) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 262, 448);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel1 = new JLabel("Number Guessing ");
		lblNewLabel1.setForeground(new Color(0, 255, 255));
		lblNewLabel1.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 26));
		lblNewLabel1.setBounds(40, 48, 179, 30);
		contentPane.add(lblNewLabel1);
		
		JLabel lblNewLabel_1 = new JLabel("Game");
		lblNewLabel_1.setForeground(new Color(0, 255, 255));
		lblNewLabel_1.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 26));
		lblNewLabel_1.setBounds(87, 89, 73, 30);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("You Got a Scores :");
		lblNewLabel.setForeground(new Color(0, 255, 255));
		lblNewLabel.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 24));
		lblNewLabel.setBounds(22, 188, 174, 36);
		contentPane.add(lblNewLabel);
		
		JLabel points = new JLabel();
		points.setForeground(new Color(0, 255, 255));
		points.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 20));
		points.setBounds(46, 235, 36, 30);
		String pointsto=Integer.toString(Point);
		points.setText(pointsto);
		contentPane.add(points);
		
		JLabel labelrough = new JLabel("Points For");
		labelrough.setForeground(new Color(0, 255, 255));
		labelrough.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 20));
		labelrough.setBounds(78, 240, 92, 20);
		contentPane.add(labelrough);
		
		JLabel no_game = new JLabel();
		no_game.setForeground(new Color(0, 255, 255));
		no_game.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 20));
		no_game.setBounds(106, 282, 28, 23);
		no_game.setText(no_of_gam);
		contentPane.add(no_game);
		
		JLabel lblNewLabel_2 = new JLabel("Games");
		lblNewLabel_2.setForeground(new Color(0, 255, 255));
		lblNewLabel_2.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_2.setBounds(144, 283, 59, 20);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Exit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 28));
		btnNewButton.setBounds(82, 353, 98, 30);
		contentPane.add(btnNewButton);
		
		JLabel Scoreres = new JLabel();
		Scoreres.setForeground(new Color(0, 255, 255));
		Scoreres.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 24));
		Scoreres.setBounds(193, 195, 36, 22);
		Scoreres.setText(MScore);
		contentPane.add(Scoreres);
		String value=Main_Screen.h;
	    player = new JLabel(value);
		player.setForeground(new Color(0, 255, 255));
		player.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 28));
		player.setBounds(22, 141, 214, 36);
		
		
		contentPane.add(player);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Admin\\Desktop\\background projects\\Black image.jpg"));
		lblNewLabel_3.setBounds(0, 0, 246, 409);
		contentPane.add(lblNewLabel_3);
	}

}
