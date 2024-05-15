import static org.junit.Assert.*;
import org.junit.Test;



public class LoginScreenTest {

	public static void main(String[] args) {
	}
	
	@Test
	public void testSuccessfulLogin() {
		loginScreen loginScreen = new loginScreen();
		assertTrue(loginScreen.login("john", "password123"));
	}
	
	@Test
	public void testFailedLogin() {
		loginScreen loginScreen = new loginScreen();
		assertFalse(loginScreen.login("john", "wrongpassword"));
	}
	
	@Test
	public void testAddUser() {
		loginScreen loginScreen = new loginScreen();
		loginScreen.addUser("testuser", "testpassword");
		assertTrue(loginScreen.login("testuser", "testpassword"));
	}

}
