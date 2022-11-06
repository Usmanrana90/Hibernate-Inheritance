package cloudxweb;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class ClientApp {

	public static void main(String[] args) {
			SessionFactory sf=null;
			Session session=null;
			try {
				Configuration cfg=new Configuration();
				cfg.configure("cloudxweb/hibernate.cfg.xml");
				
				StandardServiceRegistryBuilder builder=new StandardServiceRegistryBuilder();
				builder=builder.applySettings(cfg.getProperties());
				
				StandardServiceRegistry reg=builder.build();
				sf=cfg.buildSessionFactory(reg);
				
				session=sf.openSession();
				Transaction tx=session.beginTransaction();
				
				
				CardPayment cp=new CardPayment();
				cp.setTx_id("321");
				cp.setPay_date("2/02/2019");
				cp.setPay_amt(1000);
				cp.setCard_No(90887);
				cp.setExp_date("3/03/2018");
				
				ChequePayment chp=new ChequePayment();
				chp.setTx_id("121");
				chp.setPay_date("12/02/2019");
				chp.setPay_amt(30000);
				chp.setCheque_no(2312);
				chp.setExp_date("4 month");
				
				session.save(cp);
				session.save(chp);
				tx.commit();
				System.out.println("Payment submitted by card");
				System.out.println("Payment submitted by cheque");
				
				
				
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
			
					

	}

}
