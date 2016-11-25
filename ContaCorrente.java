
public class ContaCorrente {
    private int conta;
    private int agencia;
    private double saldo;
    private String nome;        
    
    public ContaCorrente(){
        
    } 
    public ContaCorrente(int conta, int agencia, double saldo, String nome){
        this.conta=conta; 
        this.agencia=agencia; 
        this.saldo=saldo; 
        this.nome=nome;
    }
    public int getConta(){
        return conta;
    }
    public void setConta(int conta){
        this.conta=conta;
    }
    public int getAagencia(){
        return agencia;
    }
    public void setAgencia(int agencia){
        this.agencia=agencia;
    }
    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double saldo){
        this.saldo =saldo;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public void sfetuarSaque(double valor){
        if(valor>=valor){
            saldo = saldo - valor;
            System.out.println("Saque efetuado com sucesso");
        }
        else
            System.out.println("Saldo insuficiente");
    }
    public void efetuarDeposito(double valor){
        saldo = saldo + valor;
        System.out.println("Deposito efetuado com sucesso");
    }    
    
    @Override
    public String toString(){
        return "ContaCorrente[conta: " + conta + " agencia: " + agencia + " saldo: " + saldo + " nome: " + nome +"]";
        
    }
        
}
