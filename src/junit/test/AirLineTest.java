package junit.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Test;

import com.xiaobing.compositePK.AirLine;

public class AirLineTest {

	@Test
	public void save(){
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		em.persist(new AirLine("PEK","SHA","�������Ϻ�"));
		
		em.getTransaction().commit();
		em.close();
		factory.close();
	}

	
}
