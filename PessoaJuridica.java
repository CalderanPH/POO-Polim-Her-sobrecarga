public final class PessoaJuridica extends ClienteBanco{
    private int cnpj = 0;
    private PessoaFisica responsavel;



    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public PessoaFisica getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(PessoaFisica responsavel) {
        this.responsavel = responsavel;
    }


    @Override
    public void verifDoc() {
        String soma;

        soma = String.valueOf(getResponsavel().getNome());
        if(soma.length() <= 30) {
            System.out.println("Nome válido");
        }
        else {
            System.out.println("Nome inválido tem que ser menor que 30");
        }
    }

    @Override
    public void validar() {
        if(getNumeroConta() % 2 == 0){
            System.out.println("É par");
        }
        else {
            System.out.println("É ímpar");
        }
    }
}
