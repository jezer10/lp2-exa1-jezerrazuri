package pe.edu.upeu.service;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.entity.Usuario;

public interface UsuarioService {
	public Usuario read(String nomuser);
	public List<Map<String, Object>> readAll();

}
