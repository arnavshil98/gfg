package shiva;

public class RopeCutting {

	public void CutRope(int length, int allowed1, int allowed2, int allowed3) {

		int a = length - allowed1;
		if (a < 0)
			return;
		CutRope(a, allowed1, allowed2, allowed3);
		int b = length - allowed2;
		if (b < 0)
			return;
		CutRope(b, allowed1, allowed2, allowed3);
		int c = length - allowed3;
		if (c < 0)
			return;
		CutRope(c, allowed1, allowed2, allowed3);

	}

	public static void main(String[] args) {

	}

}
