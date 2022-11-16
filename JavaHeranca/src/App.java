import java.util.Locale;

import classes.Banco;
import classes.Conta;
import classes.ContaEmpresarial;
import classes.ContaPoupanca;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        
        /*Conta c1 = new Conta(1, "Jorge Washington", 100.00);
        System.out.println(c1);

        ContaEmpresarial c2 = new ContaEmpresarial(2, "Peitro Inacio Enzo",
         17000.00 , 100000.00);
        System.out.println(c2);*/

        //Conta x = new Conta(1020, "Alex", 1000.0);
        //Conta y = new ContaPoupanca(1023, "Maria",
        // 1000.0, 1.0);

         //System.out.println(x);
         //System.out.println(y);

         //x.saque(50.0);
         //y.saque(50.0);

         //y = new ContaEmpresarial(1023, 
         //"Maria", 1000.0, 2500.0);
      
        
         /*if(y instanceof ContaPoupanca){            
            ContaPoupanca  cp = (ContaPoupanca) y;
            System.out.println(cp);
            cp.renderJuros();
            System.out.println(cp);
            y = cp;
         }else if(y instanceof ContaEmpresarial){
            ContaEmpresarial ce = (ContaEmpresarial) y;
            System.out.println(ce);
            ce.pegarEmprestimo(2000.0);
            System.out.println(ce);
            y = ce;
         }*/

         
         Banco banco = new Banco();
         banco.iniciar();
         
         
         

         
         
      


    }
}
