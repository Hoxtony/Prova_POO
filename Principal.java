//9. Escreva uma classe chamada Principal. A classe Principal faz o seguinte:

//9.1 Define o método main.

//9.2 No método main, instancia uma vacina de lote igual a 53, descrição igual a "vacina covid-19" e fabricante "Pfizer".

//9.3 No método main, instancia uma profissional de saúde chamada Maria, de idade igual a 27 e matricula igual a 11223344



public class Principal {

    public static void main (String[]args){

        Vacinas vacina = new Vacinas();
        ProfissionalDeSaude profisional = new ProfissionalDeSaude(null, 0, 0);
        Paciente paciente = new Paciente();

        vacina.setLote (53);
        vacina.setDescricao("vacina covid-19");
        vacina.setFabricante("Pfizer");

        profisional.setNome("Maria");
        profisional.setIdade(27);
        profisional.setmatricula(11223344);

        paciente.setNome("Joao");
        paciente.setIdade(43);

        profisional.Aplicar(paciente, vacina);
        }

}
