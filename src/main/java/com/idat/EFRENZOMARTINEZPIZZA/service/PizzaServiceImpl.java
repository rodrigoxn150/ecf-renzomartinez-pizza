package com.idat.EFRENZOMARTINEZPIZZA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.idat.EFRENZOMARTINEZPIZZA.client.OPenFeignPizzeria;
import com.idat.EFRENZOMARTINEZPIZZA.client.OpenFeignCliente;
import com.idat.EFRENZOMARTINEZPIZZA.dto.Cliente;
import com.idat.EFRENZOMARTINEZPIZZA.dto.Pizzeria;
import com.idat.EFRENZOMARTINEZPIZZA.entity.ClienteDetalle;
import com.idat.EFRENZOMARTINEZPIZZA.entity.PizzaClienteFK;
import com.idat.EFRENZOMARTINEZPIZZA.entity.PizzaPizzeriaFK;
import com.idat.EFRENZOMARTINEZPIZZA.entity.PizzeriaDetalle;
import com.idat.EFRENZOMARTINEZPIZZA.repository.ClienteDetalleRepository;
import com.idat.EFRENZOMARTINEZPIZZA.repository.PizzaRepository;
import com.idat.EFRENZOMARTINEZPIZZA.repository.PizzeriaDetalleRepository;


public class PizzaServiceImpl implements PizzaService{

	@Autowired
	private PizzaRepository repositoryPizza;
	
	@Autowired
	private ClienteDetalleRepository repositoryClienteDetalle;
	
	@Autowired
	private PizzeriaDetalleRepository repositoryPizzeriaDetalle;
	
	@Autowired
	private OpenFeignCliente feignCliente;
	
	@Autowired
	private OPenFeignPizzeria feignPizzeria;

	@Override
	public void asignarPizzeriaPizza() {
		List<Pizzeria> listado = feignPizzeria.listaPizzeriaSeleccionados();
		PizzaPizzeriaFK fk = null;
		PizzeriaDetalle detalle = null;

		
		for (Pizzeria pizzeria : listado) {
			
			fk = new PizzaPizzeriaFK();
			fk.setIdPizzeria(pizzeria.getIdPizzeria());
			fk.setIdPizza(1);
			
			detalle = new PizzeriaDetalle();
			detalle.setFk(fk);	
			
			repositoryPizzeriaDetalle.save(detalle);
		}
	}

	@Override
	public void asignarClientePizza() {
		List<Cliente> listado = feignCliente.listaClientesSeleccionados();
		PizzaClienteFK fk = null;
		ClienteDetalle detalle = null;

		
		for (Cliente cliente : listado) {
			
			fk = new PizzaClienteFK();
			fk.setIdCliente(cliente.getIdCliente());
			fk.setIdPizza(1);
			
			detalle = new ClienteDetalle();
			detalle.setFk(fk);	
			
			repositoryClienteDetalle.save(detalle);
		}
	}

	@Override
	public void guardarCliente(Cliente cliente) {
		repositoryClienteDetalle.save(cliente);
	}

	@Override
	public void guardarPizzeria(Pizzeria pizzeria) {
		repositoryPizzeriaDetalle.save(pizzeria);
	}

	

}
