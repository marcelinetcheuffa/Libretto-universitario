package it.polito.tdp.libretto.model;

import java.util.ArrayList;
import java.util.List;

import it.polito.tdp.libretto.db.EsameDAO;

/**
 * Il model e' la classe principale che gestisce
 * i dati di tipo esame
 * @author b
 *
 */

public class Model {
	private List<Esame> esami ;
	
	/**
	 * Il compito del costruttore e' quello di laciare un 
	 * oggetto allo stato coerente.
	 * Lo stato di un oggetto e' l'insieme delle sue proprietà
	 */
	public Model(){
		this.esami = new ArrayList<Esame>();
	}
	
	/**
	 * Aggiunge un nuovo esame all'elenco degli esami presenti
	 * verificando che non ci sia già
	 * @param e
	 * @return true se l'ha inserito, false se esiteva già e
	 * quindi non l'ha potuto inserire
	 */
	public boolean addEsame(Esame e){
//		if(!esami.contains(e)){
//			esami.add(e);
//			return true ;
//		} else {
//			return false;
//		}
		
		EsameDAO dao = new EsameDAO() ;
		
		return dao.create(e) ;
		
	}
	
	/**
	 * Ricerca se esiste un esame con il codice specificato,
	 * sSe esiste, lo restituisce ,altrimenti restitiusce null
	 * @param codice codice dell'esame da ricercare
	 * @return l'esame trovato, oppure null se non trovato
	 */
	public Esame trovaEsame(String codice){
		//Il metodo indexOf() si aspestta un oggetto di tipo della lista
		// Creo un pggetto dello stesso tipo che quello che sto cercando
		// Non sara mai identico,non sara mai nella stessa locazione di memoria
		// Ma rispondera il modo positivo all'equals perché ha lo stesso codice
		
//		int pos = esami.indexOf(new Esame(codice, null, null));
//		if(pos==-1){
//			return null ;
//		} else {
//			return esami.get(pos);
//		}
		
		EsameDAO dao = new EsameDAO() ;
		
		Esame e = dao.find(codice) ;
		
		return e ;
		
	}

}
