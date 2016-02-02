package bobslickgame;
import java.util.Random;

import org.newdawn.slick.state.*;

import java.io.IOException;

import java.util.ArrayList;

import java.util.Iterator;

import java.util.logging.Level;

import java.util.logging.Logger;

import org.newdawn.slick.Animation;
import org.newdawn.slick.Color;

import org.newdawn.slick.AppGameContainer;

import org.newdawn.slick.BasicGame;

import org.newdawn.slick.Font;

import org.newdawn.slick.GameContainer;

import org.newdawn.slick.Graphics;

import org.newdawn.slick.Image;

import org.newdawn.slick.Input;

import org.newdawn.slick.SlickException;

import org.newdawn.slick.SpriteSheet;

import org.newdawn.slick.TrueTypeFont;

import org.newdawn.slick.geom.Rectangle;

import org.newdawn.slick.geom.Shape;

import org.newdawn.slick.state.BasicGameState;

import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.state.transition.FadeInTransition;
import org.newdawn.slick.state.transition.FadeOutTransition;

import org.newdawn.slick.tiled.TiledMap;
import org.w3c.dom.css.Rect;
import java.math.*;
import java.util.*;

public class Skelebash extends BasicGameState {
Random randy = new Random();
    int number;
	public Item healthpotion, healthpotion1;
	public Item1 speedpotion, speedpotion1;
	public Itemwin antidote;
        public Orb bob;        
        public Enemy flava, flav;
        
	public ArrayList<Item> stuff = new ArrayList();
        
	public ArrayList<Item1> stuff1 = new ArrayList();
	
	public ArrayList<Itemwin> stuffwin = new ArrayList();        
        
        public ArrayList<Enemy> bonez = new ArrayList();

	private boolean[][] hostiles;

	private static TiledMap grassMap;

	private static AppGameContainer app;

	private static Camera camera;
	
	public static int counter = 0;

	// Player stuff

	private Animation sprite, up, down, left, right, wait;

	/**
	 * 
	 * The collision map indicating which tiles block movement - generated based
	 * 
	 * on tile properties
	 */

	// changed to match size of sprites & map

	private static final int SIZE = 16;

	// screen width and height won't change

	private static final int SCREEN_WIDTH = 1000;

	private static final int SCREEN_HEIGHT = 750;

	public Skelebash(int xSize, int ySize) {

	}
        private void moveenemies() throws SlickException {

        for (Enemy e : bonez) {

              e.setdirection();

            e.move();

        }


    }

	public void init(GameContainer gc, StateBasedGame sbg)

