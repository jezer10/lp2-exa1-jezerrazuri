package pe.edu.upeu.serviceimp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.dao.Detalle_pedidoDao;
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
	
}
