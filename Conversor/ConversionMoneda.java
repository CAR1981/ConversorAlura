
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ConversionMoneda {

    public void convertir() {

        CapturarValor capturar = new CapturarValor();
        
        capturar.IngresoValor("Ingrese la cantidad de efectivo que desea convertir ►►");
        
        ElegirMoneda(capturar.getValorSalida());
    }

    private void ElegirMoneda(double valorEntrante) {

        double dolar = 200.16;
        double  euro = 5118.9;
        double  libra = 238.51;
        double  yen = 146.87;
        double  won = 6.60;
        double  resultado = 0;

        String seleccionado,
                texto = "";

        String[] lista = {"De Pesos a Dólar", "De Pesos a Euro", "De Pesos a Libras",
            "De Pesos a Yen", "De Pesos a Won Coreano", "De Dólar a Pesos",
            "De Euro a Pesos", "De Libras a Pesos", "De Yen a Pesos",
            "De Won Coreano a Pesos"};

        ImageIcon icono = new ImageIcon("imagen/dinero.jpg");

        Object seleccion = JOptionPane.showInputDialog(null, "Seleccione una opción de conversión ►►",
                "Moneda", JOptionPane.PLAIN_MESSAGE, icono, lista, lista[0]);

        if (seleccion != null) {
            
            seleccionado = seleccion.toString();
            
            switch (seleccionado) {
                case "De Pesos a Dólar":
                    resultado = valorEntrante / dolar;
                    texto = "Dolares";
                    break;
                case "De Dólar a Pesos":
                    resultado = valorEntrante * dolar;
                    texto = "Pesos";
                    break;
                case "De Pesos a Euro":
                    resultado = valorEntrante / euro;
                    texto = "Euros";
                    break;
                case "De Euro a Pesos":
                    resultado = valorEntrante * euro;
                    texto = "Pesos";
                    break;
                case "De Pesos a Libras":
                    resultado = valorEntrante / libra;
                    texto = "Libras";
                    break;
                case "De Libras a Pesos":
                    System.out.println(valorEntrante);
                    resultado = valorEntrante * libra;
                    texto = "Pesos";
                    break;
                case "De Pesos a Yen":
                    resultado = valorEntrante / yen;
                    texto = "Yenes";
                    break;
                case "De Yen a Pesos":
                    resultado = valorEntrante * yen;
                    texto = "Pesos";
                    break;
                case "De Pesos a Won Coreano":
                    resultado = valorEntrante / won;
                    texto = "Wones";
                    break;
                case "De Won Coreano a Pesos":
                    resultado = valorEntrante * won;
                    texto = "Pesos";
                    break;
                default:
                    new Mensaje().MensajeContinuar();
                    break;
            }

            new Mensaje().MensajeResultado("Usted tiene " + " " + String.format("%.2f", resultado) + " " + texto);

        } else {
            
            new ConversionMoneda().convertir();
            
        }
    }

}