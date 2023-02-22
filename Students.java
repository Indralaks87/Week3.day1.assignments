package w3.day1.assignments;

public class Students {

	public void getStudentInfo(int id) {
		System.out.println("Students Id: "+ id);
		System.out.println(" ");
	}
	
	public void getStudentInfo(int id,String name) {
		System.out.println("Students Id: "+ id);
		System.out.println("Students Name: "+ name);
		System.out.println(" ");
	}
	
	public void getStudentInfo(String email,long phone) {
		System.out.println("Students Id: "+ email);
		System.out.println("Students phone Number : "+ phone);
	}

	public static void main(String[] args) {
		Students st = new Students();
		st.getStudentInfo(001);
		st.getStudentInfo(001,"Sanjanaa");
		st.getStudentInfo("sanjanaa13@gmail.com", 1234567890);
		
	}

}
