package br.com.zup;

public class Main {

    public static void main(String[] args) {
        boolean continuarExecultar = true;
       while(continuarExecultar){
           try {
              continuarExecultar= Sistema.execultar();

           } catch (Exception erro) {
               System.out.println(erro.getMessage());
           }
       }

    }
}
