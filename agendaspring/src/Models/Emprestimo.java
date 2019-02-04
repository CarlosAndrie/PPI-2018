package Models;

import java.util.Calendar;

import org.springframework.format.annotation.DateTimeFormat;

public class Emprestimo {
	private Long id; 
	private Aluno matriculaAluno;
	private Livro idLivro;
	private Calendar dataEmprestimo;
	@DateTimeFormat(pattern="dd/MM/yyyy")
	private Calendar dataDevolucao;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Aluno getMatriculaAluno() {
		return matriculaAluno;
	}
	public void setMatriculaAluno(Aluno matriculaAluno) {
		this.matriculaAluno = matriculaAluno;
	}
	public Livro getIdLivro() {
		return idLivro;
	}
	public void setIdLivro(Livro idLivro) {
		this.idLivro = idLivro;
	}
	public Calendar getDataEmprestimo() {
		return dataEmprestimo;
	}
	public void setDataEmprestimo(Calendar dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}
	public Calendar getDataDevolucao() {
		return dataDevolucao;
	}
	public void setDataDevolucao(Calendar dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}
	
	
	
}
	

