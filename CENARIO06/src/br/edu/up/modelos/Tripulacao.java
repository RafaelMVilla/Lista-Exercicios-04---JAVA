package br.edu.up.modelos;

public class Tripulacao extends Pessoa{

    private String identificacaoAeronautica;
    private String matriculaFuncionario;

    
    public Tripulacao() {
    }

    
    public String getIdentificacaoAeronautica() {
        return identificacaoAeronautica;
    }
    public void setIdentificacaoAeronautica(String identificacaoAeronautica) {
        this.identificacaoAeronautica = identificacaoAeronautica;
    }
    public String getMatriculaFuncionario() {
        return matriculaFuncionario;
    }
    public void setMatriculaFuncionario(String matriculaFuncionario) {
        this.matriculaFuncionario = matriculaFuncionario;
    }


    
}
