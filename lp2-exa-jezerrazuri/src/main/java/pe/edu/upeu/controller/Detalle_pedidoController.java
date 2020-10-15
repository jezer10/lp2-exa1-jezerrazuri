package pe.edu.upeu.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.service.Detalle_pedidoService;

@RestController
@RequestMapping("/detalle_pedido")
public class Detalle_pedidoController {
	@Autowired
	private Detalle_pedidoService detalle_pedidoService;
	@GetMapping("/all")
	public List<Map<String, Object>> listar(){
		return detalle_pedidoService.readAll();
	}
}
