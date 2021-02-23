package br.com.zup.mercadolivre.form;

import br.com.zup.mercadolivre.model.Usuario;

public class CadastroUsuarioForm {

	private String login;
	private String pass;
	
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	
	public CadastroUsuarioForm(String login, String pass) {
		super();
		this.login = login;
		this.pass = pass;
	}
	
	
	public Usuario paraUsuario() {
		return new Usuario(login, pass);
	}
	
	
}
