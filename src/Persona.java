public class Persona {
    private String cedula;
    private String nombre;
    private String fechaNacimiento;
    private String tipoSangre;

    public Persona() {

    }

    public Persona(String cedula, String nombre, String fechaNacimiento, String tipoSangre) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.tipoSangre = tipoSangre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    void imprimir() {

        System.out.println("°Los datos de la persona es: ");
        System.out.println("Cedula: " + cedula);
        //System.out.println("Cedula: " + getCedula());

        System.out.println("Nombre: " + nombre);
        //System.out.println("Nombre: " + getNombre());

        System.out.println("FechaNacimiento: " + fechaNacimiento);
        //System.out.println("FechaNacimiento: " + getFechaNacimiento());

        System.out.println("Tipo de Sangre: " + tipoSangre);
        //System.out.println("Tipo de Sangre: " + getTipoSangre());

    }
}
