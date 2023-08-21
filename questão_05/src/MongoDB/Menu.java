package MongoDB;

public class Menu {

	public static void main(String[] args) {
		Connection c = new Connection();
		
		c.insert();
		c.show();

	}

}
