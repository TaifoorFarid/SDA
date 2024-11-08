/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer.eventsmanagement;

/**
 *
 * @author fa22-bse-051
 */
import java.io.File;

public interface EventListener {
    void update(String eventType, File file);
}
