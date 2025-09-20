public class Usuario {
    long id;
    private String nomeCompleto;
    private String nomeUsuario;
    private String senha;
    private Boolean ativo;
    private String papel; 
}
public long getId() {
    return id;
}
public void setId(long id) {
    this.id = id;
}
public String getnomeCompleto() {
    return nomeCompleto;
}
public void setnomeCompleto(String nomeCompleto){
    this.nomeCompleto = nomeCompleto;
}
public String getnomeUsuario(){
    return nomeUsuario;
}
public void setnomeUsuario(String nomeUsuario){
    this.nomeUsuario = nomeUsuario;
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
