
package main;


public class Perro extends Animal{
        private String raza;

        public Perro() {
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
    
