package gui;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.Event;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import model.Yatzy;


public class YatzyGui extends Application {


    @Override
    public void start(Stage stage) {
        stage.setTitle("Yatzy");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    // -------------------------------------------------------------------------

    // Shows the face values of the 5 dice.
    private TextField[] txfValues = new TextField[5];
    // Shows the hold status of the 5 dice.
    private CheckBox[] chbHolds = new CheckBox[5];
    // Shows the results previously selected .
    // For free results (results not set yet), the results
    // corresponding to the actual face values of the 5 dice are shown.
    private TextField[] txfresults = new TextField[15];
    // Shows points in sums, bonus and total.
    private TextField txfSumSame, txfBonus, txfSumOther, txfTotal;
    // Shows the number of times the dice has been rolled.
    private Label lblRolled = new Label();

    private Button btnRoll = new Button();

    private boolean[] isUsed = new boolean[15];

    private int scoreForTop6;
    private int scoreforRest;
    private int bonus = 0;

    private void initContent(GridPane pane) {
        pane.setGridLinesVisible(false);
        pane.setPadding(new Insets(10));
        pane.setHgap(10);
        pane.setVgap(10);

        // ---------------------------------------------------------------------

        GridPane dicePane = new GridPane();
        pane.add(dicePane, 0, 0);
        dicePane.setGridLinesVisible(false);
        dicePane.setPadding(new Insets(10));
        dicePane.setHgap(10);
        dicePane.setVgap(10);
        dicePane.setStyle("-fx-border-color: black");

        // initialize txfValues, chbHolds, btnRoll and lblRolled
        for (int i = 0; i < this.txfValues.length; i++) {
            TextField txfValue = new TextField();
            txfValue.setEditable(false);
            txfValue.setPrefSize(75, 75);
            txfValue.setFont(Font.font(35));
            txfValue.setAlignment(Pos.CENTER);

            dicePane.add(txfValue, i, 0);
            this.txfValues[i] = txfValue;
            CheckBox checkBox = new CheckBox("Hold");
            dicePane.add(checkBox, i, 2);
            this.chbHolds[i] = checkBox;
        }
        btnRoll.setText("Roll");
        btnRoll.setPrefWidth(75);
        dicePane.add(btnRoll, 3, 3);
        lblRolled.setText("Rolled: " + dice.getThrowCount());
        dicePane.add(lblRolled, 4, 3);

        btnRoll.setOnAction(event -> roll());
        // ---------------------------------------------------------------------

        GridPane scorePane = new GridPane();
        pane.add(scorePane, 0, 1);
        scorePane.setGridLinesVisible(false);
        scorePane.setPadding(new Insets(10));
        scorePane.setVgap(5);
        scorePane.setHgap(10);
        scorePane.setStyle("-fx-border-color: black");
        int w = 50; // width of the text fields

        // Initialize labels for results, txfResults,
        Label ones = new Label("1s");
        scorePane.add(ones, 0, 0);
        Label twos = new Label("2s");
        scorePane.add(twos, 0, 1);
        Label threes = new Label("3s");
        scorePane.add(threes, 0, 2);
        Label fours = new Label("4s");
        scorePane.add(fours, 0, 3);
        Label fives = new Label("5s");
        scorePane.add(fives, 0, 4);
        Label sixes = new Label("6s");
        scorePane.add(sixes, 0, 5);
        Label onePair = new Label("One pair");
        scorePane.add(onePair, 0, 6);
        Label twoPair = new Label("Two pairs");
        scorePane.add(twoPair, 0, 7);
        Label threeSame = new Label("Three of a kind");
        scorePane.add(threeSame, 0, 8);
        Label fourSame = new Label("Four of a kind");
        scorePane.add(fourSame, 0, 9);
        Label fullHouse = new Label("Full house");
        scorePane.add(fullHouse, 0, 10);
        Label smallStraight = new Label("Small Straight");
        scorePane.add(smallStraight, 0, 11);
        Label bigStraight = new Label("Large Straight");
        scorePane.add(bigStraight, 0, 12);
        Label chance = new Label("Chance");
        scorePane.add(chance, 0, 13);
        Label yatzy = new Label("Yatzy");
        scorePane.add(yatzy, 0, 14);

        Label sum = new Label("Sum");
        scorePane.add(sum, 2, 5);
        Label sum1 = new Label("Sum");
        scorePane.add(sum1, 2, 14);
        Label bonus = new Label("Bonus");
        scorePane.add(bonus, 4, 5);
        Label total = new Label("Total");
        scorePane.add(total, 4, 14);
        // labels and text fields for sums, bonus and total.
        for (int i = 0; i < txfresults.length; i++) {
            TextField txfresult = new TextField();
            this.txfresults[i] = txfresult;
            txfresult.setPrefWidth(80);
            txfresult.setAlignment(Pos.CENTER_LEFT);
            if (i <= 5) {
                txfresult.setOnMouseClicked(event -> this.chooseFieldAction(event));
            } else {
                txfresult.setOnMouseClicked(event -> this.chooseFieldAction2(event));
            }
            scorePane.add(txfresult, 1, i);
        }
        txfSumSame = new TextField();
        txfSumSame.setPrefWidth(70);
        scorePane.add(txfSumSame, 3, 5);
        txfSumSame.setStyle("-fx-text-fill: blue; -fx-font-size: 12px;");
        txfSumSame.setEditable(false);

        txfBonus = new TextField();
        txfBonus.setPrefWidth(70);
        scorePane.add(txfBonus, 5, 5);
        txfBonus.setStyle("-fx-text-fill: blue; -fx-font-size: 12px;");
        txfBonus.setEditable(false);

        txfSumOther = new TextField();
        txfSumOther.setPrefWidth(70);
        scorePane.add(txfSumOther, 3, 14);
        txfSumOther.setStyle("-fx-text-fill: blue; -fx-font-size: 12px;");
        txfSumOther.setEditable(false);

        txfTotal = new TextField();
        txfTotal.setPrefWidth(70);
        scorePane.add(txfTotal, 5, 14);
        txfTotal.setStyle("-fx-text-fill: blue; -fx-font-size: 12px;");
        txfTotal.setEditable(false);
    }

    // -------------------------------------------------------------------------

    private Yatzy dice = new Yatzy();

    // Create a method for btnRoll's action.

    // Hint: Create small helper methods to be used in the action method.
    private void roll() {
        boolean[] holds = new boolean[5];
        if (dice.getThrowCount() == 0) {
            for (int i = 0; i < chbHolds.length; i++) {
                chbHolds[i].setDisable(false);
            }
        }
        for (int i = 0; i < chbHolds.length; i++) {
            holds[i] = chbHolds[i].isSelected();
        }
        if (dice.getThrowCount() < 3) {
            dice.throwDice(holds);
            for (int i = 0; i < txfValues.length; i++) {

                txfValues[i].setText(String.valueOf(dice.getValues()[i]));
            }
            if (dice.getThrowCount() == 3)
                updateresult();
            lblRolled.setText("Rolled: " + dice.getThrowCount());
        }
    }

    // -------------------------------------------------------------------------

    // Create a method for mouse click on one of the text fields in txfResults.
    // Hint: Create small helper methods to be used in the mouse click method.
    public void chooseFieldAction(Event event) {
        if (dice.getThrowCount() == 3) {
            TextField text = (TextField) event.getSource();
            text.setDisable(true);
            text.setStyle("-fx-text-fill: blue; -fx-font-size: 12px;");
            lockresults();
            updatelock();
            scoreForTop6 += Integer.parseInt(text.getText());
            setBonus();
            reset();
            txfSumSame.setText(String.valueOf(scoreForTop6));
            txfTotal.setText(String.valueOf(scoreForTop6 + scoreforRest + bonus));
            lblRolled.setText("Rolled: " + dice.getThrowCount());
            endgame();
        }
    }

    public void chooseFieldAction2(Event event) {
        if (dice.getThrowCount() == 3) {
            TextField text = (TextField) event.getSource();
            text.setDisable(true);
            text.setStyle("-fx-text-fill: blue; -fx-font-size: 12px;");
            lockresults();
            updatelock();
            scoreforRest += Integer.parseInt(text.getText());
            reset();
            txfSumOther.setText(String.valueOf(scoreforRest));
            txfTotal.setText(String.valueOf(scoreForTop6 + scoreforRest + bonus));
            lblRolled.setText("Rolled: " + dice.getThrowCount());
            endgame();
        }
    }

    public void reset() {
        for (int i = 0; i < txfValues.length; i++) {
            txfValues[i].clear();
            chbHolds[i].setSelected(false);
            chbHolds[i].setDisable(true);
        }
        dice.resetThrowCount();
    }

    public void lockresults() {
        for (int i = 0; i < isUsed.length; i++) {
            if (txfresults[i].isDisabled()) {
                isUsed[i] = true;
            }
            if (!txfresults[i].isDisabled()) {
                txfresults[i].clear();
            }
        }
    }

    public void updatelock() {
        for (int i = 0; i < isUsed.length; i++) {
            isUsed[i] = txfresults[i].isDisabled();
        }
    }

    public void updateresult() {
        for (int i = 0; i < txfresults.length; i++) {
            if (!isUsed[i]) {
                txfresults[i].setText("" + dice.getResults()[i]);
            }
        }
    }

    public void setBonus() {
        if (scoreForTop6 >= 63) {
            bonus = 50;
            txfBonus.setText(String.valueOf(bonus));
        } else {
            bonus = 0;
            txfBonus.setText(String.valueOf(bonus));
        }
    }

    public void endgame() {
        boolean end = false;
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("GAME OVER");
        alert.setHeaderText("Game over: Your score: " + txfTotal.getText());


        end = isUsed[0] && isUsed[1] && isUsed[2] && isUsed[3] && isUsed[4] && isUsed[5] && isUsed[6] && isUsed[7] && isUsed[8] && isUsed[9] && isUsed[10] && isUsed[11] && isUsed[12] && isUsed[13] && isUsed[14];

        if (end) {
            alert.showAndWait();
            Platform.exit();
        }
    }

}






