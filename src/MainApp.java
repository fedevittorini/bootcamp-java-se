import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentLinkedQueue;

import com.eduit.Book;
import com.eduit.Magazine;
import com.eduit.PublicationStage;
import com.otro.Demo;

public class MainApp {

	public static void main(String[] args) {
		new MainApp(args);
	}
	
	
	public MainApp(final String[] args) {
		String s2 = "como";
		String s3 = "estas";
		String s4 = "SGSFSFSHS";
		String s1 = "Hola";
		
		List<String> l = new ArrayList<>();
		l.add(s1);
		l.add(s1);
		l.add(s1);
		l.add(s2);
		l.add(s3);
		l.add(s1);
		l.add(s2);
		String s8 = "ffHolaa";
		
		Set<String> ts = new TreeSet<>();
		ts.add(s1);
		String s9 = "hthth";
		ts.add(s1);
		ts.add(s4);
		ts.add(s1);
		ts.add(s8);
		ts.add(s9);
		ts.add(s2);
		ts.add(s3);
		ts.add(s1);
		ts.add(s2);
		
		ts.remove(s1);
		ts.remove(s2);
		
		ts.add(s1);
		ts.add(s2);

	
		LinkedHashSet<String> s = new LinkedHashSet<>();
		s.add(s1);
		s.add(s1);
		s.add(s1);
		s.add(s2);
		s.add(s3);
		s.add(s1);
		s.add(s2);
		
		Iterator<String> it = ts.iterator();
		while (it.hasNext()) {
			String next = it.next();
			System.out.println(next);
		}
		
		
		Queue<String> q = new ConcurrentLinkedQueue<>();
		q.add(s1);
		q.add(s2);
		q.add(s3);
		q.add(s4);
		q.add(s8);
		q.add(s9);
		
		
		System.out.println(q.poll());
		
		System.out.println(q.poll());
		System.out.println(q.element());
		System.out.println(q.element());
		System.out.println(q.peek());
		
		
		Integer arrI[] = new Integer[3];
		arrI[0] = 1;
		arrI[1] = 1;
		arrI[2] = 1;
		
		/**
		* Esto rompe por index out of bounds
		* -> arrI[3] = 1;
		*/
		
		String a = "HOLA";
		char ch = 'a';
		
		Object ee = ch;
		
		char[] chB = a.toCharArray();
		Object b = chB;
		
		//Class cast exception
		//Double bb = (Double) b;
		
		Object bk = new String();
		
		
		Float f = new Float("100");
		
		
		int i = 2;
		
		long ggg = Long.MAX_VALUE;
		
		int iii = (int) ggg;
		
		
		primerDerivacion(a);
		System.out.println(a);
		
		String stg = "WIP";
		PublicationStage wip = PublicationStage.PENDING;
		PublicationStage wipCDT = PublicationStage.CANCELED_DUE_TIME;
		System.out.println(wipCDT.isParent(PublicationStage.PENDING));
		
		
		List<PublicationStage> v = Arrays.asList(PublicationStage.values());
		for (PublicationStage p : v) {
			if (p.name().equals(stg)) {
				wip = PublicationStage.valueOf(stg);
			}
		}
		
		Magazine m = new Magazine();
		m.setStage(wip);

		try {
			m.setSinopsis("AFAFAF");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("QUE BIEN!");
		System.out.println(m);
	}
	
	public void primerDerivacion(final String d) {
		System.out.println(d);
		segundaDerivacion(d);
	}
	
	public void segundaDerivacion(final String d) {
		System.out.println(d);
		tercerDerivacion(d);
	}
	
	public void tercerDerivacion(final String d) {
		System.out.println(d);
	}
	

}
