package pe.edu.upeu.daoimp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.dao.Detalle_pedidoDao;
@Repository
public class Detalle_pedidoDaoImp implements Detalle_pedidoDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		String sql ="select * from detalle_pedido";
		return jdbcTemplate.queryForList(sql);
	}

}
