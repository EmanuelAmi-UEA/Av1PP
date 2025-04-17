
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    // Criar Professor
    Professor professor = new Professor("Dr. Silva", "Computação", "PROF001");
    
    // Criar Curso
    Curso curso = new Curso("Programação Java", "60h", "POO, Collections, Exception Handling");
    
    // Associar Professor ao Curso
    professor.adicionarCurso(curso);
    
    // Criar Turmas
    Turma turma1 = new Turma("T1-2023", "2023.1");
    Turma turma2 = new Turma("T2-2023", "2023.1");
    
    // Adicionar Turmas ao Curso
    curso.adicionarTurma(turma1);
    curso.adicionarTurma(turma2);
    
    // Criar e adicionar alunos à Turma 1
    turma1.adicionarAluno(new Aluno("João Silva", "2023001", "joao@email.com"));
    turma1.adicionarAluno(new Aluno("Maria Santos", "2023002", "maria@email.com"));
    turma1.adicionarAluno(new Aluno("Pedro Costa", "2023003", "pedro@email.com"));
    turma1.adicionarAluno(new Aluno("Ana Oliveira", "2023004", "ana@email.com"));
    turma1.adicionarAluno(new Aluno("Lucas Pereira", "2023005", "lucas@email.com"));
    
    // Criar e adicionar alunos à Turma 2
    turma2.adicionarAluno(new Aluno("Carlos Souza", "2023006", "carlos@email.com"));
    turma2.adicionarAluno(new Aluno("Julia Lima", "2023007", "julia@email.com"));
    turma2.adicionarAluno(new Aluno("Rafael Martins", "2023008", "rafael@email.com"));
    turma2.adicionarAluno(new Aluno("Beatriz Alves", "2023009", "beatriz@email.com"));
    turma2.adicionarAluno(new Aluno("Gabriel Santos", "2023010", "gabriel@email.com"));
    
    // Exibir informações
    System.out.println("=== INFORMAÇÕES DO PROFESSOR ===");
    System.out.println("Nome: " + professor.getNome());
    System.out.println("Especialidade: " + professor.getEspecilidade());
    System.out.println("ID: " + professor.getId());
    
    System.out.println("\n=== INFORMAÇÕES DO CURSO ===");
    System.out.println("Nome: " + curso.getNome());
    System.out.println("Carga Horária: " + curso.getCargaHoraria());
    System.out.println("Ementa: " + curso.getEmenta());
    
    // Exibir informações da Turma 1
    System.out.println("\n=== TURMA 1 ===");
    System.out.println("Código: " + turma1.getCodigo());
    System.out.println("Período: " + turma1.getPeriodo());
    System.out.println("Alunos:");
    for (Aluno aluno : turma1.getListaDeAlunos()) {
      System.out.println("- " + aluno.getNome() + " (Matrícula: " + aluno.getMatricula() + ")");
    }
    
    // Exibir informações da Turma 2
    System.out.println("\n=== TURMA 2 ===");
    System.out.println("Código: " + turma2.getCodigo());
    System.out.println("Período: " + turma2.getPeriodo());
    System.out.println("Alunos:");
    for (Aluno aluno : turma2.getListaDeAlunos()) {
      System.out.println("- " + aluno.getNome() + " (Matrícula: " + aluno.getMatricula() + ")");
    }
  }
}
