
import java.util.ArrayList;

public class Turma{
  private String codigo;
  private String periodo;
  private ArrayList<Aluno> listaDeAlunos;

  public Turma(String codigo, String periodo, ArrayList<Aluno> listaDeAlunos){
    this.codigo = codigo;
    this.periodo = periodo;
    this.listaDeAlunos = listaDeAlunos;
  }

  public String getCodigo(){
    return this.codigo;
  }
  public String getPeriodo(){
    return this.periodo;
  }
  public ArrayList<Aluno> getListaDeAlunos(){
    return this.listaDeAlunos;
  }
  public void setCodigo(String codigo){
    this.codigo = codigo;
  }
  public void setPeriodo(String periodo){
    this.periodo = periodo;
  }
  public void setListaDeAlunos(ArrayList<Aluno> listaDeAlunos){
    this.listaDeAlunos = listaDeAlunos;
  }
  public void adicionarAluno(Aluno aluno){
    this.listaDeAlunos.add(aluno);
  }
  public void removerAluno(Aluno aluno){
    this.listaDeAlunos.remove(aluno);
  }
  
  
}
