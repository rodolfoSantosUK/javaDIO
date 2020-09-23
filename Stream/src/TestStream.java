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

        System.out.println("Quantidade " + estudantes.stream().count());

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

        System.out.println(" Nome mais a quantidade de letras " + estudantes
                .stream().map(estudante ->
                        estudante.concat(" - ")
                                 .concat(String.valueOf(estudante.length()))).collect(Collectors.toList()));

        System.out.println(" Retorna os 3 primeiros elementos: " + estudantes
                .stream()
                .limit(3).collect(Collectors.toList()));

//      Exibe cada elemento no console e depois retorna a mesma coleção
        System.out.println(" Retorna os elementos: " + estudantes
                .stream()
                .peek(System.out::println)
                .collect(Collectors.toList()));

        // Exibe cada elemento
        System.out.println(" Retorna os elementos novamente: ");
        estudantes.stream().forEach(System.out::println);

        // Retorna true se todos os elements possuirem letra w no nome
        System.out.println(" tem algum elemento com a letra w no nome ? " +
                estudantes
                        .stream()
                        .allMatch((elemento) -> elemento.contains("w")));

        //  Retorna true se algum dos elementos
        System.out.println(" Possui algum elemento com a ?  " +
                estudantes
                        .stream()
                        .anyMatch((estudante) ->
                                estudante.toLowerCase().contains("a"))
        );



    }

}
