package aproject.controller;

import java.sql.Date;
import java.util.List;
import java.util.Scanner;

import aproject.model.EmpService;
import aproject.view.EmpView;
import aproject.vo.EmpVO;

public class EmpController {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		EmpService eService = new EmpService();
		
		
		while(true) {
			System.out.println("1.모든 직원");
			System.out.println("2.직원상세");
			System.out.println("3.부서의 직원");
			System.out.println("4.부서,직책,급여로 조회");
			System.out.println("5.부서의 평균 급여 이하인 직원 조회");
			System.out.println("6.신규 직원 추가");
			System.out.println("7.직원 정보 수정");
			System.out.println("8.직원 삭제");
			System.out.println("9.직원 급여조회(sp)");
			
			System.out.println("exit.종료");
			System.out.print("===작업을 선택해주세여>>");
			
			String job = sc.next();
			if(job.equals("exit")) break;
			switch(job) {
			case "1"://모든 직원
				EmpView.print(eService.selectAll());
				break;
			case "2":{//직원상세
				System.out.print("조회할 직원 번호>>");
				int empid = sc.nextInt();
				EmpView.print(eService.selectById(empid));
				break;
			}
			case "3":{//해당 부서 직원
				System.out.print("조회할 직원부서 번호>>");
				int deptid = sc.nextInt();
				EmpView.print(eService.selectByDept(deptid));
			
				break;
				}
			case "4"://부서 직책 급여조회
			{
				System.out.print("조회할 직원부서 번호>>");
				int deptid = sc.nextInt();
				System.out.print("조회할 직원 직책>>");
				String jobid= sc.next();
				System.out.print("조회할 직원 급여>>");
				double salary = sc.nextDouble();
				EmpView.print(eService.selectByCondition(deptid,jobid,salary));
				break;
			}
			case "5"://
				List<EmpVO> empList = eService.selectLowSalary();
				System.out.println("[Controller]5번 작업"+empList.size());
				EmpView.print(empList);
				break;
			case "6"://신규회원
				{
				EmpVO emp = makeEmp(sc);
				EmpView.print(eService.empInsert(emp));
				
				break;
				}
			case "7"://회원수정
			{
				System.out.print("1수정할 직원ID>>");
				int empid = sc.nextInt();
				EmpView.print(eService.selectById(empid));//현재정보
				
				EmpVO emp = makeEmp2(sc,empid);
				EmpView.print(eService.empUpdate(emp));//수정된 정보
				EmpView.print(eService.selectById(empid));//수정된 정보
				
				break;
			}
			case "8"://직원삭제
			{
				System.out.print("1 삭제할 직원ID>>");
				int empid = sc.nextInt();
				EmpView.print(eService.selectById(empid));//현재정보
				System.out.println("삭제를 진행하겠습니까? Y|N");
				String yn = sc.next();
				if(yn.equals("Y"))
					EmpView.print(eService.empDelete(empid));//삭제확인
				else
					break;
				
			break;
			}
			case "9":{//직원번호조회
				System.out.print("조회할 직원 번호>>");
				int empid = sc.nextInt();
				EmpView.print("급여는"+eService.getSalary(empid));
				break;
			}
			default:
				break;
			}
		}
		System.out.println("수고하셧습니다.");
	}

	private static EmpVO makeEmp2(Scanner sc, int empid) {//회원수정
		
	
		System.out.print("\n2 직원의 email수정>>");
		String email = sc.next();
		System.out.print("\n3 직원의 job_id수정>>");
		String jobid= sc.next();
		System.out.print("\n4 직원의 deptid수정>>");
		int deptid= sc.nextInt();
		System.out.print("\n5 직원의 salary 수정>>");
		double salary= sc.nextDouble();
		System.out.print("\n6 직원의 입사일 수정yyyy/mm/dd>>");
		String hdate= sc.next();
		Date hiredate = DateUtil.convertToDate(hdate);
		System.out.print("\n7 직원의 manager_Id 수정>>");
		int manid= sc.nextInt();
		
		EmpVO emp = new EmpVO();//받은 문자를 EmpVO타입의 객체에 삽입
		emp.setEmployee_id(empid);
		emp.setEmail(email);
		emp.setJob_id(jobid);
		emp.setSalary(salary);
		emp.setDepartment_id(deptid);
		emp.setHire_date(hiredate);
		emp.setManager_id(manid);
		return emp;
	}

	private static EmpVO makeEmp(Scanner sc) {//신규회원
		System.out.print("1신규 직원의 First_name>>");
		String firstName = sc.next();
		System.out.print("\n2신규 직원의 Last_name>>");
		String lastName = sc.next();
		System.out.print("\n3신규 직원의 Email>>");
		String email= sc.next();
		System.out.print("\n4신규 직원의 Phone_number>>");
		String pnum= sc.next();
		System.out.print("\n5신규 직원의 입사일 yyyy/mm/dd>>");
		String hdate= sc.next();
		//String ->Date
		Date hiredate = DateUtil.convertToDate(hdate);
		System.out.print("\n6신규 직원의 Job_Id>>");
		String jobId= sc.next();
		System.out.print("\n7신규 직원의 Salary>>");
		double salary= sc.nextDouble();
		System.out.print("\n8신규 직원의 Commission_PCT>>");
		double pct= sc.nextDouble();
		System.out.print("\n9신규 직원의 manager_Id>>");
		int manid= sc.nextInt();
		System.out.print("\n10신규 직원의 department_Id>>");
		int depId= sc.nextInt();
		
		EmpVO emp = new EmpVO();//받은 문자를 EmpVO타입의 객체에 삽입
		emp.setFirst_name(firstName);
		emp.setLast_name(lastName);
		emp.setEmail(email);
		emp.setPhone_number(pnum);
		emp.setHire_date(hiredate);
		emp.setJob_id(jobId);
		emp.setSalary(salary);
		emp.setCommission_pct(pct);
		emp.setManager_id(manid);
		emp.setDepartment_id(depId);
		return emp;
	}
	
}
