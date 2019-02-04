package Models;

import java.util.Calendar;

import org.springframework.format.annotation.DateTimeFormat;

public class Aluno {
	private int id;
	private int matricula;
	private String nome;
	private String cpf;
	private String endereco;
	@DateTimeFormat(pattern="dd/MM/yyyy")
	private Calendar dataNascimento;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "aluno [matricula=" + matricula + ", nome=" + nome + ", cpf=" + cpf + ", endereco=" + endereco
				+ ", dataNascimento=" + dataNascimento + "]";
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
}
