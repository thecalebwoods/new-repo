package myInh;

public class Animation {
	private String title;
	private int frames;
	private boolean old;
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getFrames() {
		return frames;
	}
	public void setFrames(int frames) {
		this.frames = frames;
	}
	public boolean isOld() {
		return old;
	}
	public void setOld(boolean old) {
		this.old = old;
	}
	
	public void stillLife() {
		System.out.println("You can make it either way");
	}
	@Override
	public String toString() {
		System.out.println("Animation [title=" + title + ", frames=" + frames + ", old=" + old + "]");
		return null;
	}
	
}
