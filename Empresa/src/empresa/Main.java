/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

import javax.swing.JOptionPane;

/**
 *
 * @author felip
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Manager manager[] = new Manager[3];
        Filial filial[] = new Filial[3];
        int i;
        for(i=0;i<=2;i++){
            filial[i] = new Filial();
            manager[i] = new Manager();
        }
        
        filial[0].setAdress("Av. Paulo VI, nº33");
        filial[0].setBirth(2012);
        filial[0].setContact("71-55558888");
        filial[0].setGrade(3);
        
        filial[1].setAdress("Rua Luis Eduardo Magalhães 1000");
        filial[1].setBirth(2019);
        filial[1].setContact("71-993580614");
        filial[1].setGrade(5);
        
        filial[2].setAdress("Av Orlando Gomes n 1001");
        filial[2].setBirth(2010);
        filial[2].setContact("71-12121414");
        filial[2].setGrade(4);
        
        for(i=0;i<=2;i++){
            manager[i].setName(JOptionPane.showInputDialog("Cadastro Gerente:\n Nome:"));
            manager[i].setCpf(JOptionPane.showInputDialog("Cpf:"));
            manager[i].setContact(JOptionPane.showInputDialog("Telefone"));
            manager[i].setYw(Integer.parseInt(JOptionPane.showInputDialog("Anos Trabalhados: ")));
        }
        int z;
        for(i=0;i<=2;i++){
            z=Integer.parseInt(JOptionPane.showInputDialog("O Gerente "+manager[i].getName()+" gerencia qual filial ?\n0: Paulo VI\n1:Luis Eduardo\n2:Orlando Gomes"));
            filial[z].setManager(manager[i]);
            if(filial[z].getGrade()<5 && manager[i].getYw()>=5){
                filial[z].setGrade(filial[z].getGrade()+1);
                if(filial[z].getGrade()>5){
                   filial[z].setGrade(5);
                }
            }
            z=0;
        }
        for(i=0;i<=2;i++){
            System.out.println("Filial"+ i);
            System.out.println("Endereço: "+filial[i].getAdress());
            System.out.println("Telefone: "+filial[i].getContact());
            System.out.println("Ano de Abertura: "+filial[i].getBirth());
            System.out.println("Nota de Avaliação: "+filial[i].getGrade());
            System.out.println("Gerente: ");
            System.out.println("Nome: "+filial[i].getManager().getName());
            System.out.println("CPF: "+filial[i].getManager().getContact());
            System.out.println("Telefone: "+filial[i].getManager().getContact());
            System.out.println("Tempo de Empresa: "+filial[i].getManager().getYw());
        }
}
}
