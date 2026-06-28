package Factory;
public class LaptopProfesional extends Laptop {

    public LaptopProfesional(String marca, String modelo, int anioFabricacion,
                             String procesador, double tamanioPantalla) {
        super(marca, modelo, anioFabricacion, procesador, tamanioPantalla);
    }

    @Override
    public void ejecutarPrueba() {
        System.out.println("Esta laptop es para uso profesional.");
    }

    }