package opgave5;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Gui extends Application {

	@Override
	public void start(Stage stage) {
		stage.setTitle("Tæl op");
		GridPane pane = new GridPane();
		this.initContent(pane);

		Scene scene = new Scene(pane);
		stage.setScene(scene);
		stage.show();
	}

	// -------------------------------------------------------------------------
	private TextField txfNumber = new TextField();
	private void initContent(GridPane pane) {
		// show or hide grid lines
		pane.setGridLinesVisible(false);

		// set padding of the pane
		pane.setPadding(new Insets(10));
		// set horizontal gap between components 
		pane.setHgap(10);
		// set vertical gap between components 
		pane.setVgap(10);

		// add a label to the pane (at col=0, row=0)
		Label lblName = new Label("Number:");
		pane.add(lblName, 0, 1);

//		// add a text field to the pane (at col=1, row=0, extending 2 columns and 1 row)

		pane.add(txfNumber, 1, 1,1,1);



// 		add a button to the pane (at col=1, row=1)
		Button btnFahrenheit = new Button("F");
		pane.add(btnFahrenheit, 3, 0);
		GridPane.setMargin(btnFahrenheit, new Insets(10, 10, 0, 0));
		btnFahrenheit.setOnAction(event -> Fahrenheit());

		Button btnCelcius = new Button("C");
		pane.add(btnCelcius,3,2);
		GridPane.setMargin(btnCelcius, new Insets(10,10,0,0));
		btnCelcius.setOnAction(event -> Celcius());

//		// add a button to the pane (at col=2, row=1)
//		Button btnLowerCase = new Button("Lower Case");
//		pane.add(btnLowerCase, 2, 1);
//		GridPane.setMargin(btnLowerCase, new Insets(10, 10, 0, 10));

//		//---------------------------------------------------------------------------------------
	}
	private void Fahrenheit(){
		String text = txfNumber.getText().trim();
		double number = Double.parseDouble(text);
		number = (9/5.0*number) + 32;
		txfNumber.setText(number + "");
	}
	private void Celcius(){
		String text = txfNumber.getText().trim();
		double number = Double.parseDouble(text);
		number = (number - 32) * 5.0/9;
		txfNumber.setText(number + "");
	}

}
