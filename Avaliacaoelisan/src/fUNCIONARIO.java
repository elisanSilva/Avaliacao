/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluno
 */
public class fUNCIONARIO extends Fisica{
    
    
    protected String cpf;
    protected String rg;
     protected String maticula;
     protected Setor setor;
     protected double salario;

    public fUNCIONARIO() {
    }

    public fUNCIONARIO(String cpf, String rg, String maticula, Setor setor, double salario) {
        this.cpf = cpf;
        this.rg = rg;
        this.maticula = maticula;
        this.setor = setor;
        this.salario = salario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getMaticula() {
        return maticula;
    }

    public void setMaticula(String maticula) {
        this.maticula = maticula;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
     
     

}
