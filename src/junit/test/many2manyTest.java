package junit.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Test;

import com.xiaobing.many2many.Student;
import com.xiaobing.many2many.Teacher;

public class many2manyTest {

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
		
		Teacher t1 = new Teacher("teacher1");
		Student s1 = new Student("student1");
	
		em.persist(t1);
		em.persist(s1);
		
		em.getTransaction().commit();
		em.close();
		factory.close();
	}
	
	
	@Test
	public void buildTS(){
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		Student s1 = em.find(Student.class, 1);
		s1.addTeacher(em.getReference(Teacher.class, 1));
		
		em.getTransaction().commit();
		em.close();
		factory.close();
	}
	
	@Test
	public void deleteTS(){
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		Student s1 = em.find(Student.class, 1);
		s1.removeTeacher(em.getReference(Teacher.class, 1));
		
		em.getTransaction().commit();
		em.close();
		factory.close();
	}
	
	// É¾³ýÀÏÊ¦
	@Test
	public void deleteTeacher(){
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		Student s1 = em.find(Student.class, 1);
		Teacher t1 = em.getReference(Teacher.class, 1);
		s1.removeTeacher(t1);
		em.remove(t1);
		
		em.getTransaction().commit();
		em.close();
		factory.close();
	}
	
	// É¾³ýStudent
	@Test
	public void deleteStudent(){
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		Student s1 = em.find(Student.class, 1);
		em.remove(s1);
		
		em.getTransaction().commit();
		em.close();
		factory.close();
	}
	
}
