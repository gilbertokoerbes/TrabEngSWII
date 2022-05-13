package br.pucrs.engswii.beans;

public class LoginSystemRegistration {

    private User usrLogged;

    private static LoginSystemRegistration loginsysreg = null;

    private LoginSystemRegistration(){
		usrLogged = null;
	}

	public static LoginSystemRegistration getInstance() {

		if(loginsysreg == null) {
			loginsysreg = new LoginSystemRegistration();
			return loginsysreg;
		}
		else {
			return loginsysreg;
		}
	}
    

    
}
