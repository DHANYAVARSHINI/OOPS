class Whatsapp_1{
    String version = "Whatsapp version 1";
    void text_chat(){
        System.out.println("Text Feature is Available");
    }
    void emoji(){
        System.out.println("Emojis are Available");
    }
}
class Whatsapp_2 extends Whatsapp_1{
    String version = "Whatsapp version 2";
    void status(){
        System.out.println("Status Feature is Available");
    }
    void video_call(){
        System.out.println("Video Call Feature is Available");
    }
}
class Whatsapp_3 extends Whatsapp_2{
    String version = "Whatsapp version 3";
    void payments(){
        System.out.println("Payments Feature is Available");
    }
    void avathar(){
        System.out.println("Avathar Feature is Available");
    }
}

public class Multilevel_Inheritance{
    public static void main(String args[]){
        Whatsapp_3 whatsapp = new Whatsapp_3();
        System.out.println(whatsapp.version);
        whatsapp.text_chat();
        whatsapp.emoji();
        whatsapp.status();
        whatsapp.video_call();
        whatsapp.payments();
        whatsapp.avathar();
    }
}