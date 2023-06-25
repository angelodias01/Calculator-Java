import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.geometry.Insets;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.layout.ColumnConstraints;
import java.text.DecimalFormat;
import javafx.scene.input.MouseEvent;
import javafx.application.Application;
import javafx.scene.control.TextFormatter;

public class Calculator extends Application
{
    // We keep track of the count, and label displaying the count:
    private int count = 0;
    private float num1;
    private String num1In = null;
    private float num2;
    private String num2In = null;
    private boolean equal;
    private boolean sub;
    private boolean sum;
    private boolean div;
    private boolean mult;
    private boolean percent;
    private boolean dotClicked;
    private TextField terminal = new TextField("");
    private Button zero = new Button("0");
    private Button one = new Button("1");
    private Button two = new Button("2");
    private Button three = new Button("3");
    private Button four = new Button("4");
    private Button five = new Button("5");
    private Button six = new Button("6");
    private Button seven = new Button("7");
    private Button eight = new Button("8");
    private Button nine = new Button("9");
    private Button plus = new Button("+");
    private Button minus = new Button("-");
    private Button equals = new Button("=");
    private Button dot = new Button(".");
    private Button multiply = new Button("x");
    private Button division = new Button("/");
    private Button percentage = new Button("%");
    private Button clear = new Button("C");

    @Override
    public void start(Stage stage)
    {

        // Create a new grid pane
        GridPane pane = new GridPane();
        pane.setPadding(new Insets(25, 25, 25, 25));
        pane.setMinSize(230, 330);
        pane.setVgap(8);
        pane.setHgap(8);
        Scene scene = new Scene(pane, 230,330);
        stage.setTitle("Calculator");
        stage.getIcons().add(new Image("icon_calc.png"));
        scene.getStylesheets().add("styles.css");
        pane.getStyleClass().add("pane");
        stage.setResizable(false);
        stage.setScene(scene);

        // Create a Button or any control item

        //Button unk = new Button("?");
        //Button unk2 = new Button("!");

        zero.setId("button-0");
        one.setId("button-w");
        two.setId("button-w");
        three.setId("button-w");
        four.setId("button-w");
        five.setId("button-w");
        six.setId("button-w");
        seven.setId("button-w");
        eight.setId("button-w");
        nine.setId("button-w");
        plus.setId("button-o");
        minus.setId("button-o");
        equals.setId("button-o");
        dot.setId("button-o");
        multiply.setId("button-o");
        division.setId("button-o");
        percentage.setId("button-o");
        clear.setId("button-c");
        //unk.setId("button-o");
        //unk2.setId("button-o");
        terminal.setEditable(false);
        terminal.setAlignment(Pos.CENTER_RIGHT);

        //set an action on the button using method reference
        clear.setOnAction(this::clearClick);
        zero.setOnAction(this::zeroClick);
        one.setOnAction(this::oneClick);
        two.setOnAction(this::twoClick);
        three.setOnAction(this::threeClick);
        four.setOnAction(this::fourClick);
        five.setOnAction(this::fiveClick);
        six.setOnAction(this::sixClick);
        seven.setOnAction(this::sevenClick);
        eight.setOnAction(this::eightClick);
        nine.setOnAction(this::nineClick);
        plus.setOnAction(this::sumClick);
        minus.setOnAction(this::subClick);
        division.setOnAction(this::divClick);
        multiply.setOnAction(this::multClick);
        equals.setOnAction(this::equalClick);
        percentage.setOnAction(this::percentClick);
        dot.setOnAction(this::dotClick);
        //Add the button and label into the pane 

        pane.add(terminal, 0, 0, 4 ,1);

        //pane line 4
        pane.add(division, 3, 1);
        pane.add(percentage, 2, 1);
        pane.add(clear, 0, 1, 2 , 1);
        //pane line 3
        pane.add(seven, 0, 2);
        pane.add(eight, 1, 2);
        pane.add(nine, 2, 2);
        pane.add(multiply, 3, 2);
        //pane line 2
        pane.add(four, 0, 3);
        pane.add(five, 1, 3);
        pane.add(six, 2, 3);
        pane.add(minus, 3, 3);
        //pane line 1
        pane.add(one, 0, 4);
        pane.add(two, 1, 4);
        pane.add(three, 2, 4);
        pane.add(plus, 3, 4);
        //pane line 0
        pane.add(zero, 0, 5, 2 ,1);
        pane.add(dot, 2, 5);
        pane.add(equals, 3, 5);
        // Show the Stage (window)

        stage.show();

    }

