public class Estudiante extends Persona{
    private int codigo;

    public Estudiante(String cedula, String nombre, String fechaNacimiento, String tipoSangre, int codigo) {
        super(cedula, nombre, fechaNacimiento, tipoSangre);
        this.codigo = codigo;
    }

    private int getCodigo() {
        return codigo;
    }

    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("°Los datos del estudiante son ");
        System.out.println("Codigo del estudiante: " + getCodigo());
    }

}
