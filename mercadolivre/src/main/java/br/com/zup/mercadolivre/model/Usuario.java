package br.com.zup.mercadolivre.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private Long id;
	
	@Email
	@NotEmpty
	@Column(unique = true, nullable = false)
	private String login;
	
	@NotBlank
	@Size(max = 400)
	@Column(nullable = false)
	private String pass;
	
	@Column(nullable = false)
	private LocalDateTime dataDeRegistro = LocalDateTime.now();
	
	public Long getId() {
		return id;
	}
	public String getLogin() {
		return login;
	}
	public String getPass() {
		return pass;
	}
	public LocalDateTime getDataDeRegistro() {
		return dataDeRegistro;
	}
	
	public Usuario() {
		super();
	}
	public Usuario(Long id, @Email @NotEmpty String login, @NotBlank @Size(max = 400) String pass,
			LocalDateTime dataDeRegistro) {
		super();
		this.id = id;
		this.login = login;
		this.pass = pass;
		this.dataDeRegistro = dataDeRegistro;
	}
	public Usuario(@Email @NotEmpty String login, @NotBlank @Size(max = 400) String pass) {
		super();
		this.login = login;
		this.pass = pass;
	}

	
	
	
	
	
	
}
