
public class Target extends GameObject {

	private int position;
	private boolean hit;
	
	Target(int position) {
		this.position = position;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		position = this.position;
	}
	
	public boolean getHit() {
		return hit;
	}

	public void setHit(boolean hit) {
		hit = this.hit;
	}

	
}
