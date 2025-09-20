public class Convenio {
    long id;
    String nome;
    String razaoSocial;
    String cnpj;
    String representante;
    String email;
    String telefone;
    Boolean ativo;
}

public long getId(){
    return id;
}
public void setId(long id){
    this.id = id;
}
public String getNome(){
    return nome;
}
public void setNome(String nome){
    this.nome = nome;
}
public String getrazaoSocial(){
    return razaoSocial;
}
public void setrazaoSocial(String razaoSocial){
    this.razaoSocial = razaoSocial;
}
public String getCnpj(){
    return cnpj;
}
public void setCnpj(String cnpj){
    this.cnpj = cnpj;
}
public String getRepresentante(){
    return representante;
}
public void setRepresentante(String representante){
    this.representante = representante;
}
public String getEmail(){
    return email;
}
public void setEmail(String email){
    this.email = email;
}
public String getTelefone(){
    return telefone;
}
public void setTelefone(String telefone){
    this.telefone = telefone;
}
public Boolean getAtivo(){
    return ativo;
}
public void setAtivo(String ativo){
    this.ativo = ativo
}
