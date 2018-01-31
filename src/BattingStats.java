import java.util.Arrays;
import java.util.Scanner;

/*
 * Ben Fogt
 * Grand Circus Java Bootcamp
 * Take At Bat occurances and generate batting and slugging stats
 * for multiple batters.
 */

public class BattingStats {

	public static void main(String[] args) {

		// Banner Display
		System.out.println("Welcome to the Batting Average Calculator!");
		System.out.println();

		// Initialize Objects and Variables
		Scanner scan = new Scanner(System.in);

		// Start building Array(s)
		int vBatters = Validator.getInt(scan, "Enter number of Batters:");
		int[][] vBats = new int[vBatters][]; // 2 Dimensional  Double Array that will contain hold AtBat data
		
		// For Loop to roll through first level array
		// First assigning array size to the array at play and populating it.
		
		for (int i = 0; i < vBats.length; i++) {
			String vPrompt = ("Enter number of times at bat for Batter " + i+1 + ":");
			int vAtBat = Validator.getInt(scan, vPrompt);
			vBats[i] = new int[vAtBat];
			
			// Print header for new player
			System.out.println("Entering At-Bats for Player " + (i+1) + ".");
			System.out.println("0=out, 1=single, 2=double, 3=triple, 4=home run");
			
			// Enhanced For Loop to handle second tier data entry			
			for (int i2 = 0; i2 < vBats[i].length; i2++) {
			vBats[i][i2] = Validator.getInt(scan, ("Result for at-bat " + (i2 + 1) + ":"));
			}
		}
		
		System.out.println();
		//System.out.println(Arrays.deepToString(vBats));

		// Print Table of Statistics for each batter
		
		System.out.println("Player\t\tBA\tS%   ");
		System.out.println("______\t\t___\t___");
		for (int i = 0; i < vBats.length; i++) {
			int vHits = 0;
			int vBases = 0;
			for (int atBat = 0; atBat < vBats[i].length; atBat++) {
				if (atBat > 0) {
					vHits += vBats[i][atBat];
				}
				vBases += vBats[i][atBat];
			}
			// Here's the magic (It prints the table)
			//System.out.println("Player " + (i+1) + ":/t" + ((double)vHits/vBats[i].length) + "/t" + ((double)vBases/vBats[1].length));
String vLine = ("Player " + (i+1) + ":\t" + ((double)vHits/vBats[i].length) + "\t" + ((double)vBases/vBats[1].length));
System.out.println(vLine);
		}
		
		System.out.println("Thank you.");
		
		
	}

}
