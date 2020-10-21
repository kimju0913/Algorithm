package codeup;

import java.util.*;

public class Q_3019_Structure {
	
	// ** 스케쥴 작성 
	// 1. 처음에 입력할 스케쥴의 수를 입력 
	// 2. 스케쥴 입력 
	// 3. 날짜순으로 출력하되 날짜가 같을 시 스케쥴 이름을 사전식으로 정렬
	
	// 예시) 
	// 입력 A 2020 01 02
	//     B 2020 01 03
	//     C 2020 01 02
	//     D 2019 12 02
	
	// 출력 D A C B

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Schedule> list = new ArrayList<Schedule>();
		
		String todo;
		int inputTime;
		int year;
		int month;
		int day;
		Schedule sch;
		
		inputTime = sc.nextInt();
		
		for(int i = 0; i < inputTime; i++) {
			
			todo = sc.next();
			year = sc.nextInt();
			month = sc.nextInt();
			day = sc.nextInt();
			
			sch = new Schedule(todo, year, month, day);
			
			list.add(sch);
			
			
		}
		
		sc.close();
		
		Collections.sort(list);
		
		for(int i = 0; i < inputTime; i++) {
			
			System.out.println(list.get(i).todo);
			
			
		}
		
		
		
		
	}
	
	
	
}

class Schedule implements Comparable<Schedule>{
	
	String todo;
	int year;
	int month;
	int day;
	
	public Schedule(String todo, int year, int month, int day) {
		
		this.todo = todo;
		this.year = year;
		this.month = month;
		this.day = day;	
		
	}

	@Override
	public int compareTo(Schedule o) {
		
		if(year < o.year) {				
			return -1;		
		}
		else if(year == o.year) {
			
			if(month < o.month) {
				return -1;
			}else if(month == o.month) {
				if(day < o.day) {
					return -1;
				}else if(day == o.day) {
					
					if(todo.compareTo(o.todo) > 0) {
						return 1;
					}else if(todo.compareTo(o.todo) == 0) {
						return 0;
					}else if(todo.compareTo(o.todo) < 0) {
						return -1;
					}
					
					return 0;
				}else {
					return 1;
				}
			}else {
				return 1;
			}
		}else {
			return 1;
		}
		
		
	}
	
	
	
}