    private void clearClick(ActionEvent event)
    {
        terminal.clear();
    }

    private void setNumber(ActionEvent event, String num){
        String input = terminal.getText();
        terminal.setText(input + num);
        num1 = Float.parseFloat(terminal.getText());
    }
    
    private void zeroClick(ActionEvent event)
    {
        String input = terminal.getText();
        terminal.setText(input + "0");
        num1 = Float.parseFloat(terminal.getText());

    }

    private void oneClick(ActionEvent event)
    {
        String input = terminal.getText();
        terminal.setText(input + "1");
        num1 = Float.parseFloat(terminal.getText());

    }

    private void twoClick(ActionEvent event)
    {
        String input = terminal.getText();
        terminal.setText(input + "2");
        num1 = Float.parseFloat(terminal.getText());

    }

    private void threeClick(ActionEvent event)
    {
        String input = terminal.getText();
        terminal.setText(input + "3");
        num1 = Float.parseFloat(terminal.getText());

    }

    private void fourClick(ActionEvent event)
    {
        String input = terminal.getText();
        terminal.setText(input + "4");
        num1 = Float.parseFloat(terminal.getText());

    }

    private void fiveClick(ActionEvent event)
    {
        String input = terminal.getText();
        terminal.setText(input + "5");
        num1 = Float.parseFloat(terminal.getText());
    }

    private void sixClick(ActionEvent event)
    {
        String input = terminal.getText();
        terminal.setText(input + "6");
        num1 = Float.parseFloat(terminal.getText());

    }

    private void sevenClick(ActionEvent event)
    {
        String input = terminal.getText();
        terminal.setText(input + "7");
        num1 = Float.parseFloat(terminal.getText());
    }

    private void eightClick(ActionEvent event)
    {
        String input = terminal.getText();
        terminal.setText(input + "8");
        num1 = Float.parseFloat(terminal.getText());

    }
    
    private void nineClick(ActionEvent event)
    {
        String input = terminal.getText();
        terminal.setText(input + "9");
        num1 = Float.parseFloat(terminal.getText());
    }
    
    private void dotClick(ActionEvent event){
        String input = terminal.getText();
        terminal.setText(input + ".");
        num1 = Float.parseFloat(terminal.getText());
    }
    
    private void sumClick(ActionEvent event)
    { 
        num2 = Float.parseFloat(terminal.getText());

        terminal.setText("");

        sum = true;
        sub = false;
        div = false;
        mult = false;
        percent = false;
    }
    
    private void subClick(ActionEvent event){
        num2 = Float.parseFloat(terminal.getText());
        terminal.setText("");

        sub = true;
        sum = false;
        div = false;
        mult = false;
    }
    
    private void divClick(ActionEvent event){
        num2 = Float.parseFloat(terminal.getText());
        terminal.setText("");

        sum = false;
        sub = false;
        div = true;
        mult = false;
    }
    
    private void multClick(ActionEvent event){
        num2 = Float.parseFloat(terminal.getText());
        terminal.setText("");

        sum = false;
        sub = false;
        div = false;
        mult = true;
    }
    
    private void percentClick(ActionEvent event)
    {
        num2 = Float.parseFloat(terminal.getText());
        terminal.setText("");

        sum = false;
        sub = false;
        div = false;
        mult = false;
        percent = true;
    }
    
    private void equalClick(ActionEvent event){

        if(sum && num2 >= 0){
            Float somas = (num1) + (num2);
            String result = Float.toString(somas);
            terminal.setText("");
            String input = terminal.getText();
            terminal.setText(result);

            sum = false;
        }

        else if(sub){
            Float subs;

            subs = num2 - num1;
            String result = Float.toString(subs);
            terminal.setText("");
            String input = terminal.getText();
            terminal.setText(result);

            sub = false;
        }

        else if(div){
            Float divs = (num2 / num1);
            String result = Float.toString(divs);
            terminal.setText("");
            String input = terminal.getText();
            terminal.setText(result);
            div = false;
        }

        else if(mult){
            Float mults = (num1 * num2);
            String result = Float.toString(mults);
            terminal.setText("");
            String input = terminal.getText();
            terminal.setText(result);
            mult = false;
        }
        else if(percent){
            Float percents = ((num2*num1)/ 100);
            String result = Float.toString(percents);
            terminal.setText("");
            String input = terminal.getText();
            terminal.setText(result);
            percent = false;
        }

    }
}