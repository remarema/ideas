package org.remarema.bilbao;

import java.util.Date;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@RequestScoped
@Named
public class Welcome {


	public String getCurrentDate(){
		return new Date().toString();
	}
}
