package com.company;

public abstract class EmpleadoFactory {

    public static IEmpleado getEmpleado(Cargo cargo) {
        switch (cargo) {
            case JEFEDEDEPARTAMENTO -> {
                return new JefeDeDepartamento();
            }
            case DIRECTIVO -> {
                return new Directivo();
            }
            case DOCENTE -> {
                return new Docente();
            }
            case ADMINISTRATIVO -> {
                return new Administrativo();
            }

            default -> {
                return null;
            }
        }
    }

    public static IEmpleado getEmpleado(Cargo cargo, String nombre, Docente salario) {
        IEmpleado nuevoEmpleado = switch (cargo) {
            case JEFEDEDEPARTAMENTO -> new JefeDeDepartamento();
            case DIRECTIVO -> new Directivo();
            case DOCENTE -> new Docente();
            default -> null;
        };
        nuevoEmpleado.actualizarDatos(nombre, salario, cargo);
        return nuevoEmpleado;
    }
}
