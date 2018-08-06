
public abstract class Mod3checkPt {
	// 8. Add a main method and create an Animation2D object.
	public static void main(String[] args) {
		Animation2D AA = new Animation2D();
		// 9. Call the draw method and getFramerate method. Print the result.
		AA.draw();
		System.out.println(AA.getFramerate());

	}

}

// 5. Create a class called Animation2D. Make this class a subclass of Animation and make it implement Drawable.

class Animation2D extends Animation implements Drawable {
	// 6. Override the draw method to simply print "drawing" √
	@Override
	public void draw() {
		System.out.println("drawing");
	}
	// 7. Override the getFramerate method to return 24. √

	@Override
	int getFramerate() {
		return 24;
	}

}
//3. Create an abstract class called Animation.
abstract class Animation {
	// 4. Add a method called getFramerate that takes no parameters but returns an int.
	int getFramerate() {
		return 0;
	}
}
//1. Create an inteface called Drawable

interface Drawable {
	// 2. Add an abstract void method called draw that takes no parameters.
	public abstract void draw();

}

//EXTRA: 10. Create a new interface called Renderable.

interface Renderable{
	//11. Add an abstract void method with no parameters called render.

	public abstract void render();
}



//12. Create a new subclass of Animation called Animation3D that implements Renderable.

abstract class Animation3D extends Animation implements Renderable{

	//13. Override the render method to do something cool of your choice.
@Override
public void render() {
	System.out.println("YAY!!!!!");
}
}