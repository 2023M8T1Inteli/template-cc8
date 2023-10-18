package inteli.cc6;

import processing.core.PApplet;

public class MinhaJanela extends PApplet {

	public void settings() {
		size(500, 500);
	}

	public void draw(){
		background(64);
		
		fill(255, 255, 255);
		ellipse(mouseX, mouseY, 20, 20);

		textSize(64);
		text("Inteli", 40, 120); 

		textSize(48);
		fill(0, 408, 612);
		text("Turma 5", 40, 180); 
		
		textSize(36);
		fill(408, 612, 0);
		text("Ciência da Computação", 40, 240); 
	}

	public void stop() {
		exit();
	}
}
