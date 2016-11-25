import java.util.ArrayList;
import java.util.Scanner;


public class PrincipalContaCorrente {
		    public static void main(String[] args) {
	        ArrayList<ContaCorrente> vetor = new ArrayList<ContaCorrente>();
	        int op;
	        ContaCorrente novo;
	        do{
	            op=menu();
	            switch(op){
	                case 1:
	                    novo = preencher();
	                    vetor.add(novo);
	                   
	                case 2:
	                    imprimir(vetor);
	                    break;
	                            
	            }
	            
	            
	        }while(op!=0);
	        
	    }
	    public static int menu(){
	        Scanner leia = new Scanner(System.in);
	        int opcao;
	        do{
	            System.out.println("0 - Sair");
	            System.out.println("1 - Inserir conta");
	            System.out.println("2 - Imprimir todas as contas");
	            System.out.println("3 - Efetuar saque");
	            System.out.println("4 - Efetuar deposito");
	            opcao = leia.nextInt(); 
	            if(opcao<0 || opcao>4)
	                System.out.println("Opcao invalida");
	        }while(opcao<0 || opcao>4);
	        return opcao;
	            
	    }

	    public static ContaCorrente preencher() {
	        Scanner leia = new Scanner(System.in);
	        ContaCorrente x = new ContaCorrente();
	        
	        System.out.println("Digite o numero da conta");
	        x.setConta(leia.nextInt());
	        
	        System.out.println("Digite o numero da agencia");
	        x.setAgencia(leia.nextInt()); 
	        
	        System.out.println("Digite o saldo da conta");
	        x.setSaldo(leia.nextDouble());        
	        
	        System.out.println("Digite o nome do cliente");
	        x.setNome(leia.next());        
	        
	        return x;
	    }

	    public static void imprimir(ArrayList<ContaCorrente> vetor) {
	        for (int i = 0; i <vetor.size(); i++) {
	            System.out.println(vetor.get(i).toString());
	        }
	    }
	    	

}
