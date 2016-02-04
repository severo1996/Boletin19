package boletin19;
public class Boletin19 {

    public static void main(String[] args) {
        Buzon msg = new Buzon();
        msg.numerodeCorreos();
        msg.añadir(new Correo ("OKEY", true));
        msg.añadir(new Correo ("DE ACUERDO", false));
        msg.añadir(new Correo ("HOME", false));
        msg.añadir(new Correo ("SI", false));
        msg.ponerLeer();
        msg.primerNoLeido();
        msg.enseña(3);
        
    }
    
}
