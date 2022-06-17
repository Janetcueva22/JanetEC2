package com.idat.Bodega.service;

import java.util.List;

import com.idat.Bodega.dto.ClienteDTORequest;
import com.idat.Bodega.dto.ClienteDTOResponse;


public interface IClienteService {

	public void guardarCliente(ClienteDTORequest cli);
	
	public void editarCliente(ClienteDTORequest cli);
	
	public void eliminarCliente(Integer id);
	
	public List<ClienteDTOResponse> listarClientes();
	
	public ClienteDTOResponse obtenerCliente(Integer id);
}
