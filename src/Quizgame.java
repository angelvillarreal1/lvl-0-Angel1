import javax.swing.JOptionPane;

public class Quizgame {
	public static void main(String[] args) {
		int score=0;
		JOptionPane.showMessageDialog(null, "Welcome to the Random Quiz!" );
		String answer=JOptionPane.showInputDialog("What color is the sky today?");
		if(answer.equalsIgnoreCase("blue")){
			score++;
		}
		answer=JOptionPane.showInputDialog("What is 9 + 10");
		if(answer.equalsIgnoreCase("19")){
		score++;	
		}
		answer=JOptionPane.showInputDialog("What are those shoes?");
		if(answer.equalsIgnoreCase("shoes")){
		score++;	
		}
		answer=JOptionPane.showInputDialog("What color is angel's shirt?");
		if(answer.equalsIgnoreCase("green")){
		score++;	
		}
		answer=JOptionPane.showInputDialog("does angel have a sister or brother?");
		if(answer.equalsIgnoreCase("sister")){
		score++;	
		}
		answer=JOptionPane.showInputDialog("Is angel's sister younger or older?");
		if(answer.equalsIgnoreCase("younger")){
		score++;	
		}
		JOptionPane.showMessageDialog(null, "Your total score is "+score);
	}
}
