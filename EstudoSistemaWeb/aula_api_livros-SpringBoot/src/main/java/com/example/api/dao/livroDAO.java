package com.example.api.dao;

import com.example.api.entity.Livro;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class livroDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public Livro save(Livro c){
        entityManager.persist(c);
        return c;
    }

    public Livro findById(Long id){
        return entityManager.find(Livro.class, id);
    }

    public List<Livro> findAll(){
        return entityManager
                .createQuery("select p from Livro p order by p.id", Livro.class)
                .getResultList();
    }

    public void deleteById(Long id){
        Livro c = findById(id);
        if (c != null) entityManager.remove(c);
    }

    public List<Livro> findByAutor(String autor){
        List<Livro> list = entityManager.createQuery("select p from Livro p where p.autor = :n", Livro.class)
                .setParameter("n", autor).getResultList();
        return list;
    }
}
