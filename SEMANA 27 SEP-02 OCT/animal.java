package main;

public class Animal {
    private String especie;

    public Animal() {
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
    
    public void comer (){
        System.out.println("El animal de especie:"+this.especie+" come todos los dias");
    }
    public void dormir (){
        System.out.println("El animal esta durmiendo");
    }  
    public class perro extends Animal{
        private String raza;

        public perro() {
        }

        public String getRaza() {
            return raza;
        }

        public void setRaza(String raza) {
            this.raza = raza;
        }
        public void sonido (){
            System.out.println("El perro hace guau");
        }
    
}

}
