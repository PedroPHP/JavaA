package JavaA.Oexception.runtimeexepition.codigo;

public class RuntimeExeceptionCodigo {
    public static void main(String[] args) {
        try{
            divisao(10,0);
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
    private static void divisao(int num1, int num2){
       if(num2 == 0){
           throw new IllegalArgumentException("passe um valor diferente de 0 para nu 2");
       }
        int result = num1/num2;
        System.out.println(result);
    }
}
