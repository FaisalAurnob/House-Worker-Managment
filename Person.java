

public class Person{
	private String id;
	private String name;
	private String bloodGroup;
	public int Bonus;
	
	public void setId(String id){
			this.id = id;		
	}
		
	public void setName(String name){
			this.name = name;
	}
		
	public void setBloodGroup(String bloodGroup){
			this.bloodGroup = bloodGroup;
	}
	public String getId(){
			return this.id;
	}
		
	public String getName(){
			return this.name;
	}
		
	public String getBloodGroup(){
			return this.bloodGroup;
	}
	public Person(){                                         //method overloading..............
		System.out.println("Default of Parent");
	}
	
	public Person(String id, String name, String bloodGroup){
		this.setId(id);
		this.setName(name);
		this.setBloodGroup(bloodGroup);
	}
	int  getBonus(){
		return 0;
	}
}