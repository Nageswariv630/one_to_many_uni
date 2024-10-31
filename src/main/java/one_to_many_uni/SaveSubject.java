package one_to_many_uni;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveSubject {
	public static void main(String[] args) {
		EntityManager em=Persistence.createEntityManagerFactory("dev").createEntityManager();
		EntityTransaction et=em.getTransaction();
		Subject s=new Subject();
		s.setName("JAVA");
		s.setSem(4);
		s.setBranch("CSE");
		et.begin();
		Subject dbs=em.merge(s);
		em.merge(s);
		et.commit();
		System.out.println(dbs);
		System.out.println("Done");
	}

}