	throws SlickException {
		
		 gc.setTargetFrameRate(60);

		gc.setShowFPS(false);

		// *******************

		// Scenerey Stuff

		// ****************

                grassMap = new TiledMap("res/full.tmx");

		// Ongoing checks are useful

		camera = new Camera(gc, grassMap);

		// *********************************************************************************

		// Player stuff --- these things should probably be chunked into methods
		// and classes

		// *********************************************************************************   
                
                Player wat = new Player();
                
//		SpriteSheet runningSS = new SpriteSheet(
//				"res/ogrespritesheet.png",64, 64, 0);



//		up = new Animation();
//
//		up.setAutoUpdate(true);
//
//		up.addFrame(runningSS.getSprite(0, 8), 330);
//
//		up.addFrame(runningSS.getSprite(1, 8), 330);
//
//		up.addFrame(runningSS.getSprite(2, 8), 330);
//
//		up.addFrame(runningSS.getSprite(3, 8), 330);
//
//		up.addFrame(runningSS.getSprite(4, 8), 330);
//
//		up.addFrame(runningSS.getSprite(5, 8), 330);
//
//		up.addFrame(runningSS.getSprite(6, 8), 330);
//
//		up.addFrame(runningSS.getSprite(7, 8), 330);
//
//		up.addFrame(runningSS.getSprite(8, 8), 330);
//
//		down = new Animation();
//
//		down.setAutoUpdate(false);
//
//		down.addFrame(runningSS.getSprite(0, 10), 330);
//
//		down.addFrame(runningSS.getSprite(1, 10), 330);
//
//		down.addFrame(runningSS.getSprite(2, 10), 330);
//
//		down.addFrame(runningSS.getSprite(3, 10), 330);
//
//		down.addFrame(runningSS.getSprite(4, 10), 330);
//
//		down.addFrame(runningSS.getSprite(5, 10), 330);
//
//		down.addFrame(runningSS.getSprite(6, 10), 330);
//
//		down.addFrame(runningSS.getSprite(7, 10), 330);
//
//		down.addFrame(runningSS.getSprite(8, 10), 330);
//
//		left = new Animation();
//
//		left.setAutoUpdate(false);
//
//		left.addFrame(runningSS.getSprite(0, 9), 330);
//
//		left.addFrame(runningSS.getSprite(1, 9), 330);
//
//		left.addFrame(runningSS.getSprite(2, 9), 330);
//
//		left.addFrame(runningSS.getSprite(3, 9), 330);
//
//		left.addFrame(runningSS.getSprite(4, 9), 330);
//
//		left.addFrame(runningSS.getSprite(5, 9), 330);
//
//		left.addFrame(runningSS.getSprite(6, 9), 330);
//
//		left.addFrame(runningSS.getSprite(7, 9), 330);
//
//		left.addFrame(runningSS.getSprite(8, 9), 330);
//
//		right = new Animation();
//
//		right.setAutoUpdate(false);
//
//		right.addFrame(runningSS.getSprite(0, 11), 330);
//
//		right.addFrame(runningSS.getSprite(1, 11), 330);
//
//		right.addFrame(runningSS.getSprite(2, 11), 330);
//
//		right.addFrame(runningSS.getSprite(3, 11), 330);
//
//		right.addFrame(runningSS.getSprite(4, 11), 330);
//
//		right.addFrame(runningSS.getSprite(5, 11), 330);
//
//		right.addFrame(runningSS.getSprite(6, 11), 330);
//
//		right.addFrame(runningSS.getSprite(7, 11), 330);
//
//		right.addFrame(runningSS.getSprite(8, 11), 330);
//
//		wait = new Animation();
//
//		wait.setAutoUpdate(true);
//
//		wait.addFrame(runningSS.getSprite(0, 14), 733);
//
//		wait.addFrame(runningSS.getSprite(1, 14), 733);
//
//		wait.addFrame(runningSS.getSprite(2, 14), 733);
//
//		wait.addFrame(runningSS.getSprite(3, 14), 733);
//
//		sprite = wait;

		// *****************************************************************

		// Obstacles etc.

		// build a collision map based on tile properties in the TileD map

		Blocked.blocked = new boolean[grassMap.getWidth()][grassMap.getHeight()];

		// There can be more than 1 layer. You'll check whatever layer has the
		// obstacles.
		// You could also use this for planning traps, etc.


		System.out.println("The grassmap is " + grassMap.getWidth() + " by "
				+ grassMap.getHeight());

		for (int xAxis = 0; xAxis < grassMap.getWidth(); xAxis++) {

			for (int yAxis = 0; yAxis < grassMap.getHeight(); yAxis++) {

				// Why was this changed?

				// It's a Different Layer.

				// You should read the TMX file. It's xml, i.e.,human-readable
				// for a reason

				int tileID = grassMap.getTileId(xAxis, yAxis, 1);

				String value = grassMap.getTileProperty(tileID,

				"blocked", "false");

				if ("true".equals(value)) {

//					System.out.println("The tile at x " + xAxis + " and y axis "
//							+ yAxis + " is blocked.");

					Blocked.blocked[xAxis][yAxis] = true;

				}

			}

		}
                

		System.out.println("Array length" + Blocked.blocked[0].length);

		// A remarkably similar process for finding hostiles

		hostiles = new boolean[grassMap.getWidth()][grassMap.getHeight()];


                for (int xAxis = 0; xAxis < grassMap.getWidth(); xAxis++) {
			for (int yAxis = 0; yAxis < grassMap.getHeight(); yAxis++) {
				int xBlock = (int) xAxis;
				int yBlock = (int) yAxis;
				if (!Blocked.blocked[xBlock][yBlock]) {
					if (yBlock % 7 == 0 && xBlock % 15 == 0 ) {
						Enemy e = new Enemy(xAxis * SIZE, yAxis * SIZE);
						bonez.add(e);
						hostiles[xAxis][yAxis] = true;
					}
				}
			}
		}

//                bob = new Orb((int) Player.x + 10,(int) Player.y - 10);

	}

