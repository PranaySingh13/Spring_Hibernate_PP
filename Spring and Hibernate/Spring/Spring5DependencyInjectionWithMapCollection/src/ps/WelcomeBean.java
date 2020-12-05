package ps;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class WelcomeBean {

	private Map data;

	public void setData(Map data) {
		this.data = data;
	}
	
	public void show() {
		
		Set s=data.entrySet();
		Iterator it=s.iterator();
		
		while(it.hasNext()) {
			Map.Entry me=(Map.Entry)it.next();
			System.out.println(me.getKey()+"-"+me.getValue());
		}
	}
}
