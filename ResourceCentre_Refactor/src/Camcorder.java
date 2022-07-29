//testing the commit in camcorder -Jun Yan
//testing the commit in camorder - Daren Lee
public class Camcorder extends Item{
	private int opticalZoom;

	public Camcorder(String assetTag, String description, int opticalZoom) {
		super(assetTag, description);
		this.opticalZoom = opticalZoom;
	}
  
	public int getOpticalZoom() {
		return opticalZoom;
	}
	
	public String toString(){
		// Write your codes here
		String output = super.toString();
		output += String.format("%-63s %-20d", output, opticalZoom);
		
		return output;
		
		
	}
}

// added this line - Aswita 

