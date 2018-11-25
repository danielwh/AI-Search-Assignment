import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Population {
	
	private int[][] distances;
	private static int n;
	public Tour[] tours;
	private static FileWriter writer;

	public static void main(String[] args) {
		try
		{
			//Run the genetic algorithm for every set of cities
			Population.run("NEWAISearchfile012.txt");
			Population.run("NEWAISearchfile017.txt");
			Population.run("NEWAISearchfile021.txt");
			Population.run("NEWAISearchfile026.txt");
			Population.run("NEWAISearchfile042.txt");
			Population.run("NEWAISearchfile048.txt");
			Population.run("NEWAISearchfile058.txt");
			Population.run("NEWAISearchfile175.txt");
			Population.run("NEWAISearchfile180.txt");
			Population.run("NEWAISearchfile535.txt");
		}
		catch(IOException e) {}
	}
	
	public Population(String file)
	{
		//Read in the size and distances
		Scanner sc = new Scanner(file);
	}
	
	public static void run(String file) throws IOException
	{
		//Create an initial population
		Population population = new Population(file);
		//Define a separate population to hold the results of each iteration
		Population newPopulation;
		//Iterate the population a large number of times
		for (int i=0; i<100; i++)
		{
			newPopulation = population.iterate();
			population = newPopulation;			
		}
		//Find the best tour in the final population
		Tour best = population.findBest();
		//Write the best tour to a file
		writer = new FileWriter("tour" + file);
		writer.write("NAME = " + file + "\nTOURSIZE = " + n + "\nLENGTH = " + best.length + ", " + best.tour.toString());
		writer.close();
		
	}
	
	public Population iterate()
	{
		
	}
	
	public Tour findBest()
	{
		Tour bestTour = tours[0];
		for (int i = 1; i < tours.length; i++)
		{
			if (tours[i].length < bestTour.length)
			{
				bestTour = tours[i];
			}
		}
		return bestTour;
	}	

}
