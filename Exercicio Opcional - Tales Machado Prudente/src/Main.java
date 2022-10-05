public class Main {
    public static void main(String[] args) {
        //Criando objetos
        Aluno aluno = new Aluno();
        Professor professor = new Professor();

        aluno.setCurso("GES");
        aluno.setMatricula(350);
        aluno.setSenha("123456");
        aluno.fazerLogin(aluno.getLogin(), aluno.getSenha());

        professor.setLogin("Kapa");
        professor.setSenha("123456");
        professor.autenticar("123456");

        aluno.getCurso();
        aluno.getMatricula();

    }
}