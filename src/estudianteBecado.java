public class estudianteBecado extends Estudiante{

    String tipoBeca;

    public estudianteBecado(String cedula, String nombre, String fechaNacimiento, String tipoSangre, int codigo, String tipoBeca) {
        super(cedula, nombre, fechaNacimiento, tipoSangre, codigo);
        this.tipoBeca = tipoBeca;
    }

    public String getTipoBeca() {
        return tipoBeca;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("°Datos del estudiante becado ");
        System.out.println("Tipo de becado: " + getTipoBeca());
    }
}
