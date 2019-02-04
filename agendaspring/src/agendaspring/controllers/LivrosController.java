package agendaspring.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import Models.Aluno;
import Models.Livro;
import daos.LivroDAO;



@Controller
public class LivrosController {
	
	@RequestMapping("/livros/form")
	public String form() {
		System.out.println("Chamou meu método de formulário");
		return "Livro/Formulario";
	}
	
	@PostMapping("/livros/adicionar")
	public String adicionar(Livro livro) {
		System.out.println("Chamou o método de adicionar");
		System.out.println(livro);
		LivroDAO livroDAO = new LivroDAO();
		livroDAO.inserir(livro);
		return "redirect:ListarLivros";
	}
	
	@GetMapping("/livros/ListarLivros")
	public ModelAndView listar() {
		System.out.println("Chamou método de listagem");
		LivroDAO livroDAO = new LivroDAO();
		List<Livro> lista = livroDAO.getLista();
		ModelAndView model = new ModelAndView("Livro/ListarLivros");
		model.addObject("livros", lista);
		return model;
	}
	@RequestMapping("/livros/remover")
	public String remover(Livro livros) {
		System.out.println("Chamou método remover livro");
		LivroDAO dao = new LivroDAO();
		dao.remover(livros);
		
		return "redirect:ListarLivros";
	}
	

}