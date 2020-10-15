package pe.edu.upeu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.entity.Usuario;
import pe.edu.upeu.service.UsuarioService;


@RestController
@RequestMapping("Usuarios")
public class UsuarioController {
	@Autowired
	private UsuarioService usuarioService;
	@GetMapping("/{id}")
	public Usuario read(@PathVariable String nomuser) {
		return usuarioService.read(nomuser);
	}
}
