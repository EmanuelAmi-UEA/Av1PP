public class Aluno{
  private String nome;
  private String matricula;
  private String email;

  public Aluno(String nome, String matricula, String email){
    this.nome = nome;
    this.matricula = matricula;
    this.email = email;
  }

  /////////////// Metodos getters e setters ///////////////////
  public String getNome(){
    return this.nome;
  }
  public String getMatricula(){
    return this.matricula;
  }
  public String getEmail(){
    return this.email;
  }
  public void setNome(String nome){
    this.nome = nome;
  }
  public void setMatricula(String matricula){
    this.matricula = matricula;
  }
  public void setEmail(String email){
    this.email = email;
  }
}
