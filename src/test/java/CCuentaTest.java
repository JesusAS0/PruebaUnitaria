/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author jesus
 */
public class CCuentaTest {
    
    public CCuentaTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    
    @Test
    //TEST DEL METODO DE ASIGNAR NOMBRE DE LA CLASE CCUENTA.
    public void testAsignarNombre() {
        System.out.println("asignarNombre");
        String nom = null;
        CCuenta instance = new CCuenta();
        String nombre=instance.asignarNombre(nom);
        assertEquals(nom,nombre);
       
    }

    
    @Test
    //TEST DEL METODO DE OBTENER EL NOMBRE DE LA CLASE CCUENTA.
    public void testObtenerNombre() {
        System.out.println("obtenerNombre");
        CCuenta instance = new CCuenta();
        String expResult = null;
        String result = instance.obtenerNombre();
        assertEquals(expResult, result);
        
    }

    
    @Test
    //TEST DEL METODO ESTADO DE LA CLASE CCUENTA.
    public void testEstado() {
        System.out.println("estado");
        CCuenta instance = new CCuenta();
        double expResult = 2500;
        double result = instance.estado();
        assertEquals(expResult, result, 2500);
        
    }

    
    @Test
    //TEST DEL METODO INGRESAR DE LA CLASE CCUENTA
    public void testIngresar() throws Exception {
        System.out.println("ingresar");
        double cantidad = 1695;
        CCuenta instance = new CCuenta();
        double result= instance.ingresar(cantidad);
        assertEquals(cantidad,result);
        
    }

    
    @Test
    //TEST DEL METODO RETIRAR DE LA CLASE CCUENTA.
    public void testRetirar() throws Exception {
        System.out.println("retirar");
        double cantidad = 0.0;
        CCuenta instance = new CCuenta();
        double resultado=instance.retirar(cantidad);
        assertEquals(cantidad,resultado);
        
    }

   
    @Test
    //TEST DEL METODO  OBTENER CUENTA DE LA CLASE CCUENTA.
    public void testObtenerCuenta() {
        System.out.println("obtenerCuenta");
        CCuenta instance = new CCuenta();
        String expResult = null;
        String result = instance.obtenerCuenta();
        assertEquals(expResult, result);
       
    }
    
    //TEST DEL METODO INGRESAR Y RETIRAR DE LA CLASE CCUENTA.
    public void testIngresarRetirar() throws Exception {
        System.out.println("IngresarRetirar");
        CCuenta instance = new CCuenta();
        double cantidad= 0;
        double resultado= instance.ingresar(cantidad);
        assertEquals(cantidad,resultado);
        
        double resultado2= instance.retirar(cantidad);
        assertEquals(cantidad,resultado2);
    }
}
