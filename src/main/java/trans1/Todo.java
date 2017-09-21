/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trans1;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author sihai
 */
@Entity
public class Todo implements Serializable {
    @Id
    @GeneratedValue
    int id;
    String title;
    boolean isFinish;
    
}
