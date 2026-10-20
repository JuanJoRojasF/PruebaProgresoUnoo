
public class CanalTelemetria {
    private int identificador;
    private String nombre;
    private double ultimoValor;
    private static int contadorCanales = 0;
    public CanalTelemetria(int identificador, String nombre) {
        this.ultimoValor = -1.0;
        if (identificador > 0 && nombre != null && !nombre.trim().isEmpty()) {
            this.identificador = identificador;
            this.nombre = nombre;
            contadorCanales++;
        }
    }

    public int getIdentificador() {
        return identificador;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        }
    }

    public static int getContadorCanales() {
        return contadorCanales;
    }

    public boolean registrarMedicion(double valor) {
        if (valor >= 0 && valor <= 100) {
            this.ultimoValor = valor;
            return true;
        }
        return false;
    }
    public String obtenerEstadoMedicion() {
        if (this.ultimoValor == -1.0) {
            return "Sin mediciones";
        } else {
            return "Última medición: " + this.ultimoValor;
        }
    }
}
