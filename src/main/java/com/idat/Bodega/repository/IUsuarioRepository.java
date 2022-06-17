package com.idat.Bodega.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.idat.Bodega.model.Usuario;



public interface IUsuarioRepository extends JpaRepository<Usuario, Integer>{

	Usuario findByUsuario(String usuario);
}
