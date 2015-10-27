/*
Ideas for challenge:
use a variety of shapes to form a picture {think big picture}
draw a sword, trapeziods, rectangles, and triagnles
make a pedistal that it is planted in {think Ocarina of Time}
*/
package renard_7_d221;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;
        
public class Renard_7_D221 extends Application {
        
    public static void main(String[]args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Drawing Operations Test");
        Group root = new Group();
        Canvas canvas = new Canvas(500, 500);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        drawBack(gc, 0,0, 1000,1000); //background
       /*
       */
        for(int i =0; i<500;i++){
        for(int o = 500; o>1; o--){  
        drawFlash(gc, i,i,i,i); //Flashing Decoration
        drawFlash(gc,500-o,o,i,i); //Flashing Decoration
        }
        }
        
        int shift = 4;
        
        drawBaseD(gc, 111+shift,301,301,301); //circle decoration to the ground/base
        drawBlade(gc, 248+shift,150,25,250); //blade
        drawBase(gc, 210+shift,350,100,20); //top base
        drawBase(gc, 200+shift,370,120,20); //second base
        drawBase(gc, 190+shift,390,140,20); //third base
        drawBase(gc, 180+shift,410,160,20); //final base
        drawBase(gc, 0+shift,430,700,200); //ground       
        drawHandle(gc, 250+shift,80,20,70); //horizantal handle
        drawHilt(gc, 225+shift,135,70,20); //vertical handle
        drawHiltD(gc, 245+shift,70,30,30); //decoration on the hilt        
        drawHiltD(gc, 213+shift,130,30,30); //left decoration of the handle
        drawHiltD(gc, 283+shift,130,30,30); //right decoration of the handle
        drawHiltG(gc, 248+shift,70,25,25); //decoration on the hilt
        drawHiltG(gc, 213+shift,130,25,25); //left decoration of the handle
        drawHiltG(gc, 288+shift,130,25,25); //right decoration of the handle
       
        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }    
    
    private void drawBaseD(GraphicsContext BaseD, int x, int y, int w, int h) {
        BaseD.setFill(Color.GOLD);
        BaseD.fillOval(x, y, w, h);
    }
    //The Background color to the cavas
    private void drawBack(GraphicsContext Back, int x, int y, int w, int h) {
        Back.setFill(Color.BLACK);
        Back.fillRect(x, y, w, h);
    }
    //the blade to the sword
    private void drawBlade(GraphicsContext Blade, int x, int y, int w, int h) {
        Blade.setFill(Color.SILVER);
        Blade.fillRect(x, y, w, h);
    }
    //The semicircles of the sword
    private void drawHiltD(GraphicsContext HiltD, int x, int y, int w, int h) {
        HiltD.setFill(Color.DARKBLUE);
        HiltD.fillOval(x, y, w, h);
    }
    private void drawHiltG(GraphicsContext HiltG, int x, int y, int w, int h) {
        HiltG.setFill(Color.GOLDENROD);
        HiltG.fillOval(x, y, w, h);
    }
    //the base inwhich the sword is sheathed
    private void drawBase(GraphicsContext BaseB, int x, int y, int w, int h) {
        BaseB.setFill(Color.DARKGRAY);
        BaseB.fillRect(x, y, w, h);
    }
    //the vertical handle
    private void drawHandle(GraphicsContext Handle, int x, int y, int w, int h) {    
        Handle.setFill(Color.DARKBLUE);
        Handle.fillRect(x, y, w, h);
    }
    //the horizontal hilt
    private void drawHilt(GraphicsContext Hilt, int x, int y, int w, int h) {
        Hilt.setFill(Color.DARKBLUE);
        Hilt.fillRect(x, y, w, h);
    }
    private void drawFlash(GraphicsContext Flash, int x, int y, int w, int h) {
        //IDE- Integrated development system
        //gc-graphics context
        //for(int i = 0; i<500; i++) {
        //for(int o = 500; o>500; o--){    
                Flash.setFill(Color.GOLD);
                Flash.fillOval(x, y, w, h);
            //}}
        }
    private void drawShape(GraphicsContext Shape, double x, double y, double w, double h) {
        for(int a = 0; a<256; a++){
        int red = a;
        int green = a;
        int blue = a;
        Shape.setFill(Color.rgb(red, green, blue));
        Shape.fillOval(x, y, w, h);
    }} 
}