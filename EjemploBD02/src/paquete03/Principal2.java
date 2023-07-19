package paquete03;

import paquete02.Auto;
import paquete01.Enlace;
import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class Principal2 {

    public static void main(String[] args) {
        String[][] autos = {{"LBC0001", "230.2"},
        {"LBC0002", "330.2"},
        {"LBC0003", "430.2"},
        {"LBC0004", "530.1"},
        {"LBC0005", "130.2"},};

        Enlace enlace = new Enlace();

        // 1. Guardar en la tabla autos de la base de datos
        for (String[] autoData : autos) {
            String placa = autoData[0];
            double valorMatricula = Double.parseDouble(autoData[1]);
            Auto auto = new Auto();
            auto.establecerPlaca(placa);
            auto.establecerValorMatricula(valorMatricula);
            enlace.insertarAuto(auto);
        }

        // 2. presentar todos los registros de la tabla autos de la base de datos
        ArrayList<Auto> listaAutos = enlace.obtenerDataAuto();
        for (Auto auto : listaAutos) {
            System.out.println("Placa: " + auto.obtenerPlaca() + ", Precio: " + auto.obtenerValorMatricula());
        }
    }
}
