/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Aluno
 */
public enum UnidadeFederativa {
 ACRE("Acre","AC"),
 ALAGOAS("Alagoas","AL"),
 AMAPA("Amapa", "AP"),
 AMAZONAS("Anazonas","AM"),
 BAHIA("Bahia", "BA"),
 CEARA("Ceara","CE"),
 ESPIRITOSANTO("Espirito Santo","ES"),
 GOIAS("Goaias","GO"), 
 MARANHAO("Maranhao","MA"),
 MATOGROSSO("Mato Grosso","MT"),
 MATOGROSSODOSUL("mato Grosso do Sul","MS"),
 MINASGERAIS("Minas Gerais","MG"),
 PARA("Pará","PA"),
 PARAIBA("Paraiba","PB"),
 PARANA("Parana","PR"),
 PERNAMBUCO("Pernambuco","PE"),
 PIAUI("Piaui","PI"),
 RIODEJANEIRO("Rio de Janeiro"),
 RIOGRANDEDONORTE("Rio Grande do Norte","RN"),
 RIOGRANDEDOSUL("Rio Grande do SUL","RS"),       
 RONDONIA("Rondonia","RO"),
 RORAIMA("Roraima","RR")
 SANTACATARINA("Santa Catarina","SC"),
 SAOPAULO("Sao Paulo","SP"),
 SERGIPE("Sergipe","SE"),
 TOCANTINS("Tocantins","TO"),
 DISTRITOFEDERA("Distrito Federaj","DF");
 
  protected  String nome;
protected    String sigla;

    private UnidadeFederativa() {
    }

    public static UnidadeFederativa getACRE() {
        return ACRE;
    }

    public static UnidadeFederativa getALAGOAS() {
        return ALAGOAS;
    }

    public static UnidadeFederativa getAMAPA() {
        return AMAPA;
    }

    public static UnidadeFederativa getAMAZONAS() {
        return AMAZONAS;
    }

    public static UnidadeFederativa getBAHIA() {
        return BAHIA;
    }

    public static UnidadeFederativa getCEARA() {
        return CEARA;
    }

    public static UnidadeFederativa getESPIRITOSANTO() {
        return ESPIRITOSANTO;
    }

    public static UnidadeFederativa getGOIAS() {
        return GOIAS;
    }

    public static UnidadeFederativa getMARANHAO() {
        return MARANHAO;
    }

    public static UnidadeFederativa getMATOGROSSO() {
        return MATOGROSSO;
    }

    public static UnidadeFederativa getMATOGROSSODOSUL() {
        return MATOGROSSODOSUL;
    }

    public static UnidadeFederativa getMINASGERAIS() {
        return MINASGERAIS;
    }

    public static UnidadeFederativa getPARA() {
        return PARA;
    }

    public static UnidadeFederativa getPARAIBA() {
        return PARAIBA;
    }

    public static UnidadeFederativa getPARANA() {
        return PARANA;
    }

    public static UnidadeFederativa getPERNAMBUCO() {
        return PERNAMBUCO;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }
 
 
 
}
