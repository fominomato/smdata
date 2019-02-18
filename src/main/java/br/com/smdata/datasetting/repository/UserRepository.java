/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.smdata.datasetting.repository;

/**
 *
 * @author Andre
 */
import br.com.smdata.datasetting.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * User Dao
 * @author Andre
 */
public interface UserRepository extends JpaRepository<User, Long>{
    
	User findById(long id);

}