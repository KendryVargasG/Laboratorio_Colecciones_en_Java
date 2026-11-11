package biblioteca;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SistemaBiblioteca {

    private Map<String, Material> catalogo;
    private Map<String, ArrayList<String>> listaEspera;
    private Set<String> miembros;

    public SistemaBiblioteca() {
        catalogo = new HashMap<>();
        listaEspera = new HashMap<>();
        miembros = new HashSet<>();
    }

    public void registrarMaterial(Material material) {
        catalogo.put(material.getCodigo(), material);
    }

    public Material buscarMaterial(String codigo) {
        return catalogo.get(codigo);
    }

    public void mostrarCatalogo() {

        for (Material material : catalogo.values()) {
            material.mostrarInfo();
            System.out.println("------------------");
        }
    }

    public void agregarMiembro(String nombre) {
        miembros.add(nombre);
    }

    public boolean esMiembro(String nombre) {
        return miembros.contains(nombre);
    }

    public void agregarEspera(String codigoMaterial, String usuario) {

        listaEspera.putIfAbsent(codigoMaterial, new ArrayList<>());

        listaEspera.get(codigoMaterial).add(usuario);
    }

    public String siguienteEnEspera(String codigoMaterial) {

        if (!listaEspera.containsKey(codigoMaterial)
                || listaEspera.get(codigoMaterial).isEmpty()) {
            return null;
        }

        return listaEspera.get(codigoMaterial).remove(0);
    }

}