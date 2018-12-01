//Begin code for first window after challenge dialog.

//Import needed Libraries
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class window2{
	
	//Set Private variables used only in this method.
	private JFrame window2Frame;
	private JLabel window2Label;
	private JTextField window2AnswerBox;
	private JButton window2AnswerCheck;
	
	//Call the window1Build function and then display it to the user.
	public window2(){
		window2Build();

		window2Frame.setVisible(true);
	
	}//End of window1 Function.
	
	//Window Construstor
	private void window2Build(){
		
		//Creates Frame and Frame type.
		window2Frame = new JFrame();
		window2Frame.setSize(600,400);
		window2Frame.setTitle("Word 2");
		window2Frame.setDefaultCloseOperation(window2Frame.EXIT_ON_CLOSE);
		window2Frame.setLayout(new FlowLayout());
		
		//Set Frame properties.
		window2Label = new JLabel("Word 2:");

		window2AnswerBox = new JTextField(5);

		window2AnswerCheck = new JButton("Check");


		//Add Properties to Frame.
		window2Frame.add(window2Label);
		window2Frame.add(window2AnswerBox);
		window2Frame.add(window2AnswerCheck);
		
		window2AnswerCheck.addActionListener(new answerChecker2());

	}//End of window1Build Function
	
	private class answerChecker2 implements ActionListener{
		
		public void actionPerformed(ActionEvent e){

			if(window2AnswerBox.getText().equals("B O I")){
				JOptionPane.showMessageDialog(null, "CORRECT!");
				window3 w3 = new window3();
				window2Frame.setVisible(false);
			}
			else if(window2AnswerBox.getText().equals("")){
				JOptionPane.showMessageDialog(null, "NOTHING WAS ENTERED! TRY AGAIN!");
			}
			else{
				JOptionPane.showMessageDialog(null, "INCORRECT: YOU FAILED, PLEASE TRY AGAIN!");
				window2Frame.dispatchEvent(new WindowEvent(window2Frame, WindowEvent.WINDOW_CLOSING));
			}

		}
	}
}//End of Method
