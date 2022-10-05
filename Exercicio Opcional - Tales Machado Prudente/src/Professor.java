public class Professor extends Usuario implements Funcionario{
    //Metodo filha
    public void publicarNota(Aluno aluno)
    {
        System.out.printf("Nota de %s publicada.\n", aluno.nome);
    }

    //Metodo mãe
    @Override
    public boolean autenticar(String senha)
    {
        if (senha == this.senha) return true;
        else return false;
    }
}
