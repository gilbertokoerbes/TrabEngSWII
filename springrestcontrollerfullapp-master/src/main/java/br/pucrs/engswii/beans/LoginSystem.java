package br.pucrs.engswii.beans;

public class LoginSystem {
    
    private User usrLogged;

    public void setUserLogged(User usrLogged){
        this.usrLogged = usrLogged;
    }
    public User getUserLogged(){
        return this.usrLogged;
    }
}
