package relation.inheritanceTablePerClass;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity

public class TeachingStaffTablePerClass extends StaffTablePerClass {

   private String qualification;
   private String subjectexpertise;

   public TeachingStaffTablePerClass( int sid, String sname,String qualification,String subjectexpertise ) {
      super( sid, sname );
      this.qualification = qualification;
      this.subjectexpertise = subjectexpertise;
   }

   public TeachingStaffTablePerClass( ) {
      super(); 
   }

   public String getQualification( ){
      return qualification;
   }

   public void setQualification( String qualification ){
      this.qualification = qualification;
   }

   public String getSubjectexpertise( ) {
      return subjectexpertise;
   }

   public void setSubjectexpertise( String subjectexpertise ){
      this.subjectexpertise = subjectexpertise;
   }
}