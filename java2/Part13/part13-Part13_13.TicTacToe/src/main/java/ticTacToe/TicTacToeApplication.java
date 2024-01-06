package ticTacToe;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.text.Font;
import javafx.geometry.Insets;
import javafx.scene.Scene;

import java.util.Arrays;


public class TicTacToeApplication extends Application {

    String player = "X";
    String[][] board = new String[3][3];

    public static void main(String[] args) {
        launch(TicTacToeApplication.class);
        
    }

    @Override
    public void start(Stage window) throws Exception {
        
        BorderPane layout = new BorderPane();
        Label turnText = new Label("Turn: " + this.player);
        turnText.setFont(Font.font("Monospaced", 40));
        
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        
        // Managing buttons in an array would have been easier!
        
        Button l00 = new Button(" ");
        Button m00 = new Button(" ");
        Button r00 = new Button(" ");
        Button l01 = new Button(" ");
        Button m01 = new Button(" ");
        Button r01 = new Button(" ");
        Button l02 = new Button(" ");
        Button m02 = new Button(" ");
        Button r02 = new Button(" ");
        
        l00.setFont(Font.font("Monospaced", 40));
        m00.setFont(Font.font("Monospaced", 40));
        r00.setFont(Font.font("Monospaced", 40));
        l01.setFont(Font.font("Monospaced", 40));
        m01.setFont(Font.font("Monospaced", 40));
        r01.setFont(Font.font("Monospaced", 40));
        l02.setFont(Font.font("Monospaced", 40));
        m02.setFont(Font.font("Monospaced", 40));
        r02.setFont(Font.font("Monospaced", 40));
        
        l00.setOnMouseClicked((event) -> {
            if(this.clicked(0, 0)) {
                l00.setText(this.player);
                if (checkBoard().equals(this.player) || checkBoard().equals("D")){
                    turnText.setText("The end!");
                } else {
                    changePlayer();
                    turnText.setText("Turn: " + this.player);
                }
            }});
        m00.setOnMouseClicked((event) -> {
            if(this.clicked(1, 0)){
                m00.setText(this.player);
                if (checkBoard().equals(this.player) || checkBoard().equals("D")){
                    turnText.setText("The end!");
                } else {
                    changePlayer();
                    turnText.setText("Turn: " + this.player);
                }
            }});
        r00.setOnMouseClicked((event) -> {
            if(this.clicked(2,0)){
                r00.setText(this.player);
                if (checkBoard().equals(this.player) || checkBoard().equals("D")){
                    turnText.setText("The end!");
                } else {
                changePlayer();
                turnText.setText("Turn: " + this.player);
                }
            }});
        l01.setOnMouseClicked((event) -> {
            if(this.clicked(0, 1)){
                l01.setText(this.player);
                if (checkBoard().equals(this.player) || checkBoard().equals("D")){
                    turnText.setText("The end!");
                } else {
                    changePlayer();
                    turnText.setText("Turn: " + this.player);
                }
            }});
        m01.setOnMouseClicked((event) -> {
            if(this.clicked(1, 1)){
                m01.setText(this.player);
                if (checkBoard().equals(this.player) || checkBoard().equals("D")){
                    turnText.setText("The end!");
                } else {                
                    changePlayer();
                    turnText.setText("Turn: " + this.player);
                }
            }});
        r01.setOnMouseClicked((event) -> {
            if(this.clicked(2, 1)){
                r01.setText(this.player);
                if (checkBoard().equals(this.player) || checkBoard().equals("D")){
                    turnText.setText("The end!");
                } else {
                    changePlayer();
                    turnText.setText("Turn: " + this.player);
                }
                
            }});
        l02.setOnMouseClicked((event) -> {
            if(this.clicked(0, 2)){
                l02.setText(this.player);
                if (checkBoard().equals(this.player) || checkBoard().equals("D")){
                    turnText.setText("The end!");
                } else {
                    changePlayer();
                    turnText.setText("Turn: " + this.player);
                }
            }});
        m02.setOnMouseClicked((event) -> {
            if(this.clicked(1, 2)){
                m02.setText(this.player);
                if (checkBoard().equals(this.player) || checkBoard().equals("D")){
                    turnText.setText("The end!");
                } else {
                    changePlayer();
                    turnText.setText("Turn: " + this.player);
                }
            }});
        r02.setOnMouseClicked((event) -> {
            if(this.clicked(2, 2)){
                r02.setText(this.player);
                if (checkBoard().equals(this.player) || checkBoard().equals("D")){
                    turnText.setText("The end!");
                } else {
                    changePlayer();
                    turnText.setText("Turn: " + this.player);
                }
            }});
        
        
        grid.add(l00, 0, 0);
        grid.add(m00, 1, 0);
        grid.add(r00, 2, 0);
        grid.add(l01, 0, 1);
        grid.add(m01, 1, 1);
        grid.add(r01, 2, 1);
        grid.add(l02, 0, 2);
        grid.add(m02, 1, 2);
        grid.add(r02, 2, 2);
        
        layout.setTop(turnText);
        layout.setCenter(grid);
        
        Scene scene = new Scene(layout);
        
        window.setScene(scene);
        window.show();
        
        

    }
    
    public void changePlayer(){
        if (this.player.equals("X")) {
            this.player = "O";
        } else if (this.player.equals("O")) {
            this.player = "X";
        }
    }
    
    
    
    public String checkBoard(){
        
        // check lines
        for (int i = 0; i < 3; i++){
            if (checkEqual(this.board[i][0], this.board[i][1], this.board[i][2])) {
                return this.board[i][0];
            }
        }

        // check rows
        for (int j = 0; j < 3; j++) {
            if (checkEqual(board[0][j], board[1][j], board[2][j])) {
                return board[0][j];
            }
        }

        // check diagonals
        if (checkEqual(board[0][0], board[1][1], board[2][2])) {
            return board[0][0];
        }
        if (checkEqual(board[0][2], board[1][1], board[2][0])) {
            return board[0][2];
        }
        
        
        //check for draw
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (this.board[i][j] == null) {
                    // Es gibt noch ein leeres Feld, das Spiel ist also noch nicht unentschieden
                    return "N";
                }
            }
        }
        return "D";
    }
    
    
private boolean checkEqual(String a, String b, String c) {
    return a != null && a.equals(b) && b.equals(c);
}
    
    public boolean clicked(int i, int j){
        if (this.board[i][j] == null) {
            this.board[i][j] = this.player;
            return true;
        }
        return false;
    }

}
