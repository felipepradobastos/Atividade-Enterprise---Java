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
        filial[1].setAdress("Av. Paulo VI, nº33");
        filial[1].setBirth(2012);
        filial[1].setContact("71-55558888");
        filial[1].setGrade(3);
        
        filial[2].setAdress("Rua Luis Eduardo Magalhães 1000");
        filial[2].setBirth(2019);
        filial[2].setContact("71-993580614");
        filial[2].setGrade(5);
        
        filial[3].setAdress("Av Orlando Gomes n 1001");
        filial[3].setBirth(2010);
        filial[3].setContact("71-12121414");
        filial[3].setGrade(4);
        
        int i;
        for(i=0;i<=3;i++){
            manager[i].setName(JOptionPane.showInputDialog("Cadastro Gerente:\n Nome:"));
            manager[i].setCpf(JOptionPane.showInputDialog("Cpf:"));
            manager[i].setContact(JOptionPane.showInputDialog("Telefone"));
            manager[i].setYw(Integer.parseInt(JOptionPane.showInputDialog("Nota de 0 a 5:")));
        }
    
}
}
