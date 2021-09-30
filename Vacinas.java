//1. Uma classe que descreve o que é uma vacina. Vacinas têm descrição, lote e fabricante.
//Todos os seus campos devem ser encapsulados e acessíveis indiretamente por outras classes.
//O tipo de cada campo fica a seu critério.
//2. A classe Vacina deve possuir o construtor padrão.
//3. A classe Vacina deve possuir um construtor que recebe valores a serem atribuídos a cada campo e faz as atribuições utilizando os métodos setters.


public class Vacinas {
    private String descricao;
    private int lote;
    private String fabricante;

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setLote(int lote) {
        this.lote = lote;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getLote() {
        return lote;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setInformacoes (String descricao, int lote, String fabricante){
        Vacinas vacina = new Vacinas();
        vacina.setDescricao(descricao);
        vacina.setLote(lote);
        vacina.setFabricante(fabricante);
    }
}
