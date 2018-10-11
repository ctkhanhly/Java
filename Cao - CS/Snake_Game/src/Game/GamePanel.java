package Game;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.awt.image.BufferedImage;
import java.awt.image.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

import java.awt.event.KeyListener;

public class GamePanel extends JPanel implements Runnable, KeyListener {
	
	public static final int WIDTH = 400;
	public static final int HEIGHT = 400;
	
	//Game Loop
	private Thread thread;
	private boolean running;//running or not 
	private long targetTime;
	
	//Render
	private Graphics2D g2d;
	private BufferedImage image;
	
	//Game Stuff
	private Entity head, apple;
	private ArrayList<Entity> snake;
	private final int SIZE = 10;// whenever final-> all caps
	private int score, level;
	private boolean gameover;
	
	//Movement
	private int dx, dy;
	
//	public void setPosition(int x, int y){
//		this.x = x;
//		this.y = y;
//	}
//	public void move (int dx, int dy){
//		x = dx;
//		y = dy;
//	}
	
	//Key Input
	private boolean up, down, left, right, start;
	
	
	private void requestRender(){
		render(g2d);
		Graphics g = getGraphics();
		g.drawImage(image,0,0,null);
		g.dispose();
	}
	
	private void render(Graphics2D g2d){
		g2d.clearRect(0, 0, WIDTH, HEIGHT);
		
		g2d.setColor(Color.PINK);
		g2d.fillRect(0, 0, WIDTH, HEIGHT);
		
		g2d.setColor(Color.CYAN);
		for(Entity e : snake)
			e.render(g2d);
		
		g2d.setColor(Color.RED);
		apple.render(g2d);
		
		g2d.setColor(Color.BLUE);
		g2d.drawString("Score : " + score + level,10,10);
		
		if(dx == 0 && dy ==0){
			g2d.drawString("Ready", 150, 200);
		}
	}
	
	
	public GamePanel(){
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		setFocusable(true);
		requestFocus();
		addKeyListener(this);
	}
	
	private void setFPS(int fps){
		targetTime = 1000/fps;
	}
	
	public void addNotify(){
		super.addNotify();//Runnable
		thread = new Thread(this);
		thread.start();
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		int k = e.getKeyCode();
		
		if(k == KeyEvent.VK_UP) up = true;
		if(k == KeyEvent.VK_DOWN) down = true;
		if(k == KeyEvent.VK_LEFT) left = true;
		if(k == KeyEvent.VK_RIGHT) right = true;
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		int k = e.getKeyCode();
		
		if(k == KeyEvent.VK_UP) up = false;
		if(k == KeyEvent.VK_DOWN) down = false;
		if(k == KeyEvent.VK_LEFT) left = false;
		if(k == KeyEvent.VK_RIGHT) right = false;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		if(running) return;
		init();//run : initialize
		long startTime;
		long elapsed;
		long wait;
		
		while(running){
			startTime = System.nanoTime();
			
			update();
			requestRender();
			
			elapsed = System.nanoTime() - startTime;
			wait = targetTime - elapsed / 100000;//not gonna go any faster than this
			
			if(wait > 0){
				try{
					thread.sleep(wait);
				}
				catch(Exception e){
					e.printStackTrace();
				}
			}
		}
	}
	
	private void init(){
		image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_ARGB);
		g2d = image.createGraphics();
		running = true;
		setUpLevel();
	}
	
	private void update(){
		
		if(gameover){
			if(start){
				setUpLevel();
			}
		}
		if(up && dy == 0){
			dy = -SIZE;
			dx = 0;
		}
		if(down && dy == 0){
			dy = SIZE;
			dx = 0;
		}
		if(left && dy == 0){
			dy = 0;
			dx = -SIZE;
		}
		if(right && dy == 0){
			dy = 0;
			dx = SIZE;
		}
		
		if(dx!=0 || dy!=0){
			for(int i = snake.size() - 1; i > 0; i--){
				snake.get(i).setPosition(snake.get(i-1).getX(), snake.get(i-1).getY());
			}
		head.move(dx, dy);
	}
		
		if(head.getX() < 0) head.setX(WIDTH);
		if(head.getX() > WIDTH) head.setX(0);
		if(head.getY() < 0) head.setY(HEIGHT);
		if(head.getY() > HEIGHT) head.setY(0);
		
		for(Entity e: snake){
			if(e.isCollision(head)){
				gameover = true;
				break;
			}
		}
		if(apple.isCollision(head)){
			score ++;
			setApple();
			
//			int s = snake.size();
//			for(int i = 0; i < snake.size(); i++){
				Entity e = new Entity(SIZE);
				e.setPosition(-100, -100);
				snake.add(e);
				
				if(score%10 ==0){
					level ++;
					if(level>10) level = 10;
					setFPS(level * 10);
				}
			}
		//}
		
	}
	
	private void render(){
		g2d.clearRect(0, 0, WIDTH, HEIGHT);
		//g2d.fillArc(x, y, size, size, 210, 160);
	}
	private void setUpLevel(){
		snake = new ArrayList<Entity>();
		head = new Entity(SIZE);
		head.setPosition(WIDTH/2, HEIGHT/2);
		snake.add(head);
		
		for(int i = 1; i < 3; i++){
			Entity e = new Entity(SIZE);
			e.setPosition(head.getX() + (i * SIZE), head.getY());
			snake.add(e);
		}
		
		apple = new Entity(SIZE);
		setApple();
		score = 0;
		
		gameover = false;
		level = 1 ;
		//start = true;
		dx = dy = 0;
		setFPS(level*10);
	}
	
	public void setApple(){
		int x = (int)(Math.random()*(WIDTH - SIZE));
		int y = (int)(Math.random()*(HEIGHT - SIZE));
		
		
		x = x - (x % SIZE);
		y = y - (y % SIZE);
		
		apple.setPosition(x, y);
	}
	
}
