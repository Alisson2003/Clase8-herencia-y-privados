public class Docente extends Persona{
    int codigo;

    public Docente(String cedula, String nombre, String fechaNacimiento, String tipoSangre, String direccion, int codigo) {
        super(cedula, nombre, fechaNacimiento, tipoSangre, direccion);
        this.codigo = codigo;
    }

    public int getCodigo() {
       return codigo;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("°Datos deporte");
        System.out.println("Codigo del deporte: " + codigo);
    }
}
