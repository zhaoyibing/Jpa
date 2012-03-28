package junit.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Test;

import com.xiaobing.one2one.Husband;
import com.xiaobing.one2one.Wife;

public class One2OneTest {

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
		
		Husband husband = new Husband();
		husband.setInfo("husband's info.");
		
		Wife wife = new Wife();
		wife.setName("wife");
		wife.setHusband(husband);
		
		em.persist(wife);
		
		em.getTransaction().commit();
		em.close();
		factory.close();
	}
	
	
}
