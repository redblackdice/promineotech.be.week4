import java.util.*;

class Week4 {
	/**
	 * From a given integer array input, the integer average sum is calculated and returned.
	 * @param intArray An integer array with a length greater than 0.
	 * @return int The integer sum integer divided by the number of integers.
	 */
	public static int calculateAverage(int intArray[]) {
		int result = 0;
		if(intArray.length > 0) {
			for(int i : intArray)
				result += i;
			result /= intArray.length;
		}
		return result;
	}
	/**
	 * From a given array input, the first element is subtracted from the last element of the array and printed out.
	 * @param agesArray An integer array with length greater than 0.
	 */
	public static void firstAndLastDifference(int[] agesArray) {
		// Part 1a: Subtract first element from last element as long as array length is greater than one.
		System.out.println((agesArray.length > 0)
			? agesArray[agesArray.length - 1] - agesArray[0]
			: "Size of array is not large enough"
		);
	}
	/**
	 * Uses the single parameter version and prints out the average age if set.
	 * @param agesArray An integer array with length greater than 0.
	 * @param calculateAverageAge Boolean to show average calculation step.
	 */
	public static void firstAndLastDifference(int[] agesArray, boolean calculateAverageAge) {
		firstAndLastDifference(agesArray);
		if(calculateAverageAge) {
			System.out.println("1a: Average Age: " + calculateAverage(agesArray));
		}
	}
	/**
	 * 7: Concatenates a string 'word' to itself 'n' times.
	 * @param word The word to repetitively concatenate.
	 * @param int The number of times to repetitively concatenate.
	 * @return The concatenated string.
	 */
	public static String wordConcatenate(String word, int n) {
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= n; ++i)
			sb.append(word);
		return sb.toString();
	}
	/**
	 * 8: Returns the first and last name with a space between them.
	 * @param firstName The String first name.
	 * @param lastName The String last name.
	 * @return A string with the first name, space, and last name stringed together.
	 */
	public static String nameCombiner(String firstName, String lastName) {
		return firstName + " " + lastName;
	}
	/**
	 * 9: Calculates the sum of integers in an array and checks if the sum is greater than 100.
	 * @param integers An array of integers.
	 * @return True if the integer sum is greater than 100, False if integer sum less than 100.
	 */
	public static boolean isArraySumGreaterThan100(int integers[]) {
		int sum = 0;
		for(int i : integers)
			sum += i;
		return sum > 100;
	}
	/**
	 * 10: Calculates the floating point average of a given FP64 array.
	 * @param fp64s An array of FP64.
	 * @return The average of the array.
	 */
	public static double averageFP64(double fp64s[]) {
		double result = 0;
		// Calculate the average if array length is greater than 1
		if(fp64s.length > 0) {
			for(double fp64 : fp64s)
				result += fp64;
			result /= fp64s.length;
		}
		return result;
	}
	/**
	 * Compares two FP64 arrays if array 1 average is greater than array 2 average.
	 * @param fp64s1 The first FP64 array to average and compare.
	 * @param fp64s2 The second FP64 array to average and compare to.
	 * @return True if fp64s1 is greater than fp64s2, else false.
	 */
	public static boolean isAverageArray1GreaterThanArray2(double fp64s1[], double fp64s2[]) {
		return averageFP64(fp64s1) > averageFP64(fp64s2);
	}
	/**
	 * 12: Will buy if it is hot outside and has enough money in pocket.
	 * @param isHotOutside Is it hot outside?
	 * @param moneyInPocket The FP64 amount of money in pocket?
	 * @return True if hot outside and FP64 amount of money in pocket is greater than 10.5, else false.
	 */
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		return isHotOutside && moneyInPocket > 10.50;
	}
	/**
	 * 13: Sometimes when I have problems, I know it's a problem, but I don't want to think it's a problem.
	 * As a reminder, the method prints out if I have a problem or not.
	 * @param isItAProblem A highly subject-able boolean, but let's just say it's either true or false.
	 */
	public static void doIHaveAProblem(boolean isItAProblem) {
		System.out.println((isItAProblem)
			? "Yes, you do have a problem."
			: "No, you do not have a problem."
		);
	}
	public static void main(String args[]) {
		int ages[] = { 3, 9, 23, 64, 2, 8, 28, 93 };

		firstAndLastDifference(ages, true);
		// Parb 1b: New array
		int ages2[] = new int[9];
		// Copy over
		for(int i = 0; i < ages.length; ++i)
			ages2[i] = ages[i];
		ages2[ages2.length - 1] = 87;
		firstAndLastDifference(ages2, true);

		// A partial sets of ages[] to show it works with different array lengths
		firstAndLastDifference(new int[] { 3, 9, 23 }, true);
		firstAndLastDifference(new int[] { 64, 2, 8, 28, 93 }, true);

		// 2: Creating an array of strings
		String names[] = { "Sam", "Tommy", "Tim", "Buck", "Bob" };
		int nameLengths[] = new int[names.length];
		// 2a: Calculate average number of letters per name
		for(int i = 0; i < names.length; ++i)
			nameLengths[i] = names[i].length();
		System.out.println("2a: Average letters per name: " + calculateAverage(nameLengths));
		// 2b: Concatenate names
		StringBuilder nameSpaced = new StringBuilder();
		for(int i = 0; i < names.length; ++i) {
			if(i > 0)
				nameSpaced.append(" ");
			nameSpaced.append(names[i]);
		}
		System.out.println("2b: " + nameSpaced.toString());
		// 3, 4
		System.out.print("3: Last element of an array is accessed by taking the array length and subtracting by 1. \nEx: myArray[myArray.length - 1]");
		System.out.print("4: First element of an array is accessed by the starting number 0.\nEx: myArray[0]");
		// 5
		// nameLengths array already declared on line 58;
		// 6 calculate sum
		int sum = 0;
		for(int i : nameLengths)
			sum += i;
		System.out.println("6: Sum of nameLengths array: " + sum);
		// 7
		// method: wordConcatenate
		System.out.println("7: wordConcatenate: " + wordConcatenate("Hello", 3));
		// 8 
		// method: nameCombiner
		System.out.println("8: nameCombiner: " + nameCombiner("John", "Doe"));
		// 9
		// method: isArraySumGreaterThan100
		System.out.println("9: is nameLengths greater than 100? " + isArraySumGreaterThan100(nameLengths));
		System.out.println("9: is ages greater than 100? " + isArraySumGreaterThan100(ages));
		// 10
		// method: averageFP64
		double fp64s1[] = { 23.56, 34.17, 82.5, 55.32 };
		System.out.println("10: Average Double of [ 23.56, 34.17, 82.5, 55.32 ] is " + averageFP64(fp64s1));
		// 11
		// method: isAverageArray1GreaterThanArray2
		double fp64s2[] = { 3.56, 15.17, 100.5, 115.32, 109.7, 101.32 };
		System.out.println("11: Is fp64s1 greater than fp64s2? " + isAverageArray1GreaterThanArray2(fp64s1, fp64s2));
		// 12
		// method: willBuyDrink
		System.out.println("12: It's not hot outside, but I have 155.50 in my pocket: " + willBuyDrink(false, 155.50));
		// 13
		// method: doIHaveAProblem
		System.out.println("13: Do I have a problem? I think it is a problem.");
		doIHaveAProblem(true);
	}
}