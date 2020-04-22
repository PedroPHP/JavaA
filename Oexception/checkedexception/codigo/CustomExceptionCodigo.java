package JavaA.Oexception.checkedexception.codigo;

import JavaA.Oexception.customexception.LoginInvalidoException;

public class CustomExceptionCodigo {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }
    private static void logar() throws LoginInvalidoException{
        String usuarioBD = "goku";
        String senhaBD = "111";
        String usuarioDigitado = "goku";
        String senhaDigitada = "111";
        if(!usuarioBD.equals(usuarioDigitado) || !senhaBD.equals(senhaDigitada)) {
            throw new LoginInvalidoException();
        }else{
            System.out.println("logado");
        }
    }
}


