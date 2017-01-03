package GestionMarche;

/**
 * Created by benjaminmalkassian on 28/11/2016.
 */

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Marche {
    public static Map<Integer, OffreVente> listeVente = new HashMap<Integer, OffreVente>();
    public static Map<Integer, OffreAchat> listeAchat = new HashMap<Integer, OffreAchat>();
    public static Map<Integer, Transaction> listeTransaction = new HashMap<Integer, Transaction>();

    public static int getKeyVenteDispo(){
    	int key = 1;
    	for (int k : listeVente.keySet())
    		if (key <= k)
    			++k;
    		else
    			return key;
    	return key;
    }
    
    public static int getKeyAchatDispo(){
    	int key = 1;
    	for (int k : listeAchat.keySet())
    		if (key <= k)
    			++k;
    		else
    			return key;
    	return key;
    }
    
    public static int getKeyTransactionDispo(){
    	int key = 1;
    	for (int k : listeTransaction.keySet())
    		if (key <= k)
    			++k;
    		else
    			return key;
    	return key;
    }
    
    
}