package Models;

import java.util.Calendar;

import org.springframework.format.annotation.DateTimeFormat;

public class Livro {
	private int id;
	private String titulo;
	private String autor;
	private String editora;
	private int edicao;
	@DateTimeFormat(pattern="dd/MM/yyyy")
	private Calendar anoPublicacao;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "livro [titulo=" + titulo + ", autor=" + autor + ", editora=" + editora + ", edicao=" + edicao
				+ ", anoPublicacao=" + anoPublicacao + "]";
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public int getEdicao() {
		return edicao;
	}

	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}

	public Calendar getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setAnoPublicacao(Calendar anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}
}


