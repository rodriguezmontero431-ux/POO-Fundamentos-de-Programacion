
package retroalimentacion.parcial;

public class Empleados {
    private String nombre;
    private String cargo;
    private double salarioBase;
    private int anosExperiencia;
    
public Empleados(){
    
}

    public Empleados(String nombre, String cargo, double salario, int anosExperiencia) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.salarioBase = salarioBase;
        this.anosExperiencia = anosExperiencia;
    }

    public Empleados(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salarioBase;
    }

    public void setSalario(double salario) {
        this.salarioBase = salarioBase;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }
    public String verDetalle(){
        return"Elempleado se llama:" + this.nombre +
        "\n El cargo del empleado es:" + this.cargo +
        "\n El salario del empleado es:" + this.salarioBase +
        "\n El empleado tiene estos anos de experiencia" + this.anosExperiencia;
        
    }
    public String trabajar(int horas){
        return "El empleado llamado" + this.nombre +
                "Trabaja estas horas al dia" +horas;       
    }
    public String tomarDescanso(){
        return "El empleado llamado" + this.nombre +
                "Toma una hora de descanso al dia";
    }
    public String trabajarYDescansar(){
           String traba = this.trabajar(horas);
           String descan = this.tomarDescanso();
           return traba+ descan;
