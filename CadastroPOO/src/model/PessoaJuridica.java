package model;

public class PessoaJuridica extends Pessoa {
    private String cnpj;

    
    public PessoaJuridica() {
        super(); 
    }

    public PessoaJuridica(int id, String nome, String cnpj) {
        super(id, nome); 
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public void exibir() {
        super.exibir(); 
        System.out.println("CNPJ: " + cnpj);
    }

    @Override
    public String toString() {
        return super.toString() + ", CNPJ: " + cnpj;
    }
}
