import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestStream {
    public static void main(String[] args) {

        List<String> estudantes = new ArrayList<String>();
        estudantes.add("Ana");
        estudantes.add("Thayse");
        estudantes.add("Marcelo");
        estudantes.add("Carla");
        estudantes.add("Juliana Pequeno");
        estudantes.add("Thiago");
        estudantes.add("Rafael");

        System.out.println("Quantidade " +  estudantes.stream().count());
        System.out.println("Maior numero de letras " + estudantes
                .stream()
                .max(Comparator.comparing(String::length)));

        System.out.println("Menor numero de letras " + estudantes
                                                       .stream()
                                                       .min(Comparator.comparing(String::length)));

        System.out.println(" Elemento com letra r " + estudantes
        .stream()
        .filter((estudante) ->
                estudante.toLowerCase().contains("r")).collect(Collectors.toList()));

        System.out.println(" Nome mais a quantidade de letras "  + estudantes
                .stream().map( estudante ->
                        estudante.concat(" - ")
                .concat(String.valueOf(estudante.length()))).collect(Collectors.toList()) );

    }

}
