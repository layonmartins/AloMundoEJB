package br.edu.aloejb.client;

import javax.naming.Context;
import javax.naming.NamingException;

import br.edu.aloejb.AloMundoBean;
import br.edu.aloejb.AloMundoBeanRemote;
import br.edu.aloejb.util.ClienteUtil;

public class EJBAppClient {

	public static void main(String[] args) {
		System.out.println(lookup().dizerAlo());
	}
	
	private static AloMundoBeanRemote lookup() {
		Context context = null;
		AloMundoBeanRemote beanRemote = null;
		
		try {
			context = ClienteUtil.getInitialContext();
			beanRemote = (AloMundoBeanRemote) context.lookup(getLookup());
		} catch (NamingException e) {
			e.printStackTrace();
		}
		return beanRemote;
	}
	
	private static String getLookup() {
		String nomeApp = "";
		
		String nomeModulo = "AloMundoSessionBean";
		
		String nomeDistinto = "";
		
		String nomeBean = AloMundoBean.class.getName();
		
		String nomeInterface = AloMundoBeanRemote.class.getName();
		
		String nomeFinal = "ejb:" + nomeApp + "/" + nomeModulo + 
				"/" + nomeDistinto + "/" + nomeBean + "!" + nomeInterface;
		
		return nomeFinal;
	}
}
