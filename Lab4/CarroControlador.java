
/** Esta clase debe implementar las interfaces tipo:
        
        - Carro implementes ITelefono , IReproducir
         */

public abstract class CarroControlador implements Telefono{

    boolean estaEncendido = false;

    ArrayList<String> canciones = new ArrayList<>();
    ArrayList<String> tarjetasDePresentacion = new ArrayList<>();
    ArrayList<Integer> contactos = new ArrayList<>();

    String ultimaCancion;
    Double emisora;
    String banda;

    public encender(){this.estaEncendido = true;}

    public apagar(){this.estaEncendido = false;}
}
