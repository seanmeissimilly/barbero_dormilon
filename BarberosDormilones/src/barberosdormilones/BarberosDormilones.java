package barberosdormilones;

public class BarberosDormilones {

    public static void main(String[] args) {       
        interfaz inicio = new interfaz();
        inicio.setVisible (true);  
        
        
        inicio.dormir(1);
        inicio.dormir(2);
        inicio.dormir(3);
        inicio.quitarCliente(1);
        inicio.quitarCliente(2);
        inicio.quitarCliente(3);
     
    }   
}