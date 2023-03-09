
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ConversionLongitud {

    public void convertir() {

        CapturarValor captura = new CapturarValor();
        captura.IngresoValor("Ingrese el valor que desea convertir ►►");
        ElegirMasa(captura.getValorSalida());
    }

    private void ElegirMasa(double valorEntrante) {

        double  metro= 1,
                Kilometro = 1000,
                Pulgada = 0.025399,
                Pie=0.304794,
                Milla=1609.34,
                resultado = 0;

        String seleccionado,
                texto = "";

        String[] lista = {"De Metro a Kilómetro", "De Metro a Pulgada", "De Metro a Pie",
            "De Metro a Milla", "De Kilómetro a Metro", "De Kilómetro a Pulgada", "Kilómetro a Pie", "Kilómetro a Milla",
            "Pulgada a Metro", "Pugada a Kilómetro", "Pulgada a Pie","Pulgada a Milla", "Pie a Metro", "Pie a Kilómetro", 
            "Pie a Pulgada", "Pie a Milla", "Milla a Metro", "Milla a Kilómetro", "Milla a Pie","Milla a Pulgada"};

        ImageIcon icono = new ImageIcon("imagen/longitud.png");

        Object seleccion = JOptionPane.showInputDialog(null, "Seleccione una opción de conversión ☺",
                "Escala de medida", JOptionPane.PLAIN_MESSAGE, icono,
                lista, lista[0]);

        if (seleccion != null) {

            seleccionado = seleccion.toString();

            switch (seleccionado) {
                case "De Metro a Kilómetro":
                    resultado = valorEntrante / Kilometro;
                    texto = "Kilómetros";
                    break;
                    
                case "De Kilómetro a Metro":
                    resultado = valorEntrante * metro;
                    texto = "Metros";
                    break;
                    
                case "De Metro a Pulgada":
                    resultado = valorEntrante / Pulgada;
                    texto = "Pulgadas";
                    break;
                    
                case "Pulgada a Metro":
                    resultado = valorEntrante * metro;
                    texto = "Metros";
                    break; 
                    
                case "De Metro a Pie":
                    resultado = valorEntrante / Pie;
                    texto = "Pie";
                    break;
                    
                case "Pie a Metro":
                    resultado = valorEntrante * metro;
                    texto = "Metros";
                    break;
                    
                    
                case "De Metro a Milla":
                    resultado = valorEntrante / Milla;
                    texto = "Millas";
                    break;
                    
                case  "Milla a Metro" :
                    resultado = valorEntrante * metro;
                    texto = "Metros";
                    break;    
                
                case "De Kilómetro a Pulgada":
                    resultado = valorEntrante / Pulgada;
                    texto = "Pulgadas";
                    break;
                    
                case "Pugada a Kilómetro":
                    resultado = valorEntrante * Kilometro;
                    texto = "Kilómetros";
                    break;   
                    
                case "Kilómetro a Pie":
                    resultado = valorEntrante / Pie;
                    texto = "Pies";
                    break; 
                    
                case "Pie a Kilómetro":
                    resultado = valorEntrante * Kilometro;
                    texto = "Kilómetros";
                    break;   
                    
                case "Kilómetro a Milla":
                    resultado = valorEntrante / Milla;
                    texto = "Millas";
                    break; 
                            
                case  "Milla a Kilómetro":
                    resultado = valorEntrante * Kilometro;
                    texto = "Kilómetros";
                    break;    
                     
                    
                case "Pulgada a Pie":
                    resultado = valorEntrante / Pie;
                    texto = "Pies";
                    break;
                    
                case "Pie a Pulgada":
                    resultado = valorEntrante * Pulgada;
                    texto = "Pulgadas";
                    break;    
                    
                case "Pulgada a Milla":
                    resultado = valorEntrante / Milla;
                    texto = "Millas";
                    break; 
                   
                case  "Milla a Pulgada":
                    resultado = valorEntrante * Pulgada;
                    texto = "Pulgadas";
                    break;
                    
                    
                case "Pie a Milla":
                    resultado = valorEntrante / Milla;
                    texto = "Millas";
                    break; 
                  
                                    
                case  "Milla a Pie":
                    resultado = valorEntrante * Pie;
                    texto = "Pies";
                    break;  
                    
                     
                default:
                    new Mensaje().MensajeContinuar();
                    break;
            }

            new Mensaje().MensajeResultado("Usted tiene " + " " + String.format("%.2f", resultado) + " " + texto);
       
        } else {
            
             new ConversionLongitud().convertir();
             
        }

    }
}
