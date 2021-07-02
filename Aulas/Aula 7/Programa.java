import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class Programa {

    public static void main(String[] args) {

        String arquivo = "D:/Documentos.HD/Sistemas de Informação/Período Atual/POO/Aulas/Aula 7/arquivo.csv";
        List<Voto> apuracao = new ArrayList<>();

        System.out.println("Apuração dos votos \n----------------------");
        

        try(BufferedReader br = new BufferedReader( new FileReader(arquivo) )){
            
            String linha = br.readLine();

            while(linha != null){
                String[] votos = linha.split(",");
                Voto voto = new Voto(votos[0], Integer.parseInt(votos[1]) );
                apuracao.add(voto);

                // System.out.println(linha);

                linha = br.readLine();
            }

        } catch (Exception e){
            System.out.println("Erro ao tentar ler o arquivo.");
        }


        for (Voto voto : apuracao) {
            System.out.println("Candidato: " + voto.getNome() + " - Votos: " + voto.getQtdVotos());
        }

        // ordenar por qtd de votos
        Collections.sort(apuracao);

        /* Collections.sort(apuracao, new Comparator<Voto>() {

            public int compare(Voto v1, Voto v2){
                return Integer.compare(v1.getQtdVotos(), v2.getQtdVotos());
            }
        }); */

        System.out.println("\nApós ordenar: ");
        for (Voto voto : apuracao) {
            System.out.println("Candidato: " + voto.getNome() + " - Votos: " + voto.getQtdVotos());
        }

        // apurar o vencedor
        Map<String, Integer> rank = new HashMap<>();

        for(Voto voto : apuracao){
            if(rank.get(voto.getNome()) == null){
                // entrando pela primeira vez na hash
                rank.put(voto.getNome(), voto.getQtdVotos());
            }
            else {
                // acumula o voto
                Integer acumVoto = rank.get(voto.getNome());

                rank.put(voto.getNome(), voto.getQtdVotos() + acumVoto);
            }
        }

        // mostrar resultado final
        System.out.println("Rank final:");
        for (Map.Entry<String, Integer> r1 : rank.entrySet() ) {
            System.out.println(r1);
        }

    }

}