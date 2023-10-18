# CLEVERTEC GRADLE TASK

***

### Описание приложения

Приложение включает три модуля - **utils**, **application** и **buildSrc**.

- Модуль **utils** предназначен для генерации файла-библиотеки **utils-1.3.5.jar** и отправки его в директорию [**libs**](libs "libs").<br/>
  Содержит класс [**StringUtil**](utils/src/main/java/ru/clevertec/utils/StringUtil.java "StringUtil.java") с методом **boolean** **isPositiveNumber(String str)**.<br/><br/>

- Модуль **application** состоит из двух подмодулей - **core** и **api**.<br/><br/>

    - Подмодуль **core** подключает файл-библиотеку **utils-1.3.5.jar** из директории [**libs**](libs "libs").<br/>
      Содержит класс [**Util**](application/core/src/main/java/ru/clevertec/core/Util.java "Util.java") с методом **boolean** **isAllPositiveNumbers(String... str)**.<br/><br/>

    - Подмодуль **api** содержит класс [**App**](application/api/src/main/java/ru/clevertec/api/App.java "App.java") с **main-методом** и методом **String** **getResult(String... str)**.<br/><br/>

- Модуль **buildSrc** служит для примера реализации простейшего [**плагина**](buildSrc/src/main/groovy/ru/clevertec/plugin/TitlePlugin.groovy "TitlePlugin.groovy").

В модулях **utils** и **application** реализованы тесты и подключен плагин **JaCoCo**.

***

### Запуск приложения

Точкой входа в приложение является **main-метод** в классе [**App**](application/api/src/main/java/ru/clevertec/api/App.java "App.java").

***

### Параметры приложения, библиотеки и зависимости

- Java 17
- Gradle 7.5.1
- Apache Commons Lang 3.13.0
- JUnit Jupiter API 5.7.0
- JUnit Jupiter Params 5.7.0
- JUnit Jupiter Engine 5.7.0
- JaCoCo Plugin

***