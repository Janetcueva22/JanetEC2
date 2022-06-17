package com.idat.Bodega.service;

import java.util.List;

import com.idat.Bodega.dto.ProductoDTORequest;
import com.idat.Bodega.dto.ProductoDTOResponse;

public interface IProductoService {

	public void guardarProducto(ProductoDTORequest prod);
	
	public void editarProducto(ProductoDTORequest prod);
	
	public void eliminarProducto(Integer id);
	
	public List<ProductoDTOResponse> listarProductos();
	
	public ProductoDTOResponse obtenerProducto(Integer id);
}
