public final class PessoaFisica extends ClienteBanco{
    private int cpf = 0;


    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }


    @Override
    public void verifDoc() {
        Integer max = 20;
        Integer min = 10;
        if(getCpf() >= min && getCpf() <= max){
            System.out.println("CPF valido");
        }
        else {
            System.out.println("CPF deve estar entre 10 a 20");
        }
    }

    @Override
    public void validar() {

    }
}
