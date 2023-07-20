# JavaSE_JavaFX-HelloWorld

## How to create a new JavaFX application

1. Run InteliJ IDEA.

![image](https://github.com/luiscoco/JavaSE_JavaFX-HelloWorld/assets/32194879/7e8e07e3-ab98-4f36-bc9b-5a3be7882902)

2. Create a new JavaFX project.

![image](https://github.com/luiscoco/JavaSE_JavaFX-HelloWorld/assets/32194879/3731a6bf-3b89-4b98-9e70-84ca7f5d90d7)

![image](https://github.com/luiscoco/JavaSE_JavaFX-HelloWorld/assets/32194879/7e257088-560c-4781-bce0-751745b9f826)

![image](https://github.com/luiscoco/JavaSE_JavaFX-HelloWorld/assets/32194879/32efeb19-99a1-4949-bd3e-61c9979acf1c)

## Application source code

### HelloApplication.java
With this l
```java
FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
```



```java
package com.sample1.sample1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
```




### HelloController.java

```java
package com.sample1.sample1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}
```


### hello-view.fxml

```java
<?xml version="1.0" encoding="UTF-8"?>

<?import javafx.geometry.Insets?>
<?import javafx.scene.control.Label?>
<?import javafx.scene.layout.VBox?>

<?import javafx.scene.control.Button?>
<VBox alignment="CENTER" spacing="20.0" xmlns:fx="http://javafx.com/fxml"
      fx:controller="com.sample1.sample1.HelloController">
    <padding>
        <Insets bottom="20.0" left="20.0" right="20.0" top="20.0"/>
    </padding>

    <Label fx:id="welcomeText"/>
    <Button text="Hello!" onAction="#onHelloButtonClick"/>
</VBox>
```



