package com.mycompany.proyectoalgoritmosmaven;
/**
 * Colas de prioridad
 * @author Andrey y Julian
 */
public class ColaPriori {
    //atributos
    private Node front;
    private Node rear;
    private int size;
    /**
     * Clase Nodo
     */
    public class Node {
        //atributos
        public Object element;
        public Node next;
        public int prioridad;
        /**
         * Constructor por defecto
         */
        public Node() {
            this.element = null;
            this.next = null;
        }
        /**
         * Constructor con el objeto
         * @param element 
         */
        public Node(Object element) {
            this.element = element;
            this.next = null;
        }
        /**
         * Constructor con el Objeto y Nodo
         * @param element
         * @param next 
         */
        public Node(Object element, Node next) {
            this.element = element;
            this.next = next;
        }
        /**
         * Get del elemento
         * @return 
         */
        public Object getElement() {
            return this.element;
        }
        /**
         * Set del elemento
         * @param element 
         */
        public void setElement(Object element) {
            this.element = element;
        }
        /**
         * Get del Nodo siguiente
         * @return 
         */
        public Node getNext() {
            return this.next;
        }
        /**
         * Set del Nodo siguiente
         * @param next 
         */
        public void setNext(Node next) {
            this.next = next;
        }
    }
    /**
     * Constructor por defecto de la clase principal
     */
    public ColaPriori() {
        this.front = new Node();
        this.rear = this.front;
        this.size = 0;
    }   
    /**
     * Agrega un elemento a la lista
     * @param element
     * @param prioridad 
     */
    public void enqueue(Object element, int prioridad) {
        this.rear.setNext(new Node(element, null));
        this.rear = rear.getNext();
        this.size++;
    }
    /**
     * Elimina un elemento de la lista
     * @return 
     */
    public Object dequeue() {
        if (this.size == 0) {
            System.out.println("Queue is empty");
            return null;
        }
        Object temp = this.front.getNext().getElement();
        Node nObjectemp = this.front.getNext();
        this.front.setNext(nObjectemp.getNext());
        if (this.rear == nObjectemp) {
            this.rear = this.front;
        }
        this.size--;
        return temp;
    }
    /**
     * Se dirige al primer elemento en la lista
     * @return 
     */
    public Object first() {
        if (this.size == 0) {
            System.out.println("Queue is empty");
            return null;
        }
        return this.front.getNext().getElement();
    }
    /**
     * Retorna el tamaño de la lista
     * @return 
     */
    public int size() {
        return this.size;
    }
    /**
     * Limpia la lista
     */
    public void clear() {
        this.front = new Node();
        this.rear = this.front;
        this.size = 0;
    }
    /**
     * Imprime la lista en String
     * @return 
     */
    @Override
    public String toString() {
        String result = "**LQueue**\n";
        Node tFront = this.front;
        int tSize = this.size;
        while (tSize != 0) {
            result += tFront.getNext().getElement() + " ";
            tFront = tFront.getNext();
            tSize--;
        }
        return result;
    }
    /**
    * Cambia el marcador en la lista
    */
    public void rotate() {
        if (this.size == 0) {
            System.out.println("Queue is empty");
        } else {
            Node current = this.front.getNext();
            Node temp = null;
            Node newRear = null;
            while (current != null) {
                if (current == this.front.getNext()) {
                    temp = new Node(current.getElement(), null);
                    newRear = temp;
                } else if (current == this.rear) {
                    temp = new Node(current.getElement(), temp);
                    this.front.setNext(temp);
                } else {
                    temp = new Node(current.getElement(), temp);
                }
                current = current.getNext();
            }
            this.rear = newRear;
        }
    }
    /**
     * Auxiliar en el cambio de puntero
     */
    public void rotate2() {
        if (this.size == 0) {
            System.out.println("Queue is empty");
        } else {
            Node next = this.front.getNext();
            Node afterNext = next.getNext();
            Node temp = null;
            while (afterNext != null) {
                if (next == this.front.getNext()) {
                    next.setNext(null);
                    this.front.setNext(this.rear);
                    this.rear = next;
                }
                temp = afterNext.getNext();
                afterNext.setNext(next);
                next = afterNext;
                afterNext = temp;
            }
        }
    }
}
