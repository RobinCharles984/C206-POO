public class Usuario {

    //Atributos
    protected String nome;
    protected String login;
    protected String senha;

    //Metodo
    public void fazerLogin(String login, String senha)
    {
        System.out.printf("Login: %s\n", login);
        System.out.printf("Senha: %s\n", senha);
    }

    //GetSet
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
