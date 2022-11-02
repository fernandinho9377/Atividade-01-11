import javax.sql.rowset.spi.SyncResolver;

public class Carro {
   
    private String marca;
    private String modelo;
    private int velocidade;

//método construtor
Carro(String marca, String modelo){
    this.marca = marca;
    this.modelo = modelo;
    velocidade = 0;
   }
   
 // Acelerar
 public void acelerar (int a) {
    System.out.printl("Acelerando");
    velocidade = velocidade + a;
    if (velocidade > 200) {
        System.out.println("Não é possível acelerar mais!");
        velocidade = 200;
    } else {
        System.out.println("Velocidade atual: "+velocidade+" km/h.");
    }
}

// Método para frear
void frear (int f) {
    System.out.println("-- Frenagem --");
    velocidade = velocidade - f;
    if (velocidade < 0) {
        System.out.println("Você freou muito forte. \nA velocidade atual é 0 km/h.");
        velocidade = 0;
    } else {
        System.out.println("A velocidade atual do carro é: " + velocidade + " km/h.");
    }
}

// Método toString
@Override
public String toString() {
    return "Carro {" +
            "marca='" + marca + '\'' +
            ", modelo='" + modelo + '\'' +
            ", velocidade=" + velocidade +
            '}';
}

// Método printStatus
public void printStatusCarro () {
    System.out.println(toString());   

}


}
