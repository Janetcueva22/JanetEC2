package com.idat.Bodega.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.idat.Bodega.model.Producto;



public interface IProductoRepository extends JpaRepository<Producto, Integer>{

}
