//Ex 6.1
import javax.swing.JOptionPane;
public class choosingOption {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		int option = JOptionPane.showConfirmDialog(null, "Do you want to change to the first class ticket?");
		JOptionPane.showMessageDialog(null, "You've chosen: " + (option == JOptionPane.YES_OPTION?"YES":"NO"));
		System.exit(0);
	}
}
