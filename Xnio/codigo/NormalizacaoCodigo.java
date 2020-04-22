package JavaA.Xnio.codigo;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizacaoCodigo {
    String diretorioProjeto = "P-Java\\home\\Pedro\\dev\\arquivo.txt";
    String arquivoTxt = "..\\..\\arquivo.txt";
    Path p1 = Paths.get(diretorioProjeto,arquivoTxt);
        System.out.println(p1);
        System.out.println(p1.normalize());
    Path p2 = Paths.get("a/./b/./c");
        System.out.println(p2);w
        System.out.println(p2.normalize());
}
