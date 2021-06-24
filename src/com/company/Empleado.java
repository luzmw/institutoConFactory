package com.company;

public class Empleado implements IEmpleado {
    private Cargo cargo;
    private Double salario;
    private String nombre;

    public Empleado() {
    }

    public Empleado(Cargo cargo, Double salario, String nombre) {
        this.cargo = cargo;
        this.salario = salario;
        this.nombre = nombre;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "cargo=" + cargo +
                ", salario=" + salario +
                ", nombre='" + nombre + '\'' +
                '}';
    }


    @Override
    public void verSalario() {

    }

    @Override
    public void verCargo() {

    }

    @Override
    public void verNombre() {

    }

    @Override
    public void actualizarDatos(Cargo cargo, Double salario) {
       this.cargo=cargo;
       this.salario= salario;

    }
}
