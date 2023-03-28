/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluno
 */
public class Medico extends fUNCIONARIO{
    
    private String crm;

    public Medico() {
    }

    public Medico(String crm, String cpf, String rg, String maticula, Setor setor, double salario) {
        super(cpf, rg, maticula, setor, salario);
        this.crm = crm;
    }

    public String getCrm() {
        return crm;
    }

    public Medico(String crm) {
        this.crm = crm;
    }

    

    @Override
    public String toString() {
        return   
                
                 "\ncrm: " + this.crm +
                "\ncpf: " + super.cpf +
                "\nRg " + super.rg +
                "\nMatricula: " + super.maticula +
                "\nSetor: " + super.setor +
                "\nSalario " + super.salario +
                "\nNome: " + super.nome +
                "\ntelefone :" + super.telefone +
                "\nEmail: " + super.email +
                "\nUf: "  + super.Uf +
                "\nGenero: " + super.genero +
                "\nIdade " + super.idade
                ;
                
    }
    
    
    
}

 