	public void render(GameContainer gc, StateBasedGame sbg, Graphics g)

	throws SlickException {

		camera.centerOn((int) Player.x, (int) Player.y);

		camera.drawMap();

		camera.translateGraphics();

		// it helps to add status reports to see what's going on

		// but it gets old quickly

		sprite.draw((int) Player.x, (int) Player.y);
		
		g.drawString("Health: " + Player.health/1000, camera.cameraX + 10,
				camera.cameraY + 10);
		
		g.drawString("speed: " + (int)(Player.speed *10), camera.cameraX + 10,
				camera.cameraY + 25);

		g.drawString("time passed: " +counter/1000, camera.cameraX +600,camera.cameraY );

		for (Item i : stuff) {
			if (i.isvisible) {
				i.currentImage.draw(i.x, i.y);
			}
		}
		
                
		for (Item1 h : stuff1) {
			if (h.isvisible) {
				h.currentImage.draw(h.x, h.y);
			}
		}

                for (Enemy e : bonez) {
			if (e.isalive) {
				e.currentanime.draw(e.Bx, e.By);
				moveenemies();
			}
		} 
		
		for (Itemwin w: stuffwin) {
			if (w.isvisible) {
				w.currentImage.draw(w.x, w.y);
			}
		}
//                if(bob.isIsvisible()){
//                    bob.orbpic.draw(bob.getX(),bob.getY());
//                }

	}

	public void update(GameContainer gc, StateBasedGame sbg, int delta)

