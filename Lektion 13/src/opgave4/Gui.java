package opgave4;

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
		Button btnIncrease = new Button("+");
		pane.add(btnIncrease, 3, 0);
		GridPane.setMargin(btnIncrease, new Insets(10, 10, 0, 0));
		btnIncrease.setOnAction(event -> addition());

		Button btnDecrease = new Button("-");
		pane.add(btnDecrease,3,2);
		GridPane.setMargin(btnDecrease, new Insets(10,10,0,0));
		btnDecrease.setOnAction(event -> subtraction());

//		// add a button to the pane (at col=2, row=1)
//		Button btnLowerCase = new Button("Lower Case");
//		pane.add(btnLowerCase, 2, 1);
//		GridPane.setMargin(btnLowerCase, new Insets(10, 10, 0, 10));

//		//---------------------------------------------------------------------------------------
	}
	private void addition(){
		String text = txfNumber.getText().trim();
		int number = Integer.parseInt(text);
		number++;
		txfNumber.setText(number + "");

	}
	private void subtraction(){
		String text = txfNumber.getText().trim();
		int number = Integer.parseInt(text);
		number--;
		txfNumber.setText(number + "");
	}

}
