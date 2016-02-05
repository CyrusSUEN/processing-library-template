package Hello;

import processing.core.*;
import template.library.*;

public class Hello extends PApplet {

	HelloLibrary hello;

	public void settings() {
		size(400, 400);
	}

	public void setup() {

		smooth();

		hello = new HelloLibrary(this);

		PFont font = createFont("", 28);
		textFont(font);
	}

	public void draw() {
		background(0);
		fill(255);
		text(hello.loadFromTxt(), 20, 20);
	}

	public static void main(String[] args) {
		PApplet.main(Hello.class.getName());
	}
}