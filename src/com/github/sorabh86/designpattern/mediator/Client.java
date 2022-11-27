package com.github.sorabh86.designpattern.mediator;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Client extends Application {

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage stage) throws Exception {
		UIMediator mediator = new UIMediator();
		MSlider slider = new MSlider(mediator);
		MTextBox text = new MTextBox(mediator);
		MLabel label = new MLabel(mediator);
		
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setVgap(20);
		grid.setPadding(new Insets(25, 25, 25, 25));
		grid.add(label, 0, 0);
		grid.add(text, 0, 1);
		grid.add(slider, 0, 2);
		Scene scene = new Scene(grid, 500, 500);
		
//		Parent root = FXMLLoader.load(getClass().getResource("LoadingPage.fxml"));
//		Scene scene = new Scene(root, 500, 500);;
		
		stage.setTitle("Mediator Design Pattern");
		stage.setScene(scene);
		stage.show();
	}
	
}
