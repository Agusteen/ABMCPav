package entidades;

import java.util.ArrayList;

public class ListaResultados {
    ArrayList<Resultado> listaResultados;

    private ListaResultados() {
        listaResultados = new ArrayList<>();
    }
    
    public ArrayList<Resultado> getLista() {
        return listaResultados;
    }
    
    private static ListaResultados instancia;
    
    public static ListaResultados getInstance() {
        if (instancia == null) instancia = new ListaResultados();
        return instancia;
    }

}
