public class LockerGame {

	public static void main(String[] args){ 
	// first execution instructions to complier
		
		boolean[] lockerS = new boolean[100]; 
		//declaring array and setting limit to 100.
		
		for (int studentS = 1; studentS <= 100; ++studentS) { 
		//setting for loop increment operator to student from 1 to 100 while adding 1.
		
			shuffle(lockerS, studentS);}
			//adding input values into shuffle for the array
			display(lockerS);}
			//adding input values for display into the array
	
	public static void shuffle(boolean[] openLockers, int startCount) {
		//starting boolean type 
		int nextLockerCount = startCount;
		//setting nextLockerCount equal to startCount for increment operator
		for (int i = startCount - 1; i < openLockers.length; i += nextLockerCount){
			//starting new for loop to subtract 1 from startCount if 
			openLockers [i] =! openLockers [i];
			//initializing array if openLockers does not match
		 	}
		 	}
	public static void display(boolean[] lockers) {
		int lockerCounts = 0; 
		//setting lockerCounts to 0
		for (int i = 0; i < lockers.length; ++i) { 
		//adding the int i to increment 
			if (lockers[i]) {
			//adding to lockerCounts if condition met for if statement
			++lockerCounts; 
			//incrementing the lockerCount
			
			if (lockerCounts % 10 == 0);
			//setting other if statement to be met if equal to 0
		
		System.out.printf("Locker %d is open \n", i+1); 
		//outputs to console the lockers that are open
	
		
		}
		}
	}

}
