
/** Al final la clase controlador que creen deberia heredar de todos estos archivos, asi:
        
        public class Carro extendes CarrocontroladorBase implementes ITelefono, IRadio, IReproducir...{}
        
    Y despues solo desarrollar los metodos*/

public abstract class CarroControladorBase{

    boolean estaEncendido = false;
    /* Se declararan todos los arraylist que se generaran para contener los datos de prueba*/
    
    /*lista de las diversas canciones que tendra la radio */
    ArrayList<String> canciones = new ArrayList<>();
    /* Lista de mensajes de tarjetas de presentacion del usuario*/
    ArrayList<String> tarjetasDePresentacion = new ArrayList<>();
    /* Lista de contactos de telefono del usuario*/
    ArrayList<Integer> contactos = new ArrayList<>();
    /** Emisoras guardadas por el usuario */
    ArrayList<Double> emisoras = new ArrayList<>();

    /**Ultimas cancion en ser tocada */
    String ultimaCancion;
    /** Emisora sonando */
    Double emisoraActual;
    /** Cancion que se encuentra sonando */
    String cancionActual;
    /** Si la radio esta en AM o FM */
    String banda;

    /** Enciende la radio */
    public encender(){this.estaEncendido = true;}

    /** Apaga la radio */
    public apagar(){this.estaEncendido = false;}
}
