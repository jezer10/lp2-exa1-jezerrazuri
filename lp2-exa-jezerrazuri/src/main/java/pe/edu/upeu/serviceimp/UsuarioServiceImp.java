package pe.edu.upeu.serviceimp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.dao.UsuarioDao;
import pe.edu.upeu.entity.Usuario;
import pe.edu.upeu.service.UsuarioService;

@Service
public class UsuarioServiceImp implements UsuarioService {
	@Autowired
	private UsuarioDao usuarioDao;

	@Override
	public Usuario read(String nomuser) {
		// TODO Auto-generated method stub
		return usuarioDao.read(nomuser);
	}

}
