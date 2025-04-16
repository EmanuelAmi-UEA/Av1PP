public class Curso{
  private String nome;
  private String cargaHoraria;
  private String ementa;

  public Curso(String nome, String cargaHoraria, String ementa){
    this.nome = nome;
    this.cargaHoraria = cargaHoraria;
    this.ementa = ementa;
  }

  public String getNome(){
    return this.nome;
  }
  public String getCargaHoraria(){
    return this.cargaHoraria;
  }
  public String getEmenta(){
    return this.ementa;
  }
  public void setNome(String nome){
    this.nome = nome;
  }
  public void setCargaHoraria(String cargaHoraria){
    this.cargaHoraria = cargaHoraria;
  }
  public void setEmenta(String ementa){
    this.ementa = ementa;
  }
}