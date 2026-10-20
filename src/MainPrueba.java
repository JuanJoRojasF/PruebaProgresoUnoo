public class MainPrueba {

    public static void main(String[] args) {

        CanalTelemetria canal = new CanalTelemetria(1, "Temperatura");
        System.out.println(canal.obtenerEstadoMedicion());
        boolean reg1 = canal.registrarMedicion(45.0);
        System.out.println("Registro 45.0 exitoso: " + reg1);
        System.out.println(canal.obtenerEstadoMedicion());
        boolean reg2 = canal.registrarMedicion(120.0);
        System.out.println("Registro 120.0 exitoso: " + reg2);
        System.out.println("Estado tras error: " + canal.obtenerEstadoMedicion());
        boolean reg3 = canal.registrarMedicion(0.0);
        System.out.println("Registro 0.0 exitoso: " + reg3);
        System.out.println(canal.obtenerEstadoMedicion());
        System.out.println("Canales creados correctamente: " + CanalTelemetria.getContadorCanales());

    }