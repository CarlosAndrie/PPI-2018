package daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import Models.Emprestimo;

public class EmprestimoDAO {
	private Connection connection;

	public EmprestimoDAO() {
		connection = ConnectionFactory.getConnection();
	}

	public boolean inserir(Emprestimo emprestimo) {

		String sql = "insert into emprestimo (matriculaAluno, idLivro, dataEmprestimo, dataDevolucao) values (?, ?, ?, ?);";

		try {
			PreparedStatement stmt = connection.prepareStatement(sql);

			stmt.setLong(1, emprestimo.getMatriculaAluno().getId());
			stmt.setLong(2, emprestimo.getIdLivro().getId());
			stmt.setDate(3, new java.sql.Date(emprestimo.getDataEmprestimo().getTimeInMillis()));
			stmt.setDate(4, new java.sql.Date(emprestimo.getDataDevolucao().getTimeInMillis()));

			stmt.execute();
			stmt.close();

		} catch (SQLException e) {

			e.printStackTrace();
			return false;
		}

		return true;
	}

	public List<Emprestimo> getLista() {
		List<Emprestimo> result = new ArrayList<>();

		try {
			PreparedStatement stmt = this.connection.prepareStatement("select * from emprestimo;");
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				
				Emprestimo emprestimo = new Emprestimo();
				emprestimo.setId(rs.getInt("id"));
				emprestimo.setMatriculaAluno(rs.getInt("matriculaAluno"));
				emprestimo.setIdLivro(rs.getInt("idLIvro"));
				
				Calendar data = Calendar.getInstance();
				data.setTime(rs.getDate("DataEmprestimo"));
				emprestimo.setDataEmprestimo(data);

				Calendar data1 = Calendar.getInstance();
				data.setTime(rs.getDate("DataDevolucao"));
				emprestimo.setDataDevolucao(data1);

				
				result.add(emprestimo);
			}
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return result;
	}
}
