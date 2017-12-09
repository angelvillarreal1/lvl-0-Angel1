import javax.swing.JOptionPane;

public class AdventureStory {
	public static void main(String[] args) {

		String a = " Note: answer = a";
		String b = " Note: answer = b";

		JOptionPane.showMessageDialog(null, "My name is Rohan and 2 days ago I started going to Mt. Everest but when I got there I put my flag there and I forgot my way back home");
		JOptionPane.showMessageDialog(null, "Once that happened I tried so hard to find my way back home but I got tired");
		JOptionPane.showMessageDialog(null, "I fell asleep and woke up now and that was the only thing I remember from yesterday.");
		JOptionPane.showMessageDialog(null, "It started snowing a while ago");
		JOptionPane.showMessageDialog(null, "And I only found two ways to get back home.");
		JOptionPane.showMessageDialog(null, "One is that I go down into a cave" + a);
		JOptionPane.showMessageDialog(null, "The other option is that I go down" + b);
		String option1= JOptionPane.showInputDialog("What should I do? (a) or (b)");
		if(option1.equals("a")){
			JOptionPane.showMessageDialog(null, "You stay warm the entire night");
			JOptionPane.showMessageDialog(null, "Now it is not snowing");
			JOptionPane.showMessageDialog(null, "You go outside and its warmer");
			JOptionPane.showMessageDialog(null, "You reach the bottom the Mt. Everest");
			JOptionPane.showMessageDialog(null, "There is a jungle in front of you now");
			JOptionPane.showMessageDialog(null, "There is no other way to go home now");
			JOptionPane.showMessageDialog(null, "You start to feel hot");
			JOptionPane.showMessageDialog(null, "You realize you still have you snow suit");
			JOptionPane.showMessageDialog(null, "One option is that you take it off and have no protection" + a);
			JOptionPane.showMessageDialog(null, "Another option is that you keep it on and ignore your body heat" + b);
			String option2= JOptionPane.showInputDialog("What should I do? (a) or (b)");
			if(option2.equals("a")){
				JOptionPane.showMessageDialog(null, "You are fresh now");
				JOptionPane.showMessageDialog(null, "You find a turantula");
				JOptionPane.showMessageDialog(null, "One option is to kill it" + a);
				JOptionPane.showMessageDialog(null, "Another option is to run the other way" + b);
				String option3= JOptionPane.showInputDialog("What should I do? (a) or (b)");
				if(option3.equals("a")){
					JOptionPane.showMessageDialog(null, "You run to Mt. Everest and freeze");
					JOptionPane.showMessageDialog(null, "GET REKT!!!");
				}if(option3.equals("b")){
					JOptionPane.showMessageDialog(null, "You try to fight it but it kills you");
					JOptionPane.showMessageDialog(null, "GET REKT!!!");
				}
			}else if(option2.equals("b")){
				JOptionPane.showMessageDialog(null, "You feel like you are going to have a heat stroke");
				JOptionPane.showMessageDialog(null, "You run to cool you off");
				JOptionPane.showMessageDialog(null, "You find a trantula");
				JOptionPane.showMessageDialog(null, "It tries to bite you but you have your snow suit");
				JOptionPane.showMessageDialog(null, "You kill it");
				JOptionPane.showMessageDialog(null, "You start to run again");
				JOptionPane.showMessageDialog(null, "You find a village");
				JOptionPane.showMessageDialog(null, "You are saved");
			}
		}if(option1.equals("b")){
			JOptionPane.showMessageDialog(null, "You are cold now");
			JOptionPane.showMessageDialog(null, "Your hands and feet are starting to move slower");
			JOptionPane.showMessageDialog(null, "You freeze to death");
			JOptionPane.showMessageDialog(null, "GET REKT!!!");
		}
	}
}



//shortcuts:
//String option3= JOptionPane.showInputDialog("");
//JOptionPane.showMessageDialog(null, "");
//if(option1.equals("a")){