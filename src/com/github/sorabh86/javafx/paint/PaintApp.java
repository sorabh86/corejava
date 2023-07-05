package com.github.sorabh86.javafx.paint;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class PaintApp extends Application {
	private double startX, startY;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) {
		// Create the canvas
		Canvas canvas = new Canvas(600, 600);
		GraphicsContext gc = canvas.getGraphicsContext2D();

		// Set up the event handlers
		canvas.addEventHandler(MouseEvent.MOUSE_PRESSED, event -> {
			startX = event.getX();
			startY = event.getY();
		});
		canvas.addEventHandler(MouseEvent.MOUSE_DRAGGED, event -> {
			double endX = event.getX();
			double endY = event.getY();
			gc.setStroke(Color.BLACK);
			gc.setLineWidth(2);
			gc.strokeLine(startX, startY, endX, endY);
			startX = endX;
			startY = endY;
		});

		// Set up the scene and show the stage
		StackPane root = new StackPane(canvas);
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
}
