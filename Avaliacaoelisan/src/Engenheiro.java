/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluno
 */
public class Engenheiro extends fUNCIONARIO{
    
    
    private String crea;

    public Engenheiro() {
    }

    public Engenheiro(String crea) {
        this.crea = crea;
    }

    public String getCrea() {
        return crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
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
              
                "\nIdade " + super.idade
                ;
    }
    
    
    
    
}
