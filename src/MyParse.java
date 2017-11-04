import javax.swing.JOptionPane;

public class MyParse {
	public static void main(String[] args) {
		String flour = JOptionPane.showInputDialog("How many cups of flour do you have?");
		int cup = Integer.parseInt(flour);
		if (cup < 2) {
			JOptionPane.showMessageDialog(null, "Go to the store and buy more flour!!!");
		}
		String cookies = JOptionPane.showInputDialog("How many people are you going to give cookies to?");
		int cookie = Integer.parseInt(cookies);
		if (cookie > 30) {
			JOptionPane.showMessageDialog(null, "make two batches of cookies then.");
		}
		String hi= JOptionPane.showInputDialog("how many batches of cookies did you make?");
		int more= Integer.parseInt(hi);
		if(more > 1){
			JOptionPane.showMessageDialog(null, "you are so lucky to have so many friends.");
	    }
	}
}
