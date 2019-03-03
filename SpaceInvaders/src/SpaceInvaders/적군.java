package SpaceInvaders;

import SpaceInvaders.À¯´Ö;

public class Àû±º extends À¯´Ö{

	public ¸Ê ÀÎº£ÀÌ´õ_Á¶ÀÛ¿ë_¸Êº¯¼ö = null;
	public int Á¡¼ö = 100;
	public void Ãâ·Â() {
		System.out.print("¢À");
	}

	public void Á×À½() {
//		this.current_position.invader = null;
//		if(this.buffer.invader == this)
//		this.buffer.invader = null;
		Á×À½È®ÀÎ = true;
	}
	public void ¸Êµé¾î°¡±â(¸Ê pos) {
		pos.invader = this;
		this.ÇöÀçÀ§Ä¡ = pos;		
	}

	public void ¸Ê³ª°¡±â(¸Ê pos) {
		pos.invader = null;
	}
	public void ÀÌµ¿(¸Ê current_pos, ¸Ê next_pos) {
		
		¸Ê³ª°¡±â(current_pos);
		¸Êµé¾î°¡±â(next_pos);
	}
}
