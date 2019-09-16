package W2L6Assignment.problem2;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameRainbowColors {
	public static void main(String[] args) {

	JFrame frame = new JFrame("Rainbow Color Frame");
	frame.setSize(550,200);
	frame.setLocation(500, 400);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	frame.setLayout(new FlowLayout(FlowLayout.LEFT));
	
	JButton btnRed = new JButton();
	btnRed.setPreferredSize(new Dimension(60, 60));
	btnRed.setBackground(Color.RED);
	frame.add(btnRed);
	
	JButton btnOrange = new JButton();
	btnOrange.setPreferredSize(new Dimension(60, 60));
	btnOrange.setBackground(Color.ORANGE);
	frame.add(btnOrange);
	
	JButton btnGreen = new JButton();
	btnGreen.setPreferredSize(new Dimension(60, 60));
	btnGreen.setBackground(Color.GREEN);
	frame.add(btnGreen);

	JButton btnBlue = new JButton();
	btnBlue.setPreferredSize(new Dimension(60, 60));
	btnBlue.setBackground(Color.BLUE);
	frame.add(btnBlue);
	
	JButton btnYellow = new JButton();
	btnYellow.setPreferredSize(new Dimension(60, 60));
	btnYellow.setBackground(Color.YELLOW);
	frame.add(btnYellow);
	
	JButton btnIndigo = new JButton();
	btnIndigo.setPreferredSize(new Dimension(60, 60));
	btnIndigo.setBackground(new Color(75, 0, 130));
	frame.add(btnIndigo);
	
	JButton btnViolet = new JButton();
	btnViolet.setPreferredSize(new Dimension(60, 60));
	btnViolet.setBackground(new Color(138, 43, 226));
	frame.add(btnViolet);
	
	btnRed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Red signifies passion, vitality,enthusiasm and security", "Color Meaning", JOptionPane.INFORMATION_MESSAGE);
				}
			});
	
	btnOrange.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, " It is a dynamic colorrepresenting creativity, practicality, playfulness as well as equilibrium or control", "Color Meaning",JOptionPane.INFORMATION_MESSAGE);
				}
			});
	
	
	btnGreen.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "denotes fertility, growth,balance, health and wealth", "Color Meaning", JOptionPane.INFORMATION_MESSAGE);
			}
		});
	
		btnBlue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Spirituality and Divinity", "ColorMeaning", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
		btnYellow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "It represents clarity of thought,wisdom, orderliness and energy", "Color Meaning", JOptionPane.INFORMATION_MESSAGE);
			}
		});

	
		btnIndigo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "used for spiritual attainment,psychic abilities, self awareness and enhancement ofIntuition", "Color Meaning",JOptionPane.INFORMATION_MESSAGE);
			}
		});

		btnViolet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Dark tones of violet areassociated with sorrow. Deeper shades of violet or purple denote high spiritual mastery", "ColorMeaning", JOptionPane.INFORMATION_MESSAGE);
			}
		});

		frame.setVisible(true);
		}
	}
