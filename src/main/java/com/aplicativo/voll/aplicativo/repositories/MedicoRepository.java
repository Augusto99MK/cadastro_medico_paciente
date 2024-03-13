package com.aplicativo.voll.aplicativo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aplicativo.voll.entities.Medico;
@Repository
public interface MedicoRepository extends JpaRepository<Medico, Long> {

}
