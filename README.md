This project is a clone of the game Will Hero built using Java and JavaFx.

##FEATURES AND FUNCTIONALITY

⭐️ Game 🎮 progresses with increasing difficulty till the player defeats the Boss Orc.

* How To Play 📄: Displays details of Game Play
* Obstacles Available 🔴: Green Orcs, Red Orcs, TNT explosions on collision
* Weapons Available 🗡️: Axe, Rocket
* Chests – Weapon and Coin 🎁: To equip weapons and earn coins
* Save Game and Restart Game options: User can save multiple game states.
* The player earns coins on the way and is given a chance to resurrect if it dies, which requires 50 coins.

##IMPLEMENTATION OVERVIEW
 
* The project follows a strict object-oriented paradigm with well-defined classes for each component of the gameplay.
* The implementation of the user interface was achieved using FXML and CSS for further UI improvements, applied using SceneBuilder.
* The gameplay additionally uses the functionality of event-driven programming using JavaFX to create the gameplay setting, various obstacles and transitions for all moving objects.
* It takes into account various design patterns of software development. Additionally, serialization has been implemented to store the progress during a particular setting of the game.
* Exceptions handled – IOException,  and ClassNotFoundException

##DESIGN PATTERNS USED
🎨Singleton
Used to create a single instance of game class. 
🎨 Decorator
- Used in Serializable and Deserializable.
🎨Façade
Used to detect collisions of the Player with various obstacles.



