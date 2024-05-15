import java.util.HashMap;
import java.util.Map;

/**
 * Uma classe para autenticação de login, simulando um database de login criado.
 */
public class loginScreen {
	
	private Map<String, String> userDatabase;

	/**
	 * Classe construtora para a classe de login inicializando um usuário no database.
	 * Cria dois logins para o teste.
	 */
	public loginScreen(){//String[] args
		userDatabase = new HashMap<>();
		userDatabase.put("john", "password123");
		userDatabase.put("alice", "securepass");
	}

	/**
	 *	Classe para autenticar o login baseado no usuário e na senha.
	 * 
	 * @param username O usuário que está tentando logar no sistema.
	 * @param password A senha para acesso do usuário.
	 * @return {@code true} se a autenticação tem sucesso, {@code false} caso contrário.
	 */
	public boolean login(String username, String password) {
		if(userDatabase.containsKey(username)) {
			String storedPassword = userDatabase.get(username);
			if (storedPassword.equals(password)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Método para criar um usuário com base no login e na senha. Por favor note que
	 * esse método não é recomendado para uma aplicação em ambiente de produção
	 * visto que não tem as devidas medidas de segurança.
	 * 
	 * @param username O novo usuário.
	 * @param password A senha do novo usuário. 
	 */
	public void addUser(String username, String password) {
		userDatabase.put(username, password);
	}

}
