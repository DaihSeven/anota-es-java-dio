package desafios.repetir;

import java.util.Scanner;

import javax.sql.rowset.spi.SyncFactory;

/*
Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare o programa inserindo o valor 0 no campo nome)
*/
public class Ex_NomeiDade{
    /**
     * @param args
     */
    public static void main(String[] args) { //é só digita main e aparce o resto
        Scanner scan = new Scanner(System.in); //* */ tem que selecionar um scanner com um monte 
        //escrita e sobre essas escreve o resto
    //variaveis originalmente eram string mome;
        int nome;//armazena o nome
        int idade;//armazena a idade

        while(true) { //enquanto o loop for verdadeiro
            System.out.println("nome: ");//peça o nome
            nome= scan.nextInt();// armazena o nome na variavel

            if (nome.equals("0") ){ //para o loop se o nome for zero
                break;//interrompe o programa
            }            
            System.out.println("idade: ");//pede idade
            idade= scan.nextInt();//armazena a idade na variavel
            //imprime nome e idade pra responder
            System.out.println("Nome: " + nome + " - idade: " + idade);
        
        }



        }






        
    }
}