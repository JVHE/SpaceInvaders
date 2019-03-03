package SpaceInvaders;

public class 플레이어 extends 유닛 {
	public int 생명 = 2;
	public int score = 0;
	맵 미래위치;
	public int 이동속도 = 400;
	
	public void 이동(char direction, 맵 current_pos, 맵 right, 맵 left) {
		if(direction == 'a' || direction == 'A' || direction == 'ㅁ') {
			if(left.좌.현재상태 != 상태.경계) {
				미래위치 = left;
				this.이동(current_pos, 미래위치);
			}
		}
		if(direction == 'd' || direction == 'D' || direction == 'ㅇ') {
			if(right.우.현재상태 != 상태.경계) {
				미래위치 = right;
				this.이동(current_pos, 미래위치);
			}
		}
	}
	
	public void 이동(맵 current_pos, 맵 next_pos) {
		맵들어가기(next_pos);
		맵나가기(current_pos);
	}
	
	public void 맵들어가기(맵 pos) {
		pos.player = this;
		this.현재위치 = pos;		
	}
	
	public void 맵나가기(맵 pos) {
		pos.player = null;
	}
	
	Runnable 미사일 = new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			맵 pos = 현재위치.상;
			boolean flag = true;
			while(pos.상.현재상태 != 상태.경계) {
				if(pos.invader != null) {
					pos.invader.죽음();
					score = score + pos.invader.점수;
					return;
				}
				if(pos.wall != null) {
					pos.wall.파괴();
					return;
				}
				if(pos.상.현재상태 == 상태.적미사일) {
					pos.상.현재상태 = 상태.공간;
					return;
				}
				
				pos.현재상태 = 상태.미사일;
				
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				pos.현재상태 = pos.이전상태;
				pos = pos.상;
			}
			return;
		}
	};
	
	public void 미사일발사() {
		Thread launch = new Thread(미사일);
		launch.start();
	}
	
	public void 죽음() {
		생명--;
		if(생명<0) {
			시스템.게임오버();
		} else {
		}
		
	}
	public void 출력() {
		System.out.print("♠");
	}

}