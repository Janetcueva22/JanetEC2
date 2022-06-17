package com.idat.Bodega.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.Bodega.dto.ProductoDTORequest;
import com.idat.Bodega.dto.ProductoDTOResponse;
import com.idat.Bodega.model.Producto;
import com.idat.Bodega.repository.IProductoRepository;


@Service
public class ProductoServiceImpl implements IProductoService{

	@Autowired
	public IProductoRepository repository;

	@Override
	public void guardarProducto(ProductoDTORequest prod) {
		
		Producto p=new Producto();
		p.setIdProducto(prod.getIdProductoDTO());
		p.setProducto(prod.getProductoDTO());
		p.setDescripcion(prod.getDescripcionDTO());
		p.setPrecio(prod.getPrecioDTO());
		p.setStock(prod.getStockDTO());
		
		repository.save(p);
	}

	@Override
	public void editarProducto(ProductoDTORequest prod) {
		Producto p=new Producto();
		p.setIdProducto(prod.getIdProductoDTO());
		p.setProducto(prod.getProductoDTO());
		p.setDescripcion(prod.getDescripcionDTO());
		p.setPrecio(prod.getPrecioDTO());
		p.setStock(prod.getStockDTO());
		
		repository.saveAndFlush(p);
	}

	@Override
	public void eliminarProducto(Integer id) {
		repository.deleteById(id);
	}

	@Override
	public List<ProductoDTOResponse> listarProductos() {
		
		List<ProductoDTOResponse>lista=new ArrayList<ProductoDTOResponse>();
		ProductoDTOResponse p=null;
		
		for (Producto productos : repository.findAll()) {
			p=new ProductoDTOResponse();
			p.setIdProductoDTO(productos.getIdProducto());
			p.setProductoDTO(productos.getProducto());
			p.setDescripcionDTO(productos.getDescripcion());
			p.setPrecioDTO(productos.getPrecio());
			p.setStockDTO(productos.getStock());
			
			lista.add(p);
		}
		
		return lista;
	}

	@Override
	public ProductoDTOResponse obtenerProducto(Integer id) {
		ProductoDTOResponse p=new ProductoDTOResponse();
		Producto producto=repository.findById(id).orElse(null);
		
		p.setIdProductoDTO(producto.getIdProducto());
		p.setProductoDTO(producto.getProducto());
		p.setDescripcionDTO(producto.getDescripcion());
		p.setPrecioDTO(producto.getPrecio());
		p.setStockDTO(producto.getStock());
		
		return p;
	}
}
