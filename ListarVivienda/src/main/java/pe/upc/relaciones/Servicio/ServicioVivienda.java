package pe.upc.relaciones.Servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.upc.relaciones.entidad.Vivienda;
import pe.upc.relaciones.repositorio.RepositorioVivienda;

@RestController
@RequestMapping("/api")
public class ServicioVivienda{
	
	@Autowired
	RepositorioVivienda repositorioVivienda;
	
	@GetMapping("/viviendas")
	public List<Vivienda> obtenerViviendas(){
		return (List<Vivienda>) repositorioVivienda.findAll();
	}
}
