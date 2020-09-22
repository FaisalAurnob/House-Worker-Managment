
public class Student extends Person
{
   
	
	private String  StudentDept;
	private double MidMark;
	private double FinalMark;
	public String  MidGrade;
    public String FinalGrade;
    public String TotalGrade;	
    
	
	
//constructor	
	public Student(String id, String name, String bloodGroup, String StudentDept, double MidMark, double FinalMark )
	{

		super(id, name, bloodGroup);//parent class er constructor
		
//		eigula ei class er jinish
		this.setStudentDept(StudentDept);
		this.setMidMark(MidMark);
		this.setFinalMark(FinalMark);
		
	}
	
	
	public void setStudentDept(String StudentDept){
		this.StudentDept = StudentDept;
	}
	
	public String getStudentDept(){
		return StudentDept;
	}
	
	
	
	public void setMidMark(double MidMark){
		if(MidMark >= 0 && MidMark <= 49){
			this.MidMark = MidMark;
			  MidGrade="F";
			
		}
		else if(MidMark >= 50 && MidMark <= 59){
			this.MidMark = MidMark;
			 MidGrade="D";
			
		}
		else if(MidMark >= 60 && MidMark <= 64){
			this.MidMark = MidMark;
			 MidGrade="D+";
			
		}
		else if(MidMark >= 65 && MidMark <= 69){
			this.MidMark = MidMark;
			 MidGrade="C";
		}
		else if(MidMark >= 70 && MidMark <= 74){
			this.MidMark = MidMark;
			 MidGrade="C+";
			
		}
		else if(MidMark >= 75 && MidMark <= 79){
			this.MidMark = MidMark;
			MidGrade="B";
			
		}
		else if(MidMark >= 80 && MidMark <= 84){
			this.MidMark = MidMark;
			 MidGrade="B+";
		}
		else if(MidMark >= 85 && MidMark <= 89){
			this.MidMark = MidMark;
			 MidGrade="A";
		}
		else if(MidMark >= 90 && MidMark <= 100){
			this.MidMark = MidMark;
			 MidGrade="A+";
			
		}
		
		else{
				MidGrade = "Invalid Number";
		    }
			
		
	}
	public String getMidGrade(){
		return MidGrade;
	}
	public double getMidMark(){return MidMark;}
	
	public void setFinalMark(double FinalMark){
		if(FinalMark >= 0 && FinalMark <= 49){
			this.FinalMark = FinalMark;
			  FinalGrade="F";
			
		}
		else if(FinalMark >= 50 && FinalMark <= 59){
			this.FinalMark = FinalMark;
			FinalGrade="D";
			
		}
		else if(FinalMark >= 60 && FinalMark <= 64){
			this.FinalMark = FinalMark;
			 FinalGrade="D+";
			
		}
		else if(FinalMark >= 65 && FinalMark <= 69){
			this.FinalMark = FinalMark;
			 FinalGrade="C";
		}
		else if(FinalMark >= 70 && FinalMark <= 74){
			this.FinalMark = FinalMark;
			 FinalGrade="C+";
			
		}
		else if(FinalMark >= 75 && FinalMark <= 79){
			this.FinalMark = FinalMark;
			FinalGrade="B";
			
		}
		else if(FinalMark >= 80 && FinalMark <= 84){
			this.FinalMark = FinalMark;
			 FinalGrade="B+";
		}
		else if(FinalMark >= 85 && FinalMark <= 89){
			this.FinalMark = FinalMark;
			 FinalGrade="A";
		}
		else if(FinalMark >= 90 && FinalMark <= 100){
			this.FinalMark = FinalMark;
			 FinalGrade="A+";
			
		}
		
		else{
				FinalGrade = "Invalid Number";
		    }
			
		
	}
	
	public String getFinalGrade(){
		return FinalGrade;
	}
	public double getFinalMark(){return FinalMark;}
	
	int  getBonus(){                                       //method overridding
		return 2;
	}
	
	public double Total(){return getMidMark()*0.4 + getFinalMark()*0.6 + getBonus();}
	
	

	
	
	
	
}
