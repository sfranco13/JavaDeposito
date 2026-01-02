package cuentas;

/**
 * Clase que gestiona los datos de una cuenta bancaria.
 * @author Silvia
 * @version 1.0
 */
public class CCuenta {
    /** Nombre del titular de la cuenta */
    private String nombre;
    /** Número de la cuenta bancaria */
    private String cuenta;
    /** Saldo actual en la cuenta */
    private double saldo;
    /** Tipo de interés aplicado a la cuenta */
    private double tipoInterés;

    /**
     * @return el número de cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta el número de cuenta a establecer
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return el tipo de interés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * @param tipoInterés el interés a establecer
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public CCuenta()
    {
    }

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * Devuelve el saldo actual de la cuenta.
     * @return El saldo disponible en tipo double.
     */
    public double estado()
    {
        return saldo;
    }

    /**
     * Incrementa el saldo de la cuenta con la cantidad indicada.
     * @param cantidad La suma a ingresar.
     * @throws Exception Si la cantidad es negativa.
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * Reduce el saldo de la cuenta tras una extracción.
     * @param cantidad La suma a retirar.
     * @throws Exception Si la cantidad es negativa o el saldo es insuficiente.
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
