package com.idat.EFRENZOMARTINEZPIZZA.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.idat.EFRENZOMARTINEZPIZZA.dto.Cliente;


@FeignClient(name="idat-cliente", url="localhost:8080")
public interface OpenFeignCliente {
	
	@GetMapping("/api/cliente/v1/listar")
	public List<Cliente> listaClientesSeleccionados();
}
