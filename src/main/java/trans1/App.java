/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trans1;

import java.util.Arrays;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author sihai
 */
@Component
public class App {

    public static void main(String[] argv) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        App app = ctx.getBean(App.class);
        app.insertTodo();
    }
    @PersistenceContext
    EntityManager em;

    @Transactional
    public void insertTodo() {
        final Tag tag = insertTag("很好");
        final Tag tag2 = insertTag("Good");
        Todo todo = new Todo();
        todo.title = "测试时放点啥放点啥放点啥";
        todo.tagList = Arrays.asList(tag, tag2);
        em.persist(todo);
    }

    @Transactional
    public Tag insertTag(String name) {
        Tag tag = new Tag();
        tag.name = name;
        em.persist(tag);
        return tag;
    }
}
