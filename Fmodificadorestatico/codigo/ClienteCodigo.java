package JavaA.Fmodificadorestatico.codigo;


import JavaA.Fmodificadorestatico.classes.Cliente;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class ClienteCodigo {
    public static void main(String[] args) {
        Cliente c = new Cliente();
        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente();
        System.out.println("exibindo quantidades de parcellas");
        // for(int parcela : c.getParcelas());
        //{System.out.println(parcela+ " ")};

        System.out.println("tamanho: "+Cliente.getParcelas().length);
        System.out.println("tamanho: "+Cliente.getParcelas().length);
        System.out.println("tamanho: "+Cliente.getParcelas().length);

        }


    }
