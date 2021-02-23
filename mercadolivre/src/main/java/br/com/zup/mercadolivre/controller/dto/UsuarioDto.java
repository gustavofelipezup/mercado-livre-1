package br.com.zup.mercadolivre.controller.dto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import br.com.zup.mercadolivre.model.Usuario;

public class UsuarioDto {
	
	private Long id;
	private String login;
	private String pass;
	private LocalDateTime dataDeRegistro;
	
	public UsuarioDto(Usuario usuario) {
		this.id = usuario.getId();
		this.login = usuario.getLogin();
		this.pass = usuario.getPass();
		this.dataDeRegistro = usuario.getDataDeRegistro();
	}
	
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setDataDeRegistro(LocalDateTime dataDeRegistro) {
		this.dataDeRegistro = dataDeRegistro;
	}

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

	public LocalDateTime getDataDeRegistro() {
		return dataDeRegistro;
	}


	public static List<UsuarioDto> paraUsuario(List<Usuario> usuarios) {
		return usuarios.stream().map(UsuarioDto::new).collect(Collectors.toList());
	}

}
