package br.edu.aloejb;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class AloMundoBean
 */
@Stateless
//@LocalBean
public class AloMundoBean implements AloMundoBeanRemote {

    /**
     * Default constructor. 
     */
    public AloMundoBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public String dizerAlo() {
		return "Alo Mundo EJB!";
	}

}
