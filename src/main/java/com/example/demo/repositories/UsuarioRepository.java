package com.example.demo.repositories;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.UsuarioModel;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long>{


	@Query(nativeQuery=true, value="SELECT *FROM USUARIOS WHERE NOMBRE LIKE %?1%")
	public abstract ArrayList<UsuarioModel> findByNombre(String nombre);

}
