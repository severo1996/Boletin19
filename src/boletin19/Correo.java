package boletin19;

public class Correo {

    private String contenido;
    private boolean leido = false;

    Correo(String contenido, boolean leido){
        this.leido=leido;
        this.contenido = contenido;
    }

    public boolean leido() {
        return leido;
    }
}
