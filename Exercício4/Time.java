/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package time;

/**
 *
 * @author Leonardo Araujo
 */
public class Time {
    
    private int hour;
    private int minute;
    
    public int getHour(){
        return hour;
    }
    public void setHour(int h){
        hour = h;
    }
    public int getMinute(){
        return minute;
    }
    public void setMinute(int m){
        minute = m;
    }
    
    Time() {};

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Time t = new Time();
        t.setHour(3);
        t.setMinute(25);
        System.out.println("The time now is " + t.getHour() + ":" + t.getMinute());
    }
    
}
