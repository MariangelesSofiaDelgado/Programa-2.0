package Modelo;

public class LenguajeProgramacion {

    private int AnioCreacion;
    private String CaracteristicaPrincipal;
    private String Nombre;
    private String Utilizacion;

    public LenguajeProgramacion(int AnioCreacion, String CaracteristicaPrincipal, String Nombre, String Utilizacion) {
        this.AnioCreacion = AnioCreacion;
        this.CaracteristicaPrincipal = CaracteristicaPrincipal;
        this.Nombre = Nombre;
        this.Utilizacion = Utilizacion;
    }

    public int getAnioCreacion() {
        return AnioCreacion;
    }

    public void setAnioCreacion(int anioCreacion) {
        AnioCreacion = anioCreacion;
    }

    public String getCaracteristicaPrincipal() {
        return CaracteristicaPrincipal;
    }

    public void setCaracteristicaPrincipal(String caracteristicaPrincipal) {
        CaracteristicaPrincipal = caracteristicaPrincipal;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getUtilizacion() {
        return Utilizacion;
    }

    public void setUtilizacion(String utilizacion) {
        Utilizacion = utilizacion;
        
    }

    @Override
    public String toString() {
        return "LenguajeProgramacion [AnioCreacion=" + AnioCreacion + ", CaracteristicaPrincipal="
                + CaracteristicaPrincipal + ", Nombre=" + Nombre + ", Utilizacion=" + Utilizacion + "]";
    }

    
}
