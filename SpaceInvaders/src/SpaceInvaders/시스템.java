package SpaceInvaders;

import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class 시스템 {

	public static 맵 시작위치_플레이어 = null;
	public static 맵 시작위치_인베이더 = null;

	public static void 화면백지화() {
		for (int i = 0; i < 50; i++)
			System.out.println();
	}

	public static void 시작() {
		for (int i = 3; i > 0; i--) {
			System.out.println("             " + i + "초 후 시작합니다!");
			System.out.println("             " + i + "초 후 시작합니다!");
			System.out.println("             " + i + "초 후 시작합니다!");
			System.out.println("             " + i + "초 후 시작합니다!");
			System.out.println("             " + i + "초 후 시작합니다!");
			System.out.println("             " + i + "초 후 시작합니다!");
			System.out.println("             " + i + "초 후 시작합니다!");
			System.out.println("             " + i + "초 후 시작합니다!");
			System.out.println("             " + i + "초 후 시작합니다!");
			System.out.println("             " + i + "초 후 시작합니다!");
			System.out.println("             " + i + "초 후 시작합니다!");
			System.out.println("             " + i + "초 후 시작합니다!");
			System.out.println("             " + i + "초 후 시작합니다!");
			System.out.println("             " + i + "초 후 시작합니다!");
			System.out.println("             " + i + "초 후 시작합니다!");
			System.out.println("             " + i + "초 후 시작합니다!");
			System.out.println("             " + i + "초 후 시작합니다!");
			System.out.println("             " + i + "초 후 시작합니다!");
			System.out.println("             " + i + "초 후 시작합니다!");
			System.out.println("             " + i + "초 후 시작합니다!");
			System.out.println("             " + i + "초 후 시작합니다!\n\n");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			화면백지화();
		}
	}

	public static void 게임오버() {
		화면백지화();
		System.out
				.println("GAME OVER   GAME OVER   GAME OVER   GAME OVER   GAME OVER   ");
		System.out
				.println("    GAME OVER   GAME OVER   GAME OVER   GAME OVER   GAME OVER   ");
		System.out
				.println("GAME OVER   GAME OVER   GAME OVER   GAME OVER   GAME OVER   ");
		System.out
				.println("    GAME OVER   GAME OVER   GAME OVER   GAME OVER   GAME OVER   ");
		System.out
				.println("GAME OVER   GAME OVER   GAME OVER   GAME OVER   GAME OVER   ");
		System.out
				.println("    GAME OVER   GAME OVER   GAME OVER   GAME OVER   GAME OVER   ");
		System.out
				.println("GAME OVER   GAME OVER   GAME OVER   GAME OVER   GAME OVER   ");
		System.out
				.println("    GAME OVER   GAME OVER   GAME OVER   GAME OVER   GAME OVER   ");
		System.out
				.println("GAME OVER   GAME OVER   GAME OVER   GAME OVER   GAME OVER   ");
		System.out
				.println("    GAME OVER   GAME OVER   GAME OVER   GAME OVER   GAME OVER   ");
		System.out
				.println("GAME OVER   GAME OVER   GAME OVER   GAME OVER   GAME OVER   ");
		System.out
				.println("    GAME OVER   GAME OVER   GAME OVER   GAME OVER   GAME OVER   ");
		System.out
				.println("GAME OVER   GAME OVER   GAME OVER   GAME OVER   GAME OVER   ");
		System.out
				.println("    GAME OVER   GAME OVER   GAME OVER   GAME OVER   GAME OVER   ");
		System.out
				.println("GAME OVER   GAME OVER   GAME OVER   GAME OVER   GAME OVER   ");
		System.out
				.println("    GAME OVER   GAME OVER   GAME OVER   GAME OVER   GAME OVER   ");
		System.out
				.println("GAME OVER   GAME OVER   GAME OVER   GAME OVER   GAME OVER   ");
		System.out
				.println("    GAME OVER   GAME OVER   GAME OVER   GAME OVER   GAME OVER   ");
		System.out
				.println("GAME OVER   GAME OVER   GAME OVER   GAME OVER   GAME OVER   ");
		System.out
				.println("    GAME OVER   GAME OVER   GAME OVER   GAME OVER   GAME OVER   ");
		System.out
				.println("GAME OVER   GAME OVER   GAME OVER   GAME OVER   GAME OVER   ");
		System.out
				.println("    GAME OVER   GAME OVER   GAME OVER   GAME OVER   GAME OVER   ");
		System.out
				.println("GAME OVER   GAME OVER   GAME OVER   GAME OVER   GAME OVER   ");
		System.out
				.println("    GAME OVER   GAME OVER   GAME OVER   GAME OVER   GAME OVER   ");
		System.out
				.println("GAME OVER   GAME OVER   GAME OVER   GAME OVER   GAME OVER   ");
		System.out
				.println("    GAME OVER   GAME OVER   GAME OVER   GAME OVER   GAME OVER   ");
		System.out
				.println("GAME OVER   GAME OVER   GAME OVER   GAME OVER   GAME OVER   ");
		System.out
				.println("    GAME OVER   GAME OVER   GAME OVER   GAME OVER   GAME OVER   ");
		System.out
				.println("GAME OVER   GAME OVER   GAME OVER   GAME OVER   GAME OVER   ");
		System.out
				.println("    GAME OVER   GAME OVER   GAME OVER   GAME OVER   GAME OVER   ");
		System.out
				.println("GAME OVER   GAME OVER   GAME OVER   GAME OVER   GAME OVER   ");
		System.out
				.println("    GAME OVER   GAME OVER   GAME OVER   GAME OVER   GAME OVER   ");
		System.out
				.println("GAME OVER   GAME OVER   GAME OVER   GAME OVER   GAME OVER   ");
		System.out
				.println("    GAME OVER   GAME OVER   GAME OVER   GAME OVER   GAME OVER   ");
		System.out
				.println("GAME OVER   GAME OVER   GAME OVER   GAME OVER   GAME OVER   ");
		System.out
				.println("    GAME OVER   GAME OVER   GAME OVER   GAME OVER   GAME OVER   ");
		System.out
				.println("GAME OVER   GAME OVER   GAME OVER   GAME OVER   GAME OVER   ");
		System.out
				.println("    GAME OVER   GAME OVER   GAME OVER   GAME OVER   GAME OVER   ");
		System.out
				.println("GAME OVER   GAME OVER   GAME OVER   GAME OVER   GAME OVER   ");
		System.out
				.println("    GAME OVER   GAME OVER   GAME OVER   GAME OVER   GAME OVER   ");
		System.out
				.println("GAME OVER   GAME OVER   GAME OVER   GAME OVER   GAME OVER   ");
		System.out
				.println("    GAME OVER   GAME OVER   GAME OVER   GAME OVER   GAME OVER   ");

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void 클리어() {
		화면백지화();
		Runnable bgm = new Runnable() {
			public void run() {
				try {
//					// 음악 안넣음
//					Clip clip = AudioSystem.getClip();
//					File file = new File("");
//					System.out.println(file.exists());
//					clip.open(AudioSystem.getAudioInputStream(file));
//					clip.start();
				} catch (Exception e) {
				}
			}
		};
		
		
		
		Thread clear = new Thread(bgm);
		clear.start();
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		System.out.println("■■■┌──┐  │     ┌───   ──   ┌── ■■■");
		System.out.println("■■■│     │     │     │  │  │  │■■■");
		System.out.println("■■■│     │     ├───  ├──┤  ├──┘■■■");
		System.out.println("■■■│     │     │     │  │  │ \\ ■■■");
		System.out.println("■■■└──┘  └───  └───  │  │  │  \\■■■");
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
	}
}
