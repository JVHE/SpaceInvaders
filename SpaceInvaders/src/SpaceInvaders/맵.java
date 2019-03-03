package SpaceInvaders;

// 경계 = '■' 공간= ' ' 미사일 = '!' 데드라인 = '-' 적미사일 = ':'
enum 상태{
	경계, 공간, 미사일, 데드라인, 적미사일;
	
} 

public class 맵 {
	public int x좌표;
	public int y좌표;
	상태 현재상태;
	상태 이전상태;
	
	적군 invader = null;
	플레이어 player = null;
	벽 wall = null;
	
	//각각 맵의 상하좌우를 가리킵니다.
	맵 상;
	맵 하;
	맵 우;
	맵 좌; 
	맵() {
		현재상태 = 상태.공간;
	}
	
	public 맵(int x, int y) {
		x좌표 = x;
		y좌표 = y;
		현재상태 = 상태.공간;
	}
	
	public void 맵설정(String status) {
		switch (status) {
		case "boundary"	: this.이전상태 = this.현재상태 = 상태.경계;
		break;
		case "space"	: this.이전상태 = this.현재상태 = 상태.공간;
		break;
		//case "object"	: this.status = component.object;
		case "missile"	: this.이전상태 = this.현재상태 = 상태.미사일;
		break;
		case "deadline"	: this.이전상태 = this.현재상태 = 상태.데드라인;
		break;
		default			: System.out.println("There are no such status.");
		}
	}
	
	public void 출력() {
		boolean flag = true;
		if(this.invader != null && this.player != null) {
			player.죽음();
		}			
		if(this.invader != null) {
			if(현재상태 == 상태.데드라인) {
				player.죽음(); 
				return;
			}
			if(현재상태 == 상태.미사일) {
				System.out.print('#');
				invader.죽음();
				return;
			}
			if(this.wall != null) {
				this.wall = null;
			}
			invader.출력();
			flag = false;
			return;
		}
		if(this.wall != null) {
			wall.출력();
			return;
		}
		if(this.player != null) {
			if(현재상태 == 상태.미사일) {
				System.out.print('#');
				player.죽음();
				return;
			}
			player.출력();
			flag = false;
		}
		if(우.player != null) {
			System.out.print("(");
			flag = false;
		}
		if(좌.player != null) {
			System.out.print(")");
			flag = false;
		}
		if(flag) {
			if(현재상태 == 상태.경계) {
				System.out.print("■");
			} else if(현재상태 == 상태.공간) {
				System.out.print(" ");
			} else if(현재상태 == 상태.미사일) {
				System.out.print("!");
			} else if(현재상태 == 상태.데드라인) {
				System.out.print("-");
			} else if(현재상태 == 상태.적미사일) {
				System.out.print(":");
			}
		}
		return;
	}

}
