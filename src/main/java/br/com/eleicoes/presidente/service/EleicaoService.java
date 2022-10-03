package br.com.eleicoes.presidente.service;

import java.util.List;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import br.com.eleicoes.presidente.dto.Candidatos;
import br.com.eleicoes.presidente.dto.EleicoesDTO;

@Component
public class EleicaoService {


    private static final String TIME_ZONE = "America/Sao_Paulo";
    
    @Scheduled(cron = "0/15 * * * * *", zone = TIME_ZONE)
    public void apurarEleicao(){
        RestTemplate restTemplate = new RestTemplate();
        String theUrl = "https://resultados.tse.jus.br/oficial/ele2022/544/dados-simplificados/br/br-c0001-e000544-r.json";
        ResponseEntity<EleicoesDTO> response = restTemplate.getForEntity(theUrl, EleicoesDTO.class);

        List<Candidatos> apuracao =  response.getBody().getCand(); 

        System.out.println("---------------------------------------------------------------------");
        System.out.println("-------------       Apuração Presidente Candidatos 2022  ------------");
        System.out.println("---------------------------------------------------------------------");
        
        for (Candidatos candidato : apuracao) {
          System.out.println(candidato.toString());
        }
        
    }

    
}
