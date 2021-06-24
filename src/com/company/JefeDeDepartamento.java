package com.company;

public class JefeDeDepartamento extends  Empleado implements  IEmpleado{

    public JefeDeDepartamento() {
    }

    public JefeDeDepartamento(Cargo cargo, Double salario, String nombre) {
        super(cargo, salario, nombre);
    }

    @Override
    public void verSalario() {
        super.verSalario();
    }

    @Override
    public void verCargo() {
        super.verCargo();
    }

    @Override
    public void verNombre() {
        super.verNombre();
    }
}
