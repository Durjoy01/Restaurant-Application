package restaurantsystem.model;

import java.util.Random;

public class SuperItem {
	  private String name;
	  
	  public SuperItem(String name) {
	      this.name = name;
	       
	  }
	  public String getName() {
	      return name;
	  }
	  public void setName(String name) {
	       this.name = name;
	  } 
	  
	  public int itemBarCodeGenerator() {
		  Random barCode = new Random(); 
	      return (int) barCode.nextInt();
	  } 
}