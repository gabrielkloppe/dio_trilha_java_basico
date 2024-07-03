public class smartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 25;

public void ligar(){
    ligada = true;

    }
   
public void desligar(){
    ligada = false;
        
    }

public void aumentarVolume(){
    volume++;
        System.out.println("Aumentar o volume para: " + volume);
    }

public void diminuirVolume(){
    volume--;
        System.out.println("Diminuindo o volume para: " + volume);
    }

public void aumentarCanal(){
    canal++;
        System.out.println("Mudando canal para cima: " + canal);
    }

public void diminuirCanal(){
    canal--;
        System.out.println("Mudando canal para baixo: " + canal);
    }

public void mudarCanal(int novoCanal){
    canal = novoCanal;
    }

}