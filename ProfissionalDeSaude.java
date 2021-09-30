//5. Escreva uma classe ProfissionalDeSaude que herda de Pessoa. Profissionais de saúde possuem um atributo -
//chamado matricula, também encapsulado e acessível indiretamente.
//6. A classe ProfissionalDeSaude deve definir um construtor que recebe nome, idade e matricula e faz as -
//atribuições corretamente, em particular, utilizando o operador super e o método setter de matrícula.

public class ProfissionalDeSaude extends Pessoa{
    ProfissionalDeSaude(String nome, int idade, int matricula){
        super (nome, idade, matricula);
    }

    @Override
    public String getNome() {
        return super.getNome();
    }
    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }
    @Override
    public int getIdade() {
        return super.getIdade();
    }
    @Override
    public void setIdade(int idade) {
        super.setIdade(idade);
    }
    @Override
    public int getmatricula() {
        return super.getmatricula();
    }
    @Override
    public void setmatricula(int matricula) {
        super.setmatricula(matricula);
    }

    public void Aplicar(Paciente paciente, Vacinas vacina){

        System.out.println("O nome do paciente e:"+ paciente.getNome() + " foi vacinado com: "+ vacina.getFabricante());

    }

}
