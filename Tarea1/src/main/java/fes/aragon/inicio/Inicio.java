package fes.aragon.inicio;

import fes.aragon.clases.SocialMediaData;
import java.io.*;
import java.util.*;

public class Inicio {
    public static void main(String[] args) throws FileNotFoundException {

        List<SocialMediaData> datos = new ArrayList<>();

        String ruta = "D:/Users/israel hernandez/Documents/israel/clases online/Estructura de Datos/Tarea1/src/main/java/fes/aragon/archivos/Presencia Redes Sociales.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea;
            String[] meses = {"ENERO", "FEBRERO", "MARZO", "ABRIL", "MAYO", "JUNIO", "JULIO", "AGOSTO", "SEPTIEMBRE", "OCTUBRE", "NOVIEMBRE", "DICIEMBRE"};
            br.readLine(); // Saltar la línea de encabezado

            while ((linea = br.readLine()) != null) {
                // Dividir la línea en partes con comas
                String[] partes = linea.split(",");

                // Asignar cada parte a cada columna empezando desde cero
                String redSocial = partes[0];
                String concepto = partes[1];
                int anio = Integer.parseInt(partes[2]);

                // Crear un mapa para todos los meses del año ordenadamente con LinkedHashMap
                Map<String, Integer> datosMensuales = new LinkedHashMap<>();

                // Asignar los datos mensuales al mapa
                for (int i = 0; i < meses.length; i++) {
                    int valor;
                    try {
                        // Convertir valor a enteros
                        valor = Integer.parseInt(partes[i + 3].trim().replace("%", "").replace(" ", ""));
                    } catch (NumberFormatException e) {
                        // Si el valor no es un número usar 0
                        valor = 0;
                    }
                    datosMensuales.put(meses[i], valor);
                }

                SocialMediaData dato = new SocialMediaData(redSocial, concepto, anio, datosMensuales);
                datos.add(dato);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
            e.printStackTrace();
        }

        // imprimir toda la tabla
            for (SocialMediaData dato : datos) {
            System.out.println(dato);
     }

        System.out.println();
        // Calcular y mostrar la diferencia de seguidores en Twitter entre enero y junio de 2020
        int diferenciaSeguidores = CalcularDiferenciaSeguidores(datos, "TWITTER", "SEGUIDORES (FOLLOWERS)", 2020, "ENERO", "JUNIO");
        System.out.println("Diferencia de seguidores en Twitter entre enero y junio de 2020: " + diferenciaSeguidores);

        int promedioDeCrecrecimiento = CalcularPromedio(datos, "TWITTER", "PORCENTAJE DE CRECIMIENTO", 2020 , "ENERO" , "JUNIO");
        System.out.println("Promedio de Crecimiento de Twitter del mes de Enero a Junio de 2020 : %" + promedioDeCrecrecimiento);

        int promedioDeMeGustaY = CalcularPromedio(datos, "YOUTUBE", "ME GUSTA", 2020, "ENERO", "DICIEMBRE");
        System.out.println("Promedio de Me gusta en Youtube en el anio 2020: " + promedioDeMeGustaY);

        int promedioDeMeGustaT = CalcularPromedio(datos, "TWITTER", "ME GUSTA", 2020, "ENERO", "DICIEMBRE");
        System.out.println("Promedio de Me gusta en Twitter en el anio 2020: " + promedioDeMeGustaT);
        int promedioDeMeGustaF = CalcularPromedio(datos, "FACEBOOK", "ME GUSTA EN PUBLICACIONES", 2020, "ENERO", "DICIEMBRE");
        System.out.println("Promedio de Me gusta en Facebook en el anio 2020: " + promedioDeMeGustaF);

        // Solicitamos la entrada del usuario para los meses.
        System.out.println();
        System.out.println("ingrese la informacion en Mayusculas , el concepto tiene que estar bien escrito como en la tabla");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la red social:");
        String redSocial = scanner.nextLine();
        System.out.println("Ingrese el concepto:");
        String concepto = scanner.nextLine();
        System.out.println("Ingrese el año:");
        int anio = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer del scanner.
        System.out.println("Ingrese el mes de inicio:");
        String mesInicio = scanner.nextLine();
        System.out.println("Ingrese el mes de fin:");
        String mesFin = scanner.nextLine();

        // Calculamos la diferencia de seguidores.
        int diferencia = CalcularDiferenciaSeguidores(datos, redSocial, concepto, anio, mesInicio, mesFin);
        System.out.println("La diferencia es de: " + diferencia);

        scanner.close();
    }

    private static int CalcularDiferenciaSeguidores(List<SocialMediaData> datos, String redSocial, String concepto, int anio, String mesInicio, String mesFin) {
        for (SocialMediaData dato : datos) {
            if (dato.getRedSocial().equalsIgnoreCase(redSocial.trim()) &&
                    dato.getConcepto().equalsIgnoreCase(concepto.trim()) &&
                    dato.getAnio() == anio) {

                Map<String, Integer> datosMensuales = dato.getDatosMensuales();
                int seguidoresInicio = datosMensuales.getOrDefault(mesInicio.toUpperCase(), 0);
                int seguidoresFin = datosMensuales.getOrDefault(mesFin.toUpperCase(), 0);

                return seguidoresFin - seguidoresInicio;
            }
        }

        return 0;
    }

    private static int CalcularPromedio(List<SocialMediaData> datos, String redSocial, String concepto, int anio , String mesInicio, String mesFin) {
        List<Integer> valores = new ArrayList<>();
        String[] meses = {"ENERO", "FEBRERO", "MARZO", "ABRIL", "MAYO", "JUNIO"};

        for (SocialMediaData dato : datos) {
            if (dato.getRedSocial().equalsIgnoreCase(redSocial.trim()) &&
                    dato.getConcepto().equalsIgnoreCase(concepto.trim()) &&
                    dato.getAnio() == anio) {

                Map<String, Integer> datosMensuales = dato.getDatosMensuales();
                boolean enRango = false;

                for (String mes : meses) {
                    if (mes.equalsIgnoreCase(mesInicio)) {
                        enRango = true;
                    }
                    if (enRango) {
                        valores.add(datosMensuales.getOrDefault(mes, 0));
                    }
                    if (mes.equalsIgnoreCase(mesFin)) {
                        break;
                    }
                }
                break; // Terminamos el bucle una vez que encontramos los datos que nos interesan
            }
        }

        if (valores.isEmpty()) {
            return 0;
        }

        int suma = 0;
        for (int valor : valores) {
            suma += valor;
        }
        return (int) ((double) suma / valores.size());
    }
}