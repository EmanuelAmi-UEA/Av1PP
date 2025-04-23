import java.util.ArrayList;
import java.util.List;

public class Assessment {
    private String tipo;
    private double notaMaxima;
    private double peso;
    private Turma turma;
    private List<Submission> submissions = new ArrayList<Submission>();

    public Assessment(String tipo, double notaMaxima, double peso, Turma turma) {
        this.tipo = tipo;
        this.notaMaxima = notaMaxima;
        this.peso = peso;
        this.turma = turma;
    }

    public String getTipo() { 
        return this.tipo; 
    }
    public double getNotaMaxima() { 
        return this.notaMaxima; 
    }
    public double getPeso() { 
        return this.peso; 
    }
    public Turma getTurma() { 
        return this.turma; 
    }
    public List<Submission> getSubmissions() { 
        return this.submissions; 
    }
    public void addSubmission(Submission submission) {
        submissions.add(submission);
    }
}
