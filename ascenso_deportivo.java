import java.util.Scanner;
public class ascenso_deportivo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] deportistas = new String[10];
        String[] disciplinas = new String[10];
        String[] categoriasActuales = new String[10];
        String[] categoriasDestino = new String[10];
        String[] entrenadores = new String[10];
        String[] puntos = new String[10];
        String[] victorias = new String[10];
        String[] derrotas = new String[10];
        String[] fechasEvaluacion = new String[10];
        String[] estados = new String[10];
        int total = 0;
        int opcion;
        //-----------------------------------------//
        //--|menu_principal_de_ascenso_deportivo|--//
        //-----------------------------------------//
        do {
            System.out.println("menu principal de ascenso deportivo");
            System.out.println("1) Registrar ascenso");
            System.out.println("2) Editar ascenso");
            System.out.println("3) Listar ascensos");
            System.out.println("4) Buscar ascenso");
            System.out.println("5) Eliminar ascenso");
            System.out.println("6) Mostrar resumen");
            System.out.println("7) Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = entrada.nextInt();
            entrada.nextLine();
            switch (opcion) {
                //-----------------------//
                //--|registrar_ascenso|--//
                //-----------------------//
                case 1:
                    if (total >= deportistas.length) {
                        System.out.println("No hay espacio para registrar mas ascensos.");
                        break;
                    }
                    int id = total + 1;
                    System.out.println("registro de ascenso deportivo");
                    System.out.println("id del ascenso a registrar: " + id);
                    System.out.print("nombre del deportista: ");
                    deportistas[total] = entrada.nextLine();
                    System.out.print("disciplina deportiva: ");
                    disciplinas[total] = entrada.nextLine();
                    System.out.print("categoria actual: ");
                    categoriasActuales[total] = entrada.nextLine();
                    System.out.print("categoria destino: ");
                    categoriasDestino[total] = entrada.nextLine();
                    System.out.print("nombre del entrenador: ");
                    entrenadores[total] = entrada.nextLine();
                    System.out.print("puntos obtenidos: ");
                    puntos[total] = entrada.nextLine();
                    System.out.print("cantidad de victorias: ");
                    victorias[total] = entrada.nextLine();
                    System.out.print("cantidad de derrotas: ");
                    derrotas[total] = entrada.nextLine();
                    System.out.print("fecha de evaluacion: ");
                    fechasEvaluacion[total] = entrada.nextLine();
                    System.out.print("estado del ascenso: ");
                    estados[total] = entrada.nextLine();
                    System.out.println("Ascenso registrado correctamente.");
                    total++;
                    break;
                //--------------------//
                //--|editar_ascenso|--//
                //--------------------//
                case 2:
                    if (total == 0) {
                        System.out.println("No existen ascensos registrados.");
                        break;
                    }
                    System.out.println("Datos de los ascensos");
                    for (int i = 0; i < total; i++) {
                        System.out.println("ID: " + (i + 1) + " | Deportista: " + deportistas[i] + " | Disciplina: " + disciplinas[i] + " | Categoria actual: " + categoriasActuales[i] + " | Categoria destino: " + categoriasDestino[i] + " | Entrenador: " + entrenadores[i] + " | Puntos: " + puntos[i] + " | Victorias: " + victorias[i] + " | Derrotas: " + derrotas[i] + " | Fecha evaluacion: " + fechasEvaluacion[i] + " | Estado: " + estados[i]);
                    }
                    System.out.print("Ingrese el ID del ascenso: ");
                    int idEditar = entrada.nextInt();
                    entrada.nextLine();
                    if (idEditar >= 1 && idEditar <= total) {
                        int posicion = idEditar - 1;
                        System.out.println("Editar el dato del ascenso");
                        System.out.print("Nuevo nombre del deportista: ");
                        deportistas[posicion] = entrada.nextLine();
                        System.out.print("Nueva disciplina deportiva: ");
                        disciplinas[posicion] = entrada.nextLine();
                        System.out.print("Nueva categoria actual: ");
                        categoriasActuales[posicion] = entrada.nextLine();
                        System.out.print("Nueva categoria destino: ");
                        categoriasDestino[posicion] = entrada.nextLine();
                        System.out.print("Nuevo nombre del entrenador: ");
                        entrenadores[posicion] = entrada.nextLine();
                        System.out.print("Nuevos puntos obtenidos: ");
                        puntos[posicion] = entrada.nextLine();
                        System.out.print("Nueva cantidad de victorias: ");
                        victorias[posicion] = entrada.nextLine();
                        System.out.print("Nueva cantidad de derrotas: ");
                        derrotas[posicion] = entrada.nextLine();
                        System.out.print("Nueva fecha de evaluacion: ");
                        fechasEvaluacion[posicion] = entrada.nextLine();
                        System.out.print("Nuevo estado del ascenso: ");
                        estados[posicion] = entrada.nextLine();
                        System.out.println("Ascenso actualizado correctamente.");
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //---------------------//
                //--|listar_ascensos|--//
                //---------------------//
                case 3:
                    if (total == 0) {
                        System.out.println("No existen ascensos registrados.");
                    } else {
                        System.out.println("Lista de ascensos deportivos");
                        for (int i = 0; i < total; i++) {
                            System.out.println("ID: " + (i + 1) + " | Deportista: " + deportistas[i] + " | Disciplina: " + disciplinas[i] + " | Categoria actual: " + categoriasActuales[i] + " | Categoria destino: " + categoriasDestino[i] + " | Entrenador: " + entrenadores[i] + " | Puntos: " + puntos[i] + " | Victorias: " + victorias[i] + " | Derrotas: " + derrotas[i] + " | Fecha evaluacion: " + fechasEvaluacion[i] + " | Estado: " + estados[i]);
                        }
                    }
                    break;
                //--------------------//
                //--|buscar_ascenso|--//
                //--------------------//
                case 4:
                    if (total == 0) {
                        System.out.println("No existen ascensos registrados.");
                        break;
                    }
                    System.out.println("busqueda de ascenso");
                    System.out.print("ingresa la id para buscar ascenso: ");
                    int idBusqueda = entrada.nextInt();
                    entrada.nextLine();
                    if (idBusqueda >= 1 && idBusqueda <= total) {
                        int posicion = idBusqueda - 1;
                        System.out.println("Datos del ascenso encontrado:");
                        System.out.println("ID: " + idBusqueda + " | Deportista: " + deportistas[posicion] + " | Disciplina: " + disciplinas[posicion] + " | Categoria actual: " + categoriasActuales[posicion] + " | Categoria destino: " + categoriasDestino[posicion] + " | Entrenador: " + entrenadores[posicion] + " | Puntos: " + puntos[posicion] + " | Victorias: " + victorias[posicion] + " | Derrotas: " + derrotas[posicion] + " | Fecha evaluacion: " + fechasEvaluacion[posicion] + " | Estado: " + estados[posicion]);
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //----------------------//
                //--|eliminar_ascenso|--//
                //----------------------//
                case 5:
                    if (total == 0) {
                        System.out.println("No existen ascensos registrados.");
                        break;
                    }
                    System.out.println("Datos de los ascensos");
                    for (int i = 0; i < total; i++) {
                        System.out.println("ID: " + (i + 1) + " | Deportista: " + deportistas[i] + " | Disciplina: " + disciplinas[i] + " | Categoria actual: " + categoriasActuales[i] + " | Categoria destino: " + categoriasDestino[i] + " | Entrenador: " + entrenadores[i] + " | Puntos: " + puntos[i] + " | Victorias: " + victorias[i] + " | Derrotas: " + derrotas[i] + " | Fecha evaluacion: " + fechasEvaluacion[i] + " | Estado: " + estados[i]);
                    }
                    System.out.print("Ingrese el ID del ascenso a eliminar: ");
                    int idEliminar = entrada.nextInt();
                    entrada.nextLine();
                    if (idEliminar >= 1 && idEliminar <= total) {
                        int posicion = idEliminar - 1;
                        for (int i = posicion; i < total - 1; i++) {
                            deportistas[i] = deportistas[i + 1];
                            disciplinas[i] = disciplinas[i + 1];
                            categoriasActuales[i] = categoriasActuales[i + 1];
                            categoriasDestino[i] = categoriasDestino[i + 1];
                            entrenadores[i] = entrenadores[i + 1];
                            puntos[i] = puntos[i + 1];
                            victorias[i] = victorias[i + 1];
                            derrotas[i] = derrotas[i + 1];
                            fechasEvaluacion[i] = fechasEvaluacion[i + 1];
                            estados[i] = estados[i + 1];
                        }
                        total--;
                        System.out.println("Ascenso eliminado correctamente.");
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //---------------------//
                //--|mostrar_resumen|--//
                //---------------------//
                case 6:
                    if (total == 0) {
                        System.out.println("No existen ascensos registrados.");
                        break;
                    }
                    int pendientes = 0;
                    int aprobados = 0;
                    int rechazados = 0;
                    int ascendidos = 0;
                    int enEvaluacion = 0;
                    int otrosEstados = 0;
                    for (int i = 0; i < total; i++) {
                        if (estados[i].equalsIgnoreCase("Pendiente")) {
                            pendientes++;
                        } else if (estados[i].equalsIgnoreCase("Aprobado")) {
                            aprobados++;
                        } else if (estados[i].equalsIgnoreCase("Rechazado")) {
                            rechazados++;
                        } else if (estados[i].equalsIgnoreCase("Ascendido")) {
                            ascendidos++;
                        } else if (estados[i].equalsIgnoreCase("En evaluacion")) {
                            enEvaluacion++;
                        } else {
                            otrosEstados++;
                        }
                    }
                    String disciplinaMayor = disciplinas[0];
                    int cantidadDisciplinaMayor = 0;
                    for (int i = 0; i < total; i++) {
                        int cantidadDisciplina = 0;
                        for (int j = 0; j < total; j++) {
                            if (disciplinas[i].equalsIgnoreCase(disciplinas[j])) {
                                cantidadDisciplina++;
                            }
                        }
                        if (cantidadDisciplina > cantidadDisciplinaMayor) {
                            cantidadDisciplinaMayor = cantidadDisciplina;
                            disciplinaMayor = disciplinas[i];
                        }
                    }
                    String categoriaActualMayor = categoriasActuales[0];
                    int cantidadCategoriaActualMayor = 0;
                    for (int i = 0; i < total; i++) {
                        int cantidadCategoriaActual = 0;
                        for (int j = 0; j < total; j++) {
                            if (categoriasActuales[i].equalsIgnoreCase(categoriasActuales[j])) {
                                cantidadCategoriaActual++;
                            }
                        }
                        if (cantidadCategoriaActual > cantidadCategoriaActualMayor) {
                            cantidadCategoriaActualMayor = cantidadCategoriaActual;
                            categoriaActualMayor = categoriasActuales[i];
                        }
                    }
                    String categoriaDestinoMayor = categoriasDestino[0];
                    int cantidadCategoriaDestinoMayor = 0;
                    for (int i = 0; i < total; i++) {
                        int cantidadCategoriaDestino = 0;
                        for (int j = 0; j < total; j++) {
                            if (categoriasDestino[i].equalsIgnoreCase(categoriasDestino[j])) {
                                cantidadCategoriaDestino++;
                            }
                        }
                        if (cantidadCategoriaDestino > cantidadCategoriaDestinoMayor) {
                            cantidadCategoriaDestinoMayor = cantidadCategoriaDestino;
                            categoriaDestinoMayor = categoriasDestino[i];
                        }
                    }
                    String entrenadorMayor = entrenadores[0];
                    int cantidadEntrenadorMayor = 0;
                    for (int i = 0; i < total; i++) {
                        int cantidadEntrenador = 0;
                        for (int j = 0; j < total; j++) {
                            if (entrenadores[i].equalsIgnoreCase(entrenadores[j])) {
                                cantidadEntrenador++;
                            }
                        }
                        if (cantidadEntrenador > cantidadEntrenadorMayor) {
                            cantidadEntrenadorMayor = cantidadEntrenador;
                            entrenadorMayor = entrenadores[i];
                        }
                    }
                    String deportistaMayorPuntos = deportistas[0];
                    int mayorPuntos = 0;
                    for (int i = 0; i < total; i++) {
                        int puntosActuales = Integer.parseInt(puntos[i]);
                        if (puntosActuales > mayorPuntos) {
                            mayorPuntos = puntosActuales;
                            deportistaMayorPuntos = deportistas[i];
                        }
                    }
                    String deportistaMayorVictorias = deportistas[0];
                    int mayorVictorias = 0;
                    for (int i = 0; i < total; i++) {
                        int victoriasActuales = Integer.parseInt(victorias[i]);
                        if (victoriasActuales > mayorVictorias) {
                            mayorVictorias = victoriasActuales;
                            deportistaMayorVictorias = deportistas[i];
                        }
                    }
                    String estadoMayor = estados[0];
                    int cantidadEstadoMayor = 0;
                    for (int i = 0; i < total; i++) {
                        int cantidadEstado = 0;
                        for (int j = 0; j < total; j++) {
                            if (estados[i].equalsIgnoreCase(estados[j])) {
                                cantidadEstado++;
                            }
                        }
                        if (cantidadEstado > cantidadEstadoMayor) {
                            cantidadEstadoMayor = cantidadEstado;
                            estadoMayor = estados[i];
                        }
                    }
                    System.out.println("resumen de ascenso deportivo");
                    System.out.println("Ascensos registrados: " + total);
                    System.out.println("Disciplina mas frecuente: " + disciplinaMayor);
                    System.out.println("Categoria actual mas frecuente: " + categoriaActualMayor);
                    System.out.println("Categoria destino mas solicitada: " + categoriaDestinoMayor);
                    System.out.println("Entrenador con mas deportistas: " + entrenadorMayor);
                    System.out.println("Deportista con mas puntos: " + deportistaMayorPuntos + " | Puntos: " + mayorPuntos);
                    System.out.println("Deportista con mas victorias: " + deportistaMayorVictorias + " | Victorias: " + mayorVictorias);
                    System.out.println("Estado mas frecuente: " + estadoMayor);
                    System.out.println("Pendientes: " + pendientes);
                    System.out.println("Aprobados: " + aprobados);
                    System.out.println("Rechazados: " + rechazados);
                    System.out.println("Ascendidos: " + ascendidos);
                    System.out.println("En evaluacion: " + enEvaluacion);
                    System.out.println("Otros estados: " + otrosEstados);
                    break;
                //------------------------------//
                //--|salir_del_menu_principal|--//
                //------------------------------//
                case 7:
                    System.out.println("Gracias por utilizar Ascenso Deportivo.");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 7);
        entrada.close();
    }
}