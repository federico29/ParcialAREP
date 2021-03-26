package co.edu.eci.parciallambda;

/**
 *
 * @author Federico Barrios Meneses
 */
public class ArcoSin {
    
    public static String asin(Double x){
        String json = "";
        json = "{'operation': asin, 'input': " + x + ", 'output': " + Math.asin(x) + "}";
        return json;
    }
}
