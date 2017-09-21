/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trans1;

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
        app.test();
    }
    @PersistenceContext
    EntityManager em;

    @Transactional
    public void test() {
        Todo todo = new Todo();
        todo.title = "测试时放点啥放点啥放点啥";
        em.persist(todo);
    }
}
