package pe.edu.upeu.dao;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.entity.Usuario;

public interface UsuarioDao {
	Usuario read(String nomuser);
	List<Map<String, Object>> readAll();
}
