package junit.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Test;

import com.xiaobing.one2many.Order;
import com.xiaobing.one2many.OrderItem;

public class One2ManyTest {

	@Test
	public void generateTables(){
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa");
		factory.close();
	}
	
	@Test
	public void save(){
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		Order order = new Order();
		order.setOrderId("11");
		order.setAmount(14.65f);
		
		OrderItem oi1 = new OrderItem();
		OrderItem oi2 = new OrderItem();
		oi1.setProductName("×ãÇò");
		oi1.setPrice(12f);
		oi2.setProductName("À¶Çò");
		oi2.setPrice(15f);
		order.addOrderItem(oi1);
		order.addOrderItem(oi2);
		
		em.persist(order);
		
		em.getTransaction().commit();
		em.close();
		factory.close();
	}
	
	
}