	throws SlickException {
		
		counter += delta;

		Input input = gc.getInput();

		float fdelta = delta * Player.speed;

		Player.setpdelta(fdelta);

		double rightlimit = (grassMap.getWidth() * SIZE) - (SIZE * 0.75);

		float projectedright = Player.x + fdelta + SIZE;

		boolean cangoright = projectedright < rightlimit;

		// there are two types of fixes. A kludge and a hack. This is a kludge.

		if (input.isKeyDown(Input.KEY_UP)) {

			sprite = up;

			float fdsc = (float) (fdelta - (SIZE * .15));

			if (!(isBlocked(Player.x, Player.y - fdelta) || isBlocked((float) (Player.x + SIZE + 1.5), Player.y - fdelta))) {

				sprite.update(delta);

				// The lower the delta the slower the sprite will animate.

				Player.y -= fdelta;

			}

		} else if (input.isKeyDown(Input.KEY_DOWN)) {

			sprite = down;

			if (!isBlocked(Player.x, Player.y + SIZE + fdelta)

			|| !isBlocked(Player.x + SIZE - 1, Player.y + SIZE + fdelta)) {

				sprite.update(delta);

				Player.y += fdelta;

			}

		} else if (input.isKeyDown(Input.KEY_LEFT)) {

			sprite = left;

			if (!(isBlocked(Player.x - fdelta, Player.y) || isBlocked(Player.x

			- fdelta, Player.y + SIZE - 1))) {

				sprite.update(delta);

				Player.x -= fdelta;

			}

		} else if (input.isKeyDown(Input.KEY_RIGHT)) {
			sprite = right;
			if (cangoright
					&& (!(isBlocked(Player.x + SIZE + fdelta,
					Player.y) || isBlocked(Player.x + SIZE + fdelta, Player.y
							+ SIZE - 1)))) {
				sprite.update(delta);
				Player.x += fdelta;
                        }
                    } else if(input.isKeyDown(Input.KEY_SPACE)){
//                    bob.setIsvisible(true);
                    
                }
                
		Player.rect.setLocation(Player.getplayershitboxX(),
				Player.getplayershitboxY());

		for (Item i : stuff) {

			if (Player.rect.intersects(i.hitbox)) {
				if (i.isvisible) {
                                     number = 1+randy.nextInt(3);
                                    if(number == 1){
                                        System.out.println("you win");
                                        i.isvisible = false;
					makevisible();
					sbg.enterState(3, new FadeOutTransition(Color.black), new FadeInTransition(Color.black));
                                    }else{
                                        System.out.println("you lose");
                                        Player.health  = 100000;
                Player.speed = .4f;
                Skelebash.counter = 0;
                Itemwin.isvisible = true;
                Player.x = 500;
                Player.y = 900;
                                    sbg.enterState(1, new FadeOutTransition(Color.black), new FadeInTransition(Color.black));
                                    }
				}

			}
		}

                for (Enemy e : bonez) {

			if (Player.rect.intersects(e.rect)) {
				if (e.isalive) {

					Player.health -= 1000;
					e.isalive = false;
				}

			}
		}
                if(Player.health <= 0){
			makevisible();
			sbg.enterState(2, new FadeOutTransition(Color.black), new FadeInTransition(Color.black));
		}
                
                
		for (Item1 h : stuff1) {

			if (Player.rect.intersects(h.hitbox)) {
				if (h.isvisible) {
                                     number = 1+randy.nextInt(3);
                                    if(number == 1){
                                        System.out.println("you win");
                                        h.isvisible = false;
					makevisible();
					sbg.enterState(3, new FadeOutTransition(Color.black), new FadeInTransition(Color.black));
                                    }else{
                                        System.out.println("you lose");
                                        Player.health  = 100000;
                Player.speed = .4f;
                Skelebash.counter = 0;
                Itemwin.isvisible = true;
                Player.x = 500;
                Player.y = 900;
                                        sbg.enterState(1, new FadeOutTransition(Color.black), new FadeInTransition(Color.black));
                                    }

			}
		}
		
		for (Itemwin w : stuffwin) {

			if (Player.rect.intersects(w.hitbox)) {
				if (w.isvisible) {
                                     number = 1+randy.nextInt(3);
                                    if(number == 2){
                                        System.out.println("you win");
                                        w.isvisible = false;
					makevisible();
					sbg.enterState(3, new FadeOutTransition(Color.black), new FadeInTransition(Color.black));
                                    }else{
                                        System.out.println("you lose");
                                        Player.health  = 100000;
                Player.speed = .4f;
                Skelebash.counter = 0;
                Itemwin.isvisible = true;
                Player.x = 500;
                Player.y = 900;
                                        sbg.enterState(1, new FadeOutTransition(Color.black), new FadeInTransition(Color.black));
                                    }

			}
		}
		 
		Player.health -= counter/1000;
		if(Player.health <= 0){
			makevisible();
			sbg.enterState(2, new FadeOutTransition(Color.black), new FadeInTransition(Color.black));
		}
                        
                }}
	}

	public int getID() {

		return 1;

	}

	public void makevisible(){
		for (Item i : stuff) {
			
			i.isvisible = true;}
           
                for (Item1 h : stuff1) {
			
		h.isvisible = true;}
		
                for (Itemwin a : stuffwin) {
			
			a.isvisible = true;}
		}
                
	private boolean isBlocked(float tx, float ty) {

		int xBlock = (int) tx / SIZE;

		int yBlock = (int) ty / SIZE;

		return Blocked.blocked[xBlock][yBlock];

		// this could make a better kludge

	}

}
