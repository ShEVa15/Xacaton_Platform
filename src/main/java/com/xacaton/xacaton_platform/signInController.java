/**
 * Sample Skeleton for 'hello-view.fxml' Controller Class
 */

package com.xacaton.xacaton_platform;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.text.Text;

public class signInController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="btnGo"
    private Button btnGo; // Value injected by FXMLLoader

    @FXML // fx:id="loginField"
    private PasswordField loginField; // Value injected by FXMLLoader

    @FXML
    private Text incorr;

    @FXML // fx:id="passField"
    private PasswordField passField; // Value injected by FXMLLoader

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        //Установка фокуса на поле логина
        loginField.requestFocus(); // Не работает ?

        setupEventHandlers();
    }

    private void LoadMainController(){
        try {
            Parent root = null;
            root = FXMLLoader.load(getClass().getResource("main-win.fxml"));
            passField.getScene().setRoot(root);
        } catch (IOException e) {
            System.out.println("Error load ");
        }
    }

    private void setupEventHandlers(){
        // Обработка кнопки войти
        btnGo.setOnAction(event -> {
            incorr.setText("");
            String pass = passField.getText();
            String login = loginField.getText();
//            System.out.println(login + " " + pass);\

            switch (login) {
                case "root":
                    if (pass.equals("123")){
                        LoadMainController();
                    }
                    else {
                        incorr.setText("Неправильный логин или пароль!");
                    }

                    break;
                case "user":
                    LoadMainController();
                    break;
            }
        });
        //Обработка enter в login
        loginField.setOnKeyPressed(event -> {
            switch (event.getCode()) {
                case ENTER:
                    passField.requestFocus();
                    break;
                case ESCAPE:
                    loginField.clear();
                    break;
            }
        });

        //Обработака enter в pass
        passField.setOnKeyPressed(event -> {
            switch (event.getCode()) {
                case ENTER:
                    if (loginField.getText().isEmpty()){
                        loginField.requestFocus();
                        break;
                    } else {
                        incorr.setText("Неправильный логин или пароль!");
                    }
                    if (passField.getText().equals("123") && loginField.getText().equals("root")){
                        LoadMainController();
                        break;
                    }
                    break;
                case ESCAPE:
                    passField.clear();
                    break;
            }
        });

    }

}



/*
// 1. Получение/установка текста
passwordField.getText();                    // Получить пароль как String
passwordField.setText("new password");      // Установить текст
passwordField.clear();                      // Очистить поле

// 2. Фокусировка и навигация
passwordField.requestFocus();               // Установить фокус на поле
passwordField.isFocused();                  // Проверить, есть ли фокус
passwordField.selectAll();                  // Выделить весь текст
passwordField.deselect();                   // Снять выделение

// 3. Внешний вид и подсказки
passwordField.setPromptText("Введите пароль");     // Текст-подсказка
passwordField.setPrefColumnCount(20);              // Ширина в символах
passwordField.setMaxWidth(300);                    // Максимальная ширина

// 4. Состояние поля
passwordField.setEditable(false);                  // Заблокировать редактирование
passwordField.setDisable(true);                    // Отключить поле
passwordField.isEditable();                        // Проверить, доступно ли редактирование
 */
