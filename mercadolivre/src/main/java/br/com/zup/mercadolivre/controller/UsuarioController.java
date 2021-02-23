package br.com.zup.mercadolivre.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.zup.mercadolivre.controller.dto.UsuarioDto;
import br.com.zup.mercadolivre.form.CadastroUsuarioForm;
import br.com.zup.mercadolivre.model.Usuario;
import br.com.zup.mercadolivre.repository.UsuarioRepository;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

	@Autowired
	UsuarioRepository usuarioRepository;
	
	@GetMapping
	public List<UsuarioDto> listar() {
		List<Usuario> usuarios = usuarioRepository.findAll();
		if (usuarios.size() == 0) {
			return null;
		}
		return UsuarioDto.paraUsuario(usuarios);
	}
	
	@PostMapping
	public void cadastrar(@RequestBody @Valid CadastroUsuarioForm form) {
		Usuario usuario = form.paraUsuario();
		usuarioRepository.save(usuario);
	}
	
}
