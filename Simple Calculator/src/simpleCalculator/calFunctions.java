package simpleCalculator;

import java.awt.EventQueue;

import javax.swing.UnsupportedLookAndFeelException;

public class calFunctions extends Cal {

	public calFunctions() throws ClassNotFoundException, InstantiationException, IllegalAccessException,
			UnsupportedLookAndFeelException {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cal frame = new Cal();
					frame.setVisible(true);
					frame.setTitle("i Calculator");
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
