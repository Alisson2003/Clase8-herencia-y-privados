public class Estudiante extends Persona{
    private int codigo;

    public Estudiante(String cedula, String nombre, String fechaNacimiento, String tipoSangre, String direccion, int codigo) {
        super(cedula, nombre, fechaNacimiento, tipoSangre, direccion);
        this.codigo = codigo;
    }

    private int getCodigo() {
        return codigo;
    }

    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("°Datos estudiante");
        System.out.println("Codigo del estudiante: " + getCodigo());
    }

}
