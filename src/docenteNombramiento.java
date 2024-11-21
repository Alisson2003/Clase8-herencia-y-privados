public class docenteNombramiento extends Docente{
    private String tipoNombramiento;

    public docenteNombramiento(String cedula, String nombre, String fechaNacimiento, String tipoSangre, String direccion, int codigo, String tipoNombramiento) {
        super(cedula, nombre, fechaNacimiento, tipoSangre,direccion, codigo);
        this.tipoNombramiento = tipoNombramiento;
    }

    public String getTipoNombramiento() {
        return tipoNombramiento;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("°Docente Nombramiento");
        System.out.println("Tipo nombramiento: " + getTipoNombramiento());
    }
}
