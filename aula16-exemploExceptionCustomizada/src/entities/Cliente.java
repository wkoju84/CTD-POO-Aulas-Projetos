package entities;

import entities.exception.ClienteException;

public class Cliente {

    private String nome;
    private String sobrenome;
    private String rg;
    private double saldoEmConta;
    private double limite;
    private double divida;
    //deixar zerado saldo e divida para cliente iniciar sem saldo e sem divida
    public Cliente(String nome, String sobrenome, String rg, double limite) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.rg = rg;
        this.saldoEmConta = 0.0;
        this.limite = limite;
        this.divida = 0.0;
    }
    //apenas o get
    public double getSaldoEmConta() {
        return saldoEmConta;
    }

    public double getLimite() {
        return limite;
    }

    public double getDivida() {
        return divida;
    }

    //métodos da minha conta

    //aumenta quando deposita
    public void depositar(double valor) throws ClienteException {
        if (valor <= 0) {
            throw new ClienteException("Valor inválido para depósito.");
        } else {
            saldoEmConta += valor;
        }
    }
    //diminui quando compra
    public void comprar(double valor) throws ClienteException{
        if ((saldoEmConta + limite) < valor){
            throw new ClienteException("Saldo insuficiente!");
        }else {
            saldoEmConta -= valor;
        }

    }
    public void contrairDivida(double valor) throws ClienteException{
        if (valor <= 0){
            throw new ClienteException("Digite um valor maior que zero.");
        }else {
            divida += valor;
        }
    }
    public void pagarDivida(double valor) throws ClienteException{
        if (divida <= 0){
            throw new ClienteException("Você não tem dívida!");
        }else {
            divida -= valor;
        }
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", saldoEmConta=" + saldoEmConta +
                '}';
    }
}
