


public class carro {
    String marca;
    String modelo;
    int velocidade;

    carro(String marca, String modelo){
        this.marca = marca;
        this. modelo = modelo;
    }
    

    public void acelerar(int valor){
        System.out.print(velocidade + " + " + valor);
        velocidade += valor;
        if(velocidade >= 200){
            velocidade = 200;
        }
        System.out.println(" > " + velocidade);

    }
    
    public void frear(int valor){
        System.out.print(velocidade + " - " + valor);
        velocidade -= valor;
        if(velocidade < 0 ){
            velocidade = 0;
        }
        System.out.println(" > " + velocidade);

    }

    @Override
    public String toString() {
        return "carro [marca=" + marca + ", modelo=" + modelo + ", velocidade=" + velocidade + "]";
    }
    
    public void printStatus() {
        System.out.println(toString());
    }
}