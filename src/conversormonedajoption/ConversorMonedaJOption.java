/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversormonedajoption;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
/**
 *
 * @author uri
 */
public class ConversorMonedaJOption {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    ConversorMonedaJOption tipo=new ConversorMonedaJOption();
        tipo.elegirConversion();

    }
    
    public  void elegirConversion(){
        Icon icono = new ImageIcon(getClass().getResource("/conversormonedajoption/imagen/con.png"));
        String opciones[]={"opcion", "moneda", "temperatura"};
    String salir="";
    String conversor="";
   do{ 
    conversor = (String) JOptionPane.showInputDialog(null,"elija hacer coversion de Moneda o temperatura","Conversor",JOptionPane.DEFAULT_OPTION,icono,opciones,opciones[0]);
    System.out.println(conversor);
    if(conversor!=null){
    switch(conversor){
            case "moneda": conversorMoneda();
                break;
            case "temperatura": conversorTemperatura();
                break;           
          }
    }
    
   }while(conversor != null);
    }
    
 public  void conversorMoneda(){
    Icon icono = new ImageIcon(getClass().getResource("/conversormonedajoption/imagen/mon.png"));
    String opciones[]={"opcion", "JAP", "EU","KOR","EUR"};
    String conversor = (String) JOptionPane.showInputDialog(null,"elija el tipo de cambio","Conversor de moneda local",JOptionPane.DEFAULT_OPTION,icono,opciones,opciones[0]);
    double moneda=0;
    double resultado=0;
    if(conversor!=null){   
    switch(conversor){
        case"JAP":
            moneda = 8.07;
            break;
        case"EU":
            moneda = .058;
            break;
        case"KOR":
            moneda = 74.35;
            break;
        case"EUR":
             moneda = 18.60;
            break;            
 }
       
        resultado = moneda * Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor"));
        JOptionPane.showMessageDialog(null, "el resultado es " + resultado +" "+ conversor);
       }
       else{
        
        
       }
       
 }
 public void conversorTemperatura(){
     Icon icono = new ImageIcon(getClass().getResource("/conversormonedajoption/imagen/tem2.png"));
     Icon icono2 = new ImageIcon(getClass().getResource("/conversormonedajoption/imagen/c.png"));
    String opciones[]={"opcion", "F°", "K°"};
    String conversor = (String) JOptionPane.showInputDialog(null,"elija la escala","Conversor de temperatura",JOptionPane.DEFAULT_OPTION,icono,opciones,opciones[0]);
 double resultado= 0; 
 double temperatura=0;
    if(conversor!=null){
    switch(conversor){
     case "F°":
         temperatura = 32;
         break;
     case "K°":
         temperatura = 273.15;
         break;
    }
    resultado = (Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor"))* (9/5)) + temperatura;
    JOptionPane.showMessageDialog(null, "el resultado es: "+ resultado +" "+ conversor);
    
 }
    
 }
}


 
 

