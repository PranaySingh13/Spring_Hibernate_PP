package ps;

import org.springframework.orm.hibernate3.HibernateTemplate;  
import java.util.*;  

public class EmployeeDao {
	
	HibernateTemplate template;

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}
	
	public void saveEmployee(Employee e)
	{
		template.save(e);
	}
	
}
