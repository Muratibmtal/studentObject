package studentObject;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Student student1=new Student();
      
		student1.setName("Murat");
        student1.setSurname("Eyken");
        student1.setGender(true);
        student1.setAge(39);
        student1.setClassRoom("10BMP");
        student1.setStage(10);
        student1.setNationalIdentity("545475745");
        student1.setLength(1.73);
        student1.setSchoollNumber("16459");
        System.out.println(
        	"Öğrenci:"+student1.getName()+" "+student1.getSurname());
        	
        	Student student2=new Student("Murat","Eyken","16459",10,1.73,15,"10A",true,"225252525");
       System.out.println(student2.getLength());
       System.out.println(student2.getClassRoom());
       System.out.println(student2.getName());
       System.out.println(student2.getNationalIdentity());
       System.out.println(student2.getStage());
       System.out.println(student2.getSurname());
       System.out.println(student2.getSchoollNumber());
       System.out.println(student2.getAge());
      
       
       Schooll okul=new Schooll("İBMTAL","Tabaklar","0374512544");    
       System.out.println(okul.getName());
       
        
	}

}
