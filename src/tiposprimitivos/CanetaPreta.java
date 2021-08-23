
package tiposprimitivos;


public class CanetaPreta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    int potencia = 10;
    int tinta = 2;
    boolean tampada;
    
    void status(){
        System.out.println("Modelo é " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta " + this.ponta);
        System.out.println("Carga é "+ this.carga);
        System.out.println("Esta tampada? " + this.tampada);
    }
    void rabiscar(){
        if (this.tampada == true){ 
        System.out.println("erro não possso rabiscar!!");
        }
        else{
            System.out.println("Rabiscando!");
        }
    }
    void tampar(){
        this.tampada = true;
    }
    void destampar(){
        this.tampada = false;
    }
    
}
