package br.com.teste.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.teste.domain.Login;

@Repository
public interface LoginRepository extends JpaRepository<Login, Long> {

}
