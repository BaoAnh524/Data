
public class HanoiTower {
	static void moveTower(int disk, char source, char dest, char spare) {
		if (disk == 1) {
			System.out.println("Move disk " + disk + " from " + source + " to " + dest);
		} else {
			moveTower(disk - 1, source, spare, dest);
			System.out.println("Move disk " + disk + " from " + source + " to " + dest);
			moveTower(disk - 1, spare, dest, source);
		}
	}

	public static void main(String[] args) {
		int n = 3; // number of disks
		moveTower(n, 'A', 'B', 'C');
	}
}
