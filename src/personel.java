public class personel {
    private double temelmaaş;
    private double eködeme;
    private double vergi;
    private String name;
    private String departman;

    personel(String name,String departman,double temelmaaş,double vergi){
        this.name=name;
        this.departman=departman;
         settemelmaaş(temelmaaş);
         setvergi(vergi);
         this.eködeme=0;
    }
    private void settemelmaaş(double temelmaaş){
        if(temelmaaş<8500){
            this.temelmaaş=8500;
            System.out.println("Maaşınız 8500TL den küçük olamaz! Maaşınız 8500Tl olarak kaydedildi.");
        }else {
            this.temelmaaş=temelmaaş;
        }

    }private void setvergi(double vergi){
        if (vergi<0){
            this.vergi=0;
        } else if (vergi>0.4) {
            this.vergi=0.4;
        }else{
            this.vergi=vergi;
        }
    }
    public void zamyap(double oran){
        double zammiktarı=this.temelmaaş/(oran*100);
        settemelmaaş(temelmaaş+zammiktarı);
        System.out.println("maaşınız %"+oran+"zam yapıldı.\nYeni maaşınız:"+this.temelmaaş+"TL");
    }
        public void bonusekle(double miktar){
        if (miktar>0){
            this.eködeme=miktar;
            System.out.println(miktar+"Tl bonus eklendi.\ntoplam bonus:"+eködeme);
        }else{
            System.out.println("geçersiz bonus miktarı girildi! ");
        }
    }
    public double netmaaşhesapla(){
        double brütmaaş=this.temelmaaş+this.eködeme;
        double netmaaş =brütmaaş*(1-this.vergi);
    return netmaaş;
    }
    public void bilgigöster(){
        double brütmaaş=this.temelmaaş+this.eködeme;
        double netmaaş=netmaaşhesapla();
        System.out.println("kullanıcı ismi:"+this.name);
        System.out.println("kullanıcı departmanı:"+this.departman);
        System.out.println("kullanıcı brüt maaşı:"+brütmaaş+"TL");
        System.out.println("vergi oranı:"+vergi);
        System.out.println("net maaş :"+netmaaş);
    }
}

