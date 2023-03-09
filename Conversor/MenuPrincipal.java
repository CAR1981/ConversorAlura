import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MenuPrincipal {

    public void MenuInicial() {
        
        String [] lista={"Conversor de moneda", "Conversor de temperatura", "Conversor de longitud"};
        
        ImageIcon icono = new ImageIcon("imagen/convertir.png");

        Object seleccion = JOptionPane.showInputDialog(null, "Seleccione una opción de conversión",
                "Menu", JOptionPane.PLAIN_MESSAGE, icono, lista, lista[0]);
  

        if (seleccion != null) {
            SeleccionMenu(seleccion.toString());
        } else {
            new Mensaje().MensajeContinuar(); 
        }
    }

    private void SeleccionMenu(String seleccionMenu) {

        String resp = seleccionMenu;

        switch (resp) {
            case "Conversor de moneda":
                new ConversionMoneda().convertir();
                break;
            case "Conversor de temperatura":
                new ConversionTemperatura().convertir();
                break;
            case "Conversor de longitud":
                new ConversionLongitud().convertir();
                break;
            default:
                new Mensaje().MensajeContinuar();
                break;
        }

    }

}