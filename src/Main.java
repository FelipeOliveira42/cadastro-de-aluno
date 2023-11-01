public class Main {
    public static void main(String[] args) {
        AlunoDao alunoDao = new AlunoDaoImpl();

        // Crie um aluno
        Aluno aluno1 = new Aluno("João", 20);

        // Salve o aluno
        Aluno alunoSalvo = alunoDao.salvarAluno(aluno1);

        // Busque o aluno pelo ID
        int alunoId = alunoSalvo.getId();
        Aluno alunoRecuperado = alunoDao.buscarAluno(alunoId);

        if (alunoRecuperado != null) {
            System.out.println("Aluno encontrado: " + alunoRecuperado.getNome() + ", Idade: " + alunoRecuperado.getIdade());
        } else {
            System.out.println("Aluno não encontrado.");
        }

        // Deletar o aluno
        alunoDao.deletarAluno(alunoId);
    }
}