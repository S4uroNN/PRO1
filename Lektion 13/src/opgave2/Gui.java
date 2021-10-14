package opgave2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Gui extends Application {

	@Override
	public void start(Stage stage) {
		stage.setTitle("Skift navne");
		GridPane pane = new GridPane();
		this.initContent(pane);

		Scene scene = new Scene(pane);
		stage.setScene(scene);
		stage.show();
	}

	// -------------------------------------------------------------------------

	private TextField txfFirstName = new TextField();
	private TextField txfLastName = new TextField();
	private TextField txfCombine = new TextField();
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
//		Label lblName = new Label("Name:");
//		pane.add(lblName, 0, 0);

//		// add a text field to the pane (at col=1, row=0, extending 2 columns and 1 row)
//		TextField txfName = new TextField();
//		pane.add(txfName, 1, 0,2,1);


		pane.add(txfFirstName, 1, 0, 1, 1);

		pane.add(txfLastName, 2, 0, 1, 1);

//		pane.add(txfCombine, 1, 1, 2, 1);


		// add a button to the pane (at col=1, row=1)
		Button btnSwap = new Button("Swap");
		pane.add(btnSwap, 1, 2);
		GridPane.setMargin(btnSwap, new Insets(10, 10, 0, 0));
		btnSwap.setOnAction(event -> this.swap());

//		// add a button to the pane (at col=2, row=1)
//		Button btnLowerCase = new Button("Lower Case");
//		pane.add(btnLowerCase, 2, 1);
//		GridPane.setMargin(btnLowerCase, new Insets(10, 10, 0, 10));

//		//---------------------------------------------------------------------------------------
	}

	private void swap() {
		String name = txfFirstName.getText().trim();
		String lastname = txfLastName.getText().trim();
		txfFirstName.setText(lastname);
		txfLastName.setText(name);
	}
}
