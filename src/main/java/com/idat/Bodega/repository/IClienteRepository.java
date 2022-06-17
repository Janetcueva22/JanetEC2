package com.idat.Bodega.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.idat.Bodega.model.Cliente;



public interface IClienteRepository extends JpaRepository<Cliente, Integer>{

}
