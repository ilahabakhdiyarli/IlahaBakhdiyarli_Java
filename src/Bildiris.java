public class Bildiris {
    public String mesajGonder(){
        return "Esas mesaj";
    }
}
class  EmailBildiris extends Bildiris{
    @Override
    public String mesajGonder(){
        return "Email mesaji";
    }
}

class SmsBildiris extends Bildiris{
    @Override
    public String mesajGonder(){
        return "SMS mesaji";
    }
}

class PushBildiris extends Bildiris{
    @Override
    public String mesajGonder(){
        return "Push mesaji";
    }
}
