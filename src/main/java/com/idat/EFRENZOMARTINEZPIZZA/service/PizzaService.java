package com.idat.EFRENZOMARTINEZPIZZA.service;

import com.idat.EFRENZOMARTINEZPIZZA.dto.Cliente;
import com.idat.EFRENZOMARTINEZPIZZA.dto.Pizzeria;

public interface PizzaService {
	void guardarCliente(Cliente cliente);
	void guardarPizzeria(Pizzeria pizzeria);
	void asignarPizzeriaPizza();
	void asignarClientePizza();
}
