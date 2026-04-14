package cuentas;

/**
 * Clase que representa una cuenta bancaria
 * Permite ingresar y retirar dinero
 * 
 * @author TuNombre
 * @version 1.0
 */
public class CCuenta {

    // Atributos encapsulados
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    // Constructor vacío
    public CCuenta() {
    }

    // Constructor con parámetros
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
        tipoInteres = tipo;
    }

    /**
     * Devuelve el saldo actual
     */
    public double estado() {
        return saldo;
    }

    /**
     * Getter nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Getter cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Setter cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Getter saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Setter saldo
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Getter tipo de interés
     */
    public double getTipoInteres() {
        return tipoInteres;
    }

    /**
     * Setter tipo de interés
     */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    /**
     * Permite ingresar dinero en la cuenta
     * @param cantidad Cantidad a ingresar
     * @throws Exception Si la cantidad es negativa
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0)
            throw new Exception("No se puede ingresar una cantidad negativa");

        saldo = saldo + cantidad;
    }

    /**
     * Permite retirar dinero de la cuenta
     * @param cantidad Cantidad a retirar
     * @throws Exception Si la cantidad es negativa o no hay saldo suficiente
     */
    public void retirar(double cantidad) throws Exception {

        if (cantidad <= 0)
            throw new Exception("No se puede retirar una cantidad negativa");

        if (estado() < cantidad)
            throw new Exception("No hay suficiente saldo");

        saldo = saldo - cantidad;
    }
}