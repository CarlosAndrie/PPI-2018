package agendaspring.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import Models.Aluno;
import daos.ClienteDAO;



@Controller
public class AlunosController {
	
	@RequestMapping("/alunos/form")
	public String form() {
		System.out.println("Chamou meu método de formulário");
		return "Aluno/FormularioAluno";
	}
	
	@PostMapping("/alunos/adicionar")
	public String adicionar(Aluno aluno) {
		System.out.println("Chamou o método de adicionar");
		System.out.println(aluno);
		ClienteDAO alunoDAO = new ClienteDAO();
		alunoDAO.inserir(aluno);
		return "redirect:listar";
	}
	
	@GetMapping("/alunos/listar")
	public ModelAndView listar() {
		System.out.println("Chamou método de listagem");
		ClienteDAO alunoDAO = new ClienteDAO();
		List<Aluno> lista = alunoDAO.getLista();
		ModelAndView model = new ModelAndView("Aluno/Listar");
		model.addObject("alunos", lista);
		return model;
	}
	@RequestMapping("/alunos/remover")
	public String remover(Aluno alunos) {
		System.out.println("Chamou método remover aluno");
		ClienteDAO dao = new ClienteDAO();
		dao.remover(alunos);
		
		return "redirect:listar";
	}
	

}