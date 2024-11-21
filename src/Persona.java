import java.util.Scanner;

public class Persona {
    private String cedula;
    private String nombre;
    private String fechaNacimiento;
    private String tipoSangre;
    private String direccion;

    public Persona() {

    }

    public Persona(String cedula, String nombre, String fechaNacimiento, String tipoSangre, String direccion) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.tipoSangre = tipoSangre;
        this.direccion = direccion;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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

        System.out.println("Direccion: " + direccion);

    }

    public void cambiarDatos() {
        //primer parametro
        /*
        cedula = cedula;
        nombre = nombre;
        fechaNacimiento = fechaNacimiento;
        tipoSangre = tipoSangre;
        direccion = direccion;
         */

        /*
        //segundo parametro
        this.cedula = cedula;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.tipoSangre = tipoSangre;
        this.direccion = direccion;
        */

        //tercero parametro

        /*
        Scanner sc = new Scanner(System.in);

        String cedula = sc.nextLine();
        String nombre = sc.nextLine();
        String fechaNacimiento = sc.nextLine();
        String tipoSangre = sc.nextLine();
        String direccion = sc.nextLine();
        setCedula(cedula);
        setNombre(nombre);
        setFechaNacimiento(fechaNacimiento);
        setTipoSangre(tipoSangre);
        setDireccion(direccion);
        */

        //cuarto parametro

         Scanner sc = new Scanner(System.in);
         this.cedula = sc.nextLine();
         this.nombre = sc.nextLine();
         this.fechaNacimiento = sc.nextLine();
         this.tipoSangre = sc.nextLine();
         this.direccion = sc.nextLine();

    }
}
