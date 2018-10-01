package myInh;

public class launcher {
	public static void main(String[] args) {
		
	myInh.Animation myAnimation = new Animation();
	
	myAnimation.setTitle("Tom & Jerry");
	myAnimation.setFrames(24);
	myAnimation.setOld(true);
	
	
	myAnimation.stillLife();
	myAnimation.toString();

	Animation2D my2Danimation = new Animation2D();
		my2Danimation.setDrawMaterials("Pencil");
		my2Danimation.setFrames(30);
		my2Danimation.setOld(false);
		my2Danimation.setTitle("Pops");
		
		my2Danimation.stillLife();
		my2Danimation.toString();
	Animation3D my3Danimation = new Animation3D();
		my3Danimation.setCom3Dsoftware("Maya");
		my3Danimation.setFrames(60);
		my3Danimation.setOld(false);
		my3Danimation.setTitle("Boom");
	
		my3Danimation.stillLife();
		my3Danimation.toString();
	}
}
