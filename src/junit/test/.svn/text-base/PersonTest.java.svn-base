package junit.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.junit.BeforeClass;
import org.junit.Test;

import com.xiaobing.bean.Person;


public class PersonTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}
	
	@Test
	public void save(){
		// same function as session factory
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin(); // start transaction
		Person p = new Person("小兵");
		p.setMoney(12.3456f);
		em.persist(p);
		em.getTransaction().commit();
		em.close();
		factory.close();
		
	}
	
	@Test
	public void getAndUpdate(){
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin(); // start transaction
		Person p = em.find(Person.class, 1);
		
		System.out.println(p.getMoney());
		p.setMoney(123.4567f);
		
		em.getTransaction().commit();
		em.close();
		factory.close();
	}
	
	@Test
	public void getAndUpdate2(){
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin(); // start transaction
		Person p = em.find(Person.class, 1);
		
		em.clear();
		// 将person的状态变为游离态
		
		System.out.println(p.getMoney());
		p.setMoney(123.4567f);
		
		em.merge(p); // 把游离状态下的实体bean同步到数据库
		
		em.getTransaction().commit();
		em.close();
		factory.close();
	}
	
	@Test
	public void delete(){
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin(); // start transaction
		Person p = em.find(Person.class, 1);
		/*Person p = new Person();
		p.setId(2);*/
		
		em.remove(p);
		
		em.getTransaction().commit();
		em.close();
		factory.close();
	}
	
	@Test
	public void query(){
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa");
		EntityManager em = factory.createEntityManager();
		
		Query query = em.createQuery("select p from Person p where p.id = ?1");
		query.setParameter(1, 2);
		//List results = query.getResultList();
		Person person = (Person)query.getSingleResult();
		System.out.println(person.getName());
//		query.getSingleResult();  --> select count(*) from Person
		
		em.close();
		factory.close();
	}
	
	@Test
	public void deleteQuery(){
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin(); // start transaction
		
		Query query = em.createQuery("delete from Person p where p.id = ?1");
		query.setParameter(1, 2);
		query.executeUpdate();
		
		em.getTransaction().commit();
		em.close();
		factory.close();
	}
	
	@Test
	public void updateQuery(){
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin(); // start transaction
		
		Query query = em.createQuery("update Person p set p.name=:name where p.id = :id");
		query.setParameter("name", "hahaha");
		query.setParameter("id", 3);
		query.executeUpdate();
		
		em.getTransaction().commit();
		em.close();
		factory.close();
	}
	
	
}
