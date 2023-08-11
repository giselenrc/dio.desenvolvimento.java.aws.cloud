import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MonitoramentoLogsAWS {
  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> eventosPorServico = new HashMap<>();
        String maiorServico = "";
        String menorServico = "";

        int quantidadeLogs = scanner.nextInt();

        int quantidade =0;
        int quantidadeMaior = Integer.MIN_VALUE;
        int quantidadeMenor = Integer.MAX_VALUE;

        for (int i = 1; i<= quantidadeLogs; i++){
          String log = scanner.next();

          String servico = scanner.nextLine().split(",")[1];
          if (!eventosPorServico.containsKey(servico)){
            eventosPorServico.put(servico,1);
          }else{
             quantidade = eventosPorServico.get(servico) + 1;
             eventosPorServico.put(servico,quantidade);
          }
        }
        
        System.out.println("Eventos por servico:");
        for(Map.Entry<String, Integer> s : eventosPorServico.entrySet() ){
           System.out.println(s.getKey() +":"+ s.getValue());
          
           if(s.getValue() > quantidadeMaior){
              maiorServico    = s.getKey();
              quantidadeMaior = s.getValue();
           } 
           if( s.getValue() < quantidadeMenor){
              menorServico = s.getKey();
              quantidadeMenor = s.getValue();
           }
        }
        System.out.println("Maior:" + maiorServico);
        System.out.println("Menor:" + menorServico);
       
        scanner.close();
    }
}
