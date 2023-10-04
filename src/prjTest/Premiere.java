package prjTest;

/**
* Ma premiere classe en Java
* 
* @author Huleux Jérémy 
* @version 1.0
*/
 class Test {
    
 private String message = "Bonjour le monde !";
    
    /**
    * On utilise le constructeur par defaut
    */
    
    /**
    * Cette methode affiche le dontenue de l'attribut prive
    * message a l'ecran.
    */
    public String getMessage() {
    	return message;
    }
    void setMessage(String nouveau) {
    	message = nouveau;
    }
    
    public void affiche() {
        System.out.println(message);
    }
}
 public class Premiere {
    
   
	 public static void main(String[] args){
	        // Cree un objet de type Premiere
	        Test prem = new Test();
	        prem.affiche();
	        String nouvo = "test";
	        prem.setMessage(nouvo);
	        System.out.println(prem.getMessage());
	    }
    /** methode principale de mon premier programme. */

    
}


