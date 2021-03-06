package com.andre.bookstore.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andre.bookstore.domain.Categoria;
import com.andre.bookstore.domain.Livro;
import com.andre.bookstore.repositories.CategoriaRepository;
import com.andre.bookstore.repositories.LivroRepository;

@Service
public class DBservice {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Autowired
	private LivroRepository livroRespository;
	
	public void instanciaBaseDeDados() {
		System.out.println("Passei aqui DBSERVICE");
		
		Categoria cat1 = new Categoria(null, "Informática", "Livros de TI");
		Categoria cat2 = new Categoria(null, "quimica", "Livros de quimica");
		Categoria cat3 = new Categoria(null, "biografia", "Livros de biografia");
		
		Livro l1 = new Livro(null, "Clean Code", "Robert Martin", "Lorem ipsumqeqeqweqweqwe", cat1);
		Livro l2 = new Livro(null, "Quimica", "Escola de Quimica", "qeqqweqweqeqweqweqwe", cat1);
		Livro l3 = new Livro(null, "Minha Biografia", "André", "qweqweqeqweqweqeqew", cat2);
		Livro l4 = new Livro(null, "eletrica já", "escola de eletrica", "qweqweqeqeqeqwe", cat2);
		
		cat1.getLivros().addAll(Arrays.asList(l1,l2));
		cat2.getLivros().addAll(Arrays.asList(l3,l4));
		
		categoriaRepository.saveAll(Arrays.asList(cat1,cat2, cat3));
		livroRespository.saveAll(Arrays.asList(l1, l2, l3, l4));
	}

}
