package main;

import View.CuiNezet;
import model.Lada;

public class LogikaiProgram {
    public static void main(String[] args) {
        run();
    }
    
    public static void run(){
        CuiNezet n1 = new CuiNezet();
        
        Lada a = new Lada("arany", "en rejtem", true);
        Lada e = new Lada("ezust", "nem en rejtem");
        Lada b = new Lada("bronz", "az arany hazudik");
        
        n1.feladatMegjelenito("csak 1 ir igazat");
    }
    
}
