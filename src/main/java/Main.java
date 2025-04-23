import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    // Criar Professor
    Professor professor = new Professor("Dr. Silva", "Ciência da Computação", "PROF001");
    Professor professor2 = new Professor("Me. Souza", "Licenciatura da Computação", "PROF002");
    
    // Criar Curso
    Curso curso = new Curso("Programação Java", "60h", "POO, Collections, Exception Handling");
    Curso curso2 = new Curso("Algoritmos e Estruturas de Dados", "60h", "Estruturas de Dados, Algoritmos de Ordenação");
    
    // Associar Professor ao Curso
    professor.adicionarCurso(curso);
    professor2.adicionarCurso(curso2);
    
    // Criar Turmas
    Turma turma1 = new Turma("T1-2023", "2023.1");
    Turma turma2 = new Turma("T2-2023", "2023.1");
    
    // Adicionar Turmas ao Curso
    curso.adicionarTurma(turma1);
    curso2.adicionarTurma(turma2);
    
    // Criar e adicionar alunos à Turma 1
    turma1.adicionarAluno(new Aluno("João Silva", "2023001", "joao@email.com"));
    turma1.adicionarAluno(new Aluno("Maria Santos", "2023002", "maria@email.com"));
    turma1.adicionarAluno(new Aluno("Pedro Costa", "2023003", "pedro@email.com"));
    turma1.adicionarAluno(new Aluno("Ana Oliveira", "2023004", "ana@email.com"));
    turma1.adicionarAluno(new Aluno("Lucas Pereira", "2023005", "lucas@email.com"));
    turma1.adicionarAluno(new Aluno("Carlos Souza", "2023006", "carlos@email.com"));
    turma1.adicionarAluno(new Aluno("Julia Lima", "2023007", "julia@email.com"));
    
    // Criar e adicionar alunos à Turma 2
    turma2.adicionarAluno(new Aluno("Carlos Souza", "2023006", "carlos@email.com"));
    turma2.adicionarAluno(new Aluno("Julia Lima", "2023007", "julia@email.com"));
    turma2.adicionarAluno(new Aluno("Rafael Martins", "2023008", "rafael@email.com"));
    turma2.adicionarAluno(new Aluno("Beatriz Alves", "2023009", "beatriz@email.com"));
    turma2.adicionarAluno(new Aluno("Gabriel Santos", "2023010", "gabriel@email.com"));
    turma2.adicionarAluno(new Aluno("Ana Oliveira", "2023004", "ana@email.com"));
    turma2.adicionarAluno(new Aluno("Lucas Pereira", "2023005", "lucas@email.com"));
    
    
    // criar avaliações
    
    Assessment av1Turma1 = new Assessment("Prova 1", 10.0, 0.4, turma1);
    Assessment av2Turma1 = new Assessment("Prova 2", 10.0, 0.6, turma1);
    Assessment av3Turma1 = new Assessment("prova 3", 10.0, 1.0, turma1);
    Assessment av1Turma2 = new Assessment("Teste", 5.0, 0.3, turma2);
    Assessment av2Turma2 = new Assessment("Trabalho Prático", 10.0, 0.7, turma2);
    Assessment av3Turma2 = new Assessment("Projeto", 10.0, 0.5, turma2);

    // adicionar avaliações
    turma1.adicionarAvaliacao(av1Turma1);
    turma1.adicionarAvaliacao(av2Turma1);
    turma1.adicionarAvaliacao(av3Turma1);
    turma2.adicionarAvaliacao(av1Turma2);
    turma2.adicionarAvaliacao(av2Turma2);
    turma2.adicionarAvaliacao(av3Turma2);
    
    // Exibir informações
    System.out.println("=== INFORMAÇÕES DO PROFESSOR ===");
    System.out.println("Nome: " + professor.getNome());
    System.out.println("Especialidade: " + professor.getEspecilidade());
    System.out.println("ID: " + professor.getId());

    System.out.println("\n=== INFORMAÇÕES DO PROFESSOR ===");
    System.out.println("Nome: " + professor2.getNome());
    System.out.println("Especialidade: " + professor2.getEspecilidade());
    System.out.println("ID: " + professor2.getId());

    System.out.println("\n=== INFORMAÇÕES DO CURSO ===");
    System.out.println("Nome: " + curso.getNome());
    System.out.println("Professor: " + curso.getProfessor().getNome());
    System.out.println("Carga Horária: " + curso.getCargaHoraria());
    System.out.println("Ementa: " + curso.getEmenta());

    System.out.println("\n=== INFORMAÇÕES DO CURSO ===");
    System.out.println("Nome: " + curso2.getNome());
    System.out.println("Professor: " + curso2.getProfessor().getNome());
    System.out.println("Carga Horária: " + curso2.getCargaHoraria());
    System.out.println("Ementa: " + curso2.getEmenta());
    
    // Exibir informações da Turma 1
    System.out.println("\n=== TURMA 1 ===");
    System.out.println("Curso: " + curso.getNome());
    System.out.println("Código: " + turma1.getCodigo());
    System.out.println("Período: " + turma1.getPeriodo());
    System.out.println("Alunos:");
    for (Aluno aluno : turma1.getListaDeAlunos()) {
      System.out.println("- " + aluno.getNome() + " (Matrícula: " + aluno.getMatricula() + ")");
    }
    System.out.println("Avaliações:");
    for (Assessment avaliacao : turma1.getListaDeAvaliacoes()){
      System.out.println("- " + avaliacao.getTipo() + " (Peso: " + avaliacao.getPeso()  + ")");
    }
    
    
    // Exibir informações da Turma 2
    System.out.println("\n=== TURMA 2 ===");
    System.out.println("Curso: " + curso2.getNome());
    System.out.println("Código: " + turma2.getCodigo());
    System.out.println("Período: " + turma2.getPeriodo());
    System.out.println("Alunos:");
    for (Aluno aluno : turma2.getListaDeAlunos()) {
      System.out.println("- " + aluno.getNome() + " (Matrícula: " + aluno.getMatricula() + ")");
    }
    System.out.println("Avaliações:");
    for (Assessment avaliacao : turma2.getListaDeAvaliacoes()){
      System.out.println("- " + avaliacao.getTipo() + " (Peso: " + avaliacao.getPeso()  + ")");
    }
  }
}
