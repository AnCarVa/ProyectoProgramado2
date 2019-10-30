package com.mycompany.proyectoalgoritmosmaven;
/**
 * Registro de las personas
 * @author Andrey u Julian
 */
//imports
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class RegistroPersonas {
    //atrubutos
    String nombre;
    String fecha;
    String pasaporte;
    String nacionalidad;
    String lugarOri;
    String destino;
    String priori;
    int tipoPriori;
    static int cont = 1;
    //Arreglos
    public ArrayList<String> asientos = new ArrayList<>();
    public ArrayList persons = new ArrayList<>();
    /**
     * Constructor de la clase
     * @param name
     * @param fechi
     * @param pasaporte
     * @param nacio
     * @param lugi
     * @param desti
     * @param tipo
     * @param pri 
     */
    RegistroPersonas(String name, String fechi, String pasaporte, String nacio, String lugi, String desti, int tipo,String pri) {
        this.nombre = name;
        this.fecha = fechi;
        this.pasaporte = pasaporte;
        this.nacionalidad = nacio;
        this.lugarOri = lugi;
        this.destino = desti;
        this.tipoPriori = tipo;
        this.priori=pri;
        persons.add(pri);
    }
    /**
     * Constructor por defecto
     */
    RegistroPersonas(){
        
    }
    /**
     * Envia la informacion de la persona 
     * @return 
     */
    public String info() {
        int num = random();
        if (num % 2 == 0) {
            String info = "Ingresa " + this.nombre + " al asiento " + this.tipoPriori + "V" + num + " para el vuelo " + cont + " con destino a " + this.destino;
            cont++;
            return info;
        } else {
            String info = "Ingresa " + this.nombre + " al asiento " + this.tipoPriori + "P" + num + " para el vuelo " + cont + " con destino a " + this.destino;
            cont++;
            return info;
        }
    }
    /**
     * Envia la informacion de la persona
     * @return 
     */
    public String infoLis(){
        String a="Nombre: "+this.nombre+" /Destino a "+this.destino+"/ Pasaporte número "+this.pasaporte;
        return a;
    }
    /**
     * Genera los asientos
     * @return 
     */
    public ArrayList<String> asientos(){
        return asientos;
    }
    /**
     * Crea un numero random
     * @return 
     */
    public int random() {
        int numero = ThreadLocalRandom.current().nextInt(1, 99);
        return numero;
    }
    /**
     * Ordena las personas
     */
    public void heap(){
        Heap orden=new Heap();
        orden.Sort(persons);
    }
}
