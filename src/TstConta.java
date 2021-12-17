//class teste
public class TstConta {
    private static PessoaJuridica pessoaJuridica = new PessoaJuridica();
    private static PessoaFisica pessoaFisica = new PessoaFisica();


    public static void main(String[] args) {
        try{
            pessoaJuridica = new PessoaJuridica();
            pessoaFisica = new PessoaFisica();

            pessoaJuridica.setNumeroConta(11);
            pessoaJuridica.setCnpj(1234567810);
            pessoaJuridica.getEndereco().setRua("Beija flor");

            pessoaJuridica.setResponsavel(pessoaFisica);

            pessoaFisica.setCpf(12);
            pessoaFisica.setNome("JOÃO PEREIRA GONÇALVES");

            System.out.println("Numero da conta : " + pessoaJuridica.getNumeroConta());
            pessoaJuridica.validar();
            System.out.println("O CNPJ da empresa: " + pessoaJuridica.getCnpj());
            System.out.println("A rua da empresa é: " + pessoaJuridica.getEndereco().getRua());

            System.out.println("\nO cpf da pessoa responsavel pela conta: " + pessoaJuridica.getResponsavel().getCpf());
            pessoaFisica.verifDoc();

            System.out.println("O nome da pessoa responsavel: " + pessoaJuridica.getResponsavel().getNome());
            pessoaJuridica.verifDoc();

        }catch (NumException ne){
            ne.impMsg();
        }catch (NullPointerException n){

        }
    }
}
