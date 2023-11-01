import java.util.List;
import java.util.ArrayList;

//A implementação do método salvarAluno na classe AlunoDAOImpl

//atua como um Creator, pois cria instâncias da classe Aluno 
//e as retorna após armazená-las na lista de alunos.
// Implementação do DAO de Aluno
public class AlunoDaoImpl implements AlunoDao {
    private List<Aluno> alunos = new ArrayList<>();
    private int nextId = 1;

    @Override
    public Aluno salvarAluno(Aluno aluno) {
        aluno.setId(nextId);
        nextId++;
        alunos.add(aluno);
        return aluno;
    }

    @Override
    public Aluno buscarAluno(int id) {
        for (Aluno aluno : alunos) {
            if (aluno.getId() == id) {
                return aluno;
            }
        }
        return null;
    }

    @Override
    public void deletarAluno(int id) {
        Aluno alunoParaDeletar = null;
        for (Aluno aluno : alunos) {
            if (aluno.getId() == id) {
                alunoParaDeletar = aluno;
                break;
            }
        }
        if (alunoParaDeletar != null) {
            alunos.remove(alunoParaDeletar);
        }
    }
}