package VjezbeDan1;

import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GUIBinary extends JFrame implements ActionListener {

	
	
	private JButton button1 = new JButton("M");
	private JButton button2 = new JButton("V");
	private JButton button3 = new JButton("T");

	public GUIBinary(){
		button1.addActionListener(this);
	    button2.addActionListener(this);
	    button3.addActionListener(this);
	}
	
	
	public static int binarySerachLoop(int[] _array, int _myNumber) {

		int start = 0; // prvi index niz
		int end = _array.length - 1; // zadnji element niza

		while (end >= start) { // sve dok je start manji ili jednak endu radi
								// ovo:
			int middle = (start + end) / 2; // sredina niza je middle
			if (_array[middle] == _myNumber) { // ako je jednak broj odmah ga
												// ispis
				return middle;

			} else if (_array[middle] > _myNumber) { // ako je middle broj veci
														// od mog broja

				end = middle - 1; // onda je krajnji broj middle - 1
			} else if (_array[middle] < _myNumber) {

				start = middle + 1;
			}
		}

		return -1;

	}

	
		@Override
		public void actionPerformed(ActionEvent e) {
			Object src = e.getSource();
			if (src == button1){
				
			} else if (src == button2){
			
			
			} else if (src == button3){
			
			}

		}



	public static void main(String[] args) {
		JPanel content = new JPanel();
		JFrame window = new JFrame("Pogodi broj");

		
//		ButtonHandler handler1 = new ButtonHandler();
//		
//		buttonM.addActionListener(handler1);
//		buttonT.addActionListener(handler1);
//		buttonV.addActionListener(handler1);
//		
//		ispis = new JTextArea(5, 5);
//		ispis.setEditable(false);
//		content.add(buttonV);
//		content.add(buttonM);
//		content.add(buttonT);
//		content.add(ispis);

		window.setContentPane(content);
		window.setSize(200, 200);
		window.setLocation(100, 100);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);

	}

}
