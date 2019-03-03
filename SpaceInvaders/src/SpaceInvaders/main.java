package SpaceInvaders;

import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.util.Random;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import SpaceInvaders.시스템;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		class 쓰레드조작클래스 {
			char move = 'T';
			char direction = 'B';
			int high_score = 1000;
			int difficulty = 0;
			int time = 60;
			boolean is_stop = false;
			boolean is_over = false;
			boolean is_clear = false;
		}
		final 쓰레드조작클래스 share_area = new 쓰레드조작클래스();

		final Scanner scan = new Scanner(System.in);

		final 플레이어 gamer;
		final int speed_screen = 200;

		gamer = new 플레이어();

		System.out
				.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		System.out
				.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		System.out
				.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		System.out
				.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");

		System.out
				.println("                                                       88              \n"
						+ "                                                       \"\"              \n"
						+ "                                                                       \n"
						+ ",adPPYba, 8b,dPPYba,  ,adPPYYba,  ,adPPYba,  ,adPPYba, 88 8b,dPPYba,   \n"
						+ "I8[    \"\" 88P'    \"8a \"\"     `Y8 a8\"     \"\" a8P_____88 88 88P'   `\"8a  \n"
						+ " `\"Y8ba,  88       d8 ,adPPPPP88 8b         8PP\"\"\"\"\"\"\" 88 88       88  \n"
						+ "aa    ]8I 88b,   ,a8\" 88,    ,88 \"8a,   ,aa \"8b,   ,aa 88 88       88  \n"
						+ "`\"YbbdP\"' 88`YbbdP\"'  `\"8bbdP\"Y8  `\"Ybbd8\"'  `\"Ybbd8\"' 88 88       88  \n"
						+ "          88                                                           \n"
						+ "          88                                                           \n"
						+ "                                                                    \n"
						+ "                                88                                  \n"
						+ "                                88                                  \n"
						+ "                                88                                  \n"
						+ "8b       d8 ,adPPYYba,  ,adPPYb,88  ,adPPYba, 8b,dPPYba, ,adPPYba,  \n"
						+ "`8b     d8' \"\"     `Y8 a8\"    `Y88 a8P_____88 88P'   \"Y8 I8[    \"\"  \n"
						+ " `8b   d8'  ,adPPPPP88 8b       88 8PP\"\"\"\"\"\"\" 88          `\"Y8ba,   \n"
						+ "  `8b,d8'   88,    ,88 \"8a,   ,d88 \"8b,   ,aa 88         aa    ]8I  \n"
						+ "    \"8\"     `\"8bbdP\"Y8  `\"8bbdP\"Y8  `\"Ybbd8\"' 88         `\"YbbdP\"'  ");
		System.out
				.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		System.out
				.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		System.out
				.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		System.out
				.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");

		System.out.println("			      1. 플레이");
		System.out.println("			      2. 종료");
		System.out
				.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		System.out
				.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		System.out
				.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		System.out
				.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");

		String selection;
		selection = scan.nextLine();
		while (!selection.equals("1") && !selection.equals("2")) {
			System.out.println("잘못된 값을 입력하였습니다. 똑바로 쓰세요!");
			selection = scan.nextLine();
		}
		if (selection.equals("1")) {
			시스템.화면백지화();

		} else {
			시스템.화면백지화();
			System.out.println("종료합니다.");

			scan.close();
			return;
		}

		System.out
				.println("도움말\n      ♣	<- UFO (맞추면 보너스점수 500점)\n♥♥♥♥	<- 적군 \n\n :	<- 적 미사일(맞으면 게임오버!!)\n\n\n\n▲	<- 벽(미사일에 의해 파괴됩니다.)\n !	<- 미사일\n(♠)	<- 플레이어\n클리어 조건: 적군 모두 섬멸!\n조작법: A(왼쪽), S(멈춤), D(오른쪽) 입력 후 엔터.\n미사일 발사: 스페이스바 입력 후 엔터\n\n게임을 시작하려면 엔터를 누르세요!");
		selection = scan.nextLine();
		시스템.화면백지화();

		시스템.시작();

		final int size_row = 15;
		final int size_col = 25;

		final 맵[][] stage = new 맵[size_row][size_col];
		for (int i = 0; i < size_row; i++) {
			for (int j = 0; j < size_col; j++) {
				stage[i][j] = new 맵(i, j);
			}
		}

		for (int i = 0; i < size_row; i++) {
			for (int j = 0; j < size_col; j++) {
				stage[i][j].상 = stage[(stage[i][j].x좌표 + size_row - 1)
						% size_row][stage[i][j].y좌표];
				stage[i][j].하 = stage[(stage[i][j].x좌표 + 1) % size_row][stage[i][j].y좌표];
				stage[i][j].좌 = stage[stage[i][j].x좌표][(stage[i][j].y좌표
						+ size_col - 1)
						% size_col];
				stage[i][j].우 = stage[stage[i][j].x좌표][(stage[i][j].y좌표 + 1)
						% size_col];
			}
		}

		for (int i = 0; i < size_row; i++) {
			for (int j = 0; j < size_col; j++) {
				stage[i][j].맵설정("boundary");
			}
		}
		for (int i = 1; i < size_row - 1; i++) {
			for (int j = 1; j < size_col - 1; j++) {
				stage[i][j].맵설정("space");
			}
		}
		for (int i = 1; i < size_col - 1; i++) {
			stage[size_row - 2][i].맵설정("deadline");
		}

		인베이더[][] invaders = new 인베이더[2][8];
		final 맵[][] buffer = new 맵[2][8];

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 8; j++) {
				invaders[i][j] = new 인베이더();
				invaders[i][j].맵들어가기(stage[i + 2][j + 3]);
			}
		}
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 8; j++) {
				buffer[i][j] = new 맵();
				buffer[i][j].invader = invaders[i][j];
				invaders[i][j].인베이더_조작용_맵변수 = buffer[i][j];
			}
		}
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 5; j++) {
				stage[size_row - 5 - i][size_col / 2 + 3 + j].wall = new 벽();
				stage[size_row - 5 - i][size_col / 2 + 3 + j].wall.현재위치 = stage[size_row
						- 5 - i][size_col / 2 + 3 + j];
				stage[size_row - 5 - i][size_col / 2 - 3 - j].wall = new 벽();
				stage[size_row - 5 - i][size_col / 2 - 3 - j].wall.현재위치 = stage[size_row
						- 5 - i][size_col / 2 - 3 - j];

			}
		}

		Runnable bgm = new Runnable() {
			Clip clip;

			public void run() {
				try {
//					clip = AudioSystem.getClip();
//					// 음악 안넣음
//					File file = new File("");
//					System.out.println(file.exists());
//					clip.open(AudioSystem.getAudioInputStream(file));
//					clip.start();
//					while (!share_area.is_clear) {
//						Thread.sleep(100);
//					}
//					clip.stop();
				} catch (Exception e) {
//					clip.stop();
				
				}
			}
		};

		final Thread bgm_start = new Thread(bgm);
		bgm_start.start();

		Runnable showScreen = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub

				boolean flag = true;

				while (flag) {
					if (share_area.is_over) {
						return;
					}
					flag = false;
					시스템.화면백지화();
					System.out.println("");
					if (gamer.score >= share_area.high_score)
						share_area.high_score = gamer.score;
					System.out.println("\t남은 시간: " + share_area.time + "초");
					System.out.println("1P\tHIGH SCORE   LIFE");
					System.out.println("" + gamer.score + "\t"
							+ share_area.high_score + "\t     " + gamer.생명);
					for (int i = 0; i < size_row; i++) {
						for (int j = 0; j < size_col; j++) {
							if (stage[i][j].invader != null
									&& stage[i][j].invader.죽음확인) {
								stage[i][j].invader = null;
							}
							stage[i][j].출력();
							if (stage[i][j].invader != null) {
								flag = true;
								if (!share_area.is_clear
										&& stage[i][j].하.현재상태 == 상태.데드라인) {
									share_area.is_over = true;
									시스템.게임오버();
									return;
								}
							}
							if (share_area.is_over) {
								return;
							}
						}
						System.out.println("");
					}
					System.out
							.println("도움말\n조작법: A(왼쪽), S(멈춤), D(오른쪽) 입력 후 엔터.\n미사일 발사: 스페이스바 입력 후 엔터\n(♠): 플레이어\n♥: 적군   ▲: 벽\n클리어 조건: 적군 모두 섬멸!");

					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					if (!flag) {
						bgm_start.interrupt();
						시스템.클리어();
						System.out.println("\t     처치점수: " + gamer.score + "점");
						System.out.println("\t +시간점수: " + share_area.time * 20
								+ "점");
						gamer.score += share_area.time * 20;
						System.out.println("\n\n\t     최종점수: " + gamer.score
								+ "점!!\n\n");

					}
				}
			}
		};

		Runnable invader_move = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				boolean flag = true;
				boolean direction = true; // true means right, false means left
				while (flag) {
					if (direction) {
						// move right
						for (int j = 7; j >= 0; j--) {
							// move to down if invaders counter boundary
							if ((buffer[1][j].invader != null && buffer[1][j].invader.현재위치.우.현재상태 == 상태.경계)
									|| (buffer[0][j].invader != null && buffer[0][j].invader.현재위치.우.현재상태 == 상태.경계)) {
								direction = !direction;
								for (int k = 7; k >= 0; k--) {
									for (int l = 1; l >= 0; l--) {
										if (buffer[l][k].invader != null) {
											if (!share_area.is_clear
													&& buffer[l][k].invader.현재위치.하.현재상태 == 상태.데드라인) {
												share_area.is_over = true;

												시스템.게임오버();
												return;
											}
											buffer[l][k].invader
													.이동(buffer[l][k].invader.현재위치,
															buffer[l][k].invader.현재위치.하);
										}
									}
								}
								break;
							}
							// check is dead
							for (int i = 1; i >= 0; i--) {
								if (buffer[i][j].invader != null) {
									if (buffer[i][j].invader.죽음확인) {
										buffer[i][j].invader = null;
										continue;
									}
									// move to right
									buffer[i][j].invader.이동(
											buffer[i][j].invader.현재위치,
											buffer[i][j].invader.현재위치.우);

								}
							}
						}
					} else {
						// move left
						for (int j = 0; j < 8; j++) {
							// move to down if invaders counter boundary
							if ((buffer[1][j].invader != null && buffer[1][j].invader.현재위치.좌.현재상태 == 상태.경계)
									|| (buffer[0][j].invader != null && buffer[0][j].invader.현재위치.좌.현재상태 == 상태.경계)) {
								direction = !direction;
								for (int k = 7; k >= 0; k--) {
									for (int l = 1; l >= 0; l--) {
										if (buffer[l][k].invader != null) {
											// if they come to deadline, then
											// game over
											if (!share_area.is_clear
													&& buffer[l][k].invader.현재위치.하.현재상태 == 상태.데드라인) {
												share_area.is_over = true;

												시스템.게임오버();
												return;
											}
											buffer[l][k].invader
													.이동(buffer[l][k].invader.현재위치,
															buffer[l][k].invader.현재위치.하);
										}
									}
								}
								break;
							}
							for (int i = 1; i >= 0; i--) {
								if (buffer[i][j].invader != null) {
									if (buffer[i][j].invader.죽음확인) {
										buffer[i][j].invader = null;
										continue;
									}
									buffer[i][j].invader.이동(
											buffer[i][j].invader.현재위치,
											buffer[i][j].invader.현재위치.좌);

									if (!share_area.is_clear
											&& buffer[i][j].invader.현재위치.하.현재상태 == 상태.데드라인) {
										share_area.is_over = true;
										시스템.게임오버();
										return;
									}
								}
							}
						}
					}
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}

			}
		};
		Runnable attack_invader = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				while (!share_area.is_clear) {
					Random rand = new Random();
					for (int i = 1; i >= 0; i--) {
						for (int j = 0; j < 8; j++) {
							if (buffer[i][j].invader != null
									&& rand.nextInt(10) % 10 == 0) {
								final 맵 tmp = buffer[i][j];
								Runnable atk_missile = new Runnable() {

									@Override
									public void run() {
										// TODO Auto-generated method stub
										맵 pos = tmp.invader.현재위치.하.하;
										while (pos.현재상태 != 상태.데드라인) {
											if (pos.player != null
													|| pos.좌.player != null
													|| pos.우.player != null) {
												share_area.is_over = true;
												시스템.게임오버();
												return;
											}
											if (pos.wall != null) {
												pos.wall.파괴();
												return;
											}
											if (pos.현재상태 == 상태.미사일) {
												pos.현재상태 = 상태.공간;
												return;
											}

											pos.현재상태 = 상태.적미사일;

											try {
												Thread.sleep(400);
											} catch (InterruptedException e) {
												e.printStackTrace();
											}
											pos.현재상태 = pos.이전상태;
											pos = pos.하;
										}
										return;
									}
								};
								Thread atkk = new Thread(atk_missile);
								atkk.start();
								try {
									Thread.sleep(6000);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
						}
						;
					}
				}
			}
		};

		Thread inv_atk = new Thread(attack_invader);
		inv_atk.start();

		final 적군 ext = new 적군();
		Runnable ufo_set = new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					// TODO Auto-generated method stub

					try {
						Thread.sleep(4000);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					ext.맵들어가기(stage[2][1]);
					while (ext.현재위치.우.현재상태 != 상태.경계) {
						ext.이동(ext.현재위치, ext.현재위치.우);
						try {
							Thread.sleep(300);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					ext.현재위치.invader = null;

				}
			}
		};

		Thread ufo_start = new Thread(ufo_set);
		ufo_start.start();

		Runnable player_move = new Runnable() {

			쓰레드조작클래스 shere;

			@Override
			public void run() {
				// TODO Auto-generated method stub
				int x, y;
				x = size_row - 3;
				y = size_col / 2;
				시스템.시작위치_플레이어 = stage[x][y];
				gamer.맵들어가기(stage[x][y]);
				shere = share_area;
				char direction = shere.direction;

				while (true) {
					direction = shere.direction;
					gamer.이동(
							direction,
							gamer.현재위치,
							stage[gamer.현재위치.x좌표][((gamer.현재위치.y좌표 + 1) % size_col)],
							stage[gamer.현재위치.x좌표][((gamer.현재위치.y좌표 + size_col - 1) % size_col)]);
					if (shere.move == ' ') {
						shere.move = 'O';
						gamer.미사일발사();
					}
					try {
						Thread.sleep(gamer.이동속도);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

			}
		};

		Runnable time_limit = new Runnable() {
			public void run() {
				while (share_area.time > 0) {
					share_area.time--;
					try {
						Thread.sleep(1000);
					} catch (Exception e2) {
						// TODO: handle exception
					}
					if (!share_area.is_clear && share_area.time == 0) {
						share_area.is_over = true;
						시스템.게임오버();
					}
				}
			}
		};

		final Scanner sc = new Scanner(System.in);
		String select = "gg";

		Thread show = new Thread(showScreen);
		Thread player_thread = new Thread(player_move);
		Thread invader_thread = new Thread(invader_move);
		Thread timeout = new Thread(time_limit);

		show.start();
		player_thread.start();
		invader_thread.start();
		timeout.start();

		while (((select = sc.nextLine()) != null) && !share_area.is_stop) {
			if (!select.equals("")) {
				share_area.direction = select.charAt(0);
				if (select.contains(" ")) {
					share_area.move = ' ';
				}
			}
		}

		sc.close();
		scan.close();
		시스템.화면백지화();
		System.out.println("종료합니다!");
		return;
	}

}
