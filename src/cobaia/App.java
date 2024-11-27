package cobaia;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class App {
  public static void main(String[] args) {
    System.out.println("OK");

    // acoplamento posicional
    // p1 = ["14:12:56", "22:32:12"]
    Map<String, String> p1 = Ponto.ler("2024-11-25");
    System.out.println(p1);
    System.out.println("Entrou: " + p1.get("entrada")); // 14:12:56
    System.out.println("Saiu: " + p1.get("saida")); // 22:32:12

    // 12 [Marcio, Guilherme]

    // List<String> lista = new ArrayList<>();
    // MAPA (DICIONÁRIO), CHAVE/VALOR
    // coleção nomeada
    // <Chave, Valor>
    Map<String, String> pessoa = new HashMap<>();
           // <String , String>
    pessoa.put("sobrenome", "Torres");
    pessoa.put("nome", "Marcio");

    System.out.println(pessoa);
    System.out.println(pessoa.get("sobrenome"));

    Map<Integer, String> alunos = new HashMap<>();
    // mapeado uma matrícula a um estudante
    alunos.put(2024007207, "Guilherme Lemos");
    alunos.put(2024123433, "Guilherme Couto");

    System.out.println(alunos.get(2024007207));

    
  }
}