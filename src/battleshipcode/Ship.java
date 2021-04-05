package battleshipcode;

public class Ship 
{
	public int size;
	public String name;
	public  int damageDone;
	public  boolean isVertical;
	public  int coordinatesx;
	public  int coordinatesy;
	public  boolean isPlaced = false;
	
	public Ship(String inputName, int inputSize)
	{
		size = inputSize;
		name = new String(inputName);
	}
}
