/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.boot.repository;

import com.boot.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author yulia
 */
public interface PersonRepository extends JpaRepository <Person, Long> {
    
}
