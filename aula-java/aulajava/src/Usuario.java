public class Usuario {
    private long id;
    private String nomeCompleto;
    private String nomeUsuario;
    private String senha;
    private Boolean ativo;
    private String papel;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto){
        this.nomeCompleto = nomeCompleto;
    }

    public String getNomeUsuario(){
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario){
        this.nomeUsuario = nomeUsuario;
    }

    public String getSenha(){
        return senha;
    }

    public void setSenha(String senha){
        this.senha = senha;
    }

    public Boolean getAtivo(){
        return ativo;
    }

    public void setAtivo(Boolean ativo){
        this.ativo = ativo;
    }

    public String getPapel(){
        return papel;
    }

    public void setPapel(String papel){
        this.papel = papel;
    }
}
