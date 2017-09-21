/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trans1;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

/**
 *
 * @author sihai
 */
@Entity
public class Tag implements Serializable {
    @Id 
    @GeneratedValue            
    int id;
    String name;
    
    @ManyToMany(mappedBy="tagList" , targetEntity=Todo.class)
    Collection<Todo> todoList;
}
