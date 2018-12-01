//Begin code for first window after challenge dialog.

//Import needed Libraries
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class window4{
	
	//Set Private variables used only in this method.
	private JFrame window4Frame;
	private JLabel window4Label;
	private JTextField window4AnswerBox;
	private JButton window4AnswerCheck;
	
	//Call the window1Build function and then display it to the user.
	public window4(){
		window4Build();

		window4Frame.setVisible(true);
	
	}//End of window4 Function.
	
	//Window Construstor
	private void window4Build(){
		
		//Creates Frame and Frame type.
		window4Frame = new JFrame();
		window4Frame.setSize(600,400);
		window4Frame.setTitle("Word 4");
		window4Frame.setDefaultCloseOperation(window4Frame.EXIT_ON_CLOSE);
		window4Frame.setLayout(new FlowLayout());
		
		//Set Frame properties.
		window4Label = new JLabel("Word 4:");

		window4AnswerBox = new JTextField(34);

		window4AnswerCheck = new JButton("Check");


		//Add Properties to Frame.
		window4Frame.add(window4Label);
		window4Frame.add(window4AnswerBox);
		window4Frame.add(window4AnswerCheck);
		
		window4AnswerCheck.addActionListener(new answerChecker4());

	}//End of window4Build Function
	
	private class answerChecker4 implements ActionListener{
		
		public void actionPerformed(ActionEvent e){

			if(window4AnswerBox.getText().equals("Supercalifragilisticexpialidocious")){
				JOptionPane.showMessageDialog(null, "CORRECT!");
				JOptionPane.showMessageDialog(null, "CONGRATS!\nYOU COMPLETED THE GAME!\nHAVE A GOOD DAY!");
				window4Frame.dispatchEvent(new WindowEvent(window4Frame, WindowEvent.WINDOW_CLOSING));
			}
			else if(window4AnswerBox.getText().equals("")){
				JOptionPane.showMessageDialog(null, "NOTHING WAS ENTERED! TRY AGAIN!");
			}
			else{
				JOptionPane.showMessageDialog(null, "INCORRECT: YOU FAILED, PLEASE TRY AGAIN!");
				window4Frame.dispatchEvent(new WindowEvent(window4Frame, WindowEvent.WINDOW_CLOSING));
			}

		}
	}
}//End of Method
