//Autor: Fabricio dos Santos Freitas

package clinica;

import java.util.Scanner;

public class Medicos {
    
    public static void main(String[] args) {
        
        String nome_medicos;
        String crm_medicos;
        String especialidade_medicos;
        int admissao_medicos;
        double salario_medicos;
        double reajuste_medicos;
        int controle;
        
        Scanner a = new Scanner (System.in);
        System.out.print("SEJA BEM VINDO AO SISTEMA DE GESTÃO DE MEDICAÇÕES,"
            + "DIGITE 1 PARA INICIAR O SISTEMA: ");
        controle = a.nextInt();
        
        if(controle == 1){
           
        
        
        //COMANDO DE ENTRADA DE DADOS
        
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o Nome do(a) médico(a): ");
        nome_medicos = ler.nextLine();
        System.out.println("Digite o CRM do(a) médico(a): ");
        crm_medicos = ler.nextLine();
        System.out.println("Digite a Especialidade do(a) médico(a): ");
        especialidade_medicos = ler.nextLine();
        System.out.println("Digite a Admissão do(a) médico(a): ");
        admissao_medicos = ler.nextInt();
        System.out.println("Digite o Salário do(a) médico(a): ");
        salario_medicos = ler.nextDouble();
        
        while (salario_medicos < 0){
            
            System.out.print("Valor inválido, digite novamente seu salário");
            salario_medicos = ler.nextDouble();
            
        }
        
        //ESTRUTURA DE CONDIÇÃO
        if (salario_medicos>=2000){
    
            reajuste_medicos = salario_medicos * 1.2;
        
        }
        
        else if(salario_medicos>=1000 && salario_medicos<2000){
            
            reajuste_medicos = salario_medicos * 1.1;
            
        }
        
        else if(salario_medicos>0 && salario_medicos<1000){
            
            reajuste_medicos = salario_medicos * 1.05;
            
        }
        
        else{
            
            reajuste_medicos = salario_medicos;
            
        }
        
        //COMANDO DE SAÍDA DE DADOS
        
        System.out.println("Médico: " + nome_medicos + "\n" +
                           "CRM: " + crm_medicos + "\n" +
                           "Especialidade: " + especialidade_medicos + "\n" +
                           "Ano de admissão: " + admissao_medicos + "\n" +
                           "Salário: " + salario_medicos + "\n");
        
        
        }
    
    }
}