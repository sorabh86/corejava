package com.github.sorabh86.javafx.transform;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class RectangleExample extends Application {

    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;

    private static final int RECT_WIDTH = 100;
    private static final int RECT_HEIGHT = 100;

    private double startX;
    private double startY;

    private double translateX;
    private double translateY;
    
    private Group root;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
    	
        // Create a group to hold the rectangle
        root = new Group();
        
        // Create a scene and add the group to it
        Scene scene = new Scene(root, WIDTH, HEIGHT);

        // Set the scene and show the stage
        stage.setScene(scene);
        stage.show();
        
        addChildrens();
    }
    
    private void addChildrens() {
    	// Create a rectangle
        Rectangle rect = new Rectangle(RECT_WIDTH, RECT_HEIGHT, Color.GREEN);
        root.getChildren().add(rect);
        
    	// Add mouse events to the rectangle
        rect.addEventHandler(MouseEvent.MOUSE_PRESSED, event -> {
            // Save the starting coordinates when the mouse is pressed
            startX = event.getSceneX()-rect.getTranslateX();
            startY = event.getSceneY()-rect.getTranslateY();
            System.out.println("Start: "+startX+" "+startY+" rect=["+rect.getX()+","+rect.getY()+"]");
        });
        rect.addEventHandler(MouseEvent.MOUSE_DRAGGED, event -> {
        	
            // Calculate the translation based on the difference between the starting coordinates and the current coordinates
            translateX = event.getSceneX() - startX;
            translateY = event.getSceneY() - startY;
            
            System.out.println("Move: "+translateX+" "+translateY);

            // Set the translation of the rectangle
            rect.setTranslateX(translateX);
            rect.setTranslateY(translateY);
        });
        rect.addEventHandler(MouseEvent.MOUSE_RELEASED, event -> {
            // Reset the starting coordinates
            startX = 0;
            startY = 0;
        });
    }
    
}

