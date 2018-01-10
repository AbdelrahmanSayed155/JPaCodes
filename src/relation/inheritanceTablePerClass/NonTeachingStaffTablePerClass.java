package relation.inheritanceTablePerClass;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class NonTeachingStaffTablePerClass extends StaffTablePerClass {
   private String areaexpertise;

   public NonTeachingStaffTablePerClass( int sid, String sname, String areaexpertise ) {
      super( sid, sname );
      this.areaexpertise = areaexpertise;
   }

   public NonTeachingStaffTablePerClass( ) {
      super( );
   }

   public String getAreaexpertise( ) {
      return areaexpertise;
   }

   public void setAreaexpertise( String areaexpertise ){
      this.areaexpertise = areaexpertise;
   }
}