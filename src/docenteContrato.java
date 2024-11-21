public class docenteContrato extends Docente{
    private String tipoContrato;

    public docenteContrato(String cedula, String nombre, String fechaNacimiento, String tipoSangre, String direccion, int codigo, String tipoContrato) {
        super(cedula, nombre, fechaNacimiento, tipoSangre,direccion, codigo);
        this.tipoContrato = tipoContrato;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Docente Contrato");
        System.out.println("Tipo contrato: " + tipoContrato);
    }
}
