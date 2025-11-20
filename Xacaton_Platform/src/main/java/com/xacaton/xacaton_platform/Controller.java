package com.xacaton.xacaton_platform;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

public class Controller {
    /* //ALL TODO
    @FXML
    private TextField loginField;  // поле для логина

    @FXML
    private PasswordField passwordField;  // поле для пароля

    @FXML
    private Button Button;  // кнопка входа

    @FXML
    private Label messageLabel;  // для сообщений

    @FXML
    private void initialize() {
        setupEventHandlers();
    }

    private void setupEventHandlers() {
        // Enter в поле логина переводит на пароль
        if (loginField != null) {
            loginField.setOnAction(e -> passwordField.requestFocus());
        }

        // Enter в поле пароля выполняет вход
        passwordField.setOnAction(e -> handleLogin());

        // Кнопка входа
        if (Button != null) {
            Button.setOnAction(e -> handleLogin());
        }


        passwordField.textProperty().addListener((obs, oldVal, newVal) -> {
            validateFields();
        });
    }

    @FXML
    private void handleLogin() {
        String password = passwordField.getText();

        if (password.isEmpty()) {
            showMessage("Введите пароль!", "red");
            return;
        }

        // ПРоверка пароля
        if (isValidPassword(password)) {
            showMessage("Успешный вход!", "green");
            // Переход к следующему окну
        } else {
            showMessage("Неверный пароль!", "red");
            passwordField.clear();
            passwordField.requestFocus();
        }
    }

    private void validateFields() {
        //  кнопка только если пароль не пустой
        if (Button != null) {
            Button.setDisable(passwordField.getText().isEmpty());
        }
    }

    private boolean isValidPassword(String password) {
        // проверка пароля
        return password.length() >= 6;
    }

    private void showMessage(String text, String color) {
        if (messageLabel != null) {
            messageLabel.setText(text);
            messageLabel.setStyle("-fx-text-fill: " + color + ";");
        }
    }*/
}