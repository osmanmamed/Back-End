import java.sql.Date;

public class Paciente {

    long id;
    String nome;
    String email;
    String telefone;
    Date dataNascimento;
    String grupoSanguineo;
    String sexo;
    String cep;
    String endereco;
    String cidade;
    String estado;

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
public String getEmail(){
    return email;
}
public void setEmail(String email){
    this.email = email;
}
public String gettelefone(){
    return telefone;
}
public void setTelefone(String telefone){
    this.telefone = telefone;
}
public Date getdataNascimento(){
    return dataNascimento;
}
public void setdataNascimento(Date dataNascimento){
    this.dataNascimento = dataNascimento;
}
public String getgrupoSanguineo(){
    return grupoSanguineo;
}
public void setgrupoSanguineo(String grupoSanguineo){
    this.grupoSanguineo = getgrupoSanguineo;
}
public String getSexo(){
    return sexo;
}
public void setSexo(String sexo){
    this.sexo = sexo;
}
public String getCep(){
    return cep;
}
public void setCep(String cep){
    this.cep = cep;
}
public String getEndereco(){
    return endereco;
}
public void setEndereco(String endereco){
    this.endereco = endereco;
}
public String getCidade(){
    return cidade;
}
public void setCidade(String cidade){
    this.cidade = cidade;
}
public String getestado(){
    return estado;
}
public void setCidade(String cidade){
    this.cidade = cidade;
}