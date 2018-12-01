//Begin code for first window after challenge dialog.

//Import needed Libraries
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class window3{
	
	//Set Private variables used only in this method.
	private JFrame window3Frame;
	private JLabel window3Label;
	private JTextField window3AnswerBox;
	private JButton window3AnswerCheck;
	
	//Call the window1Build function and then display it to the user.
	public window3(){
		window3Build();

		window3Frame.setVisible(true);
	
	}//End of window1 Function.
	
	//Window Construstor
	private void window3Build(){
		
		//Creates Frame and Frame type.
		window3Frame = new JFrame();
		window3Frame.setSize(600,400);
		window3Frame.setTitle("Word 3");
		window3Frame.setDefaultCloseOperation(window3Frame.EXIT_ON_CLOSE);
		window3Frame.setLayout(new FlowLayout());
		
		//Set Frame properties.
		window3Label = new JLabel("Word 3:");

		window3AnswerBox = new JTextField(12);

		window3AnswerCheck = new JButton("Check");


		//Add Properties to Frame.
		window3Frame.add(window3Label);
		window3Frame.add(window3AnswerBox);
		window3Frame.add(window3AnswerCheck);
		
		window3AnswerCheck.addActionListener(new answerChecker3());

	}//End of window1Build Function
	
	private class answerChecker3 implements ActionListener{
		
		public void actionPerformed(ActionEvent e){

			if(window3AnswerBox.getText().equals("Presumptuous")){
				JOptionPane.showMessageDialog(null, "CORRECT!");
				window4 w4 = new window4();
				window3Frame.setVisible(false);
			}
			else if(window3AnswerBox.getText().equals("")){
				JOptionPane.showMessageDialog(null, "NOTHING WAS ENTERED! TRY AGAIN!");
			}
			else{
				JOptionPane.showMessageDialog(null, "INCORRECT: YOU FAILED, PLEASE TRY AGAIN!");
				window3Frame.dispatchEvent(new WindowEvent(window3Frame, WindowEvent.WINDOW_CLOSING));
			}

		}
	}
}//End of Method
