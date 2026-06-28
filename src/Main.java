package Factory;

public class Main {

    public static void main(String[] args) {

        Laptop laptop1 = LaptopFactory.crearLaptop(
                "basica",
                "Lenovo",
                "IdeaPad 3",
                2024,
                "Intel Core i3",
                15.6
        );

        Laptop laptop2 = LaptopFactory.crearLaptop(
                "gamer",
                "ASUS",
                "ROG Strix G16",
                2025,
                "Intel Core i7",
                16.0
        );

        Laptop laptop3 = LaptopFactory.crearLaptop(
                "profesional",
                "Dell",
                "XPS 15",
                2025,
                "Intel Core Ultra 7",
                15.6
        );

        System.out.println("=== LAPTOP BÁSICA ===");
        laptop1.mostrarInformacion();
        laptop1.ejecutarPrueba();

        System.out.println("\n=== LAPTOP GAMER ===");
        laptop2.mostrarInformacion();
        laptop2.ejecutarPrueba();

        System.out.println("\n=== LAPTOP PROFESIONAL ===");
        laptop3.mostrarInformacion();
        laptop3.ejecutarPrueba();
    }
}