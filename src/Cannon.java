
public class Cannon extends GameObject {

	private int position; // (reset to 0 at new game, moves back 0-6 squares per shot)
	private int pitch;
	private int power;

	Cannon(int position) {
		this.position = position;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		position = this.position;
	}

	public int getPitch() {
		return pitch;
	}

	public void setPitch(int position) {
		pitch = this.pitch;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int position) {
		power = this.power;
	}

	public void shoot() {
		int distance = this.position+power*pitch;
		CannonBall cannonBall = new CannonBall(pitch, power,distance);
		//cannonBall.setPower(power);
		//cannonBall.setPitch(pitch);
		//cannonBall.setPosition(distance);
		this.position = (int) (position - .1 * power * pitch);
	}

}
