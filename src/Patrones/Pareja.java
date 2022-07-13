/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patrones;

/**
 *
 * @author leobusta
 */
public class Pareja<K, V> {

    protected K clave;
    protected V valor;

    public Pareja(K clave, V valor) {
        this.clave = clave;
        this.valor = valor;
    }

    public K clave() {
        return clave;
    }

    public V valor() {
        return valor;
    }

    @Override
    public String toString() {
        return "(" + clave + "," + valor + ")";
    }
}
