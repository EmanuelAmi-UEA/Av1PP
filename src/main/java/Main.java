import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // criar scanner  
    Scanner scanner = new Scanner(System.in);

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
    Turma turma1 = new Turma("T1-2025", "2025.1");
    Turma turma2 = new Turma("T2-2025", "2025.1");

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
    turma2.adicionarAluno(new Aluno("Carlos Souza", "2023006", "carlos@email.com")); // repetido
    turma2.adicionarAluno(new Aluno("Julia Lima", "2023007", "julia@email.com")); // repetido
    turma2.adicionarAluno(new Aluno("Rafael Martins", "2023008", "rafael@email.com")); 
    turma2.adicionarAluno(new Aluno("Beatriz Alves", "2023009", "beatriz@email.com")); 
    turma2.adicionarAluno(new Aluno("Gabriel Santos", "2023010", "gabriel@email.com")); 
    turma2.adicionarAluno(new Aluno("Ana Oliveira", "2023004", "ana@email.com")); // repetido
    turma2.adicionarAluno(new Aluno("Lucas Pereira", "2023005", "lucas@email.com")); // repetido


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

    // criar submissions Turma 1
    new Submission(turma1.getListaDeAlunos().get(0), av1Turma1, 8.5, "2025-05-01", "Parabens!");
    turma1.getListaDeAlunos().get(0).addSubmission(new Submission(turma1.getListaDeAlunos().get(0), av2Turma1, 9.0, "2025-05-15", "Parabens!")); 
    turma1.getListaDeAlunos().get(0).addSubmission(new Submission(turma1.getListaDeAlunos().get(0), av3Turma1, 7.5, "2025-05-30", "Parabens!"));
    turma1.getListaDeAlunos().get(1).addSubmission(new Submission(turma1.getListaDeAlunos().get(1), av1Turma1, 6.0, "2025-05-01", "Parabens!"));
    turma1.getListaDeAlunos().get(1).addSubmission(new Submission(turma1.getListaDeAlunos().get(1), av2Turma1, 7.5, "2025-05-15", "Parabens!"));
    turma1.getListaDeAlunos().get(1).addSubmission(new Submission(turma1.getListaDeAlunos().get(1), av3Turma1, 8.0, "2025-05-30", "Parabens!"));
    turma1.getListaDeAlunos().get(2).addSubmission(new Submission(turma1.getListaDeAlunos().get(2), av1Turma1, 9.5, "2025-05-01", "Parabens!"));
    turma1.getListaDeAlunos().get(2).addSubmission(new Submission(turma1.getListaDeAlunos().get(2), av2Turma1, 8.0, "2025-05-15", "Parabens!"));
    turma1.getListaDeAlunos().get(2).addSubmission(new Submission(turma1.getListaDeAlunos().get(2), av3Turma1, 9.0, "2025-05-30", "Parabens!"));
    turma1.getListaDeAlunos().get(3).addSubmission(new Submission(turma1.getListaDeAlunos().get(3), av1Turma1, 7.0, "2025-05-01", "Parabens!"));
    turma1.getListaDeAlunos().get(3).addSubmission(new Submission(turma1.getListaDeAlunos().get(3), av2Turma1, 8.5, "2025-05-15", "Parabens!"));
    turma1.getListaDeAlunos().get(3).addSubmission(new Submission(turma1.getListaDeAlunos().get(3), av3Turma1, 8.5, "2025-05-30", "Parabens!"));
    turma1.getListaDeAlunos().get(4).addSubmission(new Submission(turma1.getListaDeAlunos().get(4), av1Turma1, 8.0, "2025-05-01", "Parabens!"));
    turma1.getListaDeAlunos().get(4).addSubmission(new Submission(turma1.getListaDeAlunos().get(4), av2Turma1, 9.0, "2025-05-15", "Parabens!"));
    turma1.getListaDeAlunos().get(4).addSubmission(new Submission(turma1.getListaDeAlunos().get(4), av3Turma1, 8.0, "2025-05-30", "Parabens!"));

    //criar submissions Turma 2
    turma2.getListaDeAlunos().get(0).addSubmission(new Submission(turma2.getListaDeAlunos().get(0), av1Turma2, 4.5, "2025-05-01", "Parabens!"));
    turma2.getListaDeAlunos().get(0).addSubmission(new Submission(turma2.getListaDeAlunos().get(0), av2Turma2, 9.0, "2025-05-15", "Parabens!"));
    turma2.getListaDeAlunos().get(0).addSubmission(new Submission(turma2.getListaDeAlunos().get(0), av3Turma2, 8.5, "2025-05-30", "Parabens!"));
    turma2.getListaDeAlunos().get(1).addSubmission(new Submission(turma2.getListaDeAlunos().get(1), av1Turma2, 3.0, "2025-05-01", "Parabens!"));
    turma2.getListaDeAlunos().get(1).addSubmission(new Submission(turma2.getListaDeAlunos().get(1), av2Turma2, 7.5, "2025-05-15", "Parabens!"));
    turma2.getListaDeAlunos().get(1).addSubmission(new Submission(turma2.getListaDeAlunos().get(1), av3Turma2, 8.0, "2025-05-30", "Parabens!"));
    turma2.getListaDeAlunos().get(2).addSubmission(new Submission(turma2.getListaDeAlunos().get(2), av1Turma2, 4.5, "2025-05-01", "Parabens!"));
    turma2.getListaDeAlunos().get(2).addSubmission(new Submission(turma2.getListaDeAlunos().get(2), av2Turma2, 8.0, "2025-05-15", "Parabens!"));
    turma2.getListaDeAlunos().get(2).addSubmission(new Submission(turma2.getListaDeAlunos().get(2), av3Turma2, 9.0, "2025-05-30", "Parabens!"));
    turma2.getListaDeAlunos().get(3).addSubmission(new Submission(turma2.getListaDeAlunos().get(3), av1Turma2, 4.0, "2025-05-01", "Parabens!"));
    turma2.getListaDeAlunos().get(3).addSubmission(new Submission(turma2.getListaDeAlunos().get(3), av2Turma2, 8.5, "2025-05-15", "Parabens!"));
    turma2.getListaDeAlunos().get(3).addSubmission(new Submission(turma2.getListaDeAlunos().get(3), av3Turma2, 8.5, "2025-05-30", "Parabens!"));
    turma2.getListaDeAlunos().get(4).addSubmission(new Submission(turma2.getListaDeAlunos().get(4), av1Turma2, 4.0, "2025-05-01", "Parabens!"));
    turma2.getListaDeAlunos().get(4).addSubmission(new Submission(turma2.getListaDeAlunos().get(4), av2Turma2, 9.0, "2025-05-15", "Parabens!"));
    turma2.getListaDeAlunos().get(4).addSubmission(new Submission(turma2.getListaDeAlunos().get(4), av3Turma2, 8.0, "2025-05-30", "Parabens!"));


    ///Escolha de curso usando JOptionPane
        boolean continuar = true;
        while (continuar) {
            String[] opcoes = {curso.getNome(), curso2.getNome(), "Sair"};
            int escolhaCurso = javax.swing.JOptionPane.showOptionDialog(
                null,
                "Escolha um curso:",
                "Menu de Cursos",
                javax.swing.JOptionPane.DEFAULT_OPTION,
                javax.swing.JOptionPane.QUESTION_MESSAGE,
                null,
                opcoes,
                opcoes[0]
            );

            if (escolhaCurso == 2 || escolhaCurso == -1) {
                javax.swing.JOptionPane.showMessageDialog(null, "Programa encerrado.");
                continuar = false;
                continue;
            }
            
            escolhaCurso++; // Ajuste para manter a lógica original (1 ou 2)

            

            if (escolhaCurso == 0) {
                System.out.println("Programa encerrado.");
                continuar = false;
                continue;
            }

            if (escolhaCurso < 1 || escolhaCurso > 2) {
                System.out.println("Curso inválido.");
                continue;
            }

        Curso cursoEscolhido = (escolhaCurso == 1) ? curso : curso2;

        // Menu de opções usando JOptionPane
        String[] opcoesMenu = {
            "Exibir informações dos Professores",
            "Exibir informações das Turmas",
            "Exibir Submissões de uma Turma",
            "Exibir Relatório de Desempenho de um Aluno",
            "Deletar Aluno"
        };
        
        int escolhaMenu = javax.swing.JOptionPane.showOptionDialog(
            null,
            "Escolha uma opção:",
            "Menu Principal",
            javax.swing.JOptionPane.DEFAULT_OPTION,
            javax.swing.JOptionPane.QUESTION_MESSAGE,
            null,
            opcoesMenu,
            opcoesMenu[0]
        ) + 1;

        // Switch para cada opção
        switch (escolhaMenu) {
            case 1:
                // Exibir informações dos professores
                String infoProfessor = "Informações do Professor da turma: " + cursoEscolhido.getNome() + "\n";
                infoProfessor += "Professor: " + cursoEscolhido.getProfessor().getNome();
                javax.swing.JOptionPane.showMessageDialog(null, infoProfessor);
                break;
            case 2:
                // Exibir informações das turmas
                StringBuilder infoTurmas = new StringBuilder();
                infoTurmas.append("=== Informações da Turma ===\n\n");
                infoTurmas.append("Curso: ").append(cursoEscolhido.getNome()).append("\n");
                infoTurmas.append("Professor: ").append(cursoEscolhido.getProfessor().getNome()).append("\n\n");
                
                for (Turma turma : cursoEscolhido.getTurmas()) {
                    infoTurmas.append("Código da Turma: ").append(turma.getCodigo()).append("\n");
                    infoTurmas.append("Período: ").append(turma.getPeriodo()).append("\n\n");
                    infoTurmas.append("=== Lista de Alunos ===\n");
                    for (Aluno aluno : turma.getListaDeAlunos()) {
                        infoTurmas.append("• ").append(aluno.getNome())
                                .append(" (Matrícula: ").append(aluno.getMatricula()).append(")\n");
                    }
                    infoTurmas.append("\n=== Avaliações ===\n");
                    for (Assessment avaliacao : turma.getListaDeAvaliacoes()) {
                        infoTurmas.append("• ").append(avaliacao.getTipo())
                                .append(" (Peso: ").append(avaliacao.getPeso()).append(")\n");
                    }
                }
                
                javax.swing.JTextArea textArea = new javax.swing.JTextArea(infoTurmas.toString());
                textArea.setEditable(false);
                javax.swing.JScrollPane scrollPane = new javax.swing.JScrollPane(textArea);
                scrollPane.setPreferredSize(new java.awt.Dimension(500, 400));
                javax.swing.JOptionPane.showMessageDialog(null, scrollPane, "Informações das Turmas", 
                    javax.swing.JOptionPane.INFORMATION_MESSAGE);
                break;
            case 3:
                // Exibir submissões de uma turma
                StringBuilder infoSubmissoes = new StringBuilder();
                infoSubmissoes.append("=== Submissões da Turma ===\n");
                infoSubmissoes.append("Curso: ").append(cursoEscolhido.getNome()).append("\n\n");
                
                for (Assessment a : cursoEscolhido.getTurmas().get(0).getListaDeAvaliacoes()) {
                    infoSubmissoes.append("Avaliação: ").append(a.getTipo()).append("\n");
                    infoSubmissoes.append("--------------------------------\n");
                    List<Submission> submissions = a.getSubmissions();
                    if (submissions.isEmpty()) {
                        infoSubmissoes.append("Nenhuma submissão registrada.\n");
                    } else {
                        for (Submission s : submissions) {
                            infoSubmissoes.append("• Aluno: ").append(s.getAluno().getNome()).append("\n")
                                    .append("  Nota: ").append(s.getNota()).append("\n")
                                    .append("  Data de Entrega: ").append(s.getDataEntrega()).append("\n")
                                    .append("  Comentários: ").append(s.getComentarios()).append("\n\n");
                        }
                    }
                    infoSubmissoes.append("\n");
                }
                
                javax.swing.JTextArea textArea = new javax.swing.JTextArea(infoSubmissoes.toString());
                textArea.setEditable(false);
                javax.swing.JScrollPane scrollPane = new javax.swing.JScrollPane(textArea);
                scrollPane.setPreferredSize(new java.awt.Dimension(500, 400));
                javax.swing.JOptionPane.showMessageDialog(null, scrollPane, "Submissões da Turma", 
                    javax.swing.JOptionPane.INFORMATION_MESSAGE);
                break;
            case 4:
                String nomeAluno = javax.swing.JOptionPane.showInputDialog("Digite o nome do aluno:");
                if (nomeAluno == null) continue;

                boolean achou = false;
                Turma turmaAtual = cursoEscolhido.getTurmas().get(0);

                for (Aluno aluno : turmaAtual.getListaDeAlunos()) {
                    if (aluno.getNome().equalsIgnoreCase(nomeAluno)) {
                        PerformanceReport relatorio = new PerformanceReport(aluno, turmaAtual);

                        StringBuilder relatorioStr = new StringBuilder();
                        relatorioStr.append("=== Relatório de Desempenho ===\n\n");
                        relatorioStr.append("Aluno: ").append(aluno.getNome()).append("\n");
                        relatorioStr.append("Turma: ").append(turmaAtual.getCodigo()).append("\n\n");
                        relatorioStr.append("=== Notas por Avaliação ===\n");
                        
                        for (Assessment a : turmaAtual.getListaDeAvaliacoes()) {
                            for (Submission s : a.getSubmissions()) {
                                if (s.getAluno().equals(aluno)) {
                                    relatorioStr.append("• ").append(a.getTipo()).append(": ")
                                               .append(s.getNota()).append("/").append(a.getNotaMaxima())
                                               .append(" (Peso: ").append(a.getPeso()).append(")\n");
                                }
                            }
                        }
                        
                        relatorioStr.append("\n=== Resultados Finais ===\n");
                        relatorioStr.append("Média Ponderada: ").append(String.format("%.2f", relatorio.calculateMediaPonderada())).append("\n");
                        relatorioStr.append("Aproveitamento: ").append(String.format("%.2f%%", relatorio.calculaAproveitamento()));
                        
                        javax.swing.JTextArea textArea = new javax.swing.JTextArea(relatorioStr.toString());
                        textArea.setEditable(false);
                        javax.swing.JScrollPane scrollPane = new javax.swing.JScrollPane(textArea);
                        scrollPane.setPreferredSize(new java.awt.Dimension(400, 300));
                        javax.swing.JOptionPane.showMessageDialog(null, scrollPane, "Relatório de Desempenho", 
                            javax.swing.JOptionPane.INFORMATION_MESSAGE);
                        achou = true;
                        break;
                    }
                }

                if (!achou) {
                    System.out.println("Aluno não encontrado ou sem submissões.");
                }
                break;
            case 5:
                String nomeAlunoDeletar = javax.swing.JOptionPane.showInputDialog("Digite o nome do aluno para deletar:");
                if (nomeAlunoDeletar == null) continue;
                for (Turma turma : cursoEscolhido.getTurmas()){
                    for (Aluno aluno : turma.getListaDeAlunos()) {
                        if (aluno.getNome().equalsIgnoreCase(nomeAlunoDeletar)) {
                            aluno.deleteAluno();
                            turma.removerAluno(aluno);
                            System.out.println("Aluno deletado com sucesso.");
                            break;
                        }
                    }
                }
                break;

          default:
              System.out.println("Opção inválida.");
              break;
      }
    }
    scanner.close();
    }
}
  

