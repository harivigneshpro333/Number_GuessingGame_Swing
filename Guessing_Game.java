package Number_guess_gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class Guessing_Game extends JFrame {

	private JPanel contentPane;
	private JTextField Guess_no;
	public JLabel Games;
	public int Game;
	public int  compu;
	public int comp;
	public JLabel viewwer;
	public int scores;
	public int Points;
	public String sco;
	public String no_of;
	

	/**
	 * Launch the application.
	 */
	/**
	 * Create the frame.
	 */
	public Guessing_Game() {
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 283, 499);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		scores=0;
		Game=1;
		Points=0;
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Guess  The   Number");
		lblNewLabel.setForeground(new Color(0, 255, 255));
		lblNewLabel.setFont(new Font("Monotype Corsiva", Font.BOLD, 26));
		lblNewLabel.setBounds(36, 45, 206, 41);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Between 1 to 100");
		lblNewLabel_1.setForeground(new Color(0, 255, 255));
		lblNewLabel_1.setFont(new Font("Monotype Corsiva", Font.BOLD, 26));
		lblNewLabel_1.setBounds(46, 82, 185, 41);
		contentPane.add(lblNewLabel_1);
		
		JLabel labelsc = new JLabel("Score:");
		labelsc.setForeground(new Color(0, 255, 255));
		labelsc.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 20));
		labelsc.setBounds(36, 11, 59, 23);
		contentPane.add(labelsc);
		
		JLabel lblNewLabel_3 = new JLabel("Games:");
		lblNewLabel_3.setForeground(new Color(0, 255, 255));
		lblNewLabel_3.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_3.setBounds(161, 11, 70, 22);
		contentPane.add(lblNewLabel_3);
		
		viewwer = new JLabel("             Input a Number");
		viewwer.setForeground(new Color(0, 255, 255));
		viewwer.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 20));
		viewwer.setBounds(0, 261, 269, 50);
		contentPane.add(viewwer);
		
		JLabel score = new JLabel("0");
		score.setForeground(new Color(0, 255, 255));
		score.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 20));
		score.setBounds(93, 13, 46, 23);
		contentPane.add(score);
		String g1=Integer.toString(Game);
		Games = new JLabel(g1);
		Games.setForeground(new Color(0, 255, 255));
		Games.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 20));
		Games.setBounds(228, 15, 46, 19);
		contentPane.add(Games);
		
		Guess_no = new JTextField();
		Guess_no.setBackground(new Color(98, 153, 157));
		Guess_no.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 30));
		Guess_no.setBounds(71, 324, 131, 51);
		contentPane.add(Guess_no);
		Guess_no.setColumns(10);
		
		JButton kitty = new JButton(" \r\n?");
		kitty.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {	
				String con=Guess_no.getText();
			    int guess=Integer.parseInt(con);
				
				while(true) {
					
						if(comp==guess||compu==guess)
						{
							kitty.setText(con);
							Guess_no.setText("");
							viewwer.setText("       😎You'WON'Game😊");
							JOptionPane.showMessageDialog(kitty,"🤞😎😊  🤞😎😊 !wow! You 'WON'The Game Now!!! 🤞😎😊 "+"\n 🤞😎😊 ☞ﾟヮﾟ)☞    😊😍😉😎    ☜(ﾟヮﾟ☜)" );
						    scores++;
						    Points+=20;
						    sco =Integer.toString(scores);
						    score.setText(sco);
							break;
						}
						else if(comp>guess||compu>guess)
						{
							Guess_no.setText("");
							viewwer.setText("Guess "+guess+" Is Too Low...\n Try Again!!!");
							Points-=2;
							break;
						}
						else
						{    Guess_no.setText("");
						     viewwer.setText("Guess "+ guess + " Is Too High...\n Try Again!!!");
						     Points-=2;
						     break;
						}
					}
				}
				catch(Exception d) {System.out.println(d);}
					
				
				
			}
		});
		kitty.setForeground(new Color(0, 0, 0));
		kitty.setBackground(new Color(98, 153, 157));
		kitty.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 48));
		kitty.setBounds(71, 130, 131, 131);
		contentPane.add(kitty);
		
		JButton continuebut = new JButton("Continue");
		continuebut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				comp=kittynum();
				kitty.setText(" \r\n?");
				Guess_no.setText("");
				viewwer.setText("             Input a Number");
				Game++;
				no_of=Integer.toString(Game);
				Games.setText(no_of);
				}
				
				catch(Exception G) {
					System.out.println("continuebut"+G);
				}
				}	
			
		});
		continuebut.setBackground(new Color(98, 153, 157));
		continuebut.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 20));
		continuebut.setBounds(142, 395, 109, 33);
		contentPane.add(continuebut);
		
		JButton endbut = new JButton("EndGame");
		endbut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			        try {
			        	String no_o=Games.getText();
							Score_Panel frame2 = new Score_Panel(Points,sco,no_o);
							frame2.setVisible(true);
							Guessing_Game exi=new Guessing_Game();
							exi.setVisible(false);
							
			        }catch(Exception H) {
			        	
			        	System.out.println("Endbut"+H);
			        	
			        }
			
			}
		});
		endbut.setBackground(new Color(98, 153, 157));
		endbut.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 20));
		endbut.setBounds(10, 395, 115, 33);
		contentPane.add(endbut);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Admin\\Desktop\\background projects\\Black image.jpg"));
		lblNewLabel_2.setBounds(0, 0, 269, 460);
		contentPane.add(lblNewLabel_2);
	
	}

int kittynum() {
	try {	
	compu=(int)(Math.random()*100);
	}
catch(Exception KJ) {
	System.out.println("Kittynum"+KJ);
}	
	return compu;
}

}
