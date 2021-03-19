package battleshipcode;

public class Ship 
{
	public static int size;
	public static String name;
	public  int damageDone;
	public  boolean isVertical;
	public  int coordinatesx;
	public  int coordinatesy;
	public  boolean isPlaced = false;
	
	public Ship(String inputName, int inputSize)
	{
		size = inputSize;
		name = inputName;
	}
	
	
}
