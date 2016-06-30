/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author Leonardo Araujo
 */
import java.io.*;


class CalculatorEngine
{
    int value;
    int keep;
    char toDo;
    void binaryOperation(char op)
    {
        keep = value;
        value = 0;
        toDo = op;
    }
    void add()      {binaryOperation('+');}
    void subtract() {binaryOperation('-');}
    void multiply() {binaryOperation('*');}
    void divide()   {binaryOperation('/');}
    void compute()
    {
        if (toDo == '+')
            value = keep + value;
        else if (toDo == '-')
            value = keep - value;
        else if (toDo == '*')
            value = keep * value;
        else if (toDo == '/')
            value = keep / value;
        keep = 0;
    }
    void clear()
    {
        value = 0;
        keep = 0;
    }
    void digit(int x)
    {
        value = value*10 + x; 
    }
    int display()
    {
        return(value);
    }
    CalculatorEngine() {clear();}
}
class CalculatorInput
{
    BufferedReader stream;
    CalculatorEngine engine;
    
    CalculatorInput(CalculatorEngine e)
    {
        InputStreamReader input = new InputStreamReader(System.in);
        stream = new BufferedReader(input);
        engine = e;
    }
    void run() throws Exception
    {
        for(;;)
        {
            System.out.print("[" + engine.display() + "]");
            String m = stream.readLine();
            if(m == null)   
                break;
            if(m.length() > 0)
            {
                char c = m.charAt(0);
                if(c == '+')
                    engine.add();
                else if(c == '-')
                    engine.subtract();
                else if(c == '*')
                    engine.multiply();
                else if(c == '/')
                    engine.divide();
                else if(c >= '0' && c <= '9')
                    engine.digit(c - '0');
                else if(c == '=')
                    engine.compute();
                else if(c == 'c' || c == 'C')
                    engine.clear();
            }
        }
    }
}

public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        CalculatorEngine e = new CalculatorEngine();
        CalculatorInput x = new CalculatorInput(e);
        x.run();
    }
    
}
