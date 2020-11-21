package exam.develop.apps;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import exam.develop.entity.InstructorDetailEntity;
import exam.develop.entity.InstructorEntity;

public class DeleteInstructorApp {

	public static void main(String[] args) {

		// create sessionFactory
		SessionFactory factory = new Configuration()
									.configure("hibernate.oracle.cfg.xml")
									.addAnnotatedClass(InstructorEntity.class)
									.addAnnotatedClass(InstructorDetailEntity.class)
									.buildSessionFactory();

		try {
			// create session
			Session session = factory.getCurrentSession();

			// start the transaction
			session.beginTransaction();			
			
			int valId = 100000000;
			
			InstructorEntity theInstructor = session.get(InstructorEntity.class, valId);
			
			System.out.println("Se encontro el siguiente Instructor: " + theInstructor);
			
			if (theInstructor != null) {
				System.out.println("Eliminando: " + theInstructor);
				
				//Note: will ALSO delete associated "details" object
				//because of CascadeType.ALL
				session.delete(theInstructor);
			}
			
			// commit a transaction
			session.getTransaction().commit();

		} finally {
			factory.close();
		}
	}

}
