/*
* File: Console.java
* Author: Sallai András
* Copyright: 2024, Sallai András
* Group: oktat
* Date: 2024-11-27
* Github: https://github.com/oktat/
* Licenc: MIT
*/

import java.util.Scanner;

public class Console {

  public void startApp(){
    
    String name = input("Bejelentő neve: ");
    String message = input("Hiba leírása: ");

    Incident incident = new Incident(name, message);
    
    Store.writeIncidentToFile(incident);
  }

  private String input(String message) {
    System.out.println(message);
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
    
    return input;
  }
}
