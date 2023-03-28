/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluno
 */
public class Advogado extends fUNCIONARIO{
    
    private String oab;

    public Advogado() {
    }

    public Advogado(String oab, String cpf, String rg, String maticula, Setor setor, double salario) {
        super(cpf, rg, maticula, setor, salario);
        this.oab = oab;
    }

    public String getOab() {
        return oab;
    }

    public void setOab(String oab) {
        this.oab = oab;
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
                "\nUf: "  + super.Uf 
                "\nGenero: " + super.genero +
                "\nIdade " + super.idade
                ;
    }

    
    
    
}
