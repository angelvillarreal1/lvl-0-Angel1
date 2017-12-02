import javax.swing.JOptionPane;

public class Horoscope {
	public static void main(String[] args) {

		String sign = JOptionPane.showInputDialog("What is your Zodiac sign?");

		if (sign.equalsIgnoreCase("Aries")) {
			JOptionPane.showMessageDialog(null, "Aries is full of life and possesses high energy");
		} else if (sign.equalsIgnoreCase("Taurus")) {
			JOptionPane.showMessageDialog(null, "Pleasure seeking, loves control, dependable, grounded, provokes slowly, and highly sensual in nature.");
		} else if (sign.equalsIgnoreCase("Gemini")) {
			JOptionPane.showMessageDialog(null, "Cerebral, chatty, loves learning and education, charming, and adventurous.");
		} else if (sign.equalsIgnoreCase("Cancer")) {
			JOptionPane.showMessageDialog(null, "Emotional, group oriented, seeks security, family.");
		} else if (sign.equalsIgnoreCase("Leo")) {
			JOptionPane.showMessageDialog(null, "Generous, organized, protective, beautiful.");
		} else if (sign.equalsIgnoreCase("Virgo")) {
			JOptionPane.showMessageDialog(null, "Particular, logical, practical, sense of duty, critical.");
		} else if (sign.equalsIgnoreCase("Libra")) {
			JOptionPane.showMessageDialog(null, "Balanced, seeks beauty, sense of justice.");
		} else if (sign.equalsIgnoreCase("Scorpio")) {
			JOptionPane.showMessageDialog(null, "Passionate, exacting, loves extremes, combative, reflective.");
		} else if (sign.equalsIgnoreCase("Sagittarius")) {
			JOptionPane.showMessageDialog(null, "Happy, absent minded, creative, adventurous.");
		} else if (sign.equalsIgnoreCase("Capricorn")) {
			JOptionPane.showMessageDialog(null, "Timeless, driven, calculating, ambitious.");
		} else if (sign.equalsIgnoreCase("Aquarius")) {
			JOptionPane.showMessageDialog(null, "orward thinking, communicative, people oriented, stubborn, generous, and dedicated.");
		} else if (sign.equalsIgnoreCase("Pisces")) {
			JOptionPane.showMessageDialog(null, "Likeable, energetic, passionate, sensitive.");
		} else {
			JOptionPane.showMessageDialog(null, "That is not a Zodiac sign!!");
		}

	}
}
