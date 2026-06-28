package Factory;

public class LaptopFactory {

    public static Laptop crearLaptop(String tipo,
                                     String marca,
                                     String modelo,
                                     int anioFabricacion,
                                     String procesador,
                                     double tamanioPantalla) {

        switch (tipo.toLowerCase()) {
            case "basica":
                return new LaptopBasica(
                        marca, modelo, anioFabricacion,
                        procesador, tamanioPantalla);

            case "gamer":
                return new LaptopGamer(
                        marca, modelo, anioFabricacion,
                        procesador, tamanioPantalla);

            case "profesional":
                return new LaptopProfesional(
                        marca, modelo, anioFabricacion,
                        procesador, tamanioPantalla);

            default:
                throw new IllegalArgumentException(
                        "Tipo de laptop no válido: " + tipo);
        }
    }
}