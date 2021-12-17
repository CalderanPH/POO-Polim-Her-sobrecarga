
public abstract class ClienteBanco implements Verifica {
    private int numeroConta = 0;
    private String nome = "";
    private Endereco endereco;


    public ClienteBanco() {
        Endereco endereco = new Endereco();
            this.endereco = endereco;
    }


    public int getNumeroConta() {
        return numeroConta;
    }

    final public void setNumeroConta(int numeroConta) throws NumException {
        if (numeroConta >= 0){
            this.numeroConta = numeroConta;
        } else throw new NumException();
    }


    public String getNome() {
        return nome;
    }

    final public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    final public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public abstract void verifDoc();

}
