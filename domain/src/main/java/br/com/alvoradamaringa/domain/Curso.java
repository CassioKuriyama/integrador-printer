package br.com.alvoradamaringa.domain;

 
 public class Curso {
     private long idCurso;
     private String descricao;   
     
     public void setId(Long idcurso){
          this.idcurso=idcurso;
     }
     public void setDescricao(String descricao){
          this.descricao=descricao;
     }
     public Long getId(Long idcurso){
          return this.idcurso;
     }
     public String getDescricao(String descricao){
          return this.descricao;
     }
     
 }
