package br.com.eleicoes.presidente.dto;

import lombok.Data;

@Data
public class Candidatos {

    private String seq;
    private String sqcand;
    private String n;
    private String nm;
    private String cc;
    private String nv;
    private String e;
    private String st;
    private String dvt;
    private String vap;
    private String pvap;
    @Override
    
    public String toString() {
        return  this.getSeq() +" - " + this.getNm() + " , Votos=" + this.getVap() + ", Percentual=" + this.getPvap();
    }
    
  
    
}
