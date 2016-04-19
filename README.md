# Interactive
Library for creating simple interactive terminal applications

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

Then create and new menuItems

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

#MenuItems
The MenuItem class is abstract you must provide a concrete implementation
For Example:
```kotlin
class MyMenuItem(message: String) : MenuItem(message) {
    override fun accept() {
        //Do Nothing
    }
}
```
Or in Java:
```java
public class MyMenuItem extends MenuItem {
    public MyMenuItem(String message) {
        super(message);
    }
    public void accept() {
      //Do Nothing
    }
}
```
The accept method currently has no use, but in the future it will be called when the menu item is selected by the user.



