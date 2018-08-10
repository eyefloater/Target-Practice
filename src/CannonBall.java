
public class CannonBall extends GameObject {

	private int position;
	private int pitch;
	private int power;

	CannonBall(int pitch, int power, int position) {
		this.position = pitch * power + position;
	}

	public CannonBall() {
		// TODO Auto-generated constructor stub
	}

	public int getPitch() {
		return pitch;
	}

	public void setPitch(int pitch) {
		this.pitch = pitch;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

}
