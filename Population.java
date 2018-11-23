import java.util.Scanner;

public class Population {
	
	private int[][] distances;

	public static void main(String[] args) {
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
	
	public Population(String file)
	{
		//Read in the size and distances
		Scanner sc = new Scanner(file);
	}
	
	public static void run(String file)
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
	}
	
	public Population iterate()
	{
		
	}
	
	public Tour findBest()
	{
		
	}	

}
