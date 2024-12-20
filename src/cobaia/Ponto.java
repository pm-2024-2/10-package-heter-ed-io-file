package cobaia;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Ponto {
    // yml -> "iémel"

    /**
     * Lê o arquivo data.yml e retorna
     * o registro do ponto
     * 
     * @param data A data a ser consultada
     * @return Um mapa com a entrada e saída
     */
    static Map<String, String> ler(String data) {
        Map<String, String> ponto = new HashMap<>();
        var arquivo = Path.of(data + ".yml");
        
        try {
            var linhas = Files.readAllLines(arquivo);
            // [nome,
            // sobrenome,
            // data]
            
            // ESCALÁVEL, ler quantas linhas houver
            for (var linha : linhas) {
                int coluna = linha.indexOf(":");
                //         01234567890123456
                // linha = entrada: 07:52:56
                // coluna = 7
                // substr(0, coluna) = entrada
                // substr(col + 2) = 07:52:56
                ponto.put(linha.substring(0, coluna),
                          linha.substring(coluna + 2));
            }

            // NÃO ESCALÁVEL
            // int i = linhas.get(0).indexOf(":");
            // ponto.put(
            //   linhas.get(0).substring(0, i), // key
            //   linhas.get(0).substring(i + 2)); // value

            // int j = linhas.get(1).indexOf(":");
            // ponto.put(
            //     linhas.get(1).substring(0, j),
            //     linhas.get(1).substring(j + 2));

            // Input/Output Exception
        } catch (IOException e) { // deu ruim
            System.err.println(e.getMessage());
        }

        return ponto;
    }
}
