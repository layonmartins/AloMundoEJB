package br.edu.aloejb;

import javax.ejb.Remote;

@Remote
public interface AloMundoBeanRemote {

	public String dizerAlo();
}
