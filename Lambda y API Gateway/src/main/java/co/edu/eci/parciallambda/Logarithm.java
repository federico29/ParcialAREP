package co.edu.eci.parciallambda;

/**
 *
 * @author Federico Barrios Meneses
 */
public class Logarithm {
    
    public static String log(Double x){
        String json = "";
        json = "{'operation': log, 'input': " + x + ", 'output': " + Math.log(x) + "}";
        return json;
    }
}
