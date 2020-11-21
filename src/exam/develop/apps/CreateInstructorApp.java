package exam.develop.apps;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import exam.develop.entity.InstructorDetailEntity;
import exam.develop.entity.InstructorEntity;

public class CreateInstructorApp {

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

			// create the object
			InstructorEntity theInstructor = new InstructorEntity("Leslie", "Hernandez", "les_vane87@gmail.com");
			
			InstructorDetailEntity theInstrDet = new InstructorDetailEntity(
					"https://www.youtube.com/watch?v=Vane2345ytREsd43r31sfepiwTcos&index=7", "Learning..!!");

			theInstructor.setIdInstDet(theInstrDet);

			// start the transaction
			session.beginTransaction();			

			session.save(theInstructor);

			System.out.println("Guardando el Instructor " + theInstructor);
			
			// commit a transaction
			session.getTransaction().commit();

		} finally {
			factory.close();
		}
	}

}
