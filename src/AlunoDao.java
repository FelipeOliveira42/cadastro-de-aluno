// Interface para o DAO de Aluno
public interface AlunoDao {
    Aluno salvarAluno(Aluno aluno);
    Aluno buscarAluno(int id);
    void deletarAluno(int id);
}