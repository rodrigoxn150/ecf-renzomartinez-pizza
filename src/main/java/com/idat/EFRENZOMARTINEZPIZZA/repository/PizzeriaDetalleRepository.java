package com.idat.EFRENZOMARTINEZPIZZA.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.idat.EFRENZOMARTINEZPIZZA.dto.Pizzeria;
import com.idat.EFRENZOMARTINEZPIZZA.entity.PizzeriaDetalle;



public interface PizzeriaDetalleRepository extends JpaRepository<PizzeriaDetalle, Integer>{

	void save(Pizzeria pizzeria);

}
