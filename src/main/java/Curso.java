public class Curso{
  private String nome;
  private String cargaHoraria;
  private String ementa;
  private Professor professor;

  public Curso(String nome, String cargaHoraria, String ementa){
    this.nome = nome;
    this.cargaHoraria = cargaHoraria;
    this.ementa = ementa;
    this.professor = null;
  }

  public Professor getProfessor() {
    return this.professor;
  }

  public void setProfessor(Professor professor) {
    this.professor = professor;
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