/*
* File: Store.java
* Author: Sallai András
* Copyright: 2024, Sallai András
* Group: oktat
* Date: 2024-11-27
* Github: https://github.com/oktat/
* Licenc: MIT
*/

import java.io.FileWriter;
import java.io.IOException;

public class Store {

  public static void writeIncidentToFile(Incident incident) {
    try {
      tryWriteIncidentToFile(incident);
    } catch (IOException e) {
      System.err.println("Error: " + e.getMessage());
    }
  }

  public static void tryWriteIncidentToFile(Incident incident) throws IOException {
    FileWriter filewriter = new FileWriter("incidents.txt");
    filewriter.write(incident.name + ":" + incident.message + "\n");
      // Log the error message if an exception occurs
    filewriter.close();
  }
}
