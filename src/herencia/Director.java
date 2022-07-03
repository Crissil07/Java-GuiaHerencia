package herencia;

import java.util.Date;

public class Director extends Persona {

    private Integer salario;

    private Integer horasDeTrabajo;

    public Director(Integer salario, Integer horasDeTrabajo, String nombre, String apellido, Integer dni, Date fechaNacimiento) {
        super(nombre, apellido, dni, fechaNacimiento);
        this.salario = salario;
        this.horasDeTrabajo = horasDeTrabajo;
    }

    public Director() {
        this.nombre = "Pilar";
    }

    public Director(Integer salario, Integer horasDeTrabajo) {
        this.salario = salario;
        this.horasDeTrabajo = horasDeTrabajo;
    }

    public Integer getSalario() {
        return salario;
    }

    public void setSalario(Integer salario) {
        this.salario = salario;
    }

    public Integer getHorasDeTrabajo() {
        return horasDeTrabajo;
    }

    public void setHorasDeTrabajo(Integer horasDeTrabajo) {
        this.horasDeTrabajo = horasDeTrabajo;
    }

    @Override
    public Integer calcularEdad() {
        return super.calcularEdad(); 

    }

}
