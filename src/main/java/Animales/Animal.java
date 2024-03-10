package Animales;

public class Animal implements AutoCloseable {

    String nombre;
    String especie;
    String raza;
    String color;
    String sexo;
    String edad;
    String peso;
    String altura;
    String tipo;
    String habitat;
    String alimentacion;
    String reproduccion;
    String cuidados;
    String enfermedades;
    String vacunas;
    boolean salud;
    boolean comportamiento;
    int id;

    public Animal(String nombre, String especie, String raza, String color, String sexo, String edad, String peso, String altura, String tipo, String habitat, String alimentacion, String reproduccion, String cuidados, String enfermedades, String vacunas, boolean salud, boolean comportamiento, int id) {
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.color = color;
        this.sexo = sexo;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        this.tipo = tipo;
        this.habitat = habitat;
        this.alimentacion = alimentacion;
        this.reproduccion = reproduccion;
        this.cuidados = cuidados;
        this.enfermedades = enfermedades;
        this.vacunas = vacunas;
        this.salud = salud;
        this.comportamiento = comportamiento;
        this.id = id;
    }

    @Override
    public String toString() {
        return "animal []";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public void close() {
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getEspecie() {
        return especie;
    }


    public void setEspecie(String especie) {
        this.especie = especie;
    }


    public String getRaza() {
        return raza;
    }


    public void setRaza(String raza) {
        this.raza = raza;
    }


    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }


    public String getSexo() {
        return sexo;
    }


    public void setSexo(String sexo) {
        this.sexo = sexo;
    }


    public String getEdad() {
        return edad;
    }


    public void setEdad(String edad) {
        this.edad = edad;
    }


    public String getPeso() {
        return peso;
    }


    public void setPeso(String peso) {
        this.peso = peso;
    }


    public String getAltura() {
        return altura;
    }


    public void setAltura(String altura) {
        this.altura = altura;
    }


    public String getTipo() {
        return tipo;
    }


    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    public String getHabitat() {
        return habitat;
    }


    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }


    public String getAlimentacion() {
        return alimentacion;
    }


    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }


    public String getReproduccion() {
        return reproduccion;
    }


    public void setReproduccion(String reproduccion) {
        this.reproduccion = reproduccion;
    }


    public String getCuidados() {
        return cuidados;
    }


    public void setCuidados(String cuidados) {
        this.cuidados = cuidados;
    }


    public String getEnfermedades() {
        return enfermedades;
    }


    public void setEnfermedades(String enfermedades) {
        this.enfermedades = enfermedades;
    }


    public String getVacunas() {
        return vacunas;
    }


    public void setVacunas(String vacunas) {
        this.vacunas = vacunas;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }

    public boolean isSalud() {
        return salud;
    }

    public void setSalud(boolean salud) {
        this.salud = salud;
    }

    public boolean isComportamiento() {
        return comportamiento;
    }

    public void setComportamiento(boolean comportamiento) {
        this.comportamiento = comportamiento;
    }

    public String buenasalud(boolean salud) {
        if (salud == true)
            System.out.println("El animal " + nombre + " se encuentra en buen estado de salud");
        else
            System.out.println("El animal " + nombre + " se encuentra en mal estado de salud");
        return nombre;
    }

    public String buencomportamiento(boolean comportamiento) {
        if (comportamiento == true)
            System.out.println("El animal " + nombre + " se encuentra en buen estado de comportamiento");
        else
            System.out.println("El animal " + nombre + " se encuentra en mal estado de comportamiento");
        return nombre;
    }


    public void registrarAlimentacion(String alimento) {
        System.out.println("El animal " + nombre + " ha sido alimentado con " + alimento);
    }

    public void registrarReproduccion(String pareja) {
        System.out.println("El animal " + nombre + " ha tenido una relación con " + pareja);
    }

    public void registrarCuidados(String cuidado) {
        System.out.println("El animal " + nombre + " ha sido cuidado con " + cuidado);
    }

    public void registrarEnfermedades(String enfermedad) {
        System.out.println("El animal " + nombre + " ha sido diagnosticado con " + enfermedad);
    }

    public void registrarVacunas(String vacuna) {
        System.out.println("El animal " + nombre + " ha sido vacunado con " + vacuna);
    }

    public void registrarHabitat(String habitat) {
        System.out.println("El animal " + nombre + " ha sido trasladado a " + habitat);
    }

    public void registrarPeso(String peso) {
        System.out.println("El animal " + nombre + " ha sido pesado y su peso es " + peso);
    }

    public void registrarAltura(String altura) {
        System.out.println("El animal " + nombre + " ha sido medido y su altura es " + altura);
    }

    public void registrarEdad(String edad) {
        System.out.println("El animal " + nombre + " ha sido medido y su edad es " + edad);
    }

    public void registrarColor(String color) {
        System.out.println("El animal " + nombre + " ha sido medido y su color es " + color);
    }

    public void registrarRaza(String raza) {
        System.out.println("El animal " + nombre + " ha sido medido y su raza es " + raza);
    }

    public void registrarEspecie(String especie) {
        System.out.println("El animal " + nombre + " ha sido medido y su especie es " + especie);
    }

    public void registrarNombre(String nombre) {
        System.out.println("El animal " + nombre + " ha sido medido y su nombre es " + nombre);
    }

    public void registrarSexo(String sexo) {
        System.out.println("El animal " + nombre + " ha sido medido y su sexo es " + sexo);
    }

    public void registrarTipo(String tipo) {
        System.out.println("El animal " + nombre + " ha sido medido y su tipo es " + tipo);
    }

    public void registrarId(int id) {
        System.out.println("El animal " + nombre + " ha sido medido y su id es " + id);
    }

    public void registrarSalud(boolean salud) {
        System.out.println(buenasalud(salud));
    }

    public void registrarComportamiento(boolean comportamiento) {
        System.out.println(buencomportamiento(comportamiento));
    }
}

