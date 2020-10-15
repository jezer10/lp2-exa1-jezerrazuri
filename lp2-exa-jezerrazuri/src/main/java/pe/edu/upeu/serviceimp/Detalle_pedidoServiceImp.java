package pe.edu.upeu.serviceimp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.dao.Detalle_pedidoDao;
import pe.edu.upeu.entity.Detalle_pedido;
import pe.edu.upeu.service.Detalle_pedidoService;
@Service
public class Detalle_pedidoServiceImp implements Detalle_pedidoService{
	@Autowired
	private Detalle_pedidoDao detalle_pedidoDao;
	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return detalle_pedidoDao.readAll();
	}
	@Override
	public int create(Detalle_pedido d) {
		// TODO Auto-generated method stub
		return detalle_pedidoDao.create(d);
	}
	@Override
	public int update(Detalle_pedido d) {
		// TODO Auto-generated method stub
		return detalle_pedidoDao.update(d);
	}
	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return detalle_pedidoDao.delete(id);
	}
	@Override
	public Detalle_pedido read(int id) {
		// TODO Auto-generated method stub
		return detalle_pedidoDao.read(id);
	}
	
}
