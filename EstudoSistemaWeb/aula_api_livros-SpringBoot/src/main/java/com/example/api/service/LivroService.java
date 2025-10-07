package com.example.api.service;

import com.example.api.Repository.livroRepository;
import com.example.api.entity.Livro;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LivroService {

    private EnviarEmailService enviarEmailService;
    private livroRepository livrorepository;

    public LivroService(EnviarEmailService enviarEmailService, livroRepository livrorepository){
        this.enviarEmailService = enviarEmailService;
        this.livrorepository = livrorepository;
    }

    private List<Livro> livros = new ArrayList<>();

    public Livro criarLivro(Livro livro){
        livrorepository.save(livro);
        enviarEmailService.enviarEmail(livro);
        return livro;
    }

    public List<Livro> buscarLivros(){
        return livros;
    }

    public void deletarLivro(long codigo){
        for (Livro livro : livros){
            if(livro.getCodigo() == codigo){
                livros.remove(livro);
            }
        }
    }

}
