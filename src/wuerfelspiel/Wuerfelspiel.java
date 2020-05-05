
package wuerfelspiel;

/**
 *
 * @author Stefanie
 */
public class Wuerfelspiel {

    public static void main(String[] args) {
        int s=0;
        int summe = 0;
        
        for (int i=0; i <=1000 ; i++){ // Rundenanzahl= 1000
            for (int j=0; j<=4; j++){ // Werte pro Runde => hier 5
                int w = wurf(); //Gewuerfelte Zahl
                if(w !=1){ 
                    s= s+w; // Summe der gewürfelten Zahlen einer Runde
                  
                }
                else{
                    s=0;
                }
            }
            summe= summe+s;//Die Summen der Runden werden aufaddiert
            //System.out.println("Summe= "+summe);
            s=0;//Die "Rundensumme" muss wieder auf 0 gesetzt werden, da diese ansonsten weiter aufaddiert wird
        }
        double Gewinnsumme = summe/1000;
        System.out.println(Gewinnsumme);
    }
    
    public static int wurf(){ //Zahl wuerfeln
        int wert = 1+(int)(Math.random()*6);
        return wert;
    }
}
