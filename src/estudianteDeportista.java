public class estudianteDeportista extends Estudiante{
    String deporte;

    public estudianteDeportista(String cedula, String nombre, String fechaNacimiento, String tipoSangre, String direccion, int codigo, String deporte) {
        super(cedula, nombre, fechaNacimiento, tipoSangre, direccion, codigo);
        this.deporte = deporte;
    }

    public String getDeporte() {
        return deporte;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("°Estudiante deportista");
        System.out.println("Tipo de deporte: " + getDeporte());
    }
}
