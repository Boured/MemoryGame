//Begin code for first window after challenge dialog.

//Import needed Libraries
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class window1{
	
	//Set Private variables used only in this method.
	private JFrame window1Frame;
	private JLabel window1Label;
	private JTextField window1AnswerBox;
	private JButton window1AnswerCheck;
	
	//Call the window1Build function and then display it to the user.
	public window1(){
		window1Build();

		window1Frame.setVisible(true);
	
	}//End of window1 Function.
	
	//Window Construstor
	private void window1Build(){
		
		//Creates Frame and Frame type.
		window1Frame = new JFrame();
		window1Frame.setSize(600,400);
		window1Frame.setTitle("Word 1");
		window1Frame.setDefaultCloseOperation(window1Frame.EXIT_ON_CLOSE);
		window1Frame.setLayout(new FlowLayout());
		
		//Set Frame properties.
		window1Label = new JLabel("Word 1:");

		window1AnswerBox = new JTextField(4);

		window1AnswerCheck = new JButton("Check");


		//Add Properties to Frame.
		window1Frame.add(window1Label);
		window1Frame.add(window1AnswerBox);
		window1Frame.add(window1AnswerCheck);
		
		window1AnswerCheck.addActionListener(new answerChecker1());

	}//End of window1Build Function
	
	private class answerChecker1 implements ActionListener{
		
		public void actionPerformed(ActionEvent e){

			if(window1AnswerBox.getText().equals("Meme")){
				JOptionPane.showMessageDialog(null, "CORRECT!");
				window2 w2 = new window2();
				window1Frame.setVisible(false);
			}
			else if(window1AnswerBox.getText().equals("")){
				JOptionPane.showMessageDialog(null, "NOTHING WAS ENTERED! TRY AGAIN!");
			}
			else{
				JOptionPane.showMessageDialog(null, "INCORRECT: YOU FAILED, PLEASE TRY AGAIN!");
				window1Frame.dispatchEvent(new WindowEvent(window1Frame, WindowEvent.WINDOW_CLOSING));
			}

		}
	}
}//End of Method
