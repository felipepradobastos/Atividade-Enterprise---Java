/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

/**
 *
 * @author felip
 */
public class Manager {
    private String name;
    private String cpf;
    private String contact;
    private int yw;
    
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getCpf(){
        return this.cpf;
    }
    public void setCpf(String cpf){
        this.cpf=cpf;
    }
    public String getContact(){
        return this.contact;
    }
    public void setContact(String contact){
        this.contact=contact;
    }
    public int getYw(){
        return this.yw;
    }
    public void setYw(int yw){
        this.yw=yw;
    }
    
}
