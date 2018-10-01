package myInh;

public class Animation2D extends Animation {
	
	private String drawMaterials;
	
	public String getDrawMaterials() {
		return drawMaterials;
	}

	public void setDrawMaterials(String drawMaterials) {
		this.drawMaterials = drawMaterials;
		System.out.println("Made in " + drawMaterials);
	}

	public void stillLife() {
		System.out.println("You used paper for your still life animation");
	}
	
}
