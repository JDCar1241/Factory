
public class LaptopGamer extends Laptop {

    public LaptopGamer(String marca, String modelo, int anioFabricacion,
                       String procesador, double tamanioPantalla) {
        super(marca, modelo, anioFabricacion, procesador, tamanioPantalla);
    }

    @Override
    public void ejecutarPrueba() {
        System.out.println("Esta laptop es para gamers.");
    }
}