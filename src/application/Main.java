package application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

	private int contador = 0;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Label labelTitulo = new Label("Contador");
		labelTitulo.getStyleClass().add("titulo");
		
		Label labelNumero = new Label("0");
		labelNumero.getStyleClass().add("numero");
		
		Button btIncremento = new Button("+");
		btIncremento.getStyleClass().add("botoes");
		
		Button btDecremento = new Button("-");
		btDecremento.getStyleClass().add("botoes");
		
		btIncremento.setOnAction(b -> {
			contador++;
			util.CorCondicional.alteracaoCorLb (contador,labelNumero);
			util.CorCondicional.alteracaoCorButton(contador, 
					btIncremento, btDecremento);
			});
		btDecremento.setOnAction(b -> {
			contador--;
			util.CorCondicional.alteracaoCorLb (contador,labelNumero);
			
			util.CorCondicional.alteracaoCorButton(contador, 
					btIncremento, btDecremento);
			});
		
		HBox boxButton = new HBox();
		boxButton.getChildren().add(btIncremento);
		boxButton.getChildren().add(btDecremento);
		boxButton.setAlignment(Pos.CENTER);
		boxButton.setSpacing(10);
		
		VBox boxConteudo = new VBox();
		
		boxConteudo.getStyleClass().add("conteudo");
		
		boxConteudo.getChildren().add(labelTitulo);
		boxConteudo.getChildren().add(labelNumero);
		boxConteudo.getChildren().add(boxButton);
		boxConteudo.setAlignment(Pos.CENTER);
		boxConteudo.setSpacing(5);
		
		String CSS = getClass()
				.getResource("/css/Contador.css").toExternalForm();
		
		Scene cena = new Scene(boxConteudo, 400, 400);
		cena.getStylesheets().add(CSS);
		cena.getStylesheets().add("https://fonts.googleapis.com/css2?family=Oswald&display=swap");
		
		primaryStage.setScene(cena);
		primaryStage.setTitle("Contador");
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
