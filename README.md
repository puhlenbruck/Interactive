# Interactive
Library for creating simple interactive terminal applications
Supports creating and displaying menus as well as handling user input selection of menu options

# Disclaimer
This is still highly experimental (pre 0.1) and everything is subject to potential change


#Menus
To build a menu, instantiate the Menu class and set the menu title

```kotlin
var menu = Menu()
menu.title = "My Menu"
```

In Java:
```java
Menu menu = new Menu();
menu.setTitle("My Menu");
```

Then create new MenuItems 

```kotlin
var mi1 = MyMenuItem("My first menu item")
var mi2 = MyMenuItem("My second menu item")
menu.add(mi1)
menu.add(mi2)
```
Java:
```java
MenuItem mi1 = new MyMenuItem("My first menu item");
MenuItem mi2 = new MyMenuItem("My second menu item");
menu.add(mi1);
menu.add(mi2);
```

Finally you are ready to use the menu:
```
menu.render();
```
Will output as:
```
My Menu
1) My first menu item
2) My second menu item
```

# Adding Selection Handling
In most cases you will want users to select a menu item to produce some action.
This is done with SelectionHandlers.

To create a selection handler implement the SelectionHandler interface and override the select() method.  The SelectionHandler can then be assigned to a MenuItem the the `MenuItem.selectionHandler` property or in Java using `MenuItem.setSelectionHandler()`.  A MenuItem will call it's SelectionHandler's `select()` method when that item is selected.
This is easily done with anonymous classes.

Kotlin:
```kotlin
var item = MenuItem("Hello")
item.selectionHandler = object : SelectionHandler {
    override fun select() {
        //do stuff when selected
    }
}
```
Java:
```java
MenuItem item = MenuItem("Hello")
item.setSelectionHandler(new SelectionHandler(){
    public void select(){
        //do stuff when selected
    }
});
```

# Missing
Currently Menu's will only display their contents with `render()` and will not do any input handling.  This functionality should be added soon.

# Maven
The library can be used by adding the jar to your classpath, but it is also possible to include it as a maven dependancy.

There is no artifact repository for this project yet so you will need to install it manually to your local respoitory.  To do so, download this project (or clone with git) and use the command `mvn install`.  

You can also download just the jar file and use the command `mvn install:install-file -Dfile=<path-to-jar>` if you simply wish to use the library

After doing so you should be able to add the depandancy to your pom.xml with
```xml
<dependency>
    <groupId>com.puhlen</groupId>
    <artifactId>Interactive</artifactId>
    <version>0.1-SNAPSHOT</version>
</dependency>
```



