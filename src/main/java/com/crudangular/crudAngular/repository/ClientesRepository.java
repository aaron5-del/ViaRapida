/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.crudangular.crudAngular.repository;

import com.crudangular.crudAngular.model.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author macbookair
 */
public interface ClientesRepository extends JpaRepository <Clientes, Long>{
    
}