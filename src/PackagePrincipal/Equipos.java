package PackagePrincipal;

public class Equipos {

    private String paisEquipo, nombre, ciudad, estadio;

    public Equipos() {
    }

    public Equipos(String paisEquipo, String nombre, String ciudad, String estadio) {
        this.paisEquipo = paisEquipo;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.estadio = estadio;
    }

    public String getPaisEquipo() {
        return paisEquipo;
    }

    public void setPaisEquipo(String paisEquipo) {
        this.paisEquipo = paisEquipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }
    
}
