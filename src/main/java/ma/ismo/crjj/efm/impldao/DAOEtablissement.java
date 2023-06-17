package ma.ismo.crjj.efm.impldao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ismo.crjj.efm.beans.Etablissement;

import ma.ismo.crjj.efm.idao.IDAO;
import ma.ismo.crjj.util.HibernateUtils;


public class DAOEtablissement implements IDAO<Etablissement> {

    @Override
    public List<Etablissement> getAll() {
     
    	Session s = HibernateUtils.getSessionfactory().getCurrentSession();
		Transaction t = s.beginTransaction();
		List<Etablissement> etablissements = s.createQuery("from Etablissement").getResultList();
		t.commit();
		s.close();
		return etablissements;

    }

    @Override
    public Etablissement getOne(int id) {
      
    	Session s = HibernateUtils.getSessionfactory().getCurrentSession();
		Transaction t = s.beginTransaction();
		return s.get(Etablissement.class, id);

    }

    @Override
    public boolean create(Etablissement obj) {
    	
    	Session session = HibernateUtils.getSessionfactory().getCurrentSession();
        Transaction transaction = session.beginTransaction();
        session.save(obj);
        transaction.commit();
        return true;

    }

    @Override
    public boolean update(Etablissement obj) {
  
    	Session session = HibernateUtils.getSessionfactory().getCurrentSession();
        Transaction transaction = session.beginTransaction();
        session.update(obj);
        transaction.commit();
        return true;

    }

    @Override
  
    public boolean delete(Etablissement obj) {
        Session session = HibernateUtils.getSessionfactory().getCurrentSession();
        Transaction transaction = session.beginTransaction();
        session.delete(obj);
        transaction.commit();
        return true;
    }

}
