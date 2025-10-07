package com.example.api.Repository;

import com.example.api.entity.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface livroRepository extends JpaRepository <Livro, Long>{

}