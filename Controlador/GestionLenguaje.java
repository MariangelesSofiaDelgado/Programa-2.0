package Controlador;

import Modelo.LenguajeProgramacion;

public class GestionLenguaje {

    private static int FACTOR_CRECIMIENTO = 2;
    private static LenguajeProgramacion[] ArregloLenguaje = new LenguajeProgramacion[FACTOR_CRECIMIENTO];
    private static int ContadorLenguaje = 0;

    public static void AgregarLenguaje(int AnioCreacion, String CaracteristicaPrincipal, String Nombre,
            String Utilizacion) {

        if (ContadorLenguaje == ArregloLenguaje.length) {
            LenguajeProgramacion[] aux = new LenguajeProgramacion[ArregloLenguaje.length + FACTOR_CRECIMIENTO];
            System.arraycopy(ArregloLenguaje, 0, aux, 0, ArregloLenguaje.length);
            ArregloLenguaje = aux;
        }

        ArregloLenguaje[ContadorLenguaje] = new LenguajeProgramacion(AnioCreacion, CaracteristicaPrincipal, Nombre,
                Utilizacion);
        ContadorLenguaje++;
    }

    public static LenguajeProgramacion BuscarLenguaje(String Nombre) {
        for (int i = 0; i < ContadorLenguaje; i++) {
            if (ArregloLenguaje[i].getNombre().equalsIgnoreCase(Nombre)) {
                return ArregloLenguaje[i];
            }
        }
        return null;
    }

    public static boolean eliminaLenguaje(String Nombre) {
        for (int i = 0; i < ContadorLenguaje; i++) {
            if (ArregloLenguaje[i].getNombre().equals(Nombre)) {
                for (int j = i; j < ArregloLenguaje.length - 1; j++) {
                    ArregloLenguaje[j] = ArregloLenguaje[j + 1];
                }
                ArregloLenguaje[--ContadorLenguaje] = null; // Decrementa el contador y elimina el último elemento
                return true;
            }
        }
        return false;
    }

    public static LenguajeProgramacion[] getArregloLenguaje() {
        return ArregloLenguaje;
    }

    public static void ImprimirLenguajes() {
        for (int i = 0; i < ArregloLenguaje.length; i++) {
            if (ArregloLenguaje[i] != null) {
                System.out.println(ArregloLenguaje[i].toString());
            }
        }

    }

}
