
public class Teacher extends Person
{	
	private String  TeacherDept;
	private String  TeacherQualifications;
	
	public String getTeacherDept() {
		return TeacherDept;
	}

	public void setTeacherDept(String teacherDept) {
		TeacherDept = teacherDept;
	}

	public String getTeacherQualifications() {
		return TeacherQualifications;
	}

	public void setTeacherQualifications(String teacherQualifications) {
		TeacherQualifications = teacherQualifications;
	}

	public String getTeacherTitle() {
		return TeacherTitle;
	}

	public void setTeacherTitle(String teacherTitle) {
		TeacherTitle = teacherTitle;
	}

	private String  TeacherTitle;
    
	public Teacher(String id, String name, String bloodGroup, String TeacherDept,String  TeacherQualifications,String  TeacherTitle )
	{
		super(id, name, bloodGroup);
		this.setTeacherDept(TeacherDept);
		this.setTeacherTitle(TeacherTitle);
		this.setTeacherQualifications(TeacherQualifications);
		
	}
	
	int  getBonus(){                                       //method overridding
		return 2;
	}
}
