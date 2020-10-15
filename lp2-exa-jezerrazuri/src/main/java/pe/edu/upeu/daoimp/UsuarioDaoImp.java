package pe.edu.upeu.daoimp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.dao.UsuarioDao;
import pe.edu.upeu.entity.Usuario;
@Repository
public class UsuarioDaoImp implements UsuarioDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public Usuario read(String nomuser) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM usuario  where nomuser=?";
		return jdbcTemplate.queryForObject(sql, new Object[] { nomuser }, new BeanPropertyRowMapper<Usuario>(Usuario.class));
	}

}
