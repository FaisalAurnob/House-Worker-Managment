import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.io.*;


public class ProjectFinal {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		String fileName = "data.txt";
		String TfileName = "Tdata.txt";
		
		int option =1234;
//		reader class er obj 
		Reader reader = new Reader();

		Scanner input = new Scanner(System.in);
		System.out.println("Enter your name:");
		String aname = input.nextLine();

		System.out.println("Enter your pin number:");
		int pin = input.nextInt();
		ArrayList<String> Teachers = new ArrayList<String>();

		HashMap<String, Integer> Tmap = new HashMap<String, Integer>();
		ArrayList<String> Students = new ArrayList<String>();
		HashMap<String, Integer> Smap = new HashMap<String, Integer>();
		try {
			byte[] buffer = new byte[1000];
//			file reading 
			FileInputStream inputStream = new FileInputStream(TfileName);
			while (inputStream.read(buffer) != -1) {
				String[] line = new String(buffer).split(" ", 0);
				Teachers.add(line[0]);
				
				Tmap.put(line[0], Integer.valueOf(line[1]));
			}
			byte[] sbuffer = new byte[1000];
//			file reading
			FileInputStream sinputStream = new FileInputStream(fileName);
			while (inputStream.read(buffer) != -1) {
				String[] line = new String(buffer).split(" ", 0);
				Students.add(line[0]);
				Smap.put(line[0], Integer.valueOf(line[1]));
			}

			inputStream.close();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index is Out Of Bounds");
		} catch (FileNotFoundException e) {
			System.out.println("File does not exist");
		} catch (IOException e) {
			e.printStackTrace();
		}

		String s = "admin";
		String who = "student";

		try {
			if (pin == 111 && aname.equals(s)) {
//				System.out.print(aname);
				who = "admin";
			} else if (Tmap.get(aname) == pin) {
				who = "Teacher";
			} 
				
			
		} catch (Exception e) {
		}
//		System.out.print(who);

		while (option!=0){
			System.out.println("**********************************************************************");
			System.out.println("*              what do you want to do                                *");
			System.out.println("*                                                                    *");
			if (who.equals("admin") || who.equals("Teacher"))
				System.out.println("*              press 1 to Add student's result info                  *");
			System.out.println("*              press 2 to check student info                         *");
			System.out.println("*              press 3 to check Teacher info                         *");
			if (who.equals("admin"))
				System.out.println("*              press 4 to Add Teacher info                           *");
			System.out.println("*              press 0 to exit                                       *");
			System.out.println("**********************************************************************");
			option = input.nextInt();
//			System.out.println(option);
			if (option == 1) {
				try {
					int num;
//					file writer
					
					BufferedWriter buf = new BufferedWriter(new FileWriter(fileName, true));

					Scanner readme = new Scanner(System.in);
					System.out.println("Enter how many data you need: ");
					num = readme.nextInt();

					for (int i = 0; i < num; i++) {

						Scanner inp = new Scanner(System.in);
						System.out.println("Enter Student name: ");
						String name = inp.nextLine();
						System.out.println("Enter Student ID: ");
						String id = inp.nextLine();
						System.out.println("Enter Student  Dept: ");
						String StudentDept = inp.nextLine();
						System.out.println("Enter Student blood Group : ");
						String bloodGroup = inp.nextLine();
						System.out.println("Enter Student Mid marks: ");
						double MidMark = inp.nextDouble();
						System.out.println("Enter Student Final marks: ");
						double FinalMark = inp.nextDouble();
						Student s1 = new Student(id, name, bloodGroup, StudentDept, MidMark, FinalMark);
//file writer
						buf.write(s1.getName() + " ");
						buf.write(s1.getId() + " ");
						buf.write(s1.getBloodGroup() + " ");
						buf.write(s1.getStudentDept() + " ");
						buf.write(s1.getMidGrade() + " ");
						buf.write(s1.getFinalGrade() + " ");
						buf.write(s1.Total() + " ");
						buf.newLine();

					}
					buf.close();
				} catch (Exception e) {
					e.getStackTrace();
				}
			} else if (option == 2) {
				reader.read(fileName);

			} else if (option == 3) {

				reader.read(TfileName);
			} else if (option == 4) {
				try {
					int num;
					BufferedWriter buf = new BufferedWriter(new FileWriter(TfileName, true));
					Scanner readme = new Scanner(System.in);
					System.out.println("Enter how many data you need: ");
					num = readme.nextInt();
					for (int i = 0; i < num; i++) {
						Scanner inp = new Scanner(System.in);
						System.out.println("Enter Teacher name: ");
						String name = inp.nextLine();
						System.out.println("Enter Teacher ID: ");
						String id = inp.nextLine();
						System.out.println("Enter Teacher  Dept: ");
						String TeacherDept = inp.nextLine();
						System.out.println("Enter Teacher blood Group : ");
						String bloodGroup = inp.nextLine();
						System.out.println("Enter Teacher Qualifications : ");
						String TeacherQualifications = inp.nextLine();
						System.out.println("Enter Teacher Title : ");
						String TeacherTitle = inp.nextLine();

						Teacher s1 = new Teacher(id, name, bloodGroup, TeacherDept, TeacherQualifications,
								TeacherTitle);

						buf.write(s1.getName() + " ");
						buf.write(s1.getId() + " ");
						buf.write(s1.getBloodGroup() + " ");
						buf.write(s1.getTeacherDept() + " ");
						buf.write(s1.getTeacherQualifications() + " ");
						buf.write(s1.getTeacherTitle() + " ");
						buf.newLine();

					}
					buf.close();
				} catch (Exception e) {
					e.getStackTrace();
				}
			} else if (option == 0) {
				System.out.println("Thank you");
				
				
			}

		} 
	}

}
