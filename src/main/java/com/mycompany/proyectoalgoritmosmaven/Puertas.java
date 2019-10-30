package com.mycompany.proyectoalgoritmosmaven;
/**
 * Puertas del aeropuerto
 * @author Andrey y Julian
 */
public class Puertas {
    //atributos
    String viaje;
    int identi;
    int tipoPriori;
    String namePriori;
    /**
     *Get del viaje
     * @return 
     */
    public String getViaje() {
        return viaje;
    }
    /**
     * Set del viaje
     * @param viaje 
     */
    public void setViaje(String viaje) {
        this.viaje = viaje;
    }
    /**
     * Get de la identidad
     * @return 
     */
    public int getIdenti() {
        return identi;
    }
    /**
     * Get del tipo de prioridad
     * @return 
     */
    public int getTipoPriori() {
        return tipoPriori;
    }
    /**
     * Constructor de la clase
     * @param via
     * @param iden
     * @param tipo 
     */
    public Puertas(String via, int iden, int tipo){
        this.viaje=via;
        this.identi=iden;
        this.tipoPriori=tipo;
        switch(tipo){
            case(1):
                this.namePriori="Oro";
                break;
            case(2):
                this.namePriori="Platino";
                break;
            case(3):
                this.namePriori="Especial";
                break;
            case(4):
                this.namePriori="Económico";
                break;
            default:
                this.namePriori="";
                break;
        }   
    }
}
