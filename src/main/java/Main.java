class Main {
  
import java.util.*;
	
	public static boolean q1_isIn_more_then_one_time(Queue <Double> q, double num)  {
		Queue <Double> q2  = new Queue <Double> ();
		Boolean y= false;
		double x;
		while(!q.isEmpty()) {
			x = q.head();
			if(x == num) {
				x = q.head();
				q2.insert(q.remove());
			}
			x = q.head();
			if(x == num) {
				x = q.head();
				q2.insert(q.remove());
				y = true;	
			}
			q2.insert(q.remove());
		}	
		while(!q2.isEmpty()) {
			q.insert(q2.remove());			
		}
		
		return y;

	}	

	public static void main(String[] args) {
		Queue <Double> q  = new Queue <Double> ();
		//Queue <Integer> q  = new Queue <Integer> ();
		q.insert(52.0); //////////////////// להכניס לסוף התור
		double x = q.head(); ///////////////////// להכניס למשתנה את ראש התור 
		q.insert(85.0); /////////////////////////// להכניס סוף התור
		x = q.head(); //////////////////////////// להכניס למשתנה את ראש התור
		q.insert(56.0);
		q.insert(56.0);
		q.insert(748.0);
		q.insert(79.0);
		q.insert(79.0);
		q.insert(79.0);
		q.insert(79.0);
		q.insert(64.0);
		//q.insert(60.0);
		//q.insert(30.0);
		//q.insert(370.0);
		System.out.println(q);
		System.out.println(q1_isIn_more_then_one_time(q,79.0));	

	}

}


}
