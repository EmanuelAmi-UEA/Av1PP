import java.util.ArrayList;


public class Professor  {
  private String nome;
  private String especilidade;
  private String id;
  private ArrayList<Curso> cursos;

  public Professor(String nome, String especilidade, String id){
    this.nome = nome;
    this.especilidade = especilidade;
    this.id = id;
    this.cursos = new ArrayList<Curso>();
  }

  /////////////// Metodos de manipulação de cursos ///////////////////
  public void adicionarCurso(Curso curso) {
    this.cursos.add(curso);
    curso.setProfessor(this);
  }

  public void removerCurso(Curso curso) {
    this.cursos.remove(curso);
    curso.setProfessor(null);
  }
  
  /////////////// Metodos getters e setters ///////////////////
  public ArrayList<Curso> getCursos() {
    return this.cursos;
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