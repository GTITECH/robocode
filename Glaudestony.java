package tecProg;

	import robocode.*;
	import java.awt.Color;

	public class Glaudestony extends AdvancedRobot {
	public void run() {
	// A inicialização do robô deve ser colocada aqui
		setColors(Color.red,Color.black,Color.black); // body,gun,radar
	// Loop principal do robô
	while(true) {
	// Substitua as próximas 4 linhas com qualquer comportamento que você desejar
	setAhead(150);
	setTurnGunRight(360);
	turnLeft(70);
	turnGunRight(300);
	}
	}
	public void onScannedRobot(ScannedRobotEvent e) {
	fire(2);
	}
	public void onHitByBullet(HitByBulletEvent e) {
	setTurnLeft(50);
	setTurnGunRight(360);
	}
	public void onHitWall(HitWallEvent e) {
	back(80);
	turnLeft(50);
	}
}
