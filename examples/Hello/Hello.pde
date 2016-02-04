import template.library.*;

HelloLibrary hello;

void setup() {
  size(400,400);
  smooth();
  
  hello = new HelloLibrary(this);
  
  PFont font = createFont("",28);
  textFont(font);
}

void draw() {
  background(0);
  fill(255);
  text(hello.loadFromTxt("/data/english.txt"), 20, 20);
}