import javax.swing.JOptionPane;

public class PrimeNum {
	public static void main(String[] args) {
		String num = JOptionPane.showInputDialog("Can you say a number?");
		int n = Integer.parseInt(num);
		boolean isPrime = true;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				isPrime = false;
			}
		}
		if(isPrime==false) {
			JOptionPane.showMessageDialog(null, n+" is not prime.");
		}
		else {
			JOptionPane.showMessageDialog(null, n+" is prime.");
		}
	}
}
