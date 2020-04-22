package JavaA.Oexception.customexception;

public class LoginInvalidoException  extends Exception{
    public LoginInvalidoException(){
        super("usuario ou senha invalidos");
    }
}
