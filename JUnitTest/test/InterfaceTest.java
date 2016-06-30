/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Random;
import javax.swing.JButton;
import junit.framework.TestCase;

/**
 *
 * @author Leonardo Araujo
 */
public class InterfaceTest extends TestCase {
    
    public InterfaceTest(String testName) {
        super(testName);
    }

    /**
     * Test of main method, of class Interface.
     */
    public void testMain() {
        Interface calculadora = new Interface();
        Random randomNumber = new Random();
        float num1 = randomNumber.nextFloat()*randomNumber.nextInt();
        System.out.printf("Operando 1: %f\n",num1);
        float num2 = randomNumber.nextFloat()*randomNumber.nextInt();
        System.out.printf("Operando 2: %f\n",num2);
        String expected_result;
        String result;
        
        expected_result = Float.toString(num1+num2);
        calculadora.jTextField1.setText(Float.toString(num1));
        calculadora.jButtonAdd.doClick();
        calculadora.jTextField1.setText(Float.toString(num2));
        calculadora.jButtonResult.doClick();
        result = calculadora.jTextField1.getText();
        assertEquals(expected_result,result);
        
        expected_result = Float.toString(num1-num2);
        calculadora.jTextField1.setText(Float.toString(num1));
        calculadora.jButtonSubtract.doClick();
        calculadora.jTextField1.setText(Float.toString(num2));
        calculadora.jButtonResult.doClick();
        result = calculadora.jTextField1.getText();
        assertEquals(expected_result,result);
        
        expected_result = Float.toString(num1*num2);
        calculadora.jTextField1.setText(Float.toString(num1));
        calculadora.jButtonMultiply.doClick();
        calculadora.jTextField1.setText(Float.toString(num2));
        calculadora.jButtonResult.doClick();
        result = calculadora.jTextField1.getText();
        assertEquals(expected_result,result);
        
        expected_result = Float.toString(num1/num2);
        calculadora.jTextField1.setText(Float.toString(num1));
        calculadora.jButtonDivide.doClick();
        calculadora.jTextField1.setText(Float.toString(num2));
        calculadora.jButtonResult.doClick();
        result = calculadora.jTextField1.getText();
        assertEquals(expected_result,result);
        
    }
    
}
