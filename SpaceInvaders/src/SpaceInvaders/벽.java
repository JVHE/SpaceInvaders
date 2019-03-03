package SpaceInvaders;

public class 벽 extends 물체 {
	
	public void 파괴() {
		this.현재위치.wall = null;
	}
	public void 출력() {
		System.out.print("▲");
	}
}
