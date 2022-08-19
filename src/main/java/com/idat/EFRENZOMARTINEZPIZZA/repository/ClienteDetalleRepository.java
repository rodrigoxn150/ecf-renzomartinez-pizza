package com.idat.EFRENZOMARTINEZPIZZA.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.idat.EFRENZOMARTINEZPIZZA.dto.Cliente;
import com.idat.EFRENZOMARTINEZPIZZA.entity.ClienteDetalle;


public interface ClienteDetalleRepository extends JpaRepository<ClienteDetalle, Integer>{

	void save(Cliente cliente);

}
