import java.util.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ExerciseS {
	Scanner sc = new Scanner(System.in);
	String name;
	float duration;
	String date;
	float totalCalories;
	HashMap<String, Float> typeOfExercise = new HashMap<String, Float>();

	ExerciseS() {
		name = null;
		duration = 0.0f;
		date = null;
		totalCalories = 0.0f;
	}

	void input() {
		int dd = 0;
		int mm = 0;
		String dateOf = "";
		String yy = "";
		System.out.println("Enter name of a user");
		name = sc.nextLine();
		int f;
		System.out.println("Press 1 to enter date else it will be default");
		f = sc.nextInt();
		String str;
		if (f == 1) {
			boolean ch = true;
			while (ch) {
				System.out.println("Enter Date");
				dd = sc.nextInt();
				if (dd < 0 || dd > 31) {
					System.out.println("Wrong date entered!Try Again");

				} else {
					ch = false;
				}

			}
			if (dd > 0 && dd < 10) {
				dateOf = "0" + dd;
			}
			ch = true;

			while (ch) {
				System.out.println("Enter Month");
				mm = sc.nextInt();
				if (mm < 0 || mm > 12) {
					System.out.println("Wrong month entered!Try Again");

				} else {
					ch = false;
				}

			}
			ch = true;
			while (ch) {
				System.out.println("Enter year");
				yy = sc.next();
				int l = yy.length();
				if (l != 4) {
					System.out.println("Wrong year entered!Try Again");

				} else {
					ch = false;
				}
			}

			str = dateOf + "-" + mm + "-" + yy;
			date = str;
		} else {
			LocalDateTime t1 = LocalDateTime.now();
			DateTimeFormatter fd = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			date = t1.format(fd);
		}
	}

	static void printDataAggregate(ExerciseS exerciseS) {
		System.out.println("Name:" + exerciseS.name);
		System.out.println("Calories Burned=:" + exerciseS.totalCalories);
	}

	static void printDataDetailed(ExerciseS exercise) {
		System.out.println("Name:" + exercise.name);
		System.out.println("Date:" + exercise.date);
		if (exercise.typeOfExercise.containsKey("Walking"))
			System.out.println("Calories burned in Walking:" + exercise.typeOfExercise.get("Walking"));
		if (exercise.typeOfExercise.containsKey("Running"))
			System.out.println("Calories burned in Running:" + exercise.typeOfExercise.get("Running"));
		if (exercise.typeOfExercise.containsKey("Cycling")) {

			System.out.println("Calories burned in Cycling:" + exercise.typeOfExercise.get("Cycling"));
		}

		System.out.println("Total Calories Burned=:" + exercise.totalCalories);
	}

	float calorieWalking() {
		float cal;
		System.out.println("Enter duration of Walking");
		duration = sc.nextFloat();
		cal = ((1000 * duration) / 120);
		return cal;
	}

	float calorieRunning() {
		float cal;
		System.out.println("Enter duration of Running");
		duration = sc.nextFloat();
		cal = ((1400 * duration) / 120);
		return cal;
	}

	float calorieCycling() {
		float cal;
		System.out.println("Enter duration of Cycling");
		duration = sc.nextFloat();
		cal = ((1200 * duration) / 120);
		return cal;
	}

	public static void main(String args[]) {
		boolean ch = true;
		Scanner sc = new Scanner(System.in);
		ArrayList<ExerciseS> arr = new ArrayList<ExerciseS>();
		int p = 0;
		while (p != 2) {
			ExerciseS obj = new ExerciseS();
			obj.input();
			float cal = 0.0f;
			ArrayList<Integer> a = new ArrayList<Integer>(4);
			do {
				System.out.println("Enter the number in which exercise is associated\n");
				if (a.contains(1)) {
					System.out.println("Enter type of a exercise \n2:Running\n3:Cycling\n");
				} else if (a.contains(2)) {
					System.out.println("Enter type of a exercise\n1:Walking\n3:Cycling\n");
				} else if (a.contains(3)) {
					System.out.println("Enter type of a exercise\n1:Walking\n2:Running\n");

				} else
					System.out.println("Enter type of a exercise\n1:Walking\n2:Running\n3:Cycling\n");
				int c1 = sc.nextInt();
				a.add(c1);
				switch (c1) {
				case 1:
					float w = obj.calorieWalking();
					if (w != 0)
						obj.typeOfExercise.put("Walking", w);
					cal = cal + w;
					break;
				case 2:
					float r = obj.calorieRunning();
					if (r != 0)
						obj.typeOfExercise.put("Running", r);
					cal = cal + r;
					break;
				case 3:
					float C = obj.calorieCycling();
					if (C != 0)
						obj.typeOfExercise.put("Cycling", C);
					cal = cal + C;
					break;
				}
				System.out.println("Does user did more exercise,if yes press 1 else press 0 to exit\n");
				int cc = sc.nextInt();
				if (cc == 1)
					ch = true;
				else
					ch = false;
			} while (ch);
			obj.totalCalories = cal;
			arr.add(obj);
			p = p + 1;
			a.clear();
		}
		System.out.println("How you want to display data:\n1:Aggregate Mode\n2:Detailed Mode");
		int mode = sc.nextInt();
		for (ExerciseS E : arr) {
			if (mode == 1)
				ExerciseS.printDataAggregate(E);
			else if (mode == 2)
				ExerciseS.printDataDetailed(E);
			else {
				System.out.println("Wrong data entered,Printing in Aggregate Mode");
				ExerciseS.printDataAggregate(E);
			}

		}
	}
}
