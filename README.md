# JavaSoundPlayer

# TR 
Java uygulamanız için sesler çaldırmak için bu api'yi kullanabilirsiniz. 

# EN:
You can use this api to play sounds for your Java application.

# Usage

Play From File
`
package main;

import net.furkanO1.main.Player;

public class Player {

static void main(String[] args){
    File file = new File("test.wav");
	  Player.playFromFile(file);
  }
}

`

Play From Web
`
package main;

import net.furkanO1.main.Player;

public class Player {

  static void main(String[] args){
      Player.playFromWeb("https://example.com/test.wav");
    }
}


`
