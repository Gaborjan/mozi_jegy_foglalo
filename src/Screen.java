public class Screen {
	public static void main(String[] args) {
		Kijelzo konzol = new Kijelzo(25, 80);
		konzol.keret(24, 79, 'S', true,"");
		konzol.poz(3, 3);
		konzol.keret(5, 65, 'd', true,"");
		// konzol.keret(24, 79, 'S', true);
		// konzol.keret(24, 79, 'S', true);
		// konzol.sorRajzol('*', 80);
		// konzol.poz(24, 0);
		// konzol.sorRajzol('*', 80);
		konzol.poz(1, 70);
		konzol.ir("HELLO");
		konzol.kiir();
		konzol.torol();
		konzol.keret(24, 79, 'S', true," FEJL�C ");
		konzol.poz(3, 3);
		konzol.keret(5, 65, 'd', true,"J� HOSSZ� FEJL�C SZ�VEG");
		konzol.poz(15, 40);
		konzol.keret(5, 20, 'S', true,"PONT");
		konzol.poz(10, 10);
		konzol.keret(10, 20, 'S', true,"MEN�");
		konzol.irXY(12, 12, "1. Neh�zs�g");
		konzol.irXY(13, 12, "2. �j j�t�k");
		konzol.irXY(14, 12, "3. Kil�p�s");
		/*
		 * konzol.sorRajzol('*', 80); konzol.poz(24, 0); konzol.sorRajzol('*', 80);
		 */
		konzol.poz(10, 70);
		konzol.ir("HELLO");
		konzol.irXY(24, 70, "J�nv�ri G�bor");
		konzol.kiir();
		konzol.torol();
		/*for (int i=0;i<79;i++) {
			konzol.irXY(0, i, "*");
			konzol.kiir();
			konzol.irXY(0,i," ");
		}*/
	}
}
