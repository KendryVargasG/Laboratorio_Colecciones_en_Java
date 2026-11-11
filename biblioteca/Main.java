package biblioteca;

public class Main {

    public static void main(String[] args) {

        SistemaBiblioteca sistema = new SistemaBiblioteca();

        Libro libro1 = new Libro(
                "BCH15001",
                "La Leyenda del Java",
                2026,
                true,
                "Ana Alvarado",
                "150102"
        );

        Libro libro2 = new Libro(
                "BCH15002",
                "Programación Orientada a Objetos",
                2025,
                true,
                "Kendry Vargas G",
                "150103"
        );

        Revista revista1 = new Revista(
                "RCH15002",
                "News Generation Colombia",
                2026,
                true,
                "Edición 15",
                "Desarrollo de Software"
        );

        Revista revista2 = new Revista(
                "RCH15003",
                "Colombia en Desarrollo",
                2024,
                true,
                "Edición 15",
                "Progreso Ambiental"
        );

        sistema.registrarMaterial(libro1);
        sistema.registrarMaterial(revista1);
        sistema.registrarMaterial(libro2);
        sistema.registrarMaterial(revista2);

        sistema.agregarMiembro("Gabriela Maria Osorio Benitez");
        sistema.agregarMiembro("Diana Marcela Holguin Garcia");
        sistema.agregarMiembro("Catalina Restrepo Arango");

        sistema.agregarEspera("BCH15001", "Gabriela Maria Osorio Benitez");
        sistema.agregarEspera("BCH15001", "Diana Marcela Holguin Garcia");
        sistema.agregarEspera("BCH15001", "Catalina Restrepo Arango");


        System.out.println("Catálogo Biblioteca Central de la Universidad del Código:");
        sistema.mostrarCatalogo();

        System.out.println("\nConsulta de Cátalogo: Material en Existencia");
        Material encontrado = sistema.buscarMaterial("BCH15001");

        if (encontrado != null) {
            encontrado.mostrarInfo();
        }

        System.out.println("\nConsulta de Cátalogo: Material sin Existencia");
        Material inexistente = sistema.buscarMaterial("BCH140102");

        if (inexistente == null) {
            System.out.println("Material Bibliográfico no Encontrado.");
        }

        System.out.println("¿Gabriela Maria Osorio Benitez es miembro? "
                + sistema.esMiembro("Gabriela Maria Osorio Benitez"));

        System.out.println("Siguiente en espera: "
                + sistema.siguienteEnEspera("BCH15001"));
        System.out.println("Siguiente en espera: "
                + sistema.siguienteEnEspera("BCH15001"));
    }


}

