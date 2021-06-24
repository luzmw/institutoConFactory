package com.company;

public class Administrativo extends Empleado implements IEmpleado {

    public Administrativo() {
    }

    public Administrativo(Cargo cargo, Double salario, String nombre) {
        super(cargo, salario, nombre);
    }

    @Override
    public Cargo getCargo() {
        return super.getCargo();
    }
}
