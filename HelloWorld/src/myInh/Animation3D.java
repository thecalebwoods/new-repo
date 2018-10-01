package myInh;

public class Animation3D extends Animation {
	private String com3Dsoftware;
	
	public String getCom3Dsoftware() {
		return com3Dsoftware;
	}



	public void setCom3Dsoftware(String com3Dsoftware) {
		this.com3Dsoftware = com3Dsoftware;
		System.out.println("Made in " + com3Dsoftware);
	}



	public void stillLife() {
		System.out.println("You used clay for your still life animation");
	}
}
