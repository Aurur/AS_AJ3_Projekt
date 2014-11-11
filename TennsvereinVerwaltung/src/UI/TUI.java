package UI;

import controller.Controller;
import java.util.*;

/**
* FA21
 * @version 1.0 vom 17.09.2014
 * @author Andreas Lau, Vivian Fuhl
 */
public class TUI {
	
	private Controller controller;
	Scanner sc=new Scanner(System.in);
	
	public void showheader(){
		System.out.println("Tennis-Vereinverwaltung");
		System.out.println("***************************************");
		System.out.println("");
	}
	
	public void showmainscreen(){
		System.out.println("Neuen Spieler anlegen (1)");
		System.out.println("Irgendwas anderes machen (2)");
		System.out.print("Was möchten Sie tun? ");
		int input = sc.nextInt();
		switch(input)
        {
            case 1:
                System.out.println("Vorname: ");
                String firstname = sc.nextLine();
                System.out.println("Nachname");
                String lastname = sc.nextLine();
            	  controller.createMember(lastname, firstname);
                
                //showirgendwas
                break;
            case 2:
            	  clearscreen();
                showheader();
                //showirgendwas anderes
                break;
            default:
            	clearscreen();
                showheader();
                showmainscreen();
        }
	}
	
	public void clearscreen(){
		
	}
	
	public TUI(Controller controller){
		this.controller = controller;
		showheader();
		showmainscreen();
	}
	
	
}
