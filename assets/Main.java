package assets;


public class Main {

    public static void main(String[] args){
    Persona persona = new Persona();
    persona.setEdad(22);
    persona.setTelefono(1234567);
    persona.setNombre("Carlos");

    System.out.println(persona.getEdad());
    System.out.println(persona.getTelefono());
    System.out.println(persona.getNombre());
    }


}

class Persona {
    private String nombre;
    private int edad,telefono;

    public void setEdad(int edad){
        this.edad = edad;
    }

    public int getEdad(){
        return this.edad;
    }

    public void setTelefono(int telefono){
        this.telefono = telefono;
    }

    public int getTelefono(){
        return this.telefono;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }
}