package relation.OneToManyRelation;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class DepartmentO{

    @Id 
    @GeneratedValue( strategy=GenerationType.AUTO )
    private int id;
    private String name;
    //////////// if we  want create third table remove mappedBy
    @OneToMany(fetch = FetchType.EAGER , targetEntity=EmployeeO.class )
    private List employeelist;

    public int getId() {
    	return id;
    }
    
    public void setId(int id) {
    	this.id = id;
    }
    
    public String getName( ) {
    	return name;
    }
    
    public void setName( String deptName ) {
    	this.name = deptName;
    }

    public List getEmployeelist() {
      return employeelist;
    }

   public void setEmployeelist(List employeelist) {
      this.employeelist = employeelist;
   }
}