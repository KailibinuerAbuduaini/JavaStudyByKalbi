package KalbiTask1;
import java.awt.*;

import javax.swing.*;
public class kelly1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stu

		Grid grid = new Grid(75);
		int r = grid.getHt(), c = grid.getWd();

		// SIZE of STAR
		int size = 6, sH = r / size, sW = c / size;
		sW += sW / 2 + 1;

		// POSITION of STAR
		int sX = r/4, sY = r-8+(r/10);

		// POSITION of MOON
		int mX = r/6, mY = r/3-(r/15);

		// COLORS
		Color bg = new Color(85,158,226), star = Color.WHITE;

		// BACKGROUND
		for (int i = 0; i < r; i++) {
		for (int j = 0; j < c; j++) {
		grid.setColor(i, j, bg);
		}
		}

		// STAR:
		// FIRST PART - top triangle
		for (int row = sX, st = 0, con = 0; row < sX + sH - 1; row++, con++) {
		con = con > 1 ? 0 : con; st += con == 0 ? 1 : 0;

		for (int col = sY, count = 0; col < sY + sW; col++, count++) {
		grid.setColor(row, col, (count <= sW / 2 - st || count >= sW / 2 + st )? bg : star);
		}
		}
		sX += sH - 1;

		// SECOND PART - arms
		for (int row = sX, blank = 0; row < sX + sH / 2; row++, blank += 2) {
		for (int col = sY, count = 0; col < sY + sW; col++, count++) {
		if (count >= blank && count <= sW - blank) {
		grid.setColor(row, col, star);
		}
		}
		}
		sX += sH / 2;

		// THIRD PART - legs
		for (int row = sX, blank = sH, con = 0; row < sX + sH; row++, con++) {
		con = con > 1 ? 0 : con;
		blank -= con == 0 ? 1 : 0;
		for (int col = sY+2, count = 2; col < sY + sW; col++, count++) {
		if (count > blank && count < sW - blank - 1) {
		grid.setColor(row, col, star);
		}
		}
		}

		// FORTH PART - small triangle between legs
		for (int row = sX + sH / 5, blank = 0, con = 0; row < sX + sH; row++, con++) {
		con = con > 1 ? 0 : con;
		blank += con == 0 ? 1 : blank > 4 ? 1 : 2;
		for (int col = sY, count = 0; col < sY + sW; col++, count++) {
		if (count > sW / 2 - blank && count < sW / 2 + blank) {
		grid.setColor(row, col, bg);
		}
		}
		}

		// MOON

		// FIRST PART - BIG WHITE CIRCLE
		for (int row = mX, n = sH * 2+1, i = -n; i <= n; i++);
		
		
		
		
	}

}
