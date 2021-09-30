//4. Escreva uma classe chamada Pessoa. Pessoas têm nome e idade, ambos encapsulados e acessíveis indiretamente.
//A classe Pessoa define um construtor que recebe valores para atribuir a suas variáveis de instância e o faz por meio dos métodos setters.

public class Pessoa{
    private String nome;
    private int idade;
    private int matricula;

    Pessoa(){
        super();
    }

    Pessoa (String nome, int idade, int matricula){
        this();
        setNome(nome);
        setIdade(idade);
        setmatricula(matricula);
    }


    public void setNome(String nome) {
            this.nome = nome;
        }

    public String getNome() {
            return this.nome;
        }

    public void setIdade(int idade) {
            this.idade = idade;
        }
    public int getIdade() {
            return this.idade;
        }

    public void setmatricula(int matricula) {

            this.matricula = matricula;
        }
    public int getmatricula() {
            return this.matricula;
        }


    public void setInformacoes(String nome, int idade){

        Pessoa pessoa = new  Pessoa ();
        pessoa.setNome(nome);
        pessoa.setIdade(idade);
    }
}

