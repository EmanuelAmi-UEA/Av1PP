public class Professor  {
  private String nome;
  private String especilidade;
  private String id;

  public Professor(String nome, String especilidade, String id){
    this.nome = nome;
    this.especilidade = especilidade;
    this.id = id;
  }

  public String getNome(){
    return this.nome;
  }
  public String getEspecilidade(){
    return this.especilidade;
  }
  public String getId(){
    return this.id;
  }
  public void setNome(String nome){
    this.nome = nome;
  }
  public void setEspecilidade(String especilidade){
    this.especilidade = especilidade;
  }
  public void setId(String id){
    this.id = id;
  }
  




  
}