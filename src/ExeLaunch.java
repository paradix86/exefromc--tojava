
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author developer
 */
public class ExeLaunch {
    //public char parametro1, parametro2;
    
    public static void main(String[] args) {
        Runtime run = Runtime.getRuntime();
        
    /**
     *@param nomeexe name of the exe
     * @param parametro1 parameter for cmd
     * @param parametro2
     */
    
    }
  public static void LanciaExe(String nomeexe, String parametro1, String parametro2)
        {
        try {
        
            Process pp= new ProcessBuilder(nomeexe, parametro1, parametro2).start();
            BufferedReader in =new BufferedReader(new InputStreamReader(pp.getErrorStream()));
            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
            int exitVal = pp.waitFor();
            System.out.println("Process exitValue: " + exitVal);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        }  
    
